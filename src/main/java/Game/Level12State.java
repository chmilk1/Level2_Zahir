package Game;

import Game.tiles.ElectricTile;
import Game.tiles.NextFloorTile;
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

public class Level12State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 20;
	public static int thn = 5;
	public static int tw = GameRunner.WINDOW_WIDTH /twn;
	public static int th = tw;
	public static int opacity = 0;
	long currTime, totalTime; 
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*2, th*2, tw,th);
GridPlayer gp = new GridPlayer(tw*2,th*2, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
SolidTile t2 = new SolidTile(tw, 0, tw, th);
SolidTile t3 = new SolidTile(2*tw, 0, tw, th);
SolidTile t4 = new SolidTile(3*tw, 0, tw, th);
SolidTile t5 = new SolidTile(4*tw, 0, tw, th);
SafeTile t6 = new SafeTile(5*tw, 0, tw, th);
SafeTile t7 = new SafeTile(6*tw, 0, tw, th);
ElectricTile t8 = new ElectricTile(7*tw, 0, tw, th, -1);
SafeTile t9 = new SafeTile(8*tw, 0, tw, th);
SafeTile t10 = new SafeTile(9*tw, 0, tw, th);
ElectricTile t11 = new ElectricTile(10*tw, 0, tw, th, -1);
SolidTile t12 = new SolidTile(11*tw, 0, tw, th);
SolidTile t13 = new SolidTile(12*tw, 0, tw, th);
SolidTile t14 = new SolidTile(13*tw, 0, tw, th);
ElectricTile t15 = new ElectricTile(14*tw, 0, tw, th, -1);
SafeTile t16 = new SafeTile(15*tw, 0, tw, th);
SafeTile t17 = new SafeTile(16*tw, 0, tw, th);
SafeTile t18 = new SafeTile(17*tw, 0, tw, th);
SafeTile t19 = new SafeTile(18*tw, 0, tw, th);
SafeTile t20 = new SafeTile(19*tw, 0, tw, th);

SolidTile t21 = new SolidTile(0,th, tw, th);
ElectricTile t22 = new ElectricTile(tw, th, tw, th, -1);
ElectricTile t23 = new ElectricTile(2*tw, th, tw, th, -1);
ElectricTile t24 = new ElectricTile(3*tw, th, tw, th, -1);
SolidTile t25 = new SolidTile(4*tw, th, tw, th);
SafeTile t26 = new SafeTile(5*tw, th, tw, th);
SafeTile t27 = new SafeTile(6*tw, th, tw, th);
ElectricTile t28 = new ElectricTile(7*tw, th, tw, th, 1);
SafeTile t29 = new SafeTile(8*tw, th, tw, th);
SafeTile t30 = new SafeTile(9*tw, th, tw, th);
ElectricTile t31 = new ElectricTile(10*tw, th, tw, th, 1);
ElectricTile t32 = new ElectricTile(11*tw, th, tw, th, 1);
ElectricTile t33 = new ElectricTile(12*tw, th, tw, th, 1);
SolidTile t34 = new SolidTile(13*tw, th, tw, th);
ElectricTile t35 = new ElectricTile(14*tw, th, tw, th, -1);
SafeTile t36 = new SafeTile(15*tw, th, tw, th);
SafeTile t37 = new SafeTile(16*tw, th, tw, th);
SolidTile t38 = new SolidTile(17*tw, th, tw, th);
SolidTile t39 = new SolidTile(18*tw, th, tw, th);
SafeTile t40 = new SafeTile(19*tw, th, tw, th);

SolidTile t41 = new SolidTile(0,th*2, tw, th);
ElectricTile t42 = new ElectricTile(tw, th*2, tw, th, -1);
ElectricTile t43 = new ElectricTile(2*tw, th*2, tw, th, -1);
ElectricTile t44 = new ElectricTile(3*tw, th*2, tw, th, -1);
ElectricTile t45 = new ElectricTile(4*tw, th*2, tw, th, -1);
SafeTile t46 = new SafeTile(5*tw, th*2, tw, th);
SafeTile t47 = new SafeTile(6*tw, th*2, tw, th);
ElectricTile t48 = new ElectricTile(7*tw, th*2, tw, th, 1);
SafeTile t49 = new SafeTile(8*tw, th*2, tw, th);
SafeTile t50 = new SafeTile(9*tw, th*2, tw, th);
ElectricTile t51 = new ElectricTile(10*tw, th*2, tw, th, 1);
SolidTile t52 = new SolidTile(11*tw, th*2, tw, th);
ElectricTile t53 = new ElectricTile(12*tw, th*2, tw, th, -1);
ElectricTile t54 = new ElectricTile(13*tw, th*2, tw, th, -1);
ElectricTile t55 = new ElectricTile(14*tw, th*2, tw, th, -1);
SafeTile t56 = new SafeTile(15*tw, th*2, tw, th);
SafeTile t57 = new SafeTile(16*tw, th*2, tw, th);
SolidTile t58 = new SolidTile(17*tw, th*2, tw, th);
NextFloorTile t59 = new NextFloorTile(18*tw, th*2, tw, th);
SafeTile t60 = new SafeTile(19*tw, th*2, tw, th);

SolidTile t61 = new SolidTile(0,th*3, tw, th);
ElectricTile t62 = new ElectricTile(tw, th*3, tw, th, -1);
ElectricTile t63 = new ElectricTile(2*tw, th*3, tw, th, -1);
ElectricTile t64 = new ElectricTile(3*tw, th*3, tw, th, -1);
SolidTile t65 = new SolidTile(4*tw, th*3, tw, th);
SafeTile t66 = new SafeTile(5*tw, th*3, tw, th);
SafeTile t67 = new SafeTile(6*tw, th*3, tw, th);
ElectricTile t68 = new ElectricTile(7*tw, th*3, tw, th, 1);
SafeTile t69 = new SafeTile(8*tw, th*3, tw, th);
SafeTile t70 = new SafeTile(9*tw, th*3, tw, th);
ElectricTile t71 = new ElectricTile(10*tw, th*3, tw, th, 1);
ElectricTile t72 = new ElectricTile(11*tw, th*3, tw, th, 1);
ElectricTile t73 = new ElectricTile(12*tw, th*3, tw, th, 1);
SolidTile t74 = new SolidTile(13*tw, th*3, tw, th);
ElectricTile t75 = new ElectricTile(14*tw, th*3, tw, th, -1);
SafeTile t76 = new SafeTile(15*tw, th*3, tw, th);
SafeTile t77 = new SafeTile(16*tw, th*3, tw, th);
SolidTile t78 = new SolidTile(17*tw, th*3, tw, th);
SolidTile t79 = new SolidTile(18*tw, th*3, tw, th);
SafeTile t80 = new SafeTile(19*tw, th*3, tw, th);

SolidTile t81 = new SolidTile(0, th*4, tw, th);
SolidTile t82 = new SolidTile(tw, th*4, tw, th);
SolidTile t83 = new SolidTile(2*tw, th*4, tw, th);
SolidTile t84 = new SolidTile(3*tw, th*4, tw, th);
SolidTile t85 = new SolidTile(4*tw, th*4, tw, th);
SafeTile t86 = new SafeTile(5*tw, th*4, tw, th);
SafeTile t87 = new SafeTile(6*tw, th*4, tw, th);
ElectricTile t88 = new ElectricTile(7*tw, th*4, tw, th, -1);
SafeTile t89 = new SafeTile(8*tw, th*4, tw, th);
SafeTile t90 = new SafeTile(9*tw, th*4, tw, th);
ElectricTile t91 = new ElectricTile(10*tw, th*4, tw, th, -1);
SolidTile t92 = new SolidTile(11*tw, th*4, tw, th);
SolidTile t93 = new SolidTile(12*tw, th*4, tw, th);
SolidTile t94 = new SolidTile(13*tw, th*4, tw, th);
ElectricTile t95 = new ElectricTile(14*tw, th*4, tw, th, -1);
SafeTile t96 = new SafeTile(15*tw, th*4, tw, th);
SafeTile t97 = new SafeTile(16*tw, th*4, tw, th);
SafeTile t98 = new SafeTile(17*tw, th*4, tw, th);
SafeTile t99 = new SafeTile(18*tw, th*4, tw, th);
SafeTile t100 = new SafeTile(19*tw, th*4, tw, th);

RMTile t101 = new RMTile(5*tw, 4*th, tw, th, 1);
RMTile t102 = new RMTile(6*tw, 4*th, tw, th, 1);
RMTile t103 = new RMTile(5*tw, 3*th, tw, th, 1);
RMTile t104 = new RMTile(6*tw, 3*th, tw, th, 1);

RMTile t105 = new RMTile(8*tw, 0, tw, th, -1);
RMTile t106 = new RMTile(9*tw, 0, tw, th, -1);
RMTile t107 = new RMTile(8*tw, th, tw, th, -1);
RMTile t108 = new RMTile(9*tw, th, tw, th, -1);

RMTile t109 = new RMTile(15*tw, 4*th, tw, th, 1);
RMTile t110 = new RMTile(16*tw, 4*th, tw, th, 1);
RMTile t111 = new RMTile(15*tw, 3*th, tw, th, 1);
RMTile t112 = new RMTile(16*tw, 3*th, tw, th, 1);



public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level12State()
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
	manager.addObject(t81);
	manager.addObject(t82);
	manager.addObject(t83);
	manager.addObject(t84);
	manager.addObject(t85);
	manager.addObject(t86);
	manager.addObject(t87);
	manager.addObject(t88);
	manager.addObject(t89);
	manager.addObject(t90);
	manager.addObject(t91);
	manager.addObject(t92);
	manager.addObject(t93);
	manager.addObject(t94);
	manager.addObject(t95);
	manager.addObject(t96);
	manager.addObject(t97);
	manager.addObject(t98);
	manager.addObject(t99);
	manager.addObject(t100);
	manager.addObject(t101);
	manager.addObject(t102);
	manager.addObject(t103);
	manager.addObject(t104);
	manager.addObject(t105);
	manager.addObject(t106);
	manager.addObject(t107);
	manager.addObject(t108);
	manager.addObject(t109);
	manager.addObject(t110);
	manager.addObject(t111);
	manager.addObject(t112);
	



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

public void updateLevel12State() {
	
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
	if(gp.getX() >tw*20 - gp.getWidth()) {
		gp.setX(tw*16 - gp.getWidth());}
	if(gp.getY() < 0) {
		gp.setY(0);}
	if(gp.getY() > th*5 - gp.getHeight()) {
		gp.setY(th*5 - gp.getHeight());}

}

public void winChecker()
{
	if(player.getX() == t59.getX() && player.getY() == t59.getY())
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
			
		FloorSelector.floor = 2;
		
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

public void drawLevel12State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
	
	
		g.setColor(new Color(255, 255, 255, opacity));
		g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		
}




public void paintComponent(Graphics g) {
	drawLevel12State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel12State();
	
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



