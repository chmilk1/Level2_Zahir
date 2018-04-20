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

public class Level16State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 9;
	public static int thn = 14;
	public static int th = GameRunner.WINDOW_HEIGHT /thn;
	public static int tw = th;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*2, th*11, tw,th);
GridPlayer gp = new GridPlayer(tw*2,th*11, tw,th);

SafeTile t1 = new SafeTile(0, 0, tw, th);
SafeTile t2 = new SafeTile(tw, 0, tw, th);
SafeTile t3 = new SafeTile(tw*2, 0, tw, th);
SafeTile t4 = new SafeTile(tw*3, 0, tw, th);
SafeTile t5 = new SafeTile(tw*4, 0, tw, th);
SafeTile t6 = new SafeTile(tw*5, 0, tw, th);
ElectricTile t7 = new ElectricTile(tw*6, 0, tw, th, 1);
ElectricTile t8 = new ElectricTile(tw*7, 0, tw, th, -1);
ElectricTile t9 = new ElectricTile(tw*8, 0, tw, th, 1);

SafeTile t10 = new SafeTile(0, th, tw, th);
SafeTile t11 = new SafeTile(tw, th, tw, th);
SafeTile t12 = new SafeTile(tw*2, th, tw, th);
SafeTile t13 = new SafeTile(tw*3, th, tw, th);
SafeTile t14 = new SafeTile(tw*4, th, tw, th);
SolidTile t15 = new SolidTile(tw*5, th, tw, th);
ElectricTile t16 = new ElectricTile(tw*6, th, tw, th, -1);
ElectricTile t17 = new ElectricTile(tw*7, th, tw, th, 1);
ElectricTile t18 = new ElectricTile(tw*8, th, tw, th, -1);

SafeTile t19 = new SafeTile(0, th*2, tw, th);
SafeTile t20 = new SafeTile(tw, th*2, tw, th);
SafeTile t21 = new SafeTile(tw*2, th*2, tw, th);
SafeTile t22 = new SafeTile(tw*3, th*2, tw, th);
SafeTile t23 = new SafeTile(tw*4, th*2, tw, th);
SolidTile t24 = new SolidTile(tw*5, th*2, tw, th);
ElectricTile t25 = new ElectricTile(tw*6, th*2, tw, th, 1);
ElectricTile t26 = new ElectricTile(tw*7, th*2, tw, th, -1);
ElectricTile t27 = new ElectricTile(tw*8, th*2, tw, th, 1);

SafeTile t28 = new SafeTile(0, th*3, tw, th);
SafeTile t29 = new SafeTile(tw, th*3, tw, th);
SafeTile t30 = new SafeTile(tw*2, th*3, tw, th);
SafeTile t31 = new SafeTile(tw*3, th*3, tw, th);
SafeTile t32 = new SafeTile(tw*4, th*3, tw, th);
SolidTile t33 = new SolidTile(tw*5, th*3, tw, th);
ElectricTile t34 = new ElectricTile(tw*6, th*3, tw, th, -1);
ElectricTile t35 = new ElectricTile(tw*7, th*3, tw, th, 1);
ElectricTile t36 = new ElectricTile(tw*8, th*3, tw, th, -1);

SafeTile t37 = new SafeTile(0, th*4, tw, th);
SafeTile t38 = new SafeTile(tw, th*4, tw, th);
SafeTile t39 = new SafeTile(tw*2, th*4, tw, th);
SafeTile t40 = new SafeTile(tw*3, th*4, tw, th);
SafeTile t41 = new SafeTile(tw*4, th*4, tw, th);
SolidTile t42 = new SolidTile(tw*5, th*4, tw, th);
ElectricTile t43 = new ElectricTile(tw*6, th*4, tw, th, 1);
ElectricTile t44 = new ElectricTile(tw*7, th*4, tw, th, -1);
ElectricTile t45 = new ElectricTile(tw*8, th*4, tw, th, 1);

SafeTile t46 = new SafeTile(0, th*5, tw, th);
SafeTile t47 = new SafeTile(tw, th*5, tw, th);
SafeTile t48 = new SafeTile(tw*2, th*5, tw, th);
SafeTile t49 = new SafeTile(tw*3, th*5, tw, th);
SafeTile t50 = new SafeTile(tw*4, th*5, tw, th);
SolidTile t51 = new SolidTile(tw*5, th*5, tw, th);
ElectricTile t52 = new ElectricTile(tw*6, th*5, tw, th, -1);
ElectricTile t53 = new ElectricTile(tw*7, th*5, tw, th, 1);
ElectricTile t54 = new ElectricTile(tw*8, th*5, tw, th, -1);

