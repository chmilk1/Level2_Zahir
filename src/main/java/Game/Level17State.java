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

public class Level17State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 11;
	public static int thn = 10;
	public static int th = GameRunner.WINDOW_HEIGHT /thn;
	public static int tw = th;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*5, th*7, tw,th);
GridPlayer gp = new GridPlayer(tw*5,th*7, tw,th);

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

SolidTile t12 = new SolidTile(0, th, tw, th);
ElectricTile t13 = new ElectricTile(tw, th, tw, th, -1);
ElectricTile t14 = new ElectricTile(tw*2, th, tw, th, -1);
ElectricTile t15 = new ElectricTile(tw*3, th, tw, th, -1);
SafeTile t16 = new SafeTile(tw*4, th, tw, th);
SafeTile t17 = new SafeTile(tw*5, th, tw, th);
SafeTile t18 = new SafeTile(tw*6, th, tw, th);
ElectricTile t19 = new ElectricTile(tw*7, th, tw, th, 1);
ElectricTile t20 = new ElectricTile(tw*8, th, tw, th, 1);
ElectricTile t21 = new ElectricTile(tw*9, th, tw, th, 1);
SolidTile t22 = new SolidTile(tw*10, th, tw, th);

SolidTile t23 = new SolidTile(0, th*2, tw, th);
ElectricTile t24 = new ElectricTile(tw, th*2, tw, th, -1);
ElectricTile t25 = new ElectricTile(tw*2, th*2, tw, th, -1);
ElectricTile t26 = new ElectricTile(tw*3, th*2, tw, th, -1);
SafeTile t27 = new SafeTile(tw*4, th*2, tw, th);
NextLevelTile t28 = new NextLevelTile(tw*5, th*2, tw, th);
SafeTile t29 = new SafeTile(tw*6, th*2, tw, th);
ElectricTile t30 = new ElectricTile(tw*7, th*2, tw, th, 1);
ElectricTile t31 = new ElectricTile(tw*8, th*2, tw, th, 1);
ElectricTile t32 = new ElectricTile(tw*9, th*2, tw, th, 1);
SolidTile t33 = new SolidTile(tw*10, th*2, tw, th);

SolidTile t34 = new SolidTile(0, th*3, tw, th);
ElectricTile t35 = new ElectricTile(tw, th*3, tw, th, -1);
ElectricTile t36 = new ElectricTile(tw*2, th*3, tw, th, -1);
ElectricTile t37 = new ElectricTile(tw*3, th*3, tw, th, -1);
SafeTile t38 = new SafeTile(tw*4, th*3, tw, th);
SafeTile t39 = new SafeTile(tw*5, th*3, tw, th);
SafeTile t40 = new SafeTile(tw*6, th*3, tw, th);
ElectricTile t41 = new ElectricTile(tw*7, th*3, tw, th, 1);
ElectricTile t42 = new ElectricTile(tw*8, th*3, tw, th, 1);
ElectricTile t43 = new ElectricTile(tw*9, th*3, tw, th, 1);
SolidTile t44 = new SolidTile(tw*10, th*3, tw, th);

SolidTile t45 = new SolidTile(0, th*4, tw, th);
SolidTile t46 = new SolidTile(tw, th*4, tw, th);
SafeTile t47 = new SafeTile(tw*2, th*4, tw, th);
SolidTile t48 = new SolidTile(tw*3, th*4, tw, th);
SolidTile t49 = new SolidTile(tw*4, th*4, tw, th);
SolidTile t50 = new SolidTile(tw*5, th*4, tw, th);
SolidTile t51 = new SolidTile(tw*6, th*4, tw, th);
SolidTile t52 = new SolidTile(tw*7, th*4, tw, th);
SafeTile t53 = new SafeTile(tw*8, th*4, tw, th);
SolidTile t54 = new SolidTile(tw*9, th*4, tw, th);
SolidTile t55 = new SolidTile(tw*10, th*4, tw, th);

SafeTile t56 = new SafeTile(0, th*5, tw, th);
SafeTile t57 = new SafeTile(tw, th*5, tw, th);
SafeTile t58 = new SafeTile(tw*2, th*5, tw, th);
SafeTile t59 = new SafeTile(tw*3, th*5, tw, th);
SafeTile t60 = new SafeTile(tw*4, th*5, tw, th);
SafeTile t61 = new SafeTile(tw*5, th*5, tw, th);
SafeTile t62 = new SafeTile(tw*6, th*5, tw, th);
SafeTile t63 = new SafeTile(tw*7, th*5, tw, th);
SafeTile t64 = new SafeTile(tw*8, th*5, tw, th);
SafeTile t65 = new SafeTile(tw*9, th*5, tw, th);
SafeTile t66 = new SafeTile(tw*10, th*5, tw, th);

