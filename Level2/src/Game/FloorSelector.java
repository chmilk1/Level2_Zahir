package Game;

import java.awt.Color;
import java.awt.Font;
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

public class FloorSelector extends JPanel implements KeyListener, ActionListener{
	private BufferedImage p;
	Timer timer;
	boolean menuSelect = true;
	public static int floor = 1;
	
	public static int currentChoice = 0;
	private String[] options = {
		"Floor 1",
		"Floor 2",
		"Floor 3"
	};
	
	private Color titleColor;
	private Font titleFont;
	
	private Font font;
	private Font font2;
	
	public FloorSelector() {
		timer = new Timer(1000/60, this);
		
	
			// load select
			try {
				p = ImageIO.read(
					getClass().getResourceAsStream("GP.png") 
				).getSubimage(110, 130, 120, 110);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
			// titles and fonts
			titleColor = Color.WHITE;
			titleFont = new Font("Times New Roman", Font.PLAIN, 280);
			font = new Font("Arial", Font.PLAIN, 100);
			font2 = new Font("Arial", Font.PLAIN, 50);
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		// draw bg
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GameRunner.width, GameRunner.height);
		
		// draw title
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("G A M E", 200, 200);
		
		// draw menu options
		g.setFont(font);
		g.setColor(Color.WHITE);
		g.drawString("Floor 1", 600, 350);
		if(floor >= 2) {
		g.drawString("Floor 2", 600, 525);
		}
		if(floor >= 3)
		{
		g.drawString("Floor 3", 600, 700);
		}
		
		// draw floating rook
		if(floor == 1)
		{
			if(currentChoice == 0) g.drawImage(p, 450, 265, null);
		}
		if(floor == 2)
		{
		if(currentChoice == 0) g.drawImage(p, 450, 265, null);
		else if(currentChoice == 1) g.drawImage(p, 450, 440, null);
		}
		if(floor == 3)
		{
			if(currentChoice == 0) g.drawImage(p, 450, 265, null);
			else if(currentChoice == 1) g.drawImage(p, 450, 440, null);
			else if(currentChoice == 2) g.drawImage(p, 450, 615, null);
		}
		
		// other
		g.setFont(font2);
		g.drawString("2017 Zahir A.", 10, 725);
		
		menuSelect = true;
	}
	
	public void startGame()
	{
		timer.start();
	}

	
	private void select() {
		if(currentChoice == 0 && floor == 1) {
			timer.stop();
			menuSelect = false;
			Sound.click.play();
			Sound.sound4.stop();
			Sound.sound1.loop();
			GameRunner.frame.remove(GameRunner.f);
			GameRunner.frame.add(GameRunner.lv1);
			GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
			GameRunner.frame.setVisible(true);
			GameRunner.frame.addKeyListener(GameRunner.lv1);
			GameRunner.lv1.startGame();
			menuSelect = false;
		}
		else if(currentChoice == 1 && floor == 2) 
		{
			timer.stop();
			menuSelect = false;
			Sound.click.play();
			Sound.sound4.stop();
			Sound.sound2.loop();
			GameRunner.frame.remove(GameRunner.f);
			GameRunner.frame.add(GameRunner.lv13);
			GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
			GameRunner.frame.setVisible(true);
			GameRunner.frame.addKeyListener(GameRunner.lv13);
			GameRunner.lv13.startGame();
			menuSelect = false;
		}
		else if(currentChoice == 2 && floor == 3) 
		{
			timer.stop();
			menuSelect = false;
			Sound.click.play();
			Sound.sound4.stop();
			Sound.sound3.loop();
			GameRunner.frame.remove(GameRunner.f);
			GameRunner.frame.add(GameRunner.lv20);
			GameRunner.frame.setSize(GameRunner.width, GameRunner.height);
			GameRunner.frame.setVisible(true);
			GameRunner.frame.addKeyListener(GameRunner.lv20);
			GameRunner.lv20.startGame();
			menuSelect = false;
		}
	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
	
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(menuSelect == true)
		{
		int key = e.getKeyCode();
		if(key == KeyEvent.VK_ENTER) select();
		
		if(floor == 1)
		{
			if(key == KeyEvent.VK_UP) {
				if(currentChoice > 0) {
					currentChoice--;
				}
			}
			if(key == KeyEvent.VK_DOWN) {
				if(currentChoice < 0) {
					currentChoice++;
				}
			}
		}
		
		if(floor == 2)
		{
			if(key == KeyEvent.VK_UP) {
				if(currentChoice > 0) {
					currentChoice--;
				}
			}
			if(key == KeyEvent.VK_DOWN) {
				if(currentChoice < 1) {
					currentChoice++;
				}
			}
			
		}
		if(floor == 3)
		{
			if(key == KeyEvent.VK_UP) {
				if(currentChoice > 0) {
					currentChoice--;
				}
			}
			if(key == KeyEvent.VK_DOWN) {
				if(currentChoice < 2) {
					currentChoice++;
				}
			}
		}
		
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
}
