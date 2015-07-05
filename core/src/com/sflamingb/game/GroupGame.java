package com.sflamingb.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.sflamingb.game.GameScreens.GameScreen;
import com.sflamingb.game.Helpers.AssetLoader;

public class GroupGame extends Game {
	private final String LOG_TAG = GroupGame.class.getSimpleName();

	private Screen screen;
	
	@Override
	public void create () {
		Gdx.app.log(LOG_TAG, "Game Created");
		setScreen(new GameScreen());
	}

	@Override
	public void dispose(){
		super.dispose();
		AssetLoader.dispose();
	}

}
