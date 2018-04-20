package Game;

import Game.tiles.RedElectricTile;
import Game.tiles.RedTile;
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

public class Level21State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 12;
	public static int thn = 5;
	public static int tw = GameRunner.WINDOW_WIDTH /twn;
	public static int th = tw;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw, th*2, tw,th);
GridPlayer gp = new GridPlayer(tw*1,th*2, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
SolidTile t2 = new SolidTile(tw, 0, tw, th);
SolidTile t3 = new SolidTile(tw*2, 0, tw, th);
SolidTile t4 = new SolidTile(tw*3, 0, tw, th);
SolidTile t5 = new SolidTile(tw*4, 0, tw, th);
SolidTile t6 = new SolidTile(tw*5, 0, tw, th);
SolidTile t7 = new SolidTile(tw*6, 0, tw, th);
SolidTile t8 = new SolidTile(tw*7, 0, tw, th);
SolidTile t9 = new SolidTile(tw*8, 0, tw, th);
SolidTile t10 = new SolidTile(tw*9, 0, tw, th);
SolidTile t11 = new SolidTile(tw*10, 0, tw, th);
SolidTile t12 = new SolidTile(tw*11, 0, tw, th);

RedTile t13 = new RedTile(0, th, tw, th);
RedElectricTile t14 = new RedElectricTile(tw, th, tw, th, -1);
RedTile t15 = new RedTile(tw*2, th, tw, th);
RedTile t16 = new RedTile(tw*3, th, tw, th);
RedElectricTile t17 = new RedElectricTile(tw*4, th, tw, th, -1);
RedTile t18 = new RedTile(tw*5, th, tw, th);
RedTile t19 = new RedTile(tw*6, th, tw, th);
RedTile t20 = new RedTile(tw*7, th, tw, th);
RedTile t21 = new RedTile(tw*8, th, tw, th);
RedTile t22 = new RedTile(tw*9, th, tw, th);
RedElectricTile t23 = new RedElectricTile(tw*10, th, tw, th, -1);
RedTile t24 = new RedTile(tw*11, th, tw, th);

RedTile t25 = new RedTile(0, th*2, tw, th);
RedElectricTile t26 = new RedElectricTile(tw, th*2, tw, th, -1);
RedTile t27 = new RedTile(tw*2, th*2, tw, th);
RedTile t28 = new RedTile(tw*3, th*2, tw, th);
RedElectricTile t29 = new RedElectricTile(tw*4, th*2, tw, th, -1);
RedTile t30 = new RedTile(tw*5, th*2, tw, th);
RedTile t31 = new RedTile(tw*6, th*2, tw, th);
RedElectricTile t32 = new RedElectricTile(tw*7, th*2, tw, th, -1);
RedTile t33 = new RedTile(tw*8, th*2, tw, th);
RedTile t34 = new RedTile(tw*9, th*2, tw, th);
NextLevelTile t35 = new NextLevelTile(tw*10, th*2, tw, th);
RedTile t36 = new RedTile(tw*11, th*2, tw, th);

RedTile t37 = new RedTile(0, th*3, tw, th);
RedTile t38 = new RedTile(tw, th*3, tw, th);
RedTile t39 = new RedTile(tw*2, th*3, tw, th);
RedTile t40 = new RedTile(tw*3, th*3, tw, th);
RedElectricTile t41 = new RedElectricTile(tw*4, th*3, tw, th, -1);
RedTile t42 = new RedTile(tw*5, th*3, tw, th);
RedTile t43 = new RedTile(tw*6, th*3, tw, th);
RedElectricTile t44 = new RedElectricTile(tw*7, th*3, tw, th, -1);
RedTile t45 = new RedTile(tw*8, th*3, tw, th);
RedTile t46 = new RedTile(tw*9, th*3, tw, th);
RedElectricTile t47 = new RedElectricTile(tw*10, th*3, tw, th, -1);
RedTile t48 = new RedTile(tw*11, th*3, tw, th);

SolidTile t49 = new SolidTile(0, th*4, tw, th);
SolidTile t50 = new SolidTile(tw, th*4, tw, th);
SolidTile t51 = new SolidTile(tw*2, th*4, tw, th);
SolidTile t52 = new SolidTile(tw*3, th*4, tw, th);
SolidTile t53 = new SolidTile(tw*4, th*4, tw, th);
SolidTile t54 = new SolidTile(tw*5, th*4, tw, th);
SolidTile t55 = new SolidTile(tw*6, th*4, tw, th);
SolidTile t56 = new SolidTile(tw*7, th*4, tw, th);
SolidTile t57 = new SolidTile(tw*8, th*4, tw, th);
SolidTile t58 = new SolidTile(tw*9, th*4, tw, th);
SolidTile t59 = new SolidTile(tw*10, th*4, tw, th);
SolidTile t60 = new SolidTile(tw*11, th*4, tw, th);

Pawn e1 = new Pawn(10*tw, 2*th, tw, th);


public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level21State()
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
	manager.addObject(t57);
	manager.addObject(t58);
	manager.addObject(t59);
	manager.addObject(t60);
	
	manager.addObject(e1);
	
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

public void updateLevel21State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw* 1);
		gp.setY(th*2);
		
		
		player.setX(tw*1);
		player.setY(th*2);
		
		manager.redTileReset();
		
		e1.setX(tw*10);
		e1.setY(th*2);
		
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
	if(player.getX() == t35.getX() && player.getY() == t35.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv21);
		GameRunner.getFrame().add(GameRunner.lv22);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv22);
		GameRunner.lv22.startGame();
	}
}

public void drawLevel21State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}


public void paintComponent(Graphics g) {
	drawLevel21State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel21State();
	
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
		KeyHandler.enterPressed = true;
		manager.moveTile(tw, twn, thn);
		player.setX(gp.getX());
		player.setY(gp.getY());
		manager.checkCollision(player, tw);
		manager.switchState();
		manager.movePawn(tw, twn * tw, thn*th, player);
		manager.moveRook(tw, twn * tw, thn*th, player);
		manager.checkRedState(player);
		InputManager.horizontal = false;
		InputManager.vertical = false;
		KeyHandler.enterPressed = false;
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}

{

}
}
