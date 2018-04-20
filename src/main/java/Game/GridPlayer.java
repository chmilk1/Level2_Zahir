package Game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GridPlayer extends GameObject implements KeyListener{
	
	public GridPlayer(int x, int y, int width, int height)
	{
		super(x, y, width, height);
		
		this.setX(x);
		this.setY(y);
		this.setHeight(height);
		this.setWidth(width);
		
		colBox = new Rectangle(x - (width/2), y - (height/2), width, height);
	}
	
	public void update()
	{
		colBox.setBounds(getX(), getY(), getWidth(), getHeight());
	}
	
	public void draw(Graphics g)
	{
		g.drawImage(GamePanel.GPImg, getX(), getY(), getWidth(), getHeight(), null);

	}
	
	
	

	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_RIGHT)
		{
			InputManager.right_key = false;
		}
		
		
	}

}
