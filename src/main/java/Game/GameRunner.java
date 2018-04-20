package Game;

import Game.levels.Level28State;

import javax.swing.JFrame;


public class GameRunner extends JFrame{

	private static JFrame frame = new JFrame();
	public final static int WINDOW_WIDTH = 1500;
	public final static int WINDOW_HEIGHT = 750;
	GameRunner game;
	
	static MenuState m = new MenuState();
	static FloorSelector f = new FloorSelector();
	private static EndState endState = new EndState();
	
	static GamePanel lv1 = new GamePanel();
	static Level2State lv2 = new Level2State();
	static Level3State lv3 = new Level3State();
	static Level4State lv4 = new Level4State();
	static Level5State lv5 = new Level5State();
	static Level6State lv6 = new Level6State();
	static Level7State lv7 = new Level7State();
	static Level8State lv8 = new Level8State();
	static Level9State lv9 = new Level9State();
	static Level10State lv10 = new Level10State();
	static Level11State lv11 = new Level11State();
	static Level12State lv12 = new Level12State();
	static Level13State lv13 = new Level13State();
	static Level14State lv14 = new Level14State();
	static Level15State lv15 = new Level15State();
	static Level16State lv16 = new Level16State();
	static Level17State lv17 = new Level17State();
	static Level18State lv18 = new Level18State();
	static Level19State lv19 = new Level19State();
	static Level20State lv20 = new Level20State();
	static Level21State lv21 = new Level21State();
	static Level22State lv22 = new Level22State();
	static Level23State lv23 = new Level23State();
	static Level24State lv24 = new Level24State();
	static Level25State lv25 = new Level25State();
	static Level26State lv26 = new Level26State();
	static Level27State lv27 = new Level27State();
	static Level28State lv28 = new Level28State();
	


	public static void main(String[] args) {
		GameRunner game = new GameRunner();
		game.setup();
	}

	public GameRunner() {
		
		MenuState m = new MenuState();
		EndState e = new EndState();
		FloorSelector f = new FloorSelector();
		GamePanel lv1 = new GamePanel();
		Level2State lv2 = new Level2State();
		Level3State lv3 = new Level3State();
		Level4State lv4 = new Level4State();
		Level5State lv5 = new Level5State();
		Level6State lv6 = new Level6State();
		Level7State lv7 = new Level7State();
		Level8State lv8 = new Level8State();
		Level9State lv9 = new Level9State();
		Level10State lv10 = new Level10State();
		Level11State lv11 = new Level11State();
		Level12State lv12 = new Level12State();
		Level13State lv13 = new Level13State();
		Level14State lv14 = new Level14State();
		Level15State lv15 = new Level15State();
		Level16State lv16 = new Level16State();
		Level17State lv17 = new Level17State();
		Level18State lv18 = new Level18State();
		Level19State lv19 = new Level19State();
		Level20State lv20 = new Level20State();
		Level21State lv21 = new Level21State();
		Level22State lv22 = new Level22State();
		Level23State lv23 = new Level23State();
		Level24State lv24 = new Level24State();
		Level25State lv25 = new Level25State();
		Level26State lv26 = new Level26State();
		Level27State lv27 = new Level27State();
		Level28State lv28 = new Level28State();
		
		JFrame frame = new JFrame();

		GameRunner.setFrame(frame);
		
		GameRunner.lv1 = lv1;
		GameRunner.lv2 = lv2;
		GameRunner.lv3 = lv3;
		GameRunner.lv4 = lv4;
		GameRunner.lv5 = lv5;
		GameRunner.lv6 = lv6;
		GameRunner.lv7 = lv7;
		GameRunner.lv8 = lv8;
		GameRunner.lv9 = lv9;
		GameRunner.lv10 = lv10;
		GameRunner.lv11 = lv11;
		GameRunner.lv12 = lv12;
		GameRunner.lv13 = lv13;
		GameRunner.lv14 = lv14;
		GameRunner.lv15 = lv15;
		GameRunner.lv16 = lv16;
		GameRunner.lv17 = lv17;
		GameRunner.lv18 = lv18;
		GameRunner.lv19 = lv19;
		GameRunner.lv20 = lv20;
		GameRunner.lv21 = lv21;
		GameRunner.lv22 = lv22;
		GameRunner.lv23 = lv23;
		GameRunner.lv24 = lv24;
		GameRunner.lv25 = lv25;
		GameRunner.lv26 = lv26;
		GameRunner.lv27 = lv27;
		GameRunner.lv28 = lv28;
		GameRunner.f = f;
		GameRunner.setEndState(e);
		
	}

	public static JFrame getFrame() {
		return frame;
	}

	public static void setFrame(JFrame frame) {
		GameRunner.frame = frame;
	}

	public static EndState getEndState() {
		return endState;
	}

	public static void setEndState(EndState endState) {
		GameRunner.endState = endState;
	}

	public void setup() {
		Sound.menuTrack.loop();
	
		GameRunner.getFrame().add(m);
		GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
		GameRunner.getFrame().setVisible(true);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GameRunner.getFrame().addKeyListener(GameRunner.m);
		GameRunner.m.startGame();

			
			
	}
	
	
}


	
	




