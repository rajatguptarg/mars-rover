package com.rover;

public class Driver {
    private String drivingInstructions;

    public Driver(String drivingInstructions) {
        this.drivingInstructions = drivingInstructions;
    }

    public boolean drive(Rover rover) {
        for (int instruction =  0; instruction < drivingInstructions.length(); instruction++) {
            char currentInstruction = drivingInstructions.charAt(instruction);

            if ((currentInstruction == 'L') || (currentInstruction == 'R')) {
                rover.takeTurn(currentInstruction);
            }
            else if (currentInstruction == 'M') {
                rover.move();
            }
        }
        return true;
    }
}
