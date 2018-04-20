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

public class Level7State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 20;
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
SafeTile t6 = new SafeTile(5*tw, 0, tw, th);
SafeTile t7 = new SafeTile(6*tw, 0, tw, th);
SafeTile t8 = new SafeTile(7*tw, 0, tw, th);
SolidTile t9 = new SolidTile(8*tw, 0, tw, th);
SafeTile t10 = new SafeTile(9*tw, 0, tw, th);
SafeTile t11 = new SafeTile(10*tw, 0, tw, th);
SafeTile t12 = new SafeTile(11*tw, 0, tw, th);
RedTile t13 = new RedTile(12*tw, 0, tw, th);
SolidTile t14 = new SolidTile(13*tw, 0, tw, th);
SolidTile t15 = new SolidTile(14*tw, 0, tw, th);
SolidTile t16 = new SolidTile(15*tw, 0, tw, th);
SolidTile t17 = new SolidTile(16*tw, 0, tw, th);
SolidTile t18 = new SolidTile(17*tw, 0, tw, th);
SolidTile t19 = new SolidTile(18*tw, 0, tw, th);
SolidTile t20 = new SolidTile(19*tw, 0, tw, th);

SolidTile t21 = new SolidTile(0,th, tw, th);
SafeTile t22 = new SafeTile(tw, th, tw, th);
SafeTile t23 = new SafeTile(2*tw, th, tw, th);
SafeTile t24 = new SafeTile(3*tw, th, tw, th);
SolidTile t25 = new SolidTile(4*tw, th, tw, th);
SafeTile t26 = new SafeTile(5*tw, th, tw, th);
SafeTile t27 = new SafeTile(6*tw, th, tw, th);
SafeTile t28 = new SafeTile(7*tw, th, tw, th);
SolidTile t29 = new SolidTile(8*tw, th, tw, th);
SafeTile t30 = new SafeTile(9*tw, th, tw, th);
SafeTile t31 = new SafeTile(10*tw, th, tw, th);
SafeTile t32 = new SafeTile(11*tw, th, tw, th);
RedTile t33 = new RedTile(12*tw, th, tw, th);
SolidTile t34 = new SolidTile(13*tw, th, tw, th);
RedTile t35 = new RedTile(14*tw, th, tw, th);
SafeTile t36 = new SafeTile(15*tw, th, tw, th);
SafeTile t37 = new SafeTile(16*tw, th, tw, th);
SafeTile t38 = new SafeTile(17*tw, th, tw, th);
SafeTile t39 = new SafeTile(18*tw, th, tw, th);
SolidTile t40 = new SolidTile(19*tw, th, tw, th);

SolidTile t41 = new SolidTile(0,th*2, tw, th);
SafeTile t42 = new SafeTile(tw, th*2, tw, th);
SafeTile t43 = new SafeTile(2*tw, th*2, tw, th);
SafeTile t44 = new SafeTile(3*tw, th*2, tw, th);
SafeTile t45 = new SafeTile(4*tw, th*2, tw, th);
SafeTile t46 = new SafeTile(5*tw, th*2, tw, th);
SolidTile t47 = new SolidTile(6*tw, th*2, tw, th);
SafeTile t48 = new SafeTile(7*tw, th*2, tw, th);
SafeTile t49 = new SafeTile(8*tw, th*2, tw, th);
SafeTile t50 = new SafeTile(9*tw, th*2, tw, th);
SolidTile t51 = new SolidTile(10*tw, th*2, tw, th);
SafeTile t52 = new SafeTile(11*tw, th*2, tw, th);
RedTile t53 = new RedTile(12*tw, th*2, tw, th);
RedTile t54 = new RedTile(13*tw, th*2, tw, th);
RedTile t55 = new RedTile(14*tw, th*2, tw, th);
SafeTile t56 = new SafeTile(15*tw, th*2, tw, th);
SafeTile t57 = new SafeTile(16*tw, th*2, tw, th);
NextLevelTile t58 = new NextLevelTile(17*tw, th*2, tw, th);
SafeTile t59 = new SafeTile(18*tw, th*2, tw, th);
SolidTile t60 = new SolidTile(19*tw, th*2, tw, th);

