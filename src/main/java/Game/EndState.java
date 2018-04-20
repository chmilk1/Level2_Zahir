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

public class EndState extends JPanel implements KeyListener, ActionListener{
	private BufferedImage p;
	Timer timer;
	boolean menuSelect = true;
	
	private int currentChoice = 0;
	private String[] options = {
		"Start",
		"Quit"
	};
	
	private Color titleColor;
	private Font titleFont;
	
	private Font font;
	private Font font2;
	
	public EndState() {
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
			titleFont = new Font("Times New Roman", Font.PLAIN, 300);
			font = new Font("Arial", Font.PLAIN, 140);
			font2 = new Font("Arial", Font.PLAIN, 50);
		
	}
	
	
	public void paintComponent(Graphics g) {
		
		// draw bg
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		
		// draw title
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("E N D", 350, 400);
		
		g.setFont(font2);
		g.drawString(" Number of Deaths: " + KeyHandler.numDeaths, 475, 600);
		
		
		menuSelect = true;
	}
	
	public void startGame()
	{
		timer.start();
	}

	
	private void select() {
	
	}
	
	public void actionPerformed(ActionEvent e) {
		repaint();
		
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
	
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		
	}
	
}