SafeTile t55 = new SafeTile(0, th*6, tw, th);
SafeTile t56 = new SafeTile(tw, th*6, tw, th);
SafeTile t57 = new SafeTile(tw*2, th*6, tw, th);
SafeTile t58 = new SafeTile(tw*3, th*6, tw, th);
SafeTile t59 = new SafeTile(tw*4, th*6, tw, th);
SolidTile t60 = new SolidTile(tw*5, th*6, tw, th);
ElectricTile t61 = new ElectricTile(tw*6, th*6, tw, th, 1);
ElectricTile t62 = new ElectricTile(tw*7, th*6, tw, th, -1);
ElectricTile t63 = new ElectricTile(tw*8, th*6, tw, th, 1);

SafeTile t64 = new SafeTile(0, th*7, tw, th);
SafeTile t65 = new SafeTile(tw, th*7, tw, th);
NextLevelTile t66 = new NextLevelTile(tw*2, th*7, tw, th);
SafeTile t67 = new SafeTile(tw*3, th*7, tw, th);
SafeTile t68 = new SafeTile(tw*4, th*7, tw, th);
SolidTile t69 = new SolidTile(tw*5, th*7, tw, th);
ElectricTile t70 = new ElectricTile(tw*6, th*7, tw, th, -1);
ElectricTile t71 = new ElectricTile(tw*7, th*7, tw, th, 1);
ElectricTile t72 = new ElectricTile(tw*8, th*7, tw, th, -1);

SafeTile t73 = new SafeTile(0, th*8, tw, th);
SafeTile t74 = new SafeTile(tw, th*8, tw, th);
SafeTile t75 = new SafeTile(tw*2, th*8, tw, th);
SafeTile t76 = new SafeTile(tw*3, th*8, tw, th);
SafeTile t77 = new SafeTile(tw*4, th*8, tw, th);
SolidTile t78 = new SolidTile(tw*5, th*8, tw, th);
ElectricTile t79 = new ElectricTile(tw*6, th*8, tw, th, 1);
ElectricTile t80 = new ElectricTile(tw*7, th*8, tw, th, -1);
ElectricTile t81 = new ElectricTile(tw*8, th*8, tw, th, 1);

SolidTile t82 = new SolidTile(0, th*9, tw, th);
SolidTile t83 = new SolidTile(tw, th*9, tw, th);
SolidTile t84 = new SolidTile(tw*2, th*9, tw, th);
SolidTile t85 = new SolidTile(tw*3, th*9, tw, th);
SolidTile t86 = new SolidTile(tw*4, th*9, tw, th);
SolidTile t87 = new SolidTile(tw*5, th*9, tw, th);
ElectricTile t88 = new ElectricTile(tw*6, th*9, tw, th, -1);
ElectricTile t89 = new ElectricTile(tw*7, th*9, tw, th, 1);
ElectricTile t90 = new ElectricTile(tw*8, th*9, tw, th, -1);

SolidTile t91 = new SolidTile(0, th*10, tw, th);
SafeTile t92 = new SafeTile(tw, th*10, tw, th);
SafeTile t93 = new SafeTile(tw*2, th*10, tw, th);
SafeTile t94 = new SafeTile(tw*3, th*10, tw, th);
SafeTile t95 = new SafeTile(tw*4, th*10, tw, th);
SafeTile t96 = new SafeTile(tw*5, th*10, tw, th);
ElectricTile t97 = new ElectricTile(tw*6, th*10, tw, th, 1);
ElectricTile t98 = new ElectricTile(tw*7, th*10, tw, th, -1);
ElectricTile t99 = new ElectricTile(tw*8, th*10, tw, th, 1);

SolidTile t100 = new SolidTile(0, th*11, tw, th);
SafeTile t101 = new SafeTile(tw, th*11, tw, th);
SafeTile t102 = new SafeTile(tw*2, th*11, tw, th);
SafeTile t103 = new SafeTile(tw*3, th*11, tw, th);
SafeTile t104 = new SafeTile(tw*4, th*11, tw, th);
SafeTile t105 = new SafeTile(tw*5, th*11, tw, th);
ElectricTile t106 = new ElectricTile(tw*6, th*11, tw, th, -1);
ElectricTile t107 = new ElectricTile(tw*7, th*11, tw, th, 1);
ElectricTile t108 = new ElectricTile(tw*8, th*11, tw, th, -1);

