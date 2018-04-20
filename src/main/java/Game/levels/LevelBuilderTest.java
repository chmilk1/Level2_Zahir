package Game.levels;

import org.junit.Test;

import java.io.File;

/**
 * Created by jamesmaron on 4/12/18.
 */
class LevelBuilderTest {
    @Test
    void buildLevel() {
        try {
            LevelBuilder.buildLevel(new File("/level2"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}