package model;

/**
 * Represents a path on the game board (a row of 9 positions).
 */
public class Path {
    private Position[] steps;

    /**
     * Initializes a path with the specified number of steps (9).
     * Preconditions: Number of steps must be 9.
     * Postconditions: Path is initialized with 9 steps.
     */
    public Path(int numSteps) {
        steps = new Position[numSteps];
        for (int i = 0; i < numSteps; i++) {
            steps[i] = new Position(i, 0); // Set position for each step
        }
    }

    /**
     * Gets the position at a specific step.
     * Preconditions: Step index must be between 0 and 8.
     * Postconditions: Returns the position at the specified step.
     *
     * @param stepIndex The index of the step.
     * @return The position at the step.
     */
    public Position getPosition(int stepIndex) {
        return steps[stepIndex];
    }
}


