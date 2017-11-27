package Playground1.Program3;

import java.util.concurrent.ThreadLocalRandom;

public class Skill {

    static int generate() {

        boolean levelGenerated = false;
        final int levelSample = ThreadLocalRandom.current().nextInt(0, 99);
        int finalLevel = 0;

        while (!levelGenerated) {
            if (levelSample >= 0 && levelSample <= 9) finalLevel = 6;
            else if (levelSample >= 10 && levelSample <= 29) finalLevel = 5;
            else if (levelSample >= 30 && levelSample <= 59) finalLevel = 4;
            else finalLevel = ThreadLocalRandom.current().nextInt(1, 3 + 1);
            levelGenerated = true;
        }


        return finalLevel;
    }
}
