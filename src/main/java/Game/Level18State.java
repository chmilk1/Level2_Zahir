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

public class Level18State extends JPanel implements ActionListener, KeyListener{
	
	public static int twn = 9;
	public static int thn = 13;
	public static int th = GameRunner.WINDOW_HEIGHT /thn;
	public static int tw = th;
	
Timer timer;
ObjectManager manager = new ObjectManager();
Player player = new Player(tw*4, th*6, tw,th);
GridPlayer gp = new GridPlayer(tw*4,th*6, tw,th);

SolidTile t1 = new SolidTile(0, 0, tw, th);
SolidTile t2 = new SolidTile(tw, 0, tw, th);
SolidTile t3 = new SolidTile(tw*2, 0, tw, th);
SolidTile t4 = new SolidTile(tw*3, 0, tw, th);
SolidTile t5 = new SolidTile(tw*4, 0, tw, th);
SolidTile t6 = new SolidTile(tw*5, 0, tw, th);
SolidTile t7 = new SolidTile(tw*6, 0, tw, th);
SolidTile t8 = new SolidTile(tw*7, 0, tw, th);
SolidTile t9 = new SolidTile(tw*8, 0, tw, th);

SafeTile t10 = new SafeTile(0, th, tw, th);
SafeTile t11 = new SafeTile(tw, th, tw, th);
SafeTile t12 = new SafeTile(tw*2, th, tw, th);
SafeTile t13 = new SafeTile(tw*3, th, tw, th);
SafeTile t14 = new SafeTile(tw*4, th, tw, th);
SafeTile t15 = new SafeTile(tw*5, th, tw, th);
SafeTile t16 = new SafeTile(tw*6, th, tw, th);
SafeTile t17 = new SafeTile(tw*7, th, tw, th);
SafeTile t18 = new SafeTile(tw*8, th, tw, th);

SafeTile t19 = new SafeTile(0, th*2, tw, th);
SafeTile t20 = new SafeTile(tw, th*2, tw, th);
SafeTile t21 = new SafeTile(tw*2,th*2, tw, th);
SafeTile t22 = new SafeTile(tw*3, th*2, tw, th);
NextLevelTile t23 = new NextLevelTile(4*tw, th*2, tw, th);
SafeTile t24 = new SafeTile(5*tw, th*2, tw, th);
SafeTile t25 = new SafeTile(6*tw, th*2, tw, th);
SafeTile t26 = new SafeTile(7*tw, th*2, tw, th);
SafeTile t27 = new SafeTile(8*tw, th*2, tw, th);

SafeTile t28 = new SafeTile(0, th*3, tw, th);
SafeTile t29 = new SafeTile(tw, th*3, tw, th);
SafeTile t30 = new SafeTile(tw*2, th*3, tw, th);
SafeTile t31 = new SafeTile(tw*3, th*3, tw, th);
SafeTile t32 = new SafeTile(tw*4, th*3, tw, th);
SafeTile t33 = new SafeTile(tw*5, th*3, tw, th);
SafeTile t34 = new SafeTile(tw*6, th*3, tw, th);
SafeTile t35 = new SafeTile(tw*7, th*3, tw, th);
SafeTile t36 = new SafeTile(tw*8,th*3, tw, th);

SolidTile t37 = new SolidTile(0, th*4, tw, th);
SolidTile t38 = new SolidTile(tw, th*4, tw, th);
SolidTile t39 = new SolidTile(tw*2, th*4, tw, th);
SolidTile t40 = new SolidTile(tw*3, th*4, tw, th);
SafeTile t41 = new SafeTile(tw*4, th*4, tw, th);
SolidTile t42 = new SolidTile(tw*5, th*4, tw, th);
SolidTile t43 = new SolidTile(tw*6, th*4, tw, th);
SolidTile t44 = new SolidTile(tw*7, th*4, tw, th);
SolidTile t45 = new SolidTile(tw*8,th*4, tw, th);

ElectricTile t46 = new ElectricTile(0, th*5, tw, th, 1);
ElectricTile t47 = new ElectricTile(tw, th*5, tw, th, 1);
ElectricTile t48 = new ElectricTile(tw*2, th*5, tw, th, 1);
ElectricTile t49 = new ElectricTile(tw*3, th*5, tw, th, -1);
ElectricTile t50 = new ElectricTile(tw*4, th*5, tw, th, -1);
ElectricTile t51 = new ElectricTile(tw*5, th*5, tw, th, -1);
ElectricTile t52 = new ElectricTile(tw*6, th*5, tw, th, 1);
ElectricTile t53 = new ElectricTile(tw*7, th*5, tw, th, 1);
ElectricTile t54 = new ElectricTile(tw*8,th*5, tw, th, 1);

ElectricTile t55 = new ElectricTile(0, th*6, tw, th, 1);
SafeTile t56 = new SafeTile(tw, th*6, tw, th);
ElectricTile t57 = new ElectricTile(tw*2, th*6, tw, th, 1);
ElectricTile t58 = new ElectricTile(tw*3, th*6, tw, th, -1);
ElectricTile t59 = new ElectricTile(tw*4, th*6, tw, th, -1);
ElectricTile t60 = new ElectricTile(tw*5, th*6, tw, th, -1);
ElectricTile t61 = new ElectricTile(tw*6, th*6, tw, th, 1);
SafeTile t62 = new SafeTile(tw*7, th*6, tw, th);
ElectricTile t63 = new ElectricTile(tw*8,th*6, tw, th, 1);

ElectricTile t64 = new ElectricTile(0, th*7, tw, th, 1);
ElectricTile t65 = new ElectricTile(tw, th*7, tw, th, 1);
ElectricTile t66 = new ElectricTile(tw*2, th*7, tw, th, 1);
ElectricTile t67 = new ElectricTile(tw*3, th*7, tw, th, -1);
ElectricTile t68 = new ElectricTile(tw*4, th*7, tw, th, -1);
ElectricTile t69 = new ElectricTile(tw*5, th*7, tw, th, -1);
ElectricTile t70 = new ElectricTile(tw*6, th*7, tw, th, 1);
ElectricTile t71 = new ElectricTile(tw*7, th*7, tw, th, 1);
ElectricTile t72 = new ElectricTile(tw*8,th*7, tw, th, 1);

SolidTile t73 = new SolidTile(0, th*8, tw, th);
SolidTile t74 = new SolidTile(tw, th*8,tw, th);
SafeTile t75 = new SafeTile(tw*2, th*8, tw, th);
SolidTile t76 = new SolidTile(tw*3, th*8, tw, th);
SolidTile t77 = new SolidTile(tw*4, th*8, tw, th);
SolidTile t78 = new SolidTile(tw*5, th*8, tw, th);
SafeTile t79 = new SafeTile(tw*6, th*8, tw, th);
SolidTile t80 = new SolidTile(tw*7, th*8, tw, th);
SolidTile t81 = new SolidTile(tw*8,th*8, tw, th);

ElectricTile t82 = new ElectricTile(0, th*9, tw, th, 1);
ElectricTile t83 = new ElectricTile(tw, th*9, tw, th, 1);
ElectricTile t84 = new ElectricTile(tw*2, th*9, tw, th, 1);
ElectricTile t85 = new ElectricTile(tw*3, th*9, tw, th, -1);
ElectricTile t86 = new ElectricTile(tw*4, th*9, tw, th, -1);
ElectricTile t87 = new ElectricTile(tw*5, th*9, tw, th, -1);
ElectricTile t88 = new ElectricTile(tw*6, th*9, tw, th, 1);
ElectricTile t89 = new ElectricTile(tw*7, th*9, tw, th, 1);
ElectricTile t90 = new ElectricTile(tw*8,th*9, tw, th, 1);

ElectricTile t91 = new ElectricTile(0, th*10, tw, th, 1);
SolidTile t92 = new SolidTile(tw, th*10, tw, th);
ElectricTile t93 = new ElectricTile(tw*2, th*10, tw, th, 1);
ElectricTile t94 = new ElectricTile(tw*3, th*10, tw, th, -1);
ElectricTile t95 = new ElectricTile(tw*4, th*10, tw, th, -1);
ElectricTile t96 = new ElectricTile(tw*5, th*10, tw, th, -1);
ElectricTile t97 = new ElectricTile(tw*6, th*10, tw, th, 1);
SolidTile t98 = new SolidTile(tw*7, th*10, tw, th);
ElectricTile t99 = new ElectricTile(tw*8,th*10, tw, th, 1);

ElectricTile t100 = new ElectricTile(0, th*11, tw, th, 1);
ElectricTile t101 = new ElectricTile(tw, th*11, tw, th, 1);
ElectricTile t102 = new ElectricTile(tw*2, th*11, tw, th, 1);
ElectricTile t103 = new ElectricTile(tw*3, th*11, tw, th, -1);
ElectricTile t104 = new ElectricTile(tw*4, th*11, tw, th, -1);
ElectricTile t105 = new ElectricTile(tw*5, th*11, tw, th, -1);
ElectricTile t106 = new ElectricTile(tw*6, th*11, tw, th, 1);
ElectricTile t107 = new ElectricTile(tw*7, th*11, tw, th, 1);
ElectricTile t108 = new ElectricTile(tw*8,th*11, tw, th, 1);

SolidTile t109 = new SolidTile(0, th*12, tw, th);
SolidTile t110 = new SolidTile(tw, th*12, tw, th);
SolidTile t111 = new SolidTile(tw*2, th*12, tw, th);
SolidTile t112 = new SolidTile(tw*3, th*12, tw, th);
SolidTile t113 = new SolidTile(tw*4, th*12, tw, th);
SolidTile t114 = new SolidTile(tw*5, th*12, tw, th);
SolidTile t115 = new SolidTile(tw*6, th*12, tw, th);
SolidTile t116 = new SolidTile(tw*7, th*12, tw, th);
SolidTile t117 = new SolidTile(tw*8, th*12, tw, th);


Pawn p1 = new Pawn(tw*4, th*4, tw, th);

public static BufferedImage PlayerImg;
public static BufferedImage NTImg;
public static BufferedImage RTImg;
public static BufferedImage GPImg;
public static BufferedImage deathImg;
public static BufferedImage wtImg;
public static BufferedImage ONETImg;
public static BufferedImage OFFETImg;
public static BufferedImage BTImg;


public Level18State()
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

	
	
	manager.addObject(p1);

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

public void updateLevel18State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	if(player.isAlive == false)
	{
		gp.setX(tw*4);
		gp.setY(th*6);
		
		
		player.setX(tw*4);
		player.setY(th*6);
		
		p1.setX(tw*4);
		p1.setY(th*4);
		
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
	if(player.getX() == t23.getX() && player.getY() == t23.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv18);
		GameRunner.getFrame().add(GameRunner.lv19);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv19);
		GameRunner.lv19.startGame();
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


}


