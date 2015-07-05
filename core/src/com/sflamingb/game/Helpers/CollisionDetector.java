package com.sflamingb.game.Helpers;

import com.badlogic.gdx.Gdx;
import com.sflamingb.game.GameWorld.GameWorld;

/**
 * Created by Russell Elfenbein on 6/19/2015.
 */
public class CollisionDetector {
    private int collision = 0;
    private final String LOG_TAG  = CollisionDetector.class.getSimpleName();
    private GameWorld world;
    public CollisionDetector(GameWorld world){
        this.world = world;
    }

    public void detect(){


        //whenever a collision is detected add to the collision variable to change log output
        switch(collision){
            case 0:
                Gdx.app.log(LOG_TAG, "No collisions detected.");
                break;
            default:
                Gdx.app.log(LOG_TAG, "There were " + collision + " collisions detected.");
                collision = 0;
                break;
        }

    }
}
