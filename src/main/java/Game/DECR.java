package Game;

import Game.tiles.ElectricTile;

import java.awt.Graphics;

public class DECR extends GameObject{
	public static final int on = 1;
	public static final int off = -1;
	public static int superstate;
	public static final int o = 1;
	public static final int no = -1;
	
	public DECR(int x, int y, int width, int height, int state)
	{
		super(x, y, width, height);
		
		ElectricTile.superstate = 1;
		
		this.setX(x);
		this.setY(y);
		this.setWidth(width);
		this.setHeight(height);
		this.state = state;
	}
	
	public void update()
	{
		colBox.setBounds(getX(), getY(), getWidth(), getHeight());
	}
	
	public void draw(Graphics g)
	{
		if(state == 1)
		{
		g.drawImage(GamePanel.DECROnImg, getX(), getY(), getWidth(), getHeight(), null);
		}
		if(state == -1)
		{
			g.drawImage(GamePanel.DECROffImg, getX(), getY(), getWidth(), getHeight(), null);
		}
	}
	
}
