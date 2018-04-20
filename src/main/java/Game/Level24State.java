package Game;

import Game.tiles.ElectricTile;
import Game.tiles.RedTile;
import Game.tiles.RightConveyerBelt;
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

public class Level24State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 5;
	public static int thn = 16;
	public static int th = GameRunner.WINDOW_HEIGHT /thn;
	public static int tw = th;
	
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*2, th*13, tw,th);
GridPlayer gp = new GridPlayer(tw*2,th*13, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
SolidTile t2 = new SolidTile(tw, 0, tw, th);
SolidTile t3 = new SolidTile(2*tw, 0, tw, th);
SolidTile t4 = new SolidTile(3*tw, 0, tw, th);
SolidTile t5 = new SolidTile(4*tw, 0, tw, th);

SolidTile t6 = new SolidTile(0, th, tw, th);
RedTile t7 = new RedTile(tw, th, tw, th);
RedTile t8 = new RedTile(2*tw, th, tw, th);
RedTile t9 = new RedTile(3*tw, th, tw, th);
SolidTile t10 = new SolidTile(4*tw, th, tw, th);

SolidTile t11 = new SolidTile(0, 2*th, tw, th);
RedTile t12 = new RedTile(tw, 2*th, tw, th);
NextLevelTile t13 = new NextLevelTile(2*tw, 2*th, tw, th);
RedTile t14 = new RedTile(3*tw, 2*th, tw, th);
SolidTile t15 = new SolidTile(4*tw, 2*th, tw, th);

RedTile t16 = new RedTile(0, 3*th, tw, th);
RedTile t17 = new RedTile(tw, 3*th, tw, th);
RedTile t18 = new RedTile(2*tw, 3*th, tw, th);
RedTile t19 = new RedTile(3*tw, 3*th, tw, th);
RedTile t20 = new RedTile(4*tw, 3*th, tw, th);

RedTile t21 = new RedTile(0, 4*th, tw, th);
RightConveyerBelt t22 = new RightConveyerBelt(tw, 4*th, tw, th);
RightConveyerBelt t23 = new RightConveyerBelt(2*tw, 4*th, tw, th);
RightConveyerBelt t24 = new RightConveyerBelt(3*tw, 4*th, tw, th);
RedTile t25 = new RedTile(4*tw, 4*th, tw, th);

RedTile t26 = new RedTile(0, 5*th, tw, th);
LeftConveyerBelt t27 = new LeftConveyerBelt(tw, 5*th, tw, th);
LeftConveyerBelt t28 = new LeftConveyerBelt(2*tw, 5*th, tw, th);
LeftConveyerBelt t29 = new LeftConveyerBelt(3*tw, 5*th, tw, th);
RedTile t30 = new RedTile(4*tw, 5*th, tw, th);

RedTile t31 = new RedTile(0, 6*th, tw, th);
RedTile t32 = new RedTile(tw, 6*th, tw, th);
RedTile t33 = new RedTile(2*tw, 6*th, tw, th);
RedTile t34 = new RedTile(3*tw, 6*th, tw, th);
RedTile t35 = new RedTile(4*tw, 6*th, tw, th);

RedTile t36 = new RedTile(0, 7*th, tw, th);
DoubleRCB t37 = new DoubleRCB(tw, 7*th, tw, th);
DoubleRCB t38 = new DoubleRCB(2*tw, 7*th, tw, th);
DoubleRCB t39 = new DoubleRCB(3*tw, 7*th, tw, th);
RedTile t40 = new RedTile(4*tw, 7*th, tw, th);

RedTile t41 = new RedTile(0, 8*th, tw, th);
RedTile t42 = new RedTile(tw, 8*th, tw, th);
RedTile t43 = new RedTile(2*tw, 8*th, tw, th);
RedTile t44 = new RedTile(3*tw, 8*th, tw, th);
RedTile t45 = new RedTile(4*tw, 8*th, tw, th);

RedTile t46 = new RedTile(0, 9*th, tw, th);
DoubleLCB t47 = new DoubleLCB(tw, 9*th, tw, th);
DoubleLCB t48 = new DoubleLCB(2*tw, 9*th, tw, th);
DoubleLCB t49 = new DoubleLCB(3*tw, 9*th, tw, th);
RedTile t50 = new RedTile(4*tw, 9*th, tw, th);

RedTile t51 = new RedTile(0, 10*th, tw, th);
RedTile t52 = new RedTile(tw, 10*th, tw, th);
RedTile t53 = new RedTile(2*tw, 10*th, tw, th);
RedTile t54 = new RedTile(3*tw, 10*th, tw, th);
RedTile t55 = new RedTile(4*tw, 10*th, tw, th);

RedTile t56 = new RedTile(0, 11*th, tw, th);
RightConveyerBelt t57 = new RightConveyerBelt(tw, 11*th, tw, th);
RightConveyerBelt t58 = new RightConveyerBelt(2*tw, 11*th, tw, th);
RightConveyerBelt t59 = new RightConveyerBelt(3*tw, 11*th, tw, th);
RedTile t60 = new RedTile(4*tw, 11*th, tw, th);

RedTile t61 = new RedTile(0, 12*th, tw, th);
RedTile t62 = new RedTile(tw, 12*th, tw, th);
RedTile t63 = new RedTile(2*tw, 12*th, tw, th);
RedTile t64 = new RedTile(3*tw, 12*th, tw, th);
RedTile t65 = new RedTile(4*tw, 12*th, tw, th);

SolidTile t66 = new SolidTile(0, 13*th, tw, th);
ElectricTile t67 = new ElectricTile(tw, 13*th, tw, th, -1);
ElectricTile t68 = new ElectricTile(2*tw, 13*th, tw, th, -1);
ElectricTile t69 = new ElectricTile(3*tw, 13*th, tw, th, -1);
SolidTile t70 = new SolidTile(4*tw, 13*th, tw, th);

SolidTile t71 = new SolidTile(0, 14*th, tw, th);
ElectricTile t72 = new ElectricTile(tw, 14*th, tw, th, -1);
ElectricTile t73 = new ElectricTile(2*tw, 14*th, tw, th, -1);
ElectricTile t74 = new ElectricTile(3*tw, 14*th, tw, th, -1);
SolidTile t75 = new SolidTile(4*tw, 14*th, tw, th);

SolidTile t76 = new SolidTile(0, 15*th, tw, th);
SolidTile t77 = new SolidTile(tw, 15*th, tw, th);
SolidTile t78 = new SolidTile(2*tw, 15*th, tw, th);
SolidTile t79 = new SolidTile(3*tw, 15*th, tw, th);
SolidTile t80 = new SolidTile(4*tw, 15*th, tw, th);

Pawn e1 = new Pawn(2*tw, 2*th, tw, th);

public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level24State()
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
	manager.addObject(t61);
	manager.addObject(t62);
	manager.addObject(t63);
	manager.addObject(t64);
	manager.addObject(t65);
	manager.addObject(t66);
	manager.addObject(t67);
	manager.addObject(t68);
	manager.addObject(t69);
	manager.addObject(t70);
	manager.addObject(t71);
	manager.addObject(t72);
	manager.addObject(t73);
	manager.addObject(t74);
	manager.addObject(t75);
	manager.addObject(t76);
	manager.addObject(t77);
	manager.addObject(t78);
	manager.addObject(t79);
	manager.addObject(t80);
	
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

public void updateLevel24State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw*2);
		gp.setY(th*13);
		
		player.setX(tw*2);
		player.setY(th*13);
		
		e1.setX(tw*2);
		e1.setY(th*2);
		
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


}

public void winChecker()
{
	if(player.getX() == t13.getX() && player.getY() == t13.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv24);
		GameRunner.getFrame().add(GameRunner.lv25);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv25);
		GameRunner.lv25.startGame();
	}
}

public void drawLevel24State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel24State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel24State();
	
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
		manager.moveTile(tw, twn, thn);
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


