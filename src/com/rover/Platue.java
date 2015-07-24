package com.rover;

public class Platue {
    private int boundaryX;
    private int boundaryY;

    public Platue(int boundaryX, int boundaryY) {
        this.boundaryX = boundaryX;
        this.boundaryY = boundaryY;
    }

    public boolean isPresent(Rover rover) {
        if (((int) rover.position().charAt(0) > boundaryX) || ((int) rover.position().charAt(2) > boundaryY)) {
            return false;
        }
        return true;
    }
}
