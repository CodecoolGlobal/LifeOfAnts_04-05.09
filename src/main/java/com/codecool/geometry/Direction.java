package com.codecool.geometry;

import com.codecool.RandomHelper;

public enum Direction {
    NORTH(0, -1),
    EAST(1, 0),
    SOUTH(0, 1),
    WEST(-1, 0);

    public final int differenceX;
    public final int differenceY;

    Direction(int differenceX, int differenceY) {
        this.differenceX = differenceX;
        this.differenceY = differenceY;
    }

    public static Direction getRandomDirection() {
        Direction[] values = values();
        int i = RandomHelper.nextInt(values.length);
        return values[i];
    }

    public Direction turnLeft() {
        Direction[] values = values();
//        int i = this.ordinal() + 3 % values.length;
        int i = (this.ordinal() - 1 + values.length) % values.length;
        return values[i];
    }
}
