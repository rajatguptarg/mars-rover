package com.rover;

public class Rover {
    private int y;
    private int x;
    private int facingTowards;
    private char[] compass = {'W', 'N', 'E', 'S'};

    public Rover(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.facingTowards = direction;
    }

    public char takeTurn(char direction) {
        if (direction == 'L') {
            if (facingTowards == 0) {
                return 3;
            }
            return compass[facingTowards - 1];
        }
        return compass[(facingTowards + 1) % 4];
    }
}
