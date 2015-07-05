package com.sflamingb.game.GameWorld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.sflamingb.game.Helpers.AssetLoader;

/**
 * Created by Russell Elfenbein on 6/19/2015.
 */
public class GameRenderer {
    private final String LOG_TAG = GameRenderer.class.getSimpleName();

    public GameWorld world;

    private float runTime;
    private int screenWidth, screenHeight, defaulyResX, defaultResY;
    private float scaleX, scaleY;
    SpriteBatch batcher;
    ShapeRenderer shapeRenderer;
    private OrthographicCamera camera;

    public GameRenderer(GameWorld world){
        Gdx.app.log(LOG_TAG, "GameRenderer Created");

        //give the renderer an instance of the game world so that we can draw everything within;
        this.world = world;

        /**
         *  Set up screen
         */

        //set game resolution. This will have to scale for different screen sizes
        defaultResY = 1080;
        defaulyResX = 1920;
        //Find out the screen size
        screenHeight = Gdx.graphics.getHeight();
        screenWidth = Gdx.graphics.getWidth();
        //Create a scale
        scaleX = defaulyResX/screenWidth;
        scaleY = defaultResY/screenHeight;
        camera = new OrthographicCamera();
        camera.setToOrtho(true, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        //instantiate objects
        batcher = new SpriteBatch();
        batcher.setProjectionMatrix(camera.combined);
        shapeRenderer = new ShapeRenderer();
        shapeRenderer.setProjectionMatrix(camera.combined);
    }

    public void render(float delta) {
        //track duration app has been running
        runTime += delta;

        //clear the background each frame to ensure no artifacts
        Gdx.gl.glClearColor(1, 0, 0, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        //draw images/sprites to frame buffer
        batcher.begin();
        batcher.draw(AssetLoader.backgroundFrame, 0, 0, 1920, 1080);
        world.getKitty().drawSprite(batcher, delta);
        batcher.end();


        //draw lines to frame buffer
        shapeRenderer.begin(ShapeRenderer.ShapeType.Line);
        // shapeRenderer.set(ShapeRenderer.ShapeType.Filled);
        shapeRenderer.setColor(0f, 0f, 1f, 0);
        shapeRenderer.circle(100,100,50);
        shapeRenderer.end();

        //Write to app log
        Gdx.app.log(LOG_TAG, "Draw Time: " + delta * 1000 + "ms, FPS: " + 1 / delta + ".");
    }
}
