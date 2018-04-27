package com.github.zahir.level2.levels;

import com.github.zahir.level2.*;
import com.github.zahir.level2.tiles.NextFloorTile;
import com.github.zahir.level2.tiles.RedTile;
import com.github.zahir.level2.tiles.SafeTile;
import com.github.zahir.level2.tiles.SolidTile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 * Created by jamesmaron on 4/12/18.
 */
public class LevelBuilder {

    public static Level buildLevel(File file) throws Exception {
        int x;
        int y;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String l;
            x = 0;
            y = 0;
            boolean foundSize = false;
            while ((l = br.readLine()) != null) {
                if (l == "X" || foundSize) {
                    foundSize = true;
                } else {
                    y++;
                }
                x = l.length();

            }
        }
        int width = GameRunner.WINDOW_WIDTH / x;
        int height = GameRunner.WINDOW_WIDTH / y;
        ArrayList<GameObject> geometry = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int row = 0;
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
        }
        return new Level() {

            private ObjectManager manager;

            @Override
            public ObjectManager getManager() {
                if (manager == null) {
                    manager = new ObjectManager();
                    geometry.forEach(manager::addObject);
                }
                return manager;
            }

        };
    }

    public static GameObject convertToTile(char c, int colum, int row, int w, int h) {
        switch (c) {
            case ('-'):
                return new SafeTile(row, colum, w, h);
            case ('S'):
                return new SolidTile(row, colum, w, h);
            case ('E'):
                return new SafeTile(row, colum, w, h);
            case ('N'):
                return new NextFloorTile(row, colum, w, h);
            case ('R'):
                return new RedTile(row, colum, w, h);
            case ('1'):
                return new DECR(row, colum, w, h, 0);
            case ('2'):
                return new DECL(row, colum, w, h, 0);
            case ('3'):

                break;
            case ('4'):

                break;
            case ('5'):

                break;
            default:
                return new SafeTile(colum, row, 0, 0);
        }
        return new SafeTile(colum, row, 0, 0);
    }
}

