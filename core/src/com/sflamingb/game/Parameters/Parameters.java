package com.sflamingb.game.Parameters;

import com.badlogic.gdx.Gdx;

/**
 * Created by Russell Elfenbein on 6/19/2015.
 */
public class Parameters {
    public static int screenHeight, screenWidth, resX, resY;
    public static float scaleX, scaleY;

    public static void setScreenHeight(){
        screenHeight = Gdx.graphics.getHeight();
        screenWidth = Gdx.graphics.getWidth();
        resX = 1920;
        resY = 1080;
        scaleX = resX / screenWidth;
        scaleY = resY / screenHeight;
    }
}
