package Game;

import Game.tiles.RedTile;
import Game.tiles.SafeTile;
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



public class Level5State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 10;
	public static int thn = 5;
	public static int tw = GameRunner.WINDOW_WIDTH /twn;
	public static int th = GameRunner.WINDOW_HEIGHT /thn;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw,2*th, tw,th);
GridPlayer gp = new GridPlayer(tw,2*th, tw,th);

SolidTile t1 = new SolidTile(0,0,tw,th);
SolidTile t2 = new SolidTile(tw,0,tw,th);
SolidTile t3 = new SolidTile(tw * 2,0,tw,th); 
SolidTile t4 = new SolidTile(tw * 3,0,tw,th);
SafeTile t5 = new SafeTile(tw * 4,0,tw,th);
SafeTile t6 = new SafeTile(tw * 5,0,tw,th);
SolidTile t7 = new SolidTile(tw * 6,0,tw,th);
SolidTile t8 = new SolidTile(tw * 7,0,tw,th);
SolidTile t9 = new SolidTile(tw * 8,0,tw,th);
SolidTile t10 = new SolidTile(tw * 9,0,tw,th);

SafeTile t11 = new SafeTile(0,th,tw,th);
SafeTile t12 = new SafeTile(tw,th,tw,th);
SafeTile t13 = new SafeTile(tw * 2,th,tw,th);
RedTile t14 = new RedTile(tw * 3,th,tw,th);
SafeTile t15 = new SafeTile(tw * 4,th,tw,th);
SafeTile t16 = new SafeTile(tw * 5,th,tw,th);
SolidTile t17 = new SolidTile(tw * 6,th,tw,th);
SafeTile t18 = new SafeTile(tw * 7,th,tw,th);
SafeTile t19 = new SafeTile(tw * 8,th,tw,th);
SafeTile t20 = new SafeTile(tw * 9,th,tw,th);

SafeTile t21 = new SafeTile(0,2*th,tw,th);
SafeTile t22 = new SafeTile(tw,2*th,tw,th);
SafeTile t23 = new SafeTile(tw * 2,2*th,tw,th);
SolidTile t24 = new SolidTile(tw * 3,2*th,tw,th);
SafeTile t25 = new SafeTile(tw * 4,2*th,tw,th);
SafeTile t26 = new SafeTile(tw * 5,2*th,tw,th);
RedTile t27 = new RedTile(tw * 6,2*th,tw,th);
SafeTile t28 = new SafeTile(tw * 7,2*th,tw,th);
NextLevelTile t29 = new NextLevelTile(tw * 8,2*th,tw,th);
SafeTile t30 = new SafeTile(tw * 9,2*th,tw,th);

SafeTile t31 = new SafeTile(0,3*th,tw,th);
SafeTile t32 = new SafeTile(tw,3*th,tw,th);
SafeTile t33 = new SafeTile(tw * 2,3*th,tw,th);
RedTile t34 = new RedTile(tw * 3,3*th,tw,th);
SafeTile t35 = new SafeTile(tw * 4,3*th,tw,th);
SafeTile t36 = new SafeTile(tw * 5,3*th,tw,th);
SolidTile t37 = new SolidTile(tw * 6,3*th,tw,th);
SafeTile t38 = new SafeTile(tw * 7,3*th,tw,th);
SafeTile t39 = new SafeTile(tw * 8,3*th,tw,th);
SafeTile t40 = new SafeTile(tw * 9,3*th,tw,th);

SolidTile t41 = new SolidTile(0,4*th,tw,th);
SolidTile t42 = new SolidTile(tw,4*th,tw,th);
SolidTile t43 = new SolidTile(tw * 2,4*th,tw,th);
SolidTile t44 = new SolidTile(tw * 3,4*th,tw,th);
SafeTile t45 = new SafeTile(tw * 4,4*th,tw,th);
SafeTile t46 = new SafeTile(tw * 5,4*th,tw,th);
SolidTile t47 = new SolidTile(tw * 6,4*th,tw,th);
SolidTile t48 = new SolidTile(tw * 7,4*th,tw,th);
SolidTile t49 = new SolidTile(tw * 8,4*th,tw,th);
SolidTile t50 = new SolidTile(tw * 9,4*th,tw,th);

SolidTile t55 = new SolidTile(4*tw, 5*th, tw, th);
SolidTile t56 = new SolidTile(5*tw, 5*th, tw, th);


RMTile t51 = new RMTile(tw * 4,4*th,tw,th,1);
RMTile t52 = new RMTile(tw * 5,4*th,tw,th,1);
RMTile t53 = new RMTile(tw * 4,3*th,tw,th,1);
RMTile t54 = new RMTile(tw * 5,3*th,tw,th,1);



public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level5State()
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
	manager.addObject(t26);
	manager.addObject(t27);
	manager.addObject(t28);
	manager.addObject(t29);
	manager.addObject(t30);
	manager.addObject(t31);
	manager.addObject(t32);
	manager.addObject(t33);
	manager.addObject(t34);
	manager.addObject(t35);
	manager.addObject(t36);
	manager.addObject(t37);
	manager.addObject(t38);
	manager.addObject(t39);
	manager.addObject(t40);
	manager.addObject(t41);
	manager.addObject(t42);
	manager.addObject(t43);
	manager.addObject(t44);
	manager.addObject(t45);
	manager.addObject(t46);
	manager.addObject(t47);
	manager.addObject(t48);
	manager.addObject(t49);
	manager.addObject(t50);
	manager.addObject(t51);
	manager.addObject(t52);
	manager.addObject(t53);
	manager.addObject(t54);
	manager.addObject(t55);
	manager.addObject(t56);
	
	
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

public void updateLevel5State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		
		t51.setX(tw * 4);
		t51.setY(4*th);
		t51.direction = 1;
		
		t52.setX(tw * 5);
		t52.setY(4*th);
		t52.direction = 1;
		
		t53.setX(tw * 4);
		t53.setY(3*th);
		t53.direction = 1;
		
		t54.setX(tw * 5);
		t54.setY(3*th);
		t54.direction = 1;
		
		gp.setX(tw);
		gp.setY(th*2);
		
		player.setX(tw);
		player.setY(th*2);
		player.isAlive = true;
		
		
	}

	
}

public void boundChecker()
{
	if(gp.getX() < 0) {
		gp.setX(0);}
	if(gp.getX() > GameRunner.WINDOW_WIDTH - gp.getWidth()) {
		gp.setX(GameRunner.WINDOW_WIDTH - gp.getWidth());}
	if(gp.getY() < 0) {
		gp.setY(0);}
	if(gp.getY() > GameRunner.WINDOW_HEIGHT - gp.getHeight()) {
		gp.setY(GameRunner.WINDOW_HEIGHT - gp.getHeight());}

}

public void winChecker()
{
	if(player.getX() == t29.getX() && player.getY() == t29.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv5);
		GameRunner.getFrame().add(GameRunner.lv6);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv6);
		GameRunner.lv6.startGame();
	}
}

public void drawLevel5State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel5State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel5State();
	
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
		player.setX(gp.getX());
		player.setY(gp.getY());
		InputManager.horizontal = false;
		InputManager.vertical = false;
		manager.moveTile(tw, twn * tw, thn * th);
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}
