package Game;

import Game.tiles.ElectricTile;
import Game.tiles.SolidTile;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Level10State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 5;
	public static int thn = 5;
	public static int th = GameRunner.WINDOW_HEIGHT /twn;
	public static int tw = th;
	
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw, th, tw,th);
GridPlayer gp = new GridPlayer(tw,th, tw,th);

ElectricTile t1 = new ElectricTile(0, 0, tw, th, 1);
ElectricTile t2 = new ElectricTile(tw, 0, tw, th, -1);
ElectricTile t3 = new ElectricTile(2*tw, 0, tw, th, -1);
ElectricTile t4 = new ElectricTile(3*tw, 0, tw, th, -1);
ElectricTile t5 = new ElectricTile(4*tw, 0, tw, th, -1);

ElectricTile t6 = new ElectricTile(0, th, tw, th, 1);
ElectricTile t7 = new ElectricTile(tw, th, tw, th, -1);
SolidTile t8 = new SolidTile(2*tw, th, tw, th);
SolidTile t9 = new SolidTile(3*tw, th, tw, th);
ElectricTile t10 = new ElectricTile(4*tw, th, tw, th, 1);

ElectricTile t11 = new ElectricTile(0, 2*th, tw, th, 1);
SolidTile t12 = new SolidTile(tw, 2*th, tw, th);
SolidTile t13 = new SolidTile(2*tw, 2*th, tw, th);
SolidTile t14 = new SolidTile(3*tw, 2*th, tw, th);
ElectricTile t15 = new ElectricTile(4*tw, 2*th, tw, th, 1);

ElectricTile t16 = new ElectricTile(0, 3*th, tw, th, 1);
SolidTile t17 = new SolidTile(tw, 3*th, tw, th);
SolidTile t18 = new SolidTile(2*tw, 3*th, tw, th);
NextLevelTile t19 = new NextLevelTile(3*tw, 3*th, tw, th);
ElectricTile t20 = new ElectricTile(4*tw, 3*th, tw, th, 1);

ElectricTile t21 = new ElectricTile(0, 4*th, tw, th, -1);
ElectricTile t22 = new ElectricTile(tw, 4*th, tw, th, -1);
ElectricTile t23 = new ElectricTile(2*tw, 4*th, tw, th, -1);
ElectricTile t24 = new ElectricTile(3*tw, 4*th, tw, th, -1);
ElectricTile t25 = new ElectricTile(4*tw, 4*th, tw, th, 1);



public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level10State()
{
	timer = new Timer(1000/60, this);
	
	manager.addObject(t1);
	manager.addObject(t2);
	manager.addObject(t3);
	manager.addObject(t4);
	manager.addObject(t5);
	manager.addObject(t6);
	manager.addObject(t7);
	manager.addObject(t8);
	manager.addObject(t9);
	manager.addObject(t10);
	manager.addObject(t11);
	manager.addObject(t12);
	manager.addObject(t13);
	manager.addObject(t14);
	manager.addObject(t15);
	manager.addObject(t16);
	manager.addObject(t17);
	manager.addObject(t18);
	manager.addObject(t19);
	manager.addObject(t20);
	manager.addObject(t21);
	manager.addObject(t22);
	manager.addObject(t23);
	manager.addObject(t24);
	manager.addObject(t25);
	



	manager.addObject(gp);
	manager.addObject(player);
	
	try 
	{
	
		PlayerImg = ImageIO.read(this.getClass().getResourceAsStream("Player.png"));
		NTImg = ImageIO.read(this.getClass().getResourceAsStream("NT.png"));
		RTImg = ImageIO.read(this.getClass().getResourceAsStream("RT.png"));
		GPImg = ImageIO.read(this.getClass().getResourceAsStream("GP.png"));
		deathImg = ImageIO.read(this.getClass().getResourceAsStream("death.png"));
		wtImg = ImageIO.read(this.getClass().getResourceAsStream("wt.png"));
		ONETImg = ImageIO.read(this.getClass().getResourceAsStream("ONET.png"));
		OFFETImg = ImageIO.read(this.getClass().getResourceAsStream("OFFET.png"));
		BTImg = ImageIO.read(this.getClass().getResourceAsStream("BT.png"));
		
		
	} 
	catch (IOException e) {
		e.printStackTrace();
	}

}

public void startGame()
{
	timer.start();
}

public void updateLevel10State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw);
		gp.setY(th);
		
		manager.resetElectric();
		
		player.setX(tw);
		player.setY(th);
		player.isAlive = true;
		
	}

	
}

public void boundChecker()
{
	if(gp.getX() < 0) {
		gp.setX(0);}
	if(gp.getX() >tw*5 - gp.getWidth()) {
		gp.setX(tw*5 - gp.getWidth());}
	if(gp.getY() < 0) {
		gp.setY(0);}
	if(gp.getY() > th*5 - gp.getHeight()) {
		gp.setY(th*5 - gp.getHeight());}

}

public void winChecker()
{
	if(player.getX() == t19.getX() && player.getY() == t19.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv10);
		GameRunner.getFrame().add(GameRunner.lv11);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv11);
		GameRunner.lv11.startGame();
	}
}

public void drawLevel10State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel10State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel10State();
	
}

@Override
public void keyTyped(KeyEvent e) {

	
}

@Override
public void keyPressed(KeyEvent e) {
	int key = e.getKeyCode();
	
	if(InputManager.horizontal == false && InputManager.vertical == false)
	{
	if(key == KeyEvent.VK_RIGHT)
	{
		gp.setX(gp.getX() + tw);
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_LEFT)
	{
		gp.setX(gp.getX() - tw);
		InputManager.horizontal = true;
	}
	if(key == KeyEvent.VK_UP)
	{
		gp.setY(gp.getY() - th);
		InputManager.vertical = true;
	}
	if(key == KeyEvent.VK_DOWN)
	{
		gp.setY(gp.getY() + th);
		InputManager.vertical = true;
	}

	}
	
	
	
	else if(InputManager.horizontal == true)
	{
		if(key == KeyEvent.VK_RIGHT)
		{
			gp.setX(gp.getX() + tw);
			InputManager.horizontal = true;
		}
		if(key == KeyEvent.VK_LEFT)
		{
			gp.setX(gp.getX() - tw);
			InputManager.horizontal = true;
		}
		
	}
	
	else if(InputManager.vertical == true)
	{
		if(key == KeyEvent.VK_UP)
		{
			gp.setY(gp.getY() - th);
			InputManager.vertical = true;
		}
		if(key == KeyEvent.VK_DOWN)
		{
			gp.setY(gp.getY() + th);
			InputManager.vertical = true;
		}
		
		
	}
	if(gp.getX() == player.getX() && gp.getY() == player.getY())
	{
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
	if(key == KeyEvent.VK_ENTER)
	{
		manager.moveTile(tw, twn*tw, thn*th);
		manager.switchState();
		player.setX(gp.getX());
		player.setY(gp.getY());
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}


