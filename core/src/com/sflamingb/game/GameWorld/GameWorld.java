package com.sflamingb.game.GameWorld;

import com.badlogic.gdx.Gdx;
import com.sflamingb.game.GameObjects.Dog;
import com.sflamingb.game.GameObjects.Kitty;
import com.sflamingb.game.Helpers.AssetLoader;
import com.sflamingb.game.Helpers.CollisionDetector;
import com.sflamingb.game.Helpers.InputHandler;
import com.sflamingb.game.Parameters.Parameters;

/**
 * Created by Russell Elfenbein on 6/19/2015.
 */
public class GameWorld {
    //set log tag to be simple name of class
    private final String LOG_TAG = GameWorld.class.getSimpleName();
    private InputHandler inputHandler;
    private CollisionDetector collisionDetector;

    private Kitty kitty;
    private Dog dog;

    public GameWorld(){
        //Gameworld constructor
        Gdx.app.log(LOG_TAG, "GameWorld Created");
        Parameters.setScreenHeight();
        inputHandler = new InputHandler(this);
        collisionDetector = new CollisionDetector(this);
        AssetLoader.load();

        kitty = new Kitty();
        dog = new Dog();
    }

    public void update(float delta){
        Gdx.app.log(LOG_TAG, "Gameworld Updating");
        //all game world logic goes here
        kitty.update(delta);

        //update game world objects then detect collisions
        collisionDetector.detect();


    }

    public Kitty getKitty(){
        return kitty;
    }
    public Dog getDog(){
        return dog;
    }
}
