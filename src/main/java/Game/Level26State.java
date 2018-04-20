package Game;

import Game.tiles.ElectricTile;
import Game.tiles.RedTile;

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

public class Level26State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 5;
	public static int thn = 10;
	public static int th = GameRunner.WINDOW_HEIGHT /thn;
	public static int tw = th;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*2, 0, tw,th);
GridPlayer gp = new GridPlayer(tw*2,0, tw,th);

RedTile t1 = new RedTile(0, 0, tw, th);
RedTile t2 = new RedTile(tw, 0, tw, th);
ElectricTile t3 = new ElectricTile(2*tw, 0, tw, th, -1);
RedTile t4 = new RedTile(3*tw, 0, tw, th);
RedTile t5 = new RedTile(4*tw, 0, tw, th);

RedTile t6 = new RedTile(0, th, tw, th);
RedTile t7 = new RedTile(tw, th, tw, th);
RedTile t8 = new RedTile(2*tw, th, tw, th);
RedTile t9 = new RedTile(3*tw, th, tw, th);
RedTile t10 = new RedTile(4*tw, th, tw, th);

RedTile t11 = new RedTile(0, th*2, tw, th);
RedTile t12 = new RedTile(tw, th*2, tw, th);
RedTile t13 = new RedTile(2*tw, th*2, tw, th);
RedTile t14 = new RedTile(3*tw, th*2, tw, th);
RedTile t15 = new RedTile(4*tw, th*2, tw, th);

ECR t16 = new ECR(0, th*3, tw, th, -1);
ECR t17 = new ECR(tw, th*3, tw, th, -1);
ECR t18 = new ECR(2*tw, th*3, tw, th, -1);
ECR t19 = new ECR(3*tw, th*3, tw, th, -1);
ECR t20 = new ECR(4*tw, th*3, tw, th, -1);

DECR t21 = new DECR(0, th*4, tw, th, -1);
DECR t22 = new DECR(tw, th*4, tw, th, -1);
DECR t23 = new DECR(2*tw, th*4, tw, th, -1);
DECR t24 = new DECR(3*tw, th*4, tw, th, -1);
DECR t25 = new DECR(4*tw, th*4, tw, th, -1);

DECL t26 = new DECL(0, th*5, tw, th, 1);
DECL t27 = new DECL(tw, th*5, tw, th, 1);
DECL t28 = new DECL(2*tw, th*5, tw, th, 1);
DECL t29 = new DECL(3*tw, th*5, tw, th, 1);
DECL t30 = new DECL(4*tw, th*5, tw, th, 1);

ECL t31 = new ECL(0, th*6, tw, th, 1);
ECL t32 = new ECL(tw, th*6, tw, th, 1);
ECL t33 = new ECL(2*tw, th*6, tw, th, 1);
ECL t34 = new ECL(3*tw, th*6, tw, th, 1);
ECL t35 = new ECL(4*tw, th*6, tw, th, 1);

RedTile t36 = new RedTile(0, th*7, tw, th);
RedTile t37 = new RedTile(tw, th*7, tw, th);
RedTile t38 = new RedTile(2*tw, th*7, tw, th);
RedTile t39 = new RedTile(3*tw, th*7, tw, th);
RedTile t40 = new RedTile(4*tw, th*7, tw, th);

RedTile t41 = new RedTile(0, th*8, tw, th);
RedTile t42 = new RedTile(tw, th*8, tw, th);
RedTile t43 = new RedTile(2*tw, th*8, tw, th);
RedTile t44 = new RedTile(3*tw, th*8, tw, th);
RedTile t45 = new RedTile(4*tw, th*8, tw, th);

RedTile t46 = new RedTile(0, th*9, tw, th);
RedTile t47 = new RedTile(tw, th*9, tw, th);
NextLevelTile t48 = new NextLevelTile(2*tw, th*9, tw, th);
RedTile t49 = new RedTile(3*tw, th*9, tw, th);
RedTile t50 = new RedTile(4*tw, th*9, tw, th);

Pawn e1 = new Pawn(tw*2, th*9, tw, th);

public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level26State()
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

public void updateLeve26State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw*2);
		gp.setY(0);
		
		player.setX(tw*2);
		player.setY(0);
		
		e1.setX(tw*2);
		e1.setY(th*9);
		
		manager.resetElectric();
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
	
	if(player.getX() < 0) {
		player.setX(0);}
	if(player.getX() >tw*twn - player.getWidth()) {
		player.setX(tw*twn - player.getWidth());}
	if(player.getY() < 0) {
		player.setY(0);}
	if(player.getY() > th*thn - player.getHeight()) {
		player.setY(th*thn - player.getHeight());}

}

public void winChecker()
{
	if(player.getX() == t48.getX() && player.getY() == t48.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv26);
		GameRunner.getFrame().add(GameRunner.lv27);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv27);
		GameRunner.lv27.startGame();
	}
}

public void drawLeve26State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLeve26State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLeve26State();
	
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
		manager.cb = false;
		manager.moveTile(tw, twn, thn + 2*tw);
		player.setX(gp.getX());
		player.setY(gp.getY());
		
		manager.switchState();
		manager.rightConveyerBelt(player, gp, tw);
		manager.movePawn(tw, twn * tw, thn*th, player);
		manager.moveRook(tw, twn * tw, thn*th, player);
		manager.checkRedState(player);
		
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}



