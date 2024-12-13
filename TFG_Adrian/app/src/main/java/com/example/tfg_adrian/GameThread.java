package com.example.tfg_adrian;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
public class GameThread extends Thread {

    SurfaceHolder surfaceHolder;

    boolean isRunning;

    long startTime, loopTime;

    long DELAY = 45;

    public GameThread(SurfaceHolder surfaceHolder){
        this.surfaceHolder = surfaceHolder;
        isRunning = true;
    }

    @Override
    public void run(){
        while (isRunning){
            startTime = SystemClock.uptimeMillis();

            Canvas canvas = surfaceHolder.lockCanvas(null);
            if (canvas != null){
                synchronized (surfaceHolder){
                    AppConstants.getGameEngine().updateAndDrawbleBackgroundImage(canvas);

                    AppConstants.getGameEngine().updateAndDrawMonkey(canvas);

                    AppConstants.getGameEngine().updatePipes(canvas);

                    if (AppConstants.getGameEngine().gameState == 2){
                        AppConstants.getGameEngine().gameOverScreen(canvas);
                    }

                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }

            loopTime = SystemClock.uptimeMillis() - startTime;


            // Pausamlos para asegurar que actualiza correctamente por segundo
            if (loopTime < DELAY){
                try {
                    Thread.sleep(DELAY - loopTime);
                }
                catch (InterruptedException e){
                    Log.e("Interrupted", "Interrupted while sleeping");
                }
            }
        }
    }

    public boolean isRunning(){
        return isRunning;
    }

    public void setIsRunning(boolean state){
        isRunning = state;
    }


}

