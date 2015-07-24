package com.rover;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class DriverTest {

    @Test
    public void driverShouldBeAbleToMoveRover() throws Exception {
        Driver driver = new Driver("RM");
        Rover rover = new Rover(0, 0, 1);

        assertEquals(true, driver.drive(rover));
    }
}
