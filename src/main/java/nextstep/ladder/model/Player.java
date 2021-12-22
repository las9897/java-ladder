package nextstep.ladder.model;

import nextstep.ladder.common.Name;

public class Player extends Name {

    private final Index index;

    public Player(String name) {
        super(name);
        this.index = new Index(0);
    }

    public Player(String name, int index) {
        super(name);
        this.index = new Index(index);
    }

    public boolean isAdjacent(Index other) {
        return this.index.isAdjacentRight(other) || this.index.isAdjacentLeft(other);
    }

    public void move(Direction direction) {
        direction.move(index);
    }

    public Index getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "Player{" + "index=" + index.index + " Name=" + super.getName() + '}';
    }
}
