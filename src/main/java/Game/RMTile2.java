package Game;

import java.awt.Graphics;
import java.awt.Rectangle;

public class RMTile2 extends GameObject{
	public static final int right = 1;
	public static final int left = -1;
	
	public RMTile2(int x, int y, int width, int height, int direction)
	{
		super(x, y, width, height);
		
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.direction = direction;
		
		colBox = new Rectangle(x - (width/2), y - (height/2), width, height);
	}
	
	public void update()
	{
		colBox.setBounds(getX(), getY(), getWidth(), getHeight());
	}
	
	public void draw(Graphics g)
	{
		if(direction == 1)
		{
		g.drawImage(GamePanel.RMRImg, getX(), getY(), getWidth(), getHeight(), null);
		}
		if(direction == -1)
		{
			g.drawImage(GamePanel.RMLImg, getX(), getY(), getWidth(), getHeight(), null);
		}
	}
	
}