SolidTile t109 = new SolidTile(0, th*12, tw, th);
SafeTile t110 = new SafeTile(tw, th*12, tw, th);
SafeTile t111 = new SafeTile(tw*2, th*12, tw, th);
SafeTile t112 = new SafeTile(tw*3, th*12, tw, th);
SafeTile t113 = new SafeTile(tw*4, th*12, tw, th);
SafeTile t114 = new SafeTile(tw*5, th*12, tw, th);
ElectricTile t115 = new ElectricTile(tw*6, th*12, tw, th, 1);
ElectricTile t116 = new ElectricTile(tw*7, th*12, tw, th, -1);
ElectricTile t117 = new ElectricTile(tw*8, th*12, tw, th, 1);

SolidTile t118 = new SolidTile(tw*9, 0, tw, th);
SolidTile t119 = new SolidTile(tw*9, th, tw, th);
SolidTile t120 = new SolidTile(tw*9, th*2, tw, th);
SolidTile t121 = new SolidTile(tw*9, th*3, tw, th);
SolidTile t122 = new SolidTile(tw*9, th*4, tw, th);
SolidTile t123 = new SolidTile(tw*9, th*5, tw, th);
SolidTile t124 = new SolidTile(tw*9, th*6, tw, th);
SolidTile t125 = new SolidTile(tw*9, th*7, tw, th);
SolidTile t126 = new SolidTile(tw*9, th*8, tw, th);
SolidTile t127 = new SolidTile(tw*9, th*9, tw, th);
SolidTile t128 = new SolidTile(tw*9, th*10, tw, th);
SolidTile t129 = new SolidTile(tw*9, th*11, tw, th);
SolidTile t130 = new SolidTile(tw*9, th*12, tw, th);

SolidTile t131 = new SolidTile(0, th*13, tw, th);
SolidTile t132 = new SolidTile(tw, th*13, tw, th);
SolidTile t133 = new SolidTile(tw, th*13, tw, th);
SolidTile t134 = new SolidTile(tw*2, th*13, tw, th);
SolidTile t135 = new SolidTile(tw*3, th*13, tw, th);
SolidTile t136 = new SolidTile(tw*4, th*13, tw, th);
SolidTile t137 = new SolidTile(tw*5, th*13, tw, th);
SolidTile t138 = new SolidTile(tw*6, th*13, tw, th);
SolidTile t139 = new SolidTile(tw*7, th*13, tw, th);
SolidTile t140 = new SolidTile(tw*8, th*13, tw, th);
SolidTile t141 = new SolidTile(tw*9, th*13, tw, th);

Pawn e1 = new Pawn(tw*6, th, tw, th);
Pawn e2 = new Pawn(tw*7, th, tw, th);
Pawn e3 = new Pawn(tw*8, th, tw, th);


public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level16State()
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
	manager.addObject(t118);
	manager.addObject(t119);
	manager.addObject(t120);
	manager.addObject(t121);
	manager.addObject(t122);
	manager.addObject(t123);
	manager.addObject(t124);
	manager.addObject(t125);
	manager.addObject(t126);
	manager.addObject(t127);
	manager.addObject(t128);
	manager.addObject(t129);
	manager.addObject(t130);
	manager.addObject(t131);
	manager.addObject(t132);
	manager.addObject(t133);
	manager.addObject(t134);
	manager.addObject(t135);
	manager.addObject(t136);
	manager.addObject(t137);
	manager.addObject(t138);
	manager.addObject(t139);
	manager.addObject(t140);
	manager.addObject(t141);
	
	manager.addObject(e1);
	manager.addObject(e2);
	manager.addObject(e3);

	
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

public void updateLevel16State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw* 2);
		gp.setY(th*11);
		
		
		player.setX(tw*2);
		player.setY(th*11);
		
		e1.setX(tw*6);
		e1.setY(th);

		e2.setX(tw*7);
		e2.setY(th);
		
		e3.setX(tw*8);
		e3.setY(th);
		
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
	if(player.getX() == t66.getX() && player.getY() == t66.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv16);
		GameRunner.getFrame().add(GameRunner.lv17);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv17);
		GameRunner.lv17.startGame();
	}
}

public void drawLevel16State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}


public void paintComponent(Graphics g) {
	drawLevel16State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel16State();
	
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
		manager.movePawn(tw,twn*tw, thn*th, player);
		manager.switchState();
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
