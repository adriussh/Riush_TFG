package com.example.tfg_adrian;

import android.util.Log;
import java.util.Random;

public class Pipe {
    private int pipeX,  topPipeY, bottomPipeY, velocity, gap, tubeoffset;

    Random randomGenerator;

    public Pipe(){
        gap = 2135;

        randomGenerator = new Random();

        // CAMBIAR ESTE NÚMERO ACORDE CUANDO SE QUIERE CONTROLAR EL DESPLAZAMIENTO DE LAS PIPES
        tubeoffset = randomGenerator.nextInt(1001) - 500;

        pipeX = AppConstants.SCREEN_WIDTH - AppConstants.getBitmapBank().getPipeWidth(0)/2;
        topPipeY = AppConstants.SCREEN_HEIGHT/2 - AppConstants.getBitmapBank().getPipeHeight(0)/2 - gap/2 + tubeoffset;

        bottomPipeY = AppConstants.SCREEN_HEIGHT/2 - AppConstants.getBitmapBank().getPipeHeight(1)/2 + gap / 2 + tubeoffset;

        velocity = 8;

    }
    public int getX(){
        return pipeX;
    }

    public int getY(int type){
        if (type == 0){
            return topPipeY;
        }
        return bottomPipeY;
    }

    public void setX(int x){
        pipeX = x;
    }

    public void changeY(){
        topPipeY -= tubeoffset;
        bottomPipeY -= tubeoffset;

        tubeoffset = randomGenerator.nextInt(1001) - 500;

        topPipeY += tubeoffset;
        bottomPipeY += tubeoffset;
    }

    public int getVelocity(){
        return velocity;
    }

    public void setVelocity(int v){
        velocity = v;
    }
}

