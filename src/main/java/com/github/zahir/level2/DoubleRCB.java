package com.github.zahir.level2;

import java.awt.*;

public class DoubleRCB extends GameObject {

    public boolean cColl;

    public DoubleRCB(int x, int y, int width, int height) {
        super(x, y, width, height);

        this.setX(x);
        this.setY(y);
        this.setWidth(width);
        this.setHeight(height);

        cColl = false;

        colBox = new Rectangle(x - (width / 2), y - (height / 2), width, height);
    }

    public void update() {

        colBox.setBounds(getX(), getY(), getWidth(), getHeight());
    }

    public void draw(Graphics g) {
        g.drawImage(GamePanel.DCRImg, getX(), getY(), getWidth(), getHeight(), null);

    }

}