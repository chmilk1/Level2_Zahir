package Game.tiles;

import Game.GamePanel;

import java.awt.*;

public class RightConveyerBelt extends Tile {
	
	public boolean cColl;
	
	public RightConveyerBelt(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
		cColl = false;
		colBox = new Rectangle(x - (width/2), y - (height/2), width, height);
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.CRImg, getX(), getY(), getWidth(), getHeight(), null);

	}
	
}