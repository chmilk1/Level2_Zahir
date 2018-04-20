package Game;

import Game.tiles.SafeTile;
import Game.tiles.SolidTile;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Level13State  extends JPanel implements ActionListener, KeyListener{
	
public static int twn = 10;
public static int thn = 5;
public static int tw = GameRunner.WINDOW_WIDTH /twn;
public static int th = GameRunner.WINDOW_HEIGHT /thn;
	
Timer timer;
ObjectManager manager = new ObjectManager();
GridPlayer gp = new GridPlayer(2 * tw, 2 * th, tw,th);
Player player = new Player(2 * tw, 2 * th, tw,th);


SafeTile t1 = new SafeTile(0,0,tw,th);
SafeTile t2 = new SafeTile(tw,0,tw,th);
SafeTile t3 = new SafeTile(tw * 2,0,tw,th);
SafeTile t4 = new SafeTile(tw * 3,0,tw,th);
SafeTile t5 = new SafeTile(tw * 4,0,tw,th);
SolidTile t6 = new SolidTile(tw * 5,0,tw,th);
SolidTile t7 = new SolidTile(tw * 6,0,tw,th);
SolidTile t8 = new SolidTile(tw * 7,0,tw,th);
SolidTile t9 = new SolidTile(tw * 8,0,tw,th);
SolidTile t10 = new SolidTile(tw * 9,0,tw,th);

SafeTile t11 = new SafeTile(0,th,tw,th);
SafeTile t12 = new SafeTile(tw,th,tw,th);
SafeTile t13 = new SafeTile(tw * 2,th,tw,th);
SafeTile t14 = new SafeTile(tw * 3,th,tw,th);
SafeTile t15 = new SafeTile(tw * 4,th,tw,th);
SolidTile t16 = new SolidTile(tw * 5,th,tw,th);
SafeTile t17 = new SafeTile(tw * 6,th,tw,th);
SafeTile t18 = new SafeTile(tw * 7,th,tw,th);
SafeTile t19 = new SafeTile(tw * 8,th,tw,th);
SolidTile t20 = new SolidTile(tw * 9,th,tw,th);

SafeTile t21 = new SafeTile(0,2*th,tw,th);
SafeTile t22 = new SafeTile(tw,2*th,tw,th);
SafeTile t23 = new SafeTile(tw * 2,2*th,tw,th);
SafeTile t24 = new SafeTile(tw * 3,2*th,tw,th);
SafeTile t25 = new SafeTile(tw * 4,2*th,tw,th);
SafeTile t26 = new SafeTile(tw * 5,2*th,tw,th);
SafeTile t27 = new SafeTile(tw * 6,2*th,tw,th);
NextLevelTile t28 = new NextLevelTile(tw * 7,2*th,tw,th);
SafeTile t29 = new SafeTile(tw * 8,2*th,tw,th);
SolidTile t30 = new SolidTile(tw * 9,2*th,tw,th);

SafeTile t31 = new SafeTile(0,3*th,tw,th);
SafeTile t32 = new SafeTile(tw,3*th,tw,th);
SafeTile t33 = new SafeTile(tw * 2,3*th,tw,th);
SafeTile t34 = new SafeTile(tw * 3,3*th,tw,th);
SafeTile t35 = new SafeTile(tw * 4,3*th,tw,th);
SolidTile t36 = new SolidTile(tw * 5,3*th,tw,th);
SafeTile t37 = new SafeTile(tw * 6,3*th,tw,th);
SafeTile t38 = new SafeTile(tw * 7,3*th,tw,th);
SafeTile t39 = new SafeTile(tw * 8,3*th,tw,th);
SolidTile t40 = new SolidTile(tw * 9,3*th,tw,th);

SafeTile t41 = new SafeTile(0,4*th,tw,th);
SafeTile t42 = new SafeTile(tw,4*th,tw,th);
SafeTile t43 = new SafeTile(tw * 2,4*th,tw,th);
SafeTile t44 = new SafeTile(tw * 3,4*th,tw,th);
SafeTile t45 = new SafeTile(tw * 4,4*th,tw,th);
SolidTile t46 = new SolidTile(tw * 5,4*th,tw,th);
SolidTile t47 = new SolidTile(tw * 6,4*th,tw,th);
SolidTile t48 = new SolidTile(tw * 7,4*th,tw,th);
SolidTile t49 = new SolidTile(tw * 8,4*th,tw,th);
SolidTile t50 = new SolidTile(tw * 9,4*th,tw,th);

Pawn e1 = new Pawn(tw * 5, th * 2, tw, th);



public static BufferedImage PlayerImg;
public static BufferedImage PawnImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;
public static BufferedImage RMUpImg;
public static BufferedImage RMDownImg;
public static BufferedImage RMRImg;
public static BufferedImage RMLImg;


public Level13State()
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
	
	manager.addObject(t26);
	
	manager.addObject(e1);
	
	manager.addObject(gp);
	manager.addObject(player);
	
	try 
	{
	
		PlayerImg = ImageIO.read(this.getClass().getResourceAsStream("Player.png"));
		PawnImg = ImageIO.read(this.getClass().getResourceAsStream("Pawn.png"));
		NTImg = ImageIO.read(this.getClass().getResourceAsStream("NT.png"));
		RTImg = ImageIO.read(this.getClass().getResourceAsStream("RT.png"));
		GPImg = ImageIO.read(this.getClass().getResourceAsStream("GP.png"));
		deathImg = ImageIO.read(this.getClass().getResourceAsStream("death.png"));
		wtImg = ImageIO.read(this.getClass().getResourceAsStream("wt.png"));
		ONETImg = ImageIO.read(this.getClass().getResourceAsStream("ONET.png"));
		OFFETImg = ImageIO.read(this.getClass().getResourceAsStream("OFFET.png"));
		BTImg = ImageIO.read(this.getClass().getResourceAsStream("BT.png"));
		
		RMUpImg = ImageIO.read(this.getClass().getResourceAsStream("RMUp.png"));
		RMDownImg = ImageIO.read(this.getClass().getResourceAsStream("RMDown.png"));
		RMRImg = ImageIO.read(this.getClass().getResourceAsStream("RMR.png"));
		RMLImg = ImageIO.read(this.getClass().getResourceAsStream("RML.png"));
		
		
		
	} 
	catch (IOException e) {
		e.printStackTrace();
	}

}

public void startGame()
{
	timer.start();
	
	Sound.gameSong.loop();
}

public void updateMenuState() {

}

public void updateLevel13State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	
	if(player.isAlive == false)
	{
		
		player.setX(2*tw);
		player.setY(2*tw);
		
		gp.setX(2*tw);
		gp.setY(2*tw);
		
		e1.setX(tw * 5);
		e1.setY(th * 2);
		
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
	if(player.getX() == t28.getX() && player.getY() == t28.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv13);
		GameRunner.getFrame().add(GameRunner.lv14);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv14);
		GameRunner.lv14.startGame();
		
	}
}

public void drawLevel13State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel13State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel13State();
	
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
		
		manager.moveTile(tw, twn, thn);
		player.setX(gp.getX());
		player.setY(gp.getY());
		manager.checkCollision(player, tw);
		manager.movePawn(tw, twn * tw, thn*th, player);
		InputManager.horizontal = false;
		InputManager.vertical = false;
		
	}
	
}

@Override
public void keyReleased(KeyEvent e) {
	
}


}

