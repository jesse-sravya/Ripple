package jesse.games.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;

import jesse.games.gameworld.GameRenderer;
import jesse.games.gameworld.GameWorld;

/**
 * Created by jesse on 26/7/16.
 */
public class GameScreen implements Screen {

    private GameWorld gameWorld;
    private GameRenderer gameRenderer;

    public GameScreen() {
        Gdx.app.log("GameScreen", "Attached");
        gameWorld = new GameWorld();
        gameRenderer = new GameRenderer(gameWorld);
    }

    @Override
    public void render(float delta) {
        // Sets a Color to Fill the Screen with RGB and Opacity of 1 (100%)
        Gdx.gl.glClearColor(0/255.0f, 51/255.0f, 102/255.0f, 1f);
        // Fills the screen with the selected color
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        // Covert Frame rate to String, print it
        Gdx.app.log("GameScreen FPS", (1/delta) + "");

        gameWorld.update(delta);
        gameRenderer.render();
    }

    @Override
    public void show() {
        Gdx.app.log("GameScreen", "show called");
    }

    @Override
    public void resize(int width, int height) {
        Gdx.app.log("GameScreen", "resize called");
    }

    @Override
    public void pause() {
        Gdx.app.log("GameScreen", "pause called");
    }

    @Override
    public void resume() {
        Gdx.app.log("GameScreen", "resume called");
    }

    @Override
    public void hide() {
        Gdx.app.log("GameScreen", "hide called");
    }

    @Override
    public void dispose() {
    }
}
