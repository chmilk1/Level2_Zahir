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

public class Level8State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 16;
	public static int thn = 5;
	public static int tw = GameRunner.WINDOW_WIDTH /twn;
	public static int th = tw;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*2, th*2, tw,th);
GridPlayer gp = new GridPlayer(tw*2,th*2, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
SolidTile t2 = new SolidTile(tw, 0, tw, th);
SolidTile t3 = new SolidTile(2*tw, 0, tw, th);
SolidTile t4 = new SolidTile(3*tw, 0, tw, th);
SolidTile t5 = new SolidTile(4*tw, 0, tw, th);
SolidTile t6 = new SolidTile(5*tw, 0, tw, th);
SolidTile t7 = new SolidTile(6*tw, 0, tw, th);
SolidTile t8 = new SolidTile(7*tw, 0, tw, th);
SolidTile t9 = new SolidTile(8*tw, 0, tw, th);
SolidTile t10 = new SolidTile(9*tw, 0, tw, th);
SolidTile t11 = new SolidTile(10*tw, 0, tw, th);
SolidTile t12 = new SolidTile(11*tw, 0, tw, th);
SolidTile t13 = new SolidTile(12*tw, 0, tw, th);
SolidTile t14 = new SolidTile(13*tw, 0, tw, th);
SolidTile t15 = new SolidTile(14*tw, 0, tw, th);
SolidTile t16 = new SolidTile(15*tw, 0, tw, th);

SolidTile t17 = new SolidTile(0, th, tw, th);
SafeTile t18 = new SafeTile(tw, th, tw, th);
SafeTile t19 = new SafeTile(2*tw, th, tw, th);
SafeTile t20 = new SafeTile(3*tw, th, tw, th);
SolidTile t21 = new SolidTile(4*tw, th, tw, th);
SafeTile t22 = new SafeTile(5*tw, th, tw, th);
SafeTile t23 = new SafeTile(6*tw, th, tw, th);
ElectricTile t24 = new ElectricTile(7*tw, th, tw, th, -1);
ElectricTile t25 = new ElectricTile(8*tw, th, tw, th, -1);
ElectricTile t26 = new ElectricTile(9*tw, th, tw, th, -1);
SolidTile t27 = new SolidTile(10*tw, th, tw, th);
SolidTile t28 = new SolidTile(11*tw, th, tw, th);
SolidTile t29 = new SolidTile(12*tw, th, tw, th);
SafeTile t30 = new SafeTile(13*tw, th, tw, th);
SafeTile t31 = new SafeTile(14*tw, th, tw, th);
SolidTile t32 = new SolidTile(15*tw, th, tw, th);

SolidTile t33 = new SolidTile(0, 2*th, tw, th);
SafeTile t34 = new SafeTile(tw, 2*th, tw, th);
SafeTile t35 = new SafeTile(2*tw, 2*th, tw, th);
SafeTile t36 = new SafeTile(3*tw, 2*th, tw, th);
ElectricTile t37 = new ElectricTile(4*tw, 2*th, tw, th, -1);
SafeTile t38 = new SafeTile(5*tw, 2*th, tw, th);
SafeTile t39 = new SafeTile(6*tw, 2*th, tw, th);
SolidTile t40 = new SolidTile(7*tw, 2*th, tw, th);
SafeTile t41 = new SafeTile(8*tw, 2*th, tw, th);
ElectricTile t42 = new ElectricTile(9*tw, 2*th, tw, th, -1);
ElectricTile t43 = new ElectricTile(10*tw,2* th, tw, th, -1);
SafeTile t44 = new SafeTile(11*tw, 2*th, tw, th);
SafeTile t45 = new SafeTile(12*tw, 2*th, tw, th);
NextLevelTile t46 = new NextLevelTile(13*tw, 2*th, tw, th);
SafeTile t47 = new SafeTile(14*tw, 2*th, tw, th);
SolidTile t48 = new SolidTile(15*tw, 2*th, tw, th);

SolidTile t49 = new SolidTile(0, 3*th, tw, th);
SafeTile t50 = new SafeTile(tw, 3*th, tw, th);
SafeTile t51 = new SafeTile(2*tw, 3*th, tw, th);
SafeTile t52 = new SafeTile(3*tw, 3*th, tw, th);
SolidTile t53 = new SolidTile(4*tw, 3*th, tw, th);
SafeTile t54 = new SafeTile(5*tw, 3*th, tw, th);
SafeTile t55 = new SafeTile(6*tw, 3*th, tw, th);
ElectricTile t56 = new ElectricTile(7*tw, 3*th, tw, th, -1);
ElectricTile t57 = new ElectricTile(8*tw, 3*th, tw, th, -1);
ElectricTile t58 = new ElectricTile(9*tw, 3*th, tw, th, -1);
SolidTile t59 = new SolidTile(10*tw,3* th, tw, th);
SolidTile t60 = new SolidTile(11*tw, 3*th, tw, th);
SolidTile t61 = new SolidTile(12*tw, 3*th, tw, th);
SafeTile t62 = new SafeTile(13*tw, 3*th, tw, th);
SafeTile t63 = new SafeTile(14*tw, 3*th, tw, th);
SolidTile t64 = new SolidTile(15*tw, 3*th, tw, th);

SolidTile t65 = new SolidTile(0, 4*th, tw, th);
SolidTile t66 = new SolidTile(tw, 4*th, tw, th);
SolidTile t67 = new SolidTile(2*tw, 4*th, tw, th);
SolidTile t68 = new SolidTile(3*tw, 4*th, tw, th);
SolidTile t69 = new SolidTile(4*tw, 4*th, tw, th);
SolidTile t70 = new SolidTile(5*tw, 4*th, tw, th);
SolidTile t71 = new SolidTile(6*tw, 4*th, tw, th);
SolidTile t72 = new SolidTile(7*tw, 4*th, tw, th);
SolidTile t73 = new SolidTile(8*tw, 4*th, tw, th);
SolidTile t74 = new SolidTile(9*tw, 4*th, tw, th);
SolidTile t75 = new SolidTile(10*tw,4* th, tw, th);
SolidTile t76 = new SolidTile(11*tw, 4*th, tw, th);
SolidTile t77 = new SolidTile(12*tw, 4*th, tw, th);
SolidTile t78 = new SolidTile(13*tw, 4*th, tw, th);
SolidTile t79 = new SolidTile(14*tw, 4*th, tw, th);
SolidTile t80 = new SolidTile(15*tw, 4*th, tw, th);



public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level8State()
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

public void updateLevel8State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw*2);
		gp.setY(th*2);
		
		player.setX(tw*2);
		player.setY(th*2);
		
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
	if(gp.getY() > th*5 - gp.getHeight()) {
		gp.setY(th*5 - gp.getHeight());}

}

public void winChecker()
{
	if(player.getX() == t46.getX() && player.getY() == t46.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv8);
		GameRunner.getFrame().add(GameRunner.lv9);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv9);
		GameRunner.lv9.startGame();
	}
}

public void drawLevel8State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel8State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel8State();
	
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


