package model;

/**
 * Represents a pawn in the game (Archaeologist or Theseus).
 */
public abstract class Pawn {
    protected String type;
    protected Position position;

    /**
     * Moves the pawn to a new position.
     * Preconditions: Position must be valid.
     * Postconditions: Pawn is moved to the new position.
     *
     * @param position The new position.
     */
    public abstract void move(Position position);
}

