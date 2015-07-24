package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlatueTest {

    @Test
    public void checkRoverIsInsidePlatue() throws Exception {
        Platue platue = new Platue(5, 5);
        Rover rover = new Rover(2, 3, 1);

        assertEquals(true, platue.isPresent(rover));

    }
}
