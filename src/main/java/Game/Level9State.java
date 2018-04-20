package Game;

import Game.tiles.ElectricTile;
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

public class Level9State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 16;
	public static int thn = 3;
	public static int tw = GameRunner.WINDOW_WIDTH /twn;
	public static int th = tw;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw, th, tw,th);
GridPlayer gp = new GridPlayer(tw,th, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
SolidTile t2 = new SolidTile(tw, 0, tw, th);
SolidTile t3 = new SolidTile(2*tw, 0, tw, th);
SolidTile t4 = new SolidTile(3*tw, 0, tw, th);
ElectricTile t5 = new ElectricTile(4*tw, 0, tw, th, -1);
ElectricTile t6 = new ElectricTile(5*tw, 0, tw, th, -1);
ElectricTile t7 = new ElectricTile(6*tw, 0, tw, th, -1);
ElectricTile t8 = new ElectricTile(7*tw, 0, tw, th, 1);
SolidTile t9 = new SolidTile(8*tw, 0, tw, th);
ElectricTile t10 = new ElectricTile(9*tw, 0, tw, th, -1);
ElectricTile t11 = new ElectricTile(10*tw, 0, tw, th, 1);
ElectricTile t12 = new ElectricTile(11*tw, 0, tw, th, -1);
SafeTile t13 = new SafeTile(12*tw, 0, tw, th);
SafeTile t14 = new SafeTile(13*tw, 0, tw, th);
SolidTile t15 = new SolidTile(14*tw, 0, tw, th);
SolidTile t16 = new SolidTile(15*tw, 0, tw, th);

SolidTile t17 = new SolidTile(0, th, tw, th);
SafeTile t18 = new SafeTile(tw, th, tw, th);
SafeTile t19 = new SafeTile(2*tw, th, tw, th);
SafeTile t20 = new SafeTile(3*tw, th, tw, th);
ElectricTile t21 = new ElectricTile(4*tw, th, tw, th, 1);
SolidTile t22 = new SolidTile(5*tw, th, tw, th);
ElectricTile t23 = new ElectricTile(6*tw, th, tw, th, 1);
ElectricTile t24 = new ElectricTile(7*tw, th, tw, th, -1);
ElectricTile t25 = new ElectricTile(8*tw, th, tw, th, -1);
ElectricTile t26 = new ElectricTile(9*tw, th, tw, th, -1);
ElectricTile t27 = new ElectricTile(10*tw, th, tw, th, -1);
ElectricTile t28 = new ElectricTile(11*tw, th, tw, th, -1);
SolidTile t29 = new SolidTile(12*tw, th, tw, th);
NextLevelTile t30 = new NextLevelTile(13*tw, th, tw, th);
SolidTile t31 = new SolidTile(14*tw, th, tw, th);
SolidTile t32 = new SolidTile(15*tw, th, tw, th);

SolidTile t33 = new SolidTile(0, 2*th, tw, th);
SolidTile t34 = new SolidTile(tw, 2*th, tw, th);
SolidTile t35 = new SolidTile(2*tw, 2*th, tw, th);
SolidTile t36 = new SolidTile(3*tw, 2*th, tw, th);
ElectricTile t37 = new ElectricTile(4*tw, 2*th, tw, th, -1);
ElectricTile t38 = new ElectricTile(5*tw, 2*th, tw, th, -1);
ElectricTile t39 = new ElectricTile(6*tw, 2*th, tw, th, -1);
ElectricTile t40 = new ElectricTile(7*tw, 2*th, tw, th, 1);
SolidTile t41 = new SolidTile(8*tw, 2*th, tw, th);
ElectricTile t42 = new ElectricTile(9*tw, 2*th, tw, th, -1);
ElectricTile t43 = new ElectricTile(10*tw, 2*th, tw, th, 1);
ElectricTile t44 = new ElectricTile(11*tw, 2*th, tw, th, -1);
SafeTile t45 = new SafeTile(12*tw, 2*th, tw, th);
SafeTile t46 = new SafeTile(13*tw, 2*th, tw, th);
SolidTile t47 = new SolidTile(14*tw, 2*th, tw, th);
SolidTile t48 = new SolidTile(15*tw, 2*th, tw, th);

public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level9State()
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

public void updateLevel9State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw);
		gp.setY(th);
		
		player.setX(tw);
		player.setY(th);
		
		manager.resetElectric();
		player.isAlive = true;
		
	}

	
}

public void boundChecker()
{
	if(gp.getX() < 0) {
		gp.setX(0);}
	if(gp.getX() >tw*16 - gp.getWidth()) {
		gp.setX(tw*16 - gp.getWidth());}
	if(gp.getY() < 0) {
		gp.setY(0);}
	if(gp.getY() > th*3 - gp.getHeight()) {
		gp.setY(th*3 - gp.getHeight());}

}

public void winChecker()
{
	if(player.getX() == t30.getX() && player.getY() == t30.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv9);
		GameRunner.getFrame().add(GameRunner.lv10);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv10);
		GameRunner.lv10.startGame();
	}
}

public void drawLevel9State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel9State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel9State();
	
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



