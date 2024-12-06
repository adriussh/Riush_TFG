package com.example.tfg_adrian;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank
{
    Bitmap background_game;

    Bitmap [] monkey;

    Bitmap [] pipe;

    Bitmap gameOver;

    Bitmap retryBtn;

    public BitmapBank(Resources resources){
        background_game = BitmapFactory.decodeResource(resources, R.drawable.background_game);

        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();

        int backgroundScaleWidth = (int) widthHeightRatio * AppConstants.SCREEN_HEIGHT;

        background_game = scaleImage(background_game, backgroundScaleWidth, AppConstants.SCREEN_HEIGHT);

        // Numero de frames del mono (animaciones
        monkey = new Bitmap [2];

        monkey[0] = BitmapFactory.decodeResource(resources, R.drawable.bird);
        monkey[0] = scaleImage(monkey[0], monkey[0].getWidth() / 3, monkey[0].getHeight() / 3);

        monkey[1] = BitmapFactory.decodeResource(resources, R.drawable.bird2);
        monkey[1] = scaleImage(monkey[1], monkey[1].getWidth() / 3, monkey[1].getHeight() / 3);

        pipe = new Bitmap [2];

        pipe[0] = BitmapFactory.decodeResource(resources, R.drawable.toptube);
        pipe[0] = scaleImage(pipe[0], pipe[0].getWidth()/3, pipe[0].getHeight()/2);

        pipe[1] = BitmapFactory.decodeResource(resources, R.drawable.bottomtube);
        pipe[1] = scaleImage(pipe[1], pipe[1].getWidth()/3, pipe[1].getHeight()/2);


        gameOver = BitmapFactory.decodeResource(resources, R.drawable.gameover);

        retryBtn = BitmapFactory.decodeResource(resources, R.drawable.retrybtn);
        retryBtn = scaleImage(retryBtn, retryBtn.getWidth() / 3, retryBtn.getHeight() / 3);

    }

    public Bitmap getRetryBtn(){
        return retryBtn;
    }

    public Bitmap getGameOver(){
        return gameOver;
    }

    public Bitmap getPipe(int type){
        return pipe[type];
    }

    public int getPipeWidth(int type){
        return pipe[type].getWidth();
    }

    public int getPipeHeight(int type){
        return pipe[type].getHeight();
    }

    public Bitmap getMonkey(int frame){
        return monkey [frame];
    }

    public int getMonkeyWidth(){
        return monkey[0].getWidth();
    }

    public int getMonkeyHeight(){
        return monkey[0].getHeight();
    }


    public Bitmap get_background_game(){
        return background_game;
    }

    public int getBackgroundWidth(){
        return background_game.getWidth();
    }

    public int getBackgroundHeight(){
        return background_game.getHeight();
    }

    public Bitmap scaleImage(Bitmap bitmap, int newWidth, int newHeight) {
        return Bitmap.createScaledBitmap(bitmap, newWidth, newHeight, false);
    }
}
