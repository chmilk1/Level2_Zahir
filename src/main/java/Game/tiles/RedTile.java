package Game.tiles;

import Game.GamePanel;

import java.awt.*;

public class RedTile extends Tile {

	public RedTile(int x, int y, int width, int height)
	{
		super(x, y, width, height);
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.RTImg, getX(), getY(), getWidth(), getHeight(), null);
	}
	
}
