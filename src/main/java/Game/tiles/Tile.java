package Game.tiles;

import Game.GameObject;

import java.awt.*;

/**
 * Created by jamesmaron on 3/8/18.
 */
public abstract class Tile extends GameObject {
    public Tile(int x, int y, int w, int h) {
        super(x, y, w, h);
    }

    public void update()
    {
        colBox.setBounds(getX(), getY(), getWidth(), getHeight());
    }

    abstract public void draw(Graphics g);
}