SolidTile t61 = new SolidTile(0,th*3, tw, th);
SafeTile t62 = new SafeTile(tw, th*3, tw, th);
SafeTile t63 = new SafeTile(2*tw, th*3, tw, th);
SafeTile t64 = new SafeTile(3*tw, th*3, tw, th);
SolidTile t65 = new SolidTile(4*tw, th*3, tw, th);
SafeTile t66 = new SafeTile(5*tw, th*3, tw, th);
SafeTile t67 = new SafeTile(6*tw, th*3, tw, th);
SafeTile t68 = new SafeTile(7*tw, th*3, tw, th);
SolidTile t69 = new SolidTile(8*tw, th*3, tw, th);
SafeTile t70 = new SafeTile(9*tw, th*3, tw, th);
SafeTile t71 = new SafeTile(10*tw, th*3, tw, th);
SafeTile t72 = new SafeTile(11*tw, th*3, tw, th);
RedTile t73 = new RedTile(12*tw, th*3, tw, th);
SolidTile t74 = new SolidTile(13*tw, th*3, tw, th);
RedTile t75 = new RedTile(14*tw, th*3, tw, th);
SafeTile t76 = new SafeTile(15*tw, th*3, tw, th);
SafeTile t77 = new SafeTile(16*tw, th*3, tw, th);
SafeTile t78 = new SafeTile(17*tw, th*3, tw, th);
SafeTile t79 = new SafeTile(18*tw, th*3, tw, th);
SolidTile t80 = new SolidTile(19*tw, th*3, tw, th);

SolidTile t81 = new SolidTile(0, th*4, tw, th);
SolidTile t82 = new SolidTile(tw, th*4, tw, th);
SolidTile t83 = new SolidTile(2*tw, th*4, tw, th);
SolidTile t84 = new SolidTile(3*tw, th*4, tw, th);
SolidTile t85 = new SolidTile(4*tw, th*4, tw, th);
SafeTile t86 = new SafeTile(5*tw, th*4, tw, th);
SafeTile t87 = new SafeTile(6*tw, th*4, tw, th);
SafeTile t88 = new SafeTile(7*tw, th*4, tw, th);
SolidTile t89 = new SolidTile(8*tw, th*4, tw, th);
SafeTile t90 = new SafeTile(9*tw, th*4, tw, th);
SafeTile t91 = new SafeTile(10*tw, th*4, tw, th);
SafeTile t92 = new SafeTile(11*tw, th*4, tw, th);
RedTile t93 = new RedTile(12*tw, th*4, tw, th);
SolidTile t94 = new SolidTile(13*tw, th*4, tw, th);
SolidTile t95 = new SolidTile(14*tw, th*4, tw, th);
SolidTile t96 = new SolidTile(15*tw, th*4, tw, th);
SolidTile t97 = new SolidTile(16*tw, th*4, tw, th);
SolidTile t98 = new SolidTile(17*tw, th*4, tw, th);
SolidTile t99 = new SolidTile(18*tw, th*4, tw, th);
SolidTile t100 = new SolidTile(19*tw, th*4, tw, th);

RMTile2 t101 = new RMTile2(5*tw, 0, tw, th, 1);
RMTile2 t102 = new RMTile2(9*tw, 0, tw, th, 1);
RMTile2 t103 = new RMTile2(10*tw, 0, tw, th, 1);
RMTile2 t104 = new RMTile2(5*tw, th, tw, th, 1);
RMTile2 t105 = new RMTile2(9*tw, th, tw, th, 1);
RMTile2 t106 = new RMTile2(10*tw, th, tw, th, 1);
RMTile2 t107 = new RMTile2(7*tw, 2*th, tw, th, 1);
RMTile2 t108 = new RMTile2(5*tw, 3*th, tw, th, 1);
RMTile2 t109 = new RMTile2(9*tw, 3*th, tw, th, 1);
RMTile2 t110 = new RMTile2(10*tw, 3*th, tw, th, 1);
RMTile2 t111 = new RMTile2(5*tw, 4*th, tw, th, 1);
RMTile2 t112 = new RMTile2(9*tw, 4*th, tw, th, 1);
RMTile2 t113 = new RMTile2(10*tw, 4*th, tw, th, 1);

public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level7State()
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
	manager.addObject(t113);



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

public void updateLevel7State() {
	
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
	if(player.getX() == t58.getX() && player.getY() == t58.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv7);
		GameRunner.getFrame().add(GameRunner.lv8);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv8);
		GameRunner.lv8.startGame();
	}
}

public void drawLevel7State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel7State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel7State();
	
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
		InputManager.horizontal = false;
		InputManager.vertical = false;
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}


}


