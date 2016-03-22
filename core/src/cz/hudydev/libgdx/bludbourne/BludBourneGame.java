package cz.hudydev.libgdx.bludbourne;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import cz.hudydev.libgdx.bludbourne.screens.MainGameScreen;

public class BludBourneGame extends Game {

	public static final MainGameScreen MAIN_GAME_SCREEN = new MainGameScreen();


	@Override
	public void create() {
		setScreen(MAIN_GAME_SCREEN);
	}

	@Override
	public void dispose() {
		MAIN_GAME_SCREEN.dispose();
	}
}
