package com.github.zahir.level2.tiles;

import com.github.zahir.level2.GamePanel;

import java.awt.*;

public class SafeTile extends Tile {

	public SafeTile(int x, int y, int width, int height)
	{
		super(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.NTImg, getX(), getY(), getWidth(), getHeight(), null);
	}
	
}
