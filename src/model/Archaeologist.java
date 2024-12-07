package model;

/**
 * Represents an Archaeologist pawn.
 */
public class Archaeologist extends Pawn {
    /**
     * Creates an Archaeologist pawn.
     * Preconditions: None.
     * Postconditions: An Archaeologist pawn is created at the initial position.
     */
    public Archaeologist() {
        this.type = "Archaeologist";
        // Initialize position
    }

    @Override
    public void move(Position position) {
        // Implement move logic for Archaeologist
    }
}

