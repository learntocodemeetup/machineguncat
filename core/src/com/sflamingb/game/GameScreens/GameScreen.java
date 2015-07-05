package com.sflamingb.game.GameScreens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.sflamingb.game.GameWorld.GameRenderer;
import com.sflamingb.game.GameWorld.GameWorld;
import com.sflamingb.game.Helpers.InputHandler;

/**
 * Created by Russell Elfenbein on 6/19/2015.
 */
public class GameScreen implements Screen {
    private final String LOG_TAG = GameScreen.class.getSimpleName();

    private GameWorld world;
    private GameRenderer renderer;
    private float runTime;

    public GameScreen(){
        Gdx.app.log(LOG_TAG, "GameScreen Attached");
        world = new GameWorld();
        renderer = new GameRenderer(world);
        Gdx.input.setInputProcessor(new InputHandler(world));
    }

    @Override
    public void show() {
        Gdx.app.log(LOG_TAG, "GameScreen show()");
    }

    @Override
    public void render(float delta) {
        Gdx.app.log(LOG_TAG, "GameScreen render()");
        Gdx.app.log(LOG_TAG, "FPS: " + 1/delta);

        world.update(delta);
        renderer.render(delta);
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log(LOG_TAG, "GameScreen resize()");
    }

    @Override
    public void pause() {
        Gdx.app.log(LOG_TAG, "GameScreen pause()");
    }

    @Override
    public void resume() {
        Gdx.app.log(LOG_TAG, "GameScreen resume()");
    }

    @Override
    public void hide() {
        Gdx.app.log(LOG_TAG, "GameScreen hide()");
    }

    @Override
    public void dispose() {
    }
}
