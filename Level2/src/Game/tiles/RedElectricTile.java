package Game.tiles;

import Game.GamePanel;

import java.awt.*;

public class RedElectricTile extends Tile {
	
	public RedElectricTile(int x, int y, int width, int height, int RState)
	{
		super(x, y, width, height);
		this.RState = RState;
		direction = 0;
	}
	
	public void draw(Graphics g)
	{
		if(RState == 1)
		{
		g.drawImage(GamePanel.ONRTImg, x, y, width, height, null);
		}
		if(RState == -1)
		{
			g.drawImage(GamePanel.OFFRTImg, x, y, width, height, null);
		}
	}
	
}