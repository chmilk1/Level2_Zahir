package com.github.zahir.level2;

import com.github.zahir.level2.tiles.RedTile;

import java.awt.*;

public class Player extends GameObject {


    public Player(int x, int y, int width, int height) {
        super(x, y, width, height);

        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);

        colBox = new Rectangle(x - (width / 2), y - (height / 2), width, height);
    }

    public void update() {
        if (isColliding && collisionObject instanceof RedTile) {
            isAlive = false;
        }
        colBox.setBounds(getX(), getY(), getWidth(), getHeight());
    }

    public void draw(Graphics g) {
        g.drawImage(GamePanel.PlayerImg, getX(), getY(), getWidth(), getHeight(), null);

    }


}
