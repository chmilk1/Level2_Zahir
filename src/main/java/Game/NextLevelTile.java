package Game;

import java.awt.Graphics;

public class NextLevelTile extends GameObject{
	public NextLevelTile(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
	}
	
	public void update()
	{
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.wtImg, getX(), getY(), getWidth(), getHeight(), null);
	}
}