SafeTile t67 = new SafeTile(0, th*6, tw, th);
SafeTile t68 = new SafeTile(tw, th*6, tw, th);
SafeTile t69 = new SafeTile(tw*2, th*6, tw, th);
SafeTile t70 = new SafeTile(tw*3, th*6, tw, th);
SafeTile t71 = new SafeTile(tw*4, th*6, tw, th);
SafeTile t72 = new SafeTile(tw*5, th*6, tw, th);
SafeTile t73 = new SafeTile(tw*6, th*6, tw, th);
SafeTile t74 = new SafeTile(tw*7, th*6, tw, th);
SafeTile t75 = new SafeTile(tw*8, th*6, tw, th);
SafeTile t76 = new SafeTile(tw*9, th*6, tw, th);
SafeTile t77 = new SafeTile(tw*10, th*6, tw, th);

SafeTile t78 = new SafeTile(0, th*7, tw, th);
SafeTile t79 = new SafeTile(tw, th*7, tw, th);
SafeTile t80 = new SafeTile(tw*2, th*7, tw, th);
SafeTile t81 = new SafeTile(tw*3, th*7, tw, th);
SafeTile t82 = new SafeTile(tw*4, th*7, tw, th);
SafeTile t83 = new SafeTile(tw*5, th*7, tw, th);
SafeTile t84 = new SafeTile(tw*6, th*7, tw, th);
SafeTile t85 = new SafeTile(tw*7, th*7, tw, th);
SafeTile t86 = new SafeTile(tw*8, th*7, tw, th);
SafeTile t87 = new SafeTile(tw*9, th*7, tw, th);
SafeTile t88 = new SafeTile(tw*10, th*7, tw, th);

SafeTile t89 = new SafeTile(0, th*8, tw, th);
SafeTile t90 = new SafeTile(tw, th*8, tw, th);
SafeTile t91 = new SafeTile(tw*2, th*8, tw, th);
SafeTile t92 = new SafeTile(tw*3, th*8, tw, th);
SafeTile t93 = new SafeTile(tw*4, th*8, tw, th);
SafeTile t94 = new SafeTile(tw*5, th*8, tw, th);
SafeTile t95 = new SafeTile(tw*6, th*8, tw, th);
SafeTile t96 = new SafeTile(tw*7, th*8, tw, th);
SafeTile t97 = new SafeTile(tw*8, th*8, tw, th);
SafeTile t98 = new SafeTile(tw*9, th*8, tw, th);
SafeTile t99 = new SafeTile(tw*10, th*8, tw, th);

SafeTile t100 = new SafeTile(0, th*9, tw, th);
SafeTile t101 = new SafeTile(tw, th*9, tw, th);
SafeTile t102 = new SafeTile(tw*2, th*9, tw, th);
SafeTile t103 = new SafeTile(tw*3, th*9, tw, th);
SafeTile t104 = new SafeTile(tw*4, th*9, tw, th);
SafeTile t105 = new SafeTile(tw*5, th*9, tw, th);
SafeTile t106 = new SafeTile(tw*6, th*9, tw, th);
SafeTile t107 = new SafeTile(tw*7, th*9, tw, th);
SafeTile t108 = new SafeTile(tw*8, th*9, tw, th);
SafeTile t109 = new SafeTile(tw*9, th*9, tw, th);
SafeTile t110 = new SafeTile(tw*10, th*9, tw, th);

Pawn e1 = new Pawn(tw*2, th*4, tw, th);
Pawn e2 = new Pawn (tw*8, th*4, tw, th);

public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level17State()
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
		gp.setX(tw* 4);
		gp.setY(th*10);
		
		
		player.setX(tw*4);
		player.setY(th*10);
		
		
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
	if(player.getX() == t28.getX() && player.getY() == t28.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv17);
		GameRunner.getFrame().add(GameRunner.lv18);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv18);
		GameRunner.lv18.startGame();
	}
}

public void drawLevel17State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}


public void paintComponent(Graphics g) {
	drawLevel17State(g);
	
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
	}
}

@Override
public void keyReleased(KeyEvent e) {

	
}

{

}
}

