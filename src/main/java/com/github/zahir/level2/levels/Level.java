package com.github.zahir.level2.levels;

import com.github.zahir.level2.*;
import com.github.zahir.level2.tiles.Tile;

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
    protected static int opacity = 0;
    int tileSideLength;
    int widthInTiles;
    int heightInTiles;
    Tile finalTile;
    Timer timer;
    Player player = new Player(tileSideLength * 2, tileSideLength * 2, tileSideLength, tileSideLength);
    GridPlayer gp = new GridPlayer(tileSideLength * 2, tileSideLength * 2, tileSideLength, tileSideLength);

    public Level() {
        timer = new Timer(1000 / 60, this);
    }

    public void startGame() {
        timer.start();
    }

    public void boundChecker() {
        if (gp.getX() < 0) {
            gp.setX(0);
        }
        if (gp.getX() > tileSideLength * widthInTiles - gp.getWidth()) {
            gp.setX(tileSideLength * widthInTiles - gp.getWidth());
        }
        if (gp.getY() < 0) {
            gp.setY(0);
        }
        if (gp.getY() > tileSideLength * heightInTiles - gp.getHeight()) {
            gp.setY(tileSideLength * heightInTiles - gp.getHeight());
        }

        if (player.getX() < 0) {
            player.setX(0);
        }
        if (player.getX() > tileSideLength * widthInTiles - player.getWidth()) {
            player.setX(tileSideLength * widthInTiles - player.getWidth());
        }
        if (player.getY() < 0) {
            player.setY(0);
        }
        if (player.getY() > tileSideLength * heightInTiles - player.getHeight()) {
            player.setY(tileSideLength * heightInTiles - player.getHeight());
        }
    }

    public abstract ObjectManager getManager();

    public void winChecker() {
        if (player.getX() == finalTile.getX() && player.getY() == finalTile.getY()) {
            if (opacity < 245) {
                if (System.currentTimeMillis() % 2 == 0) {
                    opacity += 10;
                }
            }

            if (opacity >= 245) {
                Sound.menuTrack.stop();

                getManager().reset();
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

    public void updateLevel() {
        getManager().update();
        getManager().checkCollision(player, tileSideLength);
        winChecker();
        boundChecker();

        if (player.isAlive() == false) {
            gp.setX(tileSideLength * 2);
            gp.setY(tileSideLength * 2);

            player.setX(tileSideLength * 2);
            player.setY(tileSideLength * 2);

            getManager().redTileReset();

            player.setAlive(true);
        }
    }


    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (InputManager.horizontal == false && InputManager.vertical == false) {
            if (key == KeyEvent.VK_RIGHT) {
                gp.setX(gp.getX() + tileSideLength);
                InputManager.horizontal = true;
            }
            if (key == KeyEvent.VK_LEFT) {
                gp.setX(gp.getX() - tileSideLength);
                InputManager.horizontal = true;
            }
            if (key == KeyEvent.VK_UP) {
                gp.setY(gp.getY() - tileSideLength);
                InputManager.vertical = true;
            }
            if (key == KeyEvent.VK_DOWN) {
                gp.setY(gp.getY() + tileSideLength);
                InputManager.vertical = true;
            }

        } else if (InputManager.horizontal) {
            if (key == KeyEvent.VK_RIGHT) {
                gp.setX(gp.getX() + tileSideLength);
                InputManager.horizontal = true;
            }
            if (key == KeyEvent.VK_LEFT) {
                gp.setX(gp.getX() - tileSideLength);
                InputManager.horizontal = true;
            }

        } else if (InputManager.vertical) {
            if (key == KeyEvent.VK_UP) {
                gp.setY(gp.getY() - tileSideLength);
                InputManager.vertical = true;
            }
            if (key == KeyEvent.VK_DOWN) {
                gp.setY(gp.getY() + tileSideLength);
                InputManager.vertical = true;
            }


        }
        if (gp.getX() == player.getX() && gp.getY() == player.getY()) {
            InputManager.horizontal = false;
            InputManager.vertical = false;
        }
        if (key == KeyEvent.VK_ENTER) {
            getManager().cb = false;
            KeyHandler.enterPressed = true;

            getManager().moveTile(tileSideLength, widthInTiles, heightInTiles + 2 * tileSideLength);

            getManager().switchState();
            player.setX(gp.getX());
            player.setY(gp.getY());

            getManager().rightConveyerBelt(player, gp, tileSideLength);
            getManager().movePawn(tileSideLength, widthInTiles * tileSideLength, heightInTiles * tileSideLength, player);
            getManager().moveRook(tileSideLength, widthInTiles * tileSideLength, heightInTiles * tileSideLength, player);
            getManager().checkRedState(player);

            InputManager.horizontal = false;
            InputManager.vertical = false;

            KeyHandler.enterPressed = false;
        }
    }

    public void drawLevel(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
        getManager().draw(g);

        g.setColor(new Color(255, 255, 255, opacity));
        g.fillRect(0, 0, GameRunner.WINDOW_WIDTH, GameRunner.WINDOW_HEIGHT);
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
