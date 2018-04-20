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

public class Level27State extends JPanel implements ActionListener, KeyListener{
	
public static int twn = 10;
public static int thn = 10;
public static int th = GameRunner.WINDOW_HEIGHT /thn;
public static int tw = th;
	
Timer timer;
ObjectManager manager = new ObjectManager();
GridPlayer gp = new GridPlayer(8 * tw, 8 * th, tw,th);
Player player = new Player(8 * tw, 8 * th, tw,th);


RedTile t1 = new RedTile(0,0,tw,th);
RedTile t2 = new RedTile(tw,0,tw,th);
RedTile t3 = new RedTile(tw * 2,0,tw,th);
RedTile t4 = new RedTile(tw * 3,0,tw,th);
RedTile t5 = new RedTile(tw * 4,0,tw,th);
RedTile t6 = new RedTile(tw * 5,0,tw,th);
RedTile t7 = new RedTile(tw * 6,0,tw,th);
RedTile t8 = new RedTile(tw * 7,0,tw,th);
RedTile t9 = new RedTile(tw * 8,0,tw,th);
RedTile t10 = new RedTile(tw * 9,0,tw,th);

RedTile t11 = new RedTile(0,th,tw,th);
ECL t12 = new ECL(tw,th,tw,th, 1);
ECL t13 = new ECL(tw * 2,th,tw,th, -1);
ECL t14 = new ECL(tw * 3,th,tw,th, 1);
ECL t15 = new ECL(tw * 4,th,tw,th, -1);
ECL t16 = new ECL(tw * 5,th,tw,th, 1);
ECL t17 = new ECL(tw * 6,th,tw,th, -1);
ECL t18 = new ECL(tw * 7,th,tw,th, 1);
ECL t19 = new ECL(tw * 8,th,tw,th, -1);
RedTile t20 = new RedTile(tw * 9,th,tw,th);

RedTile t21 = new RedTile(0,th*2,tw,th);
RedTile t22 = new RedTile(tw,th*2,tw,th);
RedTile t23 = new RedTile(tw * 2,th*2,tw,th);
RedTile t24 = new RedTile(tw * 3,th*2,tw,th);
RedTile t25 = new RedTile(tw * 4,th*2,tw,th);
RedTile t26 = new RedTile(tw * 5,th*2,tw,th);
RedTile t27 = new RedTile(tw * 6, th*2,tw,th);
RedTile t28 = new RedTile(tw * 7,th*2,tw,th);
RedTile t29 = new RedTile(tw * 8,th*2,tw,th);
RedTile t30 = new RedTile(tw * 9, th*2,tw,th);

SolidTile t31 = new SolidTile(0,3*th,tw,th);
RedTile t32 = new RedTile(tw,3*th,tw,th);
SolidTile t33 = new SolidTile(tw * 2,3*th,tw,th);
SolidTile t34 = new SolidTile(tw * 3,3*th,tw,th);
SolidTile t35 = new SolidTile(tw * 4,3*th,tw,th);
SolidTile t36 = new SolidTile(tw * 5,3*th,tw,th);
SolidTile t37 = new SolidTile(tw * 6,3*th,tw,th);
SolidTile t38 = new SolidTile(tw * 7,3*th,tw,th);
RedTile t39 = new RedTile(tw * 8,3*th,tw,th);
SolidTile t40 = new SolidTile(tw * 9,3*th,tw,th);

RedTile t41 = new RedTile(0,4*th,tw,th);
RedTile t42 = new RedTile(tw,4*th,tw,th);
RedTile t43 = new RedTile(tw * 2,4*th,tw,th);
DECL t44 = new DECL(tw * 3,4*th,tw,th, -1);
DECL t45 = new DECL(tw * 4,4*th,tw,th, -1);
DECL t46 = new DECL(tw * 5,4*th,tw,th, -1);
DECR t47 = new DECR(tw * 6,4*th,tw,th, -1);
DECR t48 = new DECR(tw * 7,4*th,tw,th, -1);
DECR t49 = new DECR(tw * 8,4*th,tw,th, -1);
RedTile t50 = new RedTile(tw * 9,4*th,tw,th);

SolidTile t51 = new SolidTile(0,5*th,tw,th);
NextLevelTile t52 = new NextLevelTile(tw,5*th,tw,th);
SolidTile t53 = new SolidTile(tw * 2,5*th,tw,th);
SolidTile t54 = new SolidTile(tw * 3, 5*th,tw,th);
RedTile t55 = new RedTile(tw * 4, 5*th,tw,th);
SolidTile t56 = new SolidTile(tw * 5,5*th,tw,th);
RedTile t57 = new RedTile(tw * 6,5*th,tw,th);
SolidTile t58 = new SolidTile(tw * 7,5*th,tw,th);
RedTile t59 = new RedTile(tw * 8,5*th,tw,th);
SolidTile t60 = new SolidTile(tw * 9,5*th,tw,th);

RedTile t61 = new RedTile(0,th*6,tw,th);
ECR t62 = new ECR(tw,th*6,tw,th, -1);
ECR t63 = new ECR(tw * 2,th*6,tw,th, -1);
ECR t64 = new ECR(tw * 3,th*6,tw,th, -1);
ECR t65 = new ECR(tw * 4,th*6,tw,th, -1);
ECR t66 = new ECR(tw * 5,th*6,tw,th, 1);
ECR t67 = new ECR(tw * 6,th*6,tw,th, 1);
ECR t68 = new ECR(tw * 7,th*6,tw,th, 1);
ECR t69 = new ECR(tw * 8,th*6,tw,th, 1);
RedTile t70 = new RedTile(tw * 9,th*6,tw,th);

SolidTile t71 = new SolidTile(0,7*th,tw,th);
SolidTile t72 = new SolidTile(tw,7*th,tw,th);
SolidTile t73 = new SolidTile(tw * 2, 7*th,tw,th);
RedTile t74 = new RedTile(tw * 3, 7*th,tw,th);
SolidTile t75 = new SolidTile(tw * 4, 7*th,tw,th);
SolidTile t76 = new SolidTile(tw * 5,7*th,tw,th);
SolidTile t77 = new SolidTile(tw * 6,7*th,tw,th);
SolidTile t78 = new SolidTile(tw * 7,7*th,tw,th);
SolidTile t79 = new SolidTile(tw * 8,7*th,tw,th);
SolidTile t80 = new SolidTile(tw * 9,7*th,tw,th);


RedTile t81 = new RedTile(0,tw*8,tw,th);
DoubleLCB t82 = new DoubleLCB(tw,tw*8,tw,th);
DoubleLCB t83 = new DoubleLCB(tw * 2,tw*8,tw,th);
DoubleLCB t84 = new DoubleLCB(tw * 3,tw*8,tw,th);
DoubleLCB t85 = new DoubleLCB(tw * 4,tw*8,tw,th);
DoubleLCB t86 = new DoubleLCB(tw * 5,tw*8,tw,th);
DoubleLCB t87 = new DoubleLCB(tw * 6,tw*8,tw,th);
SafeTile t88 = new SafeTile(tw * 7,tw*8,tw,th);
SafeTile t89 = new SafeTile(tw * 8,tw*8,tw,th);
SolidTile t90 = new SolidTile(tw * 9,tw*8,tw,th);

SolidTile t91 = new SolidTile(0,tw*9,tw,th);
SolidTile t92 = new SolidTile(tw,tw*9,tw,th);
SolidTile t93 = new SolidTile(tw * 2,tw*9,tw,th);
SolidTile t94 = new SolidTile(tw * 3,tw*9,tw,th);
SolidTile t95 = new SolidTile(tw * 4,tw*9,tw,th);
SolidTile t96 = new SolidTile(tw * 5,tw*9,tw,th);
SolidTile t97 = new SolidTile(tw * 6,tw*9,tw,th);
SolidTile t98 = new SolidTile(tw * 7,tw*9,tw,th);
SolidTile t99 = new SolidTile(tw * 8,tw*9,tw,th);
SolidTile t100 = new SolidTile(tw * 9,tw*9,tw,th);




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


public Level27State()
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

public void updateLevel27State() {
	
	manager.update();
	manager.checkCollision(player, tw);
	winChecker();
	boundChecker();
	
	
	
	if(player.isAlive == false)
	{
		
		player.setX(8*tw);
		player.setY(8*tw);
		
		gp.setX(8*tw);
		gp.setY(8*tw);
		
		if(t49.state == 1)
		{
			manager.resetElectric();
		}
		
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
	
	if(player.getX() < 0) {
		player.setX(0);}
	if(player.getX() >tw*twn - player.getWidth()) {
		player.setX(tw*twn - player.getWidth());}
	if(player.getY() < 0) {
		player.setY(0);}
	if(player.getY() > th*thn - player.getHeight()) {
		player.setY(th*thn - player.getHeight());}

}

public void winChecker()
{
	if(player.getX() == t52.getX() && player.getY() == t52.getY())
	{
		manager.reset();
		timer.stop();
		GameRunner.getFrame().remove(GameRunner.lv27);
		GameRunner.getFrame().add(GameRunner.lv28);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		GameRunner.getFrame().addKeyListener(GameRunner.lv28);
		GameRunner.lv28.startGame();
	
	}
}

public void drawLevel27State(Graphics g) {
	g.setColor(Color.BLACK);
	g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
	manager.draw(g);
}




public void paintComponent(Graphics g) {
	drawLevel27State(g);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	repaint();
	updateLevel27State();
	
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
		
		manager.switchState();
		player.setX(gp.getX());
		player.setY(gp.getY());
		
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


