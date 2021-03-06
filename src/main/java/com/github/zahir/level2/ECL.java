package com.github.zahir.level2;

import com.github.zahir.level2.tiles.ElectricTile;

import java.awt.*;

public class ECL extends GameObject {
    public static final int on = 1;
    public static final int off = -1;
    public static final int o = 1;
    public static final int no = -1;
    public static int superstate;

    public ECL(int x, int y, int width, int height, int state) {
        super(x, y, width, height);

        ElectricTile.superstate = 1;

        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);
        this.state = state;
    }

    public void update() {
        colBox.setBounds(getX(), getY(), getWidth(), getHeight());
    }

    public void draw(Graphics g) {
        if (state == 1) {
            g.drawImage(GamePanel.ECLOnImg, getX(), getY(), getWidth(), getHeight(), null);
        }
        if (state == -1) {
            g.drawImage(GamePanel.ECLOffImg, getX(), getY(), getWidth(), getHeight(), null);
        }
    }

}
