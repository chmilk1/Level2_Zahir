package Game.tiles;

import Game.GamePanel;

import java.awt.*;

public class SolidTile extends Tile {

	public SolidTile(int x, int y, int width, int height)
	{
		super(x, y, width, height);

		colBox = new Rectangle(x - (width/2), y - (height/2), width, height);
	}

	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.BTImg, getX(), getY(), getWidth(), getHeight(), null);
	}
	
}

