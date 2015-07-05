package com.sflamingb.game.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

/**
 * Created by Russell Elfenbein on 6/20/2015.
 */
public class AssetLoader {

    public static Texture objects;
    public static TextureRegion[] catFrames = new TextureRegion[3];
    public static TextureRegion dogFrame, backgroundFrame, bulletFrame;
    public static Animation catAnimation;

    public static void load(){
        objects = new Texture(Gdx.files.internal("objects.png"));
        objects.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);

        for(int i = 0; i < catFrames.length; i++){
        catFrames[i] = new TextureRegion(objects, i*200, 0, 200, 300);
        catFrames[i].flip(false, true);
        }

        dogFrame = new TextureRegion(objects, 600, 0, 200, 300);
        dogFrame.flip(false, true);

        backgroundFrame = new TextureRegion(objects, 0, 700, 400, 400);
        backgroundFrame.flip(false, true);

        bulletFrame = new TextureRegion(objects, 800, 0, 15, 50);

        catAnimation = new Animation(0.08f,catFrames );
        catAnimation.setPlayMode(Animation.PlayMode.LOOP);

    }

    public static void dispose(){
        objects.dispose();
    }


}
