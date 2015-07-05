package com.sflamingb.game.GameObjects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.sflamingb.game.Helpers.AssetLoader;
import com.sflamingb.game.Parameters.Parameters;

/**
 * Created by Russell Elfenbein on 7/1/2015.
 */
public class Kitty {
    //Create a log string to identify this class
    private final String LOG_TAG = Kitty.class.getSimpleName();

    /**
     * Declare all variables here
     */
    //location of the cat and rotation
    private int posX, posY, rotation;
    //width and height
    private float width, height;
    private boolean shooting;

    //For the Animation to determine the correct frame, it
    //needs a reference to time
    //Runtime variable will be added to in each frame
    //when the cat is being animated, eg. during firing.
    private long runTime;

    //Construct the kitty. When this class is created, these are the default values
    public Kitty(){
        posX = Parameters.screenWidth/2;
        posY = Parameters.screenHeight/2;
        width = 200;
        width = 300;
        rotation = 0;
        runTime = 0;
        shooting = false;
    }

    //Draw the 'Sprites' for kitty.
    //in this case we are grabbing the frame from an animation array
    public void drawSprite(SpriteBatch batcher, float delta){
        batcher.draw(AssetLoader.catAnimation.getKeyFrame(runTime),posX, posY,0,0,200, 300,1,1,rotation);
    }

    //Draw lines and shapes etc - eg. hitboxes
    public void drawShapes(ShapeRenderer renderer){

    }

    //How will kitty change during each frame?
    //Put that stuff in here
    public void update(float delta){
        if(shooting){
            //Delta is the time difference between each frame
            runTime += delta;
        }



    }

    public void shoot(){

    }

}
