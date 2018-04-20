package Game.levels;

import Game.*;
import Game.tiles.Tile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Created by jamesmaron on 3/29/18.
 */
public abstract class Level extends JPanel implements ActionListener, KeyListener {
    int tileSideLength;
    int widthInTiles;
    int heightInTiles;

    Tile finalTile;

    protected static int opacity = 0;
    Timer timer;
    ObjectManager manager = new ObjectManager();
    Player player = new Player(tileSideLength *2, tileSideLength *2, tileSideLength, tileSideLength);
    GridPlayer gp = new GridPlayer(tileSideLength *2, tileSideLength *2, tileSideLength, tileSideLength);

    public Level() {
        timer = new Timer(1000/60, this);
    }

    public void startGame()
    {
        timer.start();
    }

    public void boundChecker()
    {
        if(gp.getX() < 0) {
            gp.setX(0);}
        if(gp.getX() > tileSideLength * widthInTiles - gp.getWidth()) {
            gp.setX(tileSideLength * widthInTiles - gp.getWidth());}
        if(gp.getY() < 0) {
            gp.setY(0);}
        if(gp.getY() > tileSideLength * heightInTiles - gp.getHeight()) {
            gp.setY(tileSideLength * heightInTiles - gp.getHeight());}

        if(player.getX() < 0) {
            player.setX(0);}
        if(player.getX() > tileSideLength * widthInTiles - player.getWidth()) {
            player.setX(tileSideLength * widthInTiles - player.getWidth());}
        if(player.getY() < 0) {
            player.setY(0);}
        if(player.getY() > tileSideLength * heightInTiles - player.getHeight()) {
            player.setY(tileSideLength * heightInTiles - player.getHeight());}
    }

    public void winChecker()
    {
        if(player.getX() == finalTile.getX() && player.getY() == finalTile.getY())
        {
            if(opacity < 245)
            {
            if(System.currentTimeMillis() % 2 == 0)
                {
                    opacity += 10;
                }
            }

            if(opacity >= 245)
            {
                Sound.menuTrack.stop();

                manager.reset();
                timer.stop();
                Sound.end.loop();
                GameRunner.getFrame().add(GameRunner.getEndState());
                GameRunner.getFrame().setSize(GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
                GameRunner.getFrame().setVisible(true);
                GameRunner.getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                GameRunner.getFrame().addKeyListener(GameRunner.getEndState());
                GameRunner.getEndState().startGame();

            }
        }
    }

    public void paintComponent(Graphics g) {
        drawLevel(g);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
        updateLevel();

    }

    @Override
    public void keyTyped(KeyEvent e) {


    }

    public abstract void updateLevel();


    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if(InputManager.horizontal == false && InputManager.vertical == false)
        {
        if(key == KeyEvent.VK_RIGHT)
        {
            gp.setX(gp.getX() + tileSideLength);
            InputManager.horizontal = true;
        }
        if(key == KeyEvent.VK_LEFT)
        {
            gp.setX(gp.getX() - tileSideLength);
            InputManager.horizontal = true;
        }
        if(key == KeyEvent.VK_UP)
        {
            gp.setY(gp.getY() - tileSideLength);
            InputManager.vertical = true;
        }
        if(key == KeyEvent.VK_DOWN)
        {
            gp.setY(gp.getY() + tileSideLength);
            InputManager.vertical = true;
        }

        }



        else if(InputManager.horizontal )
        {
            if(key == KeyEvent.VK_RIGHT)
            {
                gp.setX(gp.getX() + tileSideLength);
                InputManager.horizontal = true;
            }
            if(key == KeyEvent.VK_LEFT)
            {
                gp.setX(gp.getX() - tileSideLength);
                InputManager.horizontal = true;
            }

        }

        else if(InputManager.vertical )
        {
            if(key == KeyEvent.VK_UP)
            {
                gp.setY(gp.getY() - tileSideLength);
                InputManager.vertical = true;
            }
            if(key == KeyEvent.VK_DOWN)
            {
                gp.setY(gp.getY() + tileSideLength);
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
            KeyHandler.enterPressed = true;

            manager.moveTile(tileSideLength, widthInTiles, heightInTiles + 2* tileSideLength);

            manager.switchState();
            player.setX(gp.getX());
            player.setY(gp.getY());

            manager.rightConveyerBelt(player, gp, tileSideLength);
            manager.movePawn(tileSideLength, widthInTiles * tileSideLength, heightInTiles * tileSideLength, player);
            manager.moveRook(tileSideLength, widthInTiles * tileSideLength, heightInTiles * tileSideLength, player);
            manager.checkRedState(player);

            InputManager.horizontal = false;
            InputManager.vertical = false;

            KeyHandler.enterPressed = false;
        }
    }

    public void drawLevel(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
        manager.draw(g);

        g.setColor(new Color(255, 255, 255, opacity));
        g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
