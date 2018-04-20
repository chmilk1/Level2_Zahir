package Game;

import Game.tiles.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Level20State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 9;
	public static int thn = 13;
	public static int th = GameRunner.WINDOW_HEIGHT /thn;
	public static int tw = th;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*4, th*10, tw,th);
GridPlayer gp = new GridPlayer(tw*4,th*10, tw,th);

RedTile t1 = new RedTile(0, 0, tw, th);
RedTile t2 = new RedTile(tw, 0, tw, th);
RedTile t3 = new RedTile(tw*2, 0, tw, th);
RedTile t4 = new RedTile(tw*3, 0, tw, th);
RedTile t5 = new RedTile(tw*4, 0, tw, th);
RedTile t6 = new RedTile(tw*5, 0, tw, th);
RedTile t7 = new RedTile(tw*6, 0, tw, th);
RedTile t8 = new RedTile(tw*7, 0, tw, th);
RedTile t9 = new RedTile(tw*8, 0, tw, th);

RedTile t10 = new RedTile(0, th, tw, th);
RedTile t11 = new RedTile(tw, th, tw, th);
SafeTile t12 = new SafeTile(tw*2, th, tw, th);
SolidTile t13 = new SolidTile(tw*3, th, tw, th);
SafeTile t14 = new SafeTile(tw*4, th, tw, th);
SolidTile t15 = new SolidTile(tw*5, th, tw, th);
SafeTile t16 = new SafeTile(tw*6, th, tw, th);
RedTile t17 = new RedTile(tw*7, th, tw, th);
RedTile t18 = new RedTile(tw*8, th, tw, th);

RedTile t19 = new RedTile(0, th*2, tw, th);
RedTile t20 = new RedTile(tw, th*2, tw, th);
SafeTile t21 = new SafeTile(tw*2, th*2, tw, th);
SolidTile t22 = new SolidTile(tw*3, th*2, tw, th);
SafeTile t23 = new SafeTile(tw*4, th*2, tw, th);
SolidTile t24 = new SolidTile(tw*5, th*2, tw, th);
NextLevelTile t25 = new NextLevelTile(tw*6, th*2, tw, th);
RedTile t26 = new RedTile(tw*7, th*2, tw, th);
RedTile t27 = new RedTile(tw*8, th*2, tw, th);

RedTile t28 = new RedTile(0,th*3, tw, th);
RedTile t29 = new RedTile(tw, th*3, tw, th);
SafeTile t30 = new SafeTile(tw*2, th*3, tw, th);
SolidTile t31 = new SolidTile(tw*3, th*3, tw, th);
SafeTile t32 = new SafeTile(tw*4, th*3, tw, th);
SolidTile t33 = new SolidTile(tw*5, th*3, tw, th);
SafeTile t34 = new SafeTile(tw*6, th*3, tw, th);
RedTile t35 = new RedTile(tw*7, th*3, tw, th);
RedTile t36 = new RedTile(tw*8, th*3, tw, th);

RedTile t37 = new RedTile(0, th*4, tw, th);
RedTile t38 = new RedTile(tw, th*4, tw, th);
RedTile t39 = new RedTile(tw*2, th*4, tw, th);
RedTile t40 = new RedTile(tw*3, th*4, tw, th);
RedTile t41 = new RedTile(tw*4, th*4, tw, th);
RedTile t42 = new RedTile(tw*5, th*4, tw, th);
RedTile t43 = new RedTile(tw*6, th*4, tw, th);
RedTile t44 = new RedTile(tw*7, th*4, tw, th);
RedTile t45 = new RedTile(tw*8,th*4, tw, th);

RedTile t46 = new RedTile(0, th*5, tw, th);
RedTile t47 = new RedTile(tw, th*5, tw, th);
RedTile t48 = new RedTile(tw*2, th*5, tw, th);
RedTile t49 = new RedTile(tw*3, th*5, tw, th);
RedTile t50 = new RedTile(tw*4, th*5, tw, th);
RedTile t51 = new RedTile(tw*5, th*5, tw, th);
RedTile t52 = new RedTile(tw*6, th*5, tw, th);
RedTile t53 = new RedTile(tw*7, th*5, tw, th);
RedTile t54 = new RedTile(tw*8,th*5, tw, th);

RedTile t55= new RedTile(0, th*6, tw, th);
RedTile t56 = new RedTile(tw, th*6, tw, th);
RedTile t57 = new RedTile(tw*2, th*6, tw, th);
RedTile t58 = new RedTile(tw*3, th*6, tw, th);
RedElectricTile t59 = new RedElectricTile(tw*4, th*6, tw, th, -1);
RedTile t60 = new RedTile(tw*5, th*6, tw, th);
ElectricTile t61 = new ElectricTile(tw*6, th*6, tw, th, 1);
RedTile t62 = new RedTile(tw*7, th*6, tw, th);
RedTile t63 = new RedTile(tw*8,th*6, tw, th);

