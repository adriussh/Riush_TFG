package com.example.tfg_adrian;

import android.graphics.RectF;

public class Monkey {
    private int monkeyX, monkeyY, currentFrame, velocity;

    public static int maxFrame;

    public Monkey(){
        monkeyX = AppConstants.SCREEN_WIDTH/2 - AppConstants.getBitmapBank().getMonkeyWidth()/2;
        monkeyY = AppConstants.SCREEN_HEIGHT/2 - AppConstants.getBitmapBank().getMonkeyHeight()/2;
        currentFrame = 0;
        maxFrame = 1;
        velocity = 0;
    }
    public int getCurrentFrame(){
        return currentFrame;
    }

    public void setCurrentFrame(int frame){
        this.currentFrame = frame;
    }

    public int getX(){
        return monkeyX;
    }

    public int getY(){
        return monkeyY;
    }

    public void setX(int x){
        monkeyX = x;
    }

    public void setY(int y){
        monkeyY = y;
    }

    public int getVelocity(){
        return velocity;
    }

    public void setVelocity(int v){
        velocity = v;
    }

    public boolean checkCollision(int pipeX, int pipeY, int pipeWidth, int pipeHeight) {
        // Crea un RectF para el óvalo del mono
        RectF monkeyRectF = new RectF(monkeyX, monkeyY, monkeyX + AppConstants.bitmapBank.getMonkeyWidth(), monkeyY + AppConstants.getBitmapBank().getMonkeyHeight());

        // Crea un RectF para la tubería
        RectF pipeRectF = new RectF(pipeX, pipeY, pipeX + pipeWidth, pipeY + pipeHeight);

        // Verifica si el óvalo del mono interseca el rectángulo de la tubería
        return RectF.intersects(monkeyRectF, pipeRectF);
    }
}
