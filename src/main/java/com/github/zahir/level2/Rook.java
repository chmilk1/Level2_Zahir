package com.github.zahir.level2;

import java.awt.Graphics;
import java.awt.Rectangle;

public class Rook extends GameObject{
	

	public Rook(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		
		colBox = new Rectangle(x - (width/2), y - (height/2), width, height);
	}
	
	public void update()
	{
		
		colBox.setBounds(getX(), getY(), getWidth(), getHeight());
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.RookImg, getX(), getY(), getWidth(), getHeight(), null);

	}
	
}