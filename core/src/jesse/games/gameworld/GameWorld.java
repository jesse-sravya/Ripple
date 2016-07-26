package jesse.games.gameworld;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Rectangle;

/**
 * Created by jesse on 26/7/16.
 */
public class GameWorld {

    private Rectangle rect = new Rectangle(0, 0, 17, 12);

    public void update(float delta) {
        Gdx.app.log("GameWorld", "update");
        rect.x++;
        if (rect.x > 137) {
            rect.x = 0;
        }
    }

    public Rectangle getRect() {
        return rect;
    }
}
