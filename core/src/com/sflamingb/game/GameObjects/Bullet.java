package com.sflamingb.game.GameObjects;

import com.sflamingb.game.Parameters.Parameters;

/**
 * Created by Russell Elfenbein on 7/1/2015.
 */
public class Bullet {
    public int posX, posY, radius;
    public int velocityX, velocityY;

    public Bullet(int vX, int vY){
        posX = Parameters.screenWidth/2;
        posY = Parameters.screenHeight/2;
        radius = 5;
    }

    public void update(){

    }

}
