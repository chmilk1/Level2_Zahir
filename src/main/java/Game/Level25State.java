package Game;

import Game.tiles.RedTile;
import Game.tiles.RightConveyerBelt;
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

public class Level25State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 16;
	public static int thn = 3;
	public static int tw = GameRunner.WINDOW_WIDTH /twn;
	public static int th = tw;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw, th, tw,th);
GridPlayer gp = new GridPlayer(tw,th, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
RedTile t2 = new RedTile(tw, 0, tw, th);
LeftConveyerBelt t3 = new LeftConveyerBelt(2*tw, 0, tw, th);
DoubleLCB t4 = new DoubleLCB(3*tw, 0, tw, th);
DoubleLCB t5 = new DoubleLCB(4*tw, 0, tw, th);
DoubleLCB t6 = new DoubleLCB(5*tw, 0, tw, th);
SafeTile t7 = new SafeTile(6*tw, 0, tw, th);
DoubleRCB t8 = new DoubleRCB(7*tw, 0, tw, th);
DoubleRCB t9 = new DoubleRCB(8*tw, 0, tw, th);
DoubleRCB t10 = new DoubleRCB(9*tw, 0, tw, th);
RightConveyerBelt t11 = new RightConveyerBelt(10*tw, 0, tw, th);
RedTile t12 = new RedTile(11*tw, 0, tw, th);
SolidTile t13 = new SolidTile(12*tw, 0, tw, th);

SolidTile t14 = new SolidTile(0, th, tw, th);
SafeTile t15 = new SafeTile(tw, th, tw, th);
LeftConveyerBelt t16 = new LeftConveyerBelt(2*tw, th, tw, th);
LeftConveyerBelt t17 = new LeftConveyerBelt(3*tw, th, tw, th);
DoubleLCB t18 = new DoubleLCB(4*tw, th, tw, th);
DoubleLCB t19 = new DoubleLCB(5*tw, th, tw, th);
SafeTile t20 = new SafeTile(6*tw, th, tw, th);
DoubleRCB t21 = new DoubleRCB(7*tw, th, tw, th);
DoubleRCB t22 = new DoubleRCB(8*tw, th, tw, th);
RightConveyerBelt t23 = new RightConveyerBelt(9*tw, th, tw, th);
RightConveyerBelt t24 = new RightConveyerBelt(10*tw, th, tw, th);
NextLevelTile t25 = new NextLevelTile(11*tw, th, tw, th);
SolidTile t26 = new SolidTile(12*tw, th, tw, th);

SolidTile t27 = new SolidTile(0, th*2, tw, th);
RedTile t28 = new RedTile(tw, th*2, tw, th);
LeftConveyerBelt t29 = new LeftConveyerBelt(2*tw, th*2, tw, th);
DoubleLCB t30 = new DoubleLCB(3*tw, th*2, tw, th);
DoubleLCB t31 = new DoubleLCB(4*tw, th*2, tw, th);
DoubleLCB t32 = new DoubleLCB(5*tw, th*2, tw, th);
SafeTile t33 = new SafeTile(6*tw, th*2, tw, th);
DoubleRCB t34 = new DoubleRCB(7*tw, th*2, tw, th);
DoubleRCB t35 = new DoubleRCB(8*tw, th*2, tw, th);
DoubleRCB t36 = new DoubleRCB(9*tw, th*2, tw, th);
RightConveyerBelt t37 = new RightConveyerBelt(10*tw, th*2, tw, th);
RedTile t38 = new RedTile(11*tw, th*2, tw, th);
SolidTile t39 = new SolidTile(12*tw, th*2, tw, th);

RMTile t40 = new RMTile(6*tw, 2*th, tw, th, 1);

Pawn e1 = new Pawn(11*tw, th, tw, th);


public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level25State()
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

public void updateLeve25State() {
	
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
		
		e1.setX(11*tw);
		e1.setY(th);
		
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
	if(player.getX() == t25.getX() && player.getY() == t25.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv25);
		GameRunner.getFrame().add(GameRunner.lv26);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv26);
		GameRunner.lv26.startGame();
	}
}

public void drawLeve25State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLeve25State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLeve25State();
	
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



