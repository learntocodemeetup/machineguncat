package com.sflamingb.game.Helpers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.sflamingb.game.GameWorld.GameWorld;


/**
 * Created by Russell Elfenbein on 6/19/2015.
 */
public class InputHandler implements InputProcessor{
    private final String LOG_TAG = InputHandler.class.getSimpleName();
    private GameWorld world;

    public InputHandler(GameWorld world){
        this.world = world;
    }

    @Override
    public boolean keyDown(int keycode) {
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        Gdx.app.log(LOG_TAG, "Touched ( " + screenX + ", " + screenY + " )");

        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}
