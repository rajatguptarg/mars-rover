package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RoverTest {

    @Test
    public void roverShouldBeAbleToTakeTurns() throws Exception {
        Rover rover = new Rover(0, 0, 1);

        assertEquals('W', rover.takeTurn('L'));
    }
}
