package com.example.tfg_adrian;

public class BackgroundImage {
    private int backgroundImageX, backgroundImageY, getBackgroundVelocity;

    public BackgroundImage(){

        backgroundImageX = 0;
        backgroundImageY = 0;
        getBackgroundVelocity = 8;
    }


    public  int getX(){
        return backgroundImageX;
    }

    public int getY(){
        return backgroundImageY;
    }

    public void setX(int x){
        this.backgroundImageX = x;
    }

    public void setY(int y){
        this.backgroundImageY = y;
    }

    public int getVelocity(){
        return getBackgroundVelocity;
    }
}

