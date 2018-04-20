package Game.levels;

import Game.GameRunner;
import Game.tiles.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by jamesmaron on 4/12/18.
 */
public class LevelBuilder {

    public static Level buildLevel(File file) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(file));
        String l;
        int x = 0;
        int y = 0;
        boolean foundSize = false;
        while ((l = br.readLine()) != null) {
            if (l == "X" || foundSize) {
                foundSize = true;
            } else {
                y++;
            }
            x = l.length();

        }
        int width = GameRunner.WINDOW_WIDTH/x;
        int height = GameRunner.WINDOW_WIDTH/y;

        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        int row = 0;
        ArrayList<Tile> geometry = new ArrayList<>();
        boolean atObjects = false;
        while ((line = reader.readLine()) != null) {
            if (line == "X") {
                atObjects = true;
            }


            if (!atObjects) {
                for (int i = 0; i < line.length(); i++) {
                    char current = line.toCharArray()[i];
                    geometry.add(convertToTile(current, i, row, width, height));
                }

                row++;
            } else {

            }
        }
        throw (new Exception());
    }

    public static Tile convertToTile(char c, int colum, int row, int w, int h) {
        switch (c) {
            case ('-'):
                return new SafeTile(row, colum, w, h);
            case ('S'):
                return new SolidTile(row, colum, w, h);;
            case ('E'):
                return new SafeTile(row, colum, w, h);;
                break;
            case ('N'):
                return new NextFloorTile(row, colum, w, h);;
            case ('R'):
                return new RedTile(row, colum, w, h);
            case ('1'):

                break;
            case ('2'):

                break;
            case ('3'):

                break;
            case ('4'):

                break;
            case ('5'):

                break;
        }
        return new SafeTile(colum, row, 0, 0 );
    }
}

