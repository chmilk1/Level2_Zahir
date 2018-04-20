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

public class Level23State extends JPanel implements ActionListener, KeyListener{
	
public static int twn = 10;
public static int thn = 10;
public static int th = GameRunner.WINDOW_HEIGHT /thn;
public static int tw = th;
	
Timer timer;
ObjectManager manager = new ObjectManager();
GridPlayer gp = new GridPlayer(2 * tw, 2 * th, tw,th);
Player player = new Player(2 * tw, 2 * th, tw,th);


SolidTile t1 = new SolidTile(0,0,tw,th);
SolidTile t2 = new SolidTile(tw,0,tw,th);
SolidTile t3 = new SolidTile(tw * 2,0,tw,th);
SolidTile t4 = new SolidTile(tw * 3,0,tw,th);
SolidTile t5 = new SolidTile(tw * 4,0,tw,th);
SolidTile t6 = new SolidTile(tw * 5,0,tw,th);
SolidTile t7 = new SolidTile(tw * 6,0,tw,th);
SolidTile t8 = new SolidTile(tw * 7,0,tw,th);
SolidTile t9 = new SolidTile(tw * 8,0,tw,th);
RedTile t10 = new RedTile(tw * 9,0,tw,th);

SolidTile t11 = new SolidTile(0,th,tw,th);
ElectricTile t12 = new ElectricTile(tw,th,tw,th, -1);
ElectricTile t13 = new ElectricTile(tw * 2,th,tw,th, -1);
ElectricTile t14 = new ElectricTile(tw * 3,th,tw,th, -1);
SolidTile t15 = new SolidTile(tw * 4,th,tw,th);
ElectricTile t16 = new ElectricTile(tw * 5,th,tw,th, -1);
ElectricTile t17 = new ElectricTile(tw * 6,th,tw,th, -1);
ElectricTile t18 = new ElectricTile(tw * 7,th,tw,th, -1);
SolidTile t19 = new SolidTile(tw * 8,th,tw,th);
RedTile t20 = new RedTile(tw * 9,th,tw,th);

SolidTile t21 = new SolidTile(0,2*th,tw,th);
ElectricTile t22 = new ElectricTile(tw,2*th,tw,th, -1);
ElectricTile t23 = new ElectricTile(tw * 2,2*th,tw,th, -1);
ElectricTile t24 = new ElectricTile(tw * 3,2*th,tw,th, -1);
SolidTile t25 = new SolidTile(tw * 4,2*th,tw,th);
ElectricTile t26 = new ElectricTile(tw * 5,2*th,tw,th, -1);
NextLevelTile t27 = new NextLevelTile(tw * 6,2*th,tw,th);
ElectricTile t28 = new ElectricTile(tw * 7,2*th,tw,th, -1);
SolidTile t29 = new SolidTile(tw * 8,2*th,tw,th);
RedTile t30 = new RedTile(tw * 9,2*th,tw,th);

SolidTile t31 = new SolidTile(0,3*th,tw,th);
ElectricTile t32 = new ElectricTile(tw,3*th,tw,th, -1);
ElectricTile t33 = new ElectricTile(tw * 2,3*th,tw,th, -1);
ElectricTile t34 = new ElectricTile(tw * 3,3*th,tw,th, -1);
SolidTile t35 = new SolidTile(tw * 4,3*th,tw,th);
ElectricTile t36 = new ElectricTile(tw * 5,3*th,tw,th, -1);
ElectricTile t37 = new ElectricTile(tw * 6,3*th,tw,th, -1);
ElectricTile t38 = new ElectricTile(tw * 7,3*th,tw,th, -1);
SolidTile t39 = new SolidTile(tw * 8,3*th,tw,th);
RedTile t40 = new RedTile(tw * 9,3*th,tw,th);

SolidTile t41 = new SolidTile(0,4*th,tw,th);
SolidTile t42 = new SolidTile(tw,4*th,tw,th);
ElectricTile t43 = new ElectricTile(tw * 2,4*th,tw,th, -1);
SolidTile t44 = new SolidTile(tw * 3,4*th,tw,th);
SolidTile t45 = new SolidTile(tw * 4,4*th,tw,th);
SolidTile t46 = new SolidTile(tw * 5,4*th,tw,th);
ElectricTile t47 = new ElectricTile(tw * 6,4*th,tw,th, -1);
SolidTile t48 = new SolidTile(tw * 7,4*th,tw,th);
SolidTile t49 = new SolidTile(tw * 8,4*th,tw,th);
RedTile t50 = new RedTile(tw * 9,4*th,tw,th);

RightConveyerBelt t51 = new RightConveyerBelt(0,tw*5,tw,th);
RightConveyerBelt t52 = new RightConveyerBelt(tw,tw*5,tw,th);
RightConveyerBelt t53 = new RightConveyerBelt(tw * 2,tw*5,tw,th);
RightConveyerBelt t54 = new RightConveyerBelt(tw * 3,tw*5,tw,th);
RightConveyerBelt t55 = new RightConveyerBelt(tw * 4,tw*5,tw,th);
RightConveyerBelt t56 = new RightConveyerBelt(tw * 5,tw*5,tw,th);
RightConveyerBelt t57 = new RightConveyerBelt(tw * 6,tw*5,tw,th);
RightConveyerBelt t58 = new RightConveyerBelt(tw * 7,tw*5,tw,th);
RightConveyerBelt t59 = new RightConveyerBelt(tw * 8,tw*5,tw,th);
RedTile t60 = new RedTile(tw * 9,tw*5,tw,th);

ElectricTile t61 = new ElectricTile(0,tw*6,tw,th, 1);
ElectricTile t62 = new ElectricTile(tw,tw*6,tw,th, 1);
ElectricTile t63 = new ElectricTile(tw * 2,tw*6,tw,th, 1);
ElectricTile t64 = new ElectricTile(tw * 3,tw*6,tw,th, 1);
ElectricTile t65 = new ElectricTile(tw * 4,tw*6,tw,th, 1);
ElectricTile t66 = new ElectricTile(tw * 5,tw*6,tw,th, 1);
ElectricTile t67 = new ElectricTile(tw * 6,tw*6,tw,th, 1);
ElectricTile t68 = new ElectricTile(tw * 7,tw*6,tw,th, 1);
ElectricTile t69 = new ElectricTile(tw * 8,tw*6,tw,th, 1);
RedTile t70 = new RedTile(tw * 9,tw*6,tw,th);

ElectricTile t71 = new ElectricTile(0,tw*7,tw,th, 1);
ElectricTile t72 = new ElectricTile(tw,tw*7,tw,th, 1);
ElectricTile t73 = new ElectricTile(tw * 2,tw*7,tw,th, 1);
ElectricTile t74 = new ElectricTile(tw * 3,tw*7,tw,th, 1);
ElectricTile t75 = new ElectricTile(tw * 4,tw*7,tw,th, 1);
ElectricTile t76 = new ElectricTile(tw * 5,tw*7,tw,th, 1);
ElectricTile t77 = new ElectricTile(tw * 6,tw*7,tw,th, 1);
ElectricTile t78 = new ElectricTile(tw * 7,tw*7,tw,th, 1);
ElectricTile t79 = new ElectricTile(tw * 8,tw*7,tw,th, 1);
RedTile t80 = new RedTile(tw * 9,tw*7,tw,th);

ElectricTile t81 = new ElectricTile(0,tw*8,tw,th, 1);
ElectricTile t82 = new ElectricTile(tw,tw*8,tw,th, 1);
ElectricTile t83 = new ElectricTile(tw * 2,tw*8,tw,th, 1);
ElectricTile t84 = new ElectricTile(tw * 3,tw*8,tw,th, 1);
ElectricTile t85 = new ElectricTile(tw * 4,tw*8,tw,th, 1);
ElectricTile t86 = new ElectricTile(tw * 5,tw*8,tw,th, 1);
ElectricTile t87 = new ElectricTile(tw * 6,tw*8,tw,th, 1);
ElectricTile t88 = new ElectricTile(tw * 7,tw*8,tw,th, 1);
ElectricTile t89 = new ElectricTile(tw * 8,tw*8,tw,th, 1);
RedTile t90 = new RedTile(tw * 9,tw*8,tw,th);

RightConveyerBelt t91 = new RightConveyerBelt(0,tw*9,tw,th);
RightConveyerBelt t92 = new RightConveyerBelt(tw,tw*9,tw,th);
RightConveyerBelt t93 = new RightConveyerBelt(tw * 2,tw*9,tw,th);
RightConveyerBelt t94 = new RightConveyerBelt(tw * 3,tw*9,tw,th);
RightConveyerBelt t95 = new RightConveyerBelt(tw * 4,tw*9,tw,th);
RightConveyerBelt t96 = new RightConveyerBelt(tw * 5,tw*9,tw,th);
RightConveyerBelt t97 = new RightConveyerBelt(tw * 6,tw*9,tw,th);
RightConveyerBelt t98 = new RightConveyerBelt(tw * 7,tw*9,tw,th);
RightConveyerBelt t99 = new RightConveyerBelt(tw * 8,tw*9,tw,th);
RedTile t100 = new RedTile(tw * 9,tw*9,tw,th);

Pawn e1 = new Pawn(tw * 6, th * 4, tw, th);



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


public Level23State()
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
		
		e1.setX(tw * 6);
		e1.setY(th * 4);
		
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
	if(player.getX() == t27.getX() && player.getY() == t27.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv23);
		GameRunner.getFrame().add(GameRunner.lv24);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv24);
		GameRunner.lv24.startGame();
	
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

