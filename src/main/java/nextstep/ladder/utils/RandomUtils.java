package nextstep.ladder.utils;

import java.util.Random;

public class RandomUtils {
    private static final Random RANDOM = new Random();

    private RandomUtils() {
    }

    public static boolean nextBoolean() {
        return RANDOM.nextBoolean();
    }
}
