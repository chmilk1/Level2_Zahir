package Game.tiles;

import Game.GamePanel;

import java.awt.*;

public class ElectricTile extends Tile {
	public static int superstate = 1;
	
	public ElectricTile(int x, int y, int width, int height, int state)
	{
		super(x, y, width, height);
		this.state = state;
	}

	public void draw(Graphics g)
	{
		if(state == 1)
		{
			g.drawImage(GamePanel.ONETImg, getX(), getY(), getWidth(), getHeight(), null);
		}
		if(state == -1)
		{
			g.drawImage(GamePanel.OFFETImg, getX(), getY(), getWidth(), getHeight(), null);
		}
	}

}
