package Game;



import Game.tiles.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Level19State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 16;
	public static int thn = 3;
	public static int tw = GameRunner.WINDOW_WIDTH /twn;
	public static int th = tw;
	public static int opacity = 0;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*2, th, tw,th);
GridPlayer gp = new GridPlayer(tw*2,th, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
ElectricTile t2 = new ElectricTile(tw, 0, tw, th, -1);
ElectricTile t3 = new ElectricTile(2*tw, 0, tw, th, -1);
ElectricTile t4 = new ElectricTile(3*tw, 0, tw, th, -1);
SafeTile t5 = new SafeTile(4*tw, 0, tw, th);
SafeTile t6 = new SafeTile(5*tw, 0, tw, th);
ElectricTile t7 = new ElectricTile(6*tw, 0, tw, th, 1);
ElectricTile t8 = new ElectricTile(7*tw, 0, tw, th, 1);
ElectricTile t9 = new ElectricTile(8*tw, 0, tw, th, 1);
ElectricTile t10 = new ElectricTile(9*tw, 0, tw, th, 1);
ElectricTile t11 = new ElectricTile(10*tw, 0, tw, th, 1);
SafeTile t12 = new SafeTile(11*tw, 0, tw, th);
SafeTile t13 = new SafeTile(12*tw, 0, tw, th);
ElectricTile t14 = new ElectricTile(13*tw, 0, tw, th, -1);
RedTile t15 = new RedTile(14*tw, 0, tw, th);
RedTile t16 = new RedTile(15*tw, 0, tw, th);

SolidTile t17 = new SolidTile(0, th, tw, th);
ElectricTile t18 = new ElectricTile(tw, th, tw, th, -1);
SafeTile t19 = new SafeTile(2*tw, th, tw, th);
ElectricTile t20 = new ElectricTile(3*tw, th, tw, th, -1);
SafeTile t21 = new SafeTile(4*tw, th, tw, th);
SafeTile t22 = new SafeTile(5*tw, th, tw, th);
ElectricTile t23 = new ElectricTile(6*tw, th, tw, th, -1);
ElectricTile t24 = new ElectricTile(7*tw, th, tw, th, -1);
ElectricTile t25 = new ElectricTile(8*tw, th, tw, th, -1);
ElectricTile t26 = new ElectricTile(9*tw, th, tw, th, -1);
ElectricTile t27 = new ElectricTile(10*tw, th, tw, th, -1);
SafeTile t28 = new SafeTile(11*tw, th, tw, th);
SafeTile t29 = new SafeTile(12*tw, th, tw, th);
ElectricTile t30 = new ElectricTile(13*tw, th, tw, th, -1);
NextFloorTile t31 = new NextFloorTile(14*tw, th, tw, th);
RedTile t32 = new RedTile(15*tw, th, tw, th);

SolidTile t33 = new SolidTile(0, tw*2, tw, th);
ElectricTile t34 = new ElectricTile(tw, tw*2, tw, th, -1);
ElectricTile t35 = new ElectricTile(2*tw, tw*2, tw, th, -1);
ElectricTile t36 = new ElectricTile(3*tw, tw*2, tw, th, -1);
SafeTile t37 = new SafeTile(4*tw, tw*2, tw, th);
SafeTile t38 = new SafeTile(5*tw, tw*2, tw, th);
ElectricTile t39 = new ElectricTile(6*tw, tw*2, tw, th, 1);
ElectricTile t40 = new ElectricTile(7*tw, tw*2, tw, th, 1);
ElectricTile t41 = new ElectricTile(8*tw, tw*2, tw, th, 1);
ElectricTile t42 = new ElectricTile(9*tw, tw*2, tw, th, 1);
ElectricTile t43 = new ElectricTile(10*tw, tw*2, tw, th, 1);
SafeTile t44 = new SafeTile(11*tw, tw*2, tw, th);
SafeTile t45 = new SafeTile(12*tw, tw*2, tw, th);
ElectricTile t46 = new ElectricTile(13*tw, tw*2, tw, th, -1);
RedTile t47 = new RedTile(14*tw, tw*2, tw, th);
RedTile t48 = new RedTile(15*tw, tw*2, tw, th);

Pawn e1 = new Pawn(tw*8, th, tw, th);
Pawn e2 = new Pawn(tw*13, th, tw, th);

RMTile r1 = new RMTile(tw*5, th*1, tw, th, 1);
RMTile r2 = new RMTile(tw*11, 0, tw, th, -1);

RMTile2 r3 = new RMTile2(tw*15, th, tw, th, -1);
RMTile2 r4 = new RMTile2(tw, th, tw, th, 1);


public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level19State()
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
	
	manager.addObject(r1);
	manager.addObject(r2);
	manager.addObject(r3);
	manager.addObject(r4);
	
	manager.addObject(e1);
	manager.addObject(e2);
	
	
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

public void updateLevel17State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw* 2);
		gp.setY(th);
		
		
		player.setX(tw*2);
		player.setY(th);
		
		e1.setX(tw*8);
		e1.setY(th);
		
		e2.setX(tw*13);
		e2.setY(th);
		
		r4.setX(tw);
		r4.setY(th);
		
		r3.setX(tw*15);
		r3.setY(th);
		
		player.isAlive = true;
		
	}

	
}

public void boundChecker()
{
	if(gp.getX() < 0) {
		gp.setX(0);}
	if(gp.getX() >tw*twn - gp.getWidth()) {
		gp.setX(tw*twn - gp.getWidth());}
	if(gp.getY() < 0) {
		gp.setY(0);}
	if(gp.getY() > th*thn - gp.getHeight()) {
		gp.setY(th*thn - gp.getHeight());}

}

public void winChecker()
{
	if(player.getX() == t31.getX() && player.getY() == t31.getY())
	{
		if(opacity < 245)
		{
		if(System.currentTimeMillis() % 2 == 0)
			{
				opacity += 10;
			}
		}
		
		if(opacity >= 245)
		{
			Sound.gameSong.stop();
			FloorSelector.currentChoice = 1;
			
		FloorSelector.floor = 3;
		
			manager.reset();
			timer.stop();
			Sound.menuTrack.loop();
			GameRunner.getFrame().add(GameRunner.m);
			GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
			GameRunner.getFrame().setVisible(true);
			GameRunner.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			GameRunner.getFrame().addKeyListener(GameRunner.m);
			GameRunner.m.startGame();

		}
			
	}
}

public void drawLevel17State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}


public void paintComponent(Graphics g) {
	drawLevel17State(g);
	
	g.setColor(new Color(255, 255, 255, opacity));
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel17State();
	
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
		player.setX(gp.getX());
		player.setY(gp.getY());
		manager.movePawn(tw,twn*tw, thn*th, player);
		manager.switchState();
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}

{

}
}


