package jesse.games;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;

import jesse.games.screens.GameScreen;

public class MyGame extends Game {

	@Override
	public void create() {
		Gdx.app.log("MyGame", "created");
		setScreen(new GameScreen());
	}
}
