package com.example.tfg_adrian;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.Log;
public class GameEngine {

    BackgroundImage backgroundImage;
    Monkey monkey;

    int npipes = 3;
    Pipe[] pipe = new Pipe[npipes];
    int distancebetweenpipes = (AppConstants.SCREEN_WIDTH / 2);
    int currPipe = 0;

    Paint paint;

    int score;
    int gameState;

    public GameEngine() {
        backgroundImage = new BackgroundImage();
        monkey = new Monkey();

        for (int i = 0; i < npipes; i++) {
            pipe[i] = new Pipe();
            pipe[i].setX(pipe[i].getX() + i * distancebetweenpipes);
        }

        // 0 -> Pantalla de inicio
        // 1 -> Jugando
        // 2 -> Acabado
        gameState = 0;

        // Preparar el paint para dibujar la puntuación
        paint = new Paint();
        paint.setColor(Color.WHITE); // Color del texto
        paint.setTextSize(200); // Tamaño del texto
        paint.setTextAlign(Paint.Align.LEFT); // Alineación del texto
        paint.setStyle(Paint.Style.FILL);
        paint.setTypeface(Typeface.DEFAULT_BOLD);

    }

    public void updateAndDrawbleBackgroundImage(Canvas canvas) {
        backgroundImage.setX(backgroundImage.getX() - backgroundImage.getVelocity());
        if (backgroundImage.getX() < -AppConstants.getBitmapBank().getBackgroundWidth()) {
            backgroundImage.setX(0);
        }
        canvas.drawBitmap(AppConstants.getBitmapBank().get_background_game(), backgroundImage.getX(), backgroundImage.getY(), null);

        if (backgroundImage.getX() < - (AppConstants.getBitmapBank().getBackgroundWidth() - AppConstants.SCREEN_WIDTH)) {
            canvas.drawBitmap(AppConstants.getBitmapBank().get_background_game(), backgroundImage.getX() + AppConstants.getBitmapBank().getBackgroundWidth(), backgroundImage.getY(), null);
        }
    }

    public void updateAndDrawMonkey(Canvas canvas) {
        if (gameState == 1) {
            if (monkey.getY() < (AppConstants.SCREEN_HEIGHT - AppConstants.getBitmapBank().getMonkeyHeight()) || monkey.getVelocity() < 0) {
                monkey.setVelocity(monkey.getVelocity() + AppConstants.gravity);
                monkey.setY(monkey.getY() + monkey.getVelocity());
            }
        }
        int currentFrame = monkey.getCurrentFrame();
        canvas.drawBitmap(AppConstants.getBitmapBank().getMonkey(currentFrame), monkey.getX(), monkey.getY(), null);
        currentFrame++;
        if (currentFrame > monkey.maxFrame) {
            currentFrame = 0;
        }
        monkey.setCurrentFrame(currentFrame);
    }

    public void updatePipes(Canvas canvas) {

        // Sumar puntuación si se ha cruzado
        if (pipe[currPipe].getX() < AppConstants.SCREEN_WIDTH / 2){
            score ++;
            if (currPipe < npipes - 1){
                currPipe++;
            }
            else{
                currPipe = 0;
            }
        }

        //Log.i("PIPE", "CURRENT PIPE = " + currPipe);


        for (int i = 0; i < npipes; i++) {
            pipe[i].setX(pipe[i].getX() - pipe[i].getVelocity());

            // Comprobar que no se haya chocado
            if (monkey.checkCollision(pipe[i].getX(), pipe[i].getY(0), AppConstants.getBitmapBank().getPipeWidth(0), AppConstants.getBitmapBank().getPipeHeight(0)) ||
                    monkey.checkCollision(pipe[i].getX(), pipe[i].getY(1), AppConstants.getBitmapBank().getPipeWidth(1), AppConstants.getBitmapBank().getPipeHeight(1))) {
                gameState = 2;
                for (int j = 0; j < npipes; j++) {
                    pipe[j].setVelocity(0);
                }
            }

            // Esto lo que hace es que las pipes vuelvan a salir, pero hay que cambiarles la Y
            if (pipe[i].getX() < -AppConstants.getBitmapBank().getPipeWidth(0)) {
                pipe[i].setX(pipe[i].getX() + npipes * distancebetweenpipes);
                pipe[i].changeY();
            }

            // Dibujar las tuberías
            canvas.drawBitmap(AppConstants.getBitmapBank().getPipe(0), pipe[i].getX(), pipe[i].getY(0), null);
            canvas.drawBitmap(AppConstants.getBitmapBank().getPipe(1), pipe[i].getX(), pipe[i].getY(1), null);

            // Dibujar Score (se podría hacer una nueva función pero es más rápido aqui)
            canvas.drawText(String.valueOf(score),40, AppConstants.SCREEN_HEIGHT - 40, paint);
        }
    }

    public void gameOverScreen(Canvas canvas) {
        canvas.drawBitmap(AppConstants.getBitmapBank().getGameOver(), 0, 0, null);
        canvas.drawBitmap(AppConstants.getBitmapBank().getRetryBtn(), AppConstants.SCREEN_WIDTH / 2 - 190, 400, null);
    }
}