RedTile t64 = new RedTile(0, th*7, tw, th);
RedTile t65 = new RedTile(tw, th*7, tw, th);
RedTile t66 = new RedTile(tw*2, th*7, tw, th);
RedTile t67 = new RedTile(tw*3, th*7, tw, th);
RedTile t68 = new RedTile(tw*4, th*7, tw, th);
RedTile t69 = new RedTile(tw*5, th*7, tw, th);
RedTile t70 = new RedTile(tw*6, th*7, tw, th);
RedTile t71 = new RedTile(tw*7, th*7, tw, th);
RedTile t72 = new RedTile(tw*8,th*7, tw, th);

RedTile t73 = new RedTile(0, th*8, tw, th);
RedTile t74 = new RedTile(tw, th*8, tw, th);
RedTile t75 = new RedTile(tw*2, th*8, tw, th);
RedTile t76 = new RedTile(tw*3, th*8, tw, th);
RedTile t77 = new RedTile(tw*4, th*8, tw, th);
RedTile t78 = new RedTile(tw*5, th*8, tw, th);
RedTile t79 = new RedTile(tw*6, th*8, tw, th);
RedTile t80 = new RedTile(tw*7, th*8, tw, th);
RedTile t81 = new RedTile(tw*8,th*8, tw, th);

RedTile t82 = new RedTile(0, th*9, tw, th);
RedTile t83 = new RedTile(tw, th*9, tw, th);
SolidTile t84 = new SolidTile(tw*2, th*9, tw, th);
RedTile t85 = new RedTile(tw*3, th*9, tw, th);
SafeTile t86 = new SafeTile(tw*4, th*9, tw, th);
RedTile t87 = new RedTile(tw*5, th*9, tw, th);
SolidTile t88 = new SolidTile(tw*6, th*9, tw, th);
RedTile t89 = new RedTile(tw*7, th*9, tw, th);
RedTile t90 = new RedTile(tw*8, th*9, tw, th);

RedTile t91 = new RedTile(0, th*10, tw, th);
RedTile t92 = new RedTile(tw, th*10, tw, th);
SolidTile t93 = new SolidTile(tw*2, th*10, tw, th);
RedTile t94 = new RedTile(tw*3, th*10, tw, th);
SafeTile t95 = new SafeTile(tw*4, th*10, tw, th);
RedTile t96 = new RedTile(tw*5, th*10, tw, th);
SolidTile t97 = new SolidTile(tw*6, th*10, tw, th);
RedTile t98 = new RedTile(tw*7, th*10, tw, th);
RedTile t99 = new RedTile(tw*8, th*10, tw, th);

RedTile t100 = new RedTile(0, th*11, tw, th);
RedTile t101 = new RedTile(tw, th*11, tw, th);
SolidTile t102 = new SolidTile(tw*2, th*11, tw, th);
RedTile t103 = new RedTile(tw*3, th*11, tw, th);
SafeTile t104 = new SafeTile(tw*4, th*11, tw, th);
RedTile t105 = new RedTile(tw*5, th*11, tw, th);
SolidTile t106 = new SolidTile(tw*6, th*11, tw, th);
RedTile t107 = new RedTile(tw*7, th*11, tw, th);
RedTile t108 = new RedTile(tw*8, th*11, tw, th);

RedTile t109 = new RedTile(0, th*12, tw, th);
RedTile t110 = new RedTile(tw, th*12, tw, th);
RedTile t111 = new RedTile(tw*2, th*12, tw, th);
RedTile t112 = new RedTile(tw*3, th*12, tw, th);
RedTile t113 = new RedTile(tw*4, th*12, tw, th);
RedTile t114 = new RedTile(tw*5, th*12, tw, th);
RedTile t115 = new RedTile(tw*6, th*12, tw, th);
RedTile t116 = new RedTile(tw*7, th*12, tw, th);
RedTile t117= new RedTile(tw*8,th*12, tw, th);

public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level20State()
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
	manager.addObject(t113);
	manager.addObject(t114);
	manager.addObject(t115);
	manager.addObject(t116);
	manager.addObject(t117);
	
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
	
	Sound.menuTrack.stop();
	Sound.gameSong.loop();
}

public void updateLevel18State() {
	
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
		
		t59.RState = -1;
		
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
	if(player.getX() == t25.getX() && player.getY() == t25.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv20);
		GameRunner.getFrame().add(GameRunner.lv21);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv21);
		GameRunner.lv21.startGame();
	}
}

public void drawLevel18State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}


public void paintComponent(Graphics g) {
	drawLevel18State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel18State();
	
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