package nextstep.ladder.factory;

import nextstep.ladder.generator.LineGenerator;
import nextstep.ladder.model.Line;
import nextstep.ladder.utils.RandomUtils;

import java.util.ArrayList;
import java.util.List;

public class LineFactory {
    private static final int ONE = 1;

    private LineFactory() {
    }

    public static Line of(int countOfPerson, LineGenerator generator) {
        return of(RandomUtils.nextBoolean(), countOfPerson, generator);
    }

    public static Line of(Boolean first, int countOfPerson, LineGenerator generator) {
        List<Boolean> points = new ArrayList<>();
        points.add(first);
        loopGenerate(points, countOfPerson, generator);
        return new Line(points);
    }

    private static void loopGenerate(List<Boolean> points, int countOfPerson, LineGenerator generator) {
        for (int i = ONE; i < countOfPerson - ONE; i++) {
            boolean prevPoint = points.get(i - ONE);
            points.add(generator.generate(prevPoint));
        }
    }
}
