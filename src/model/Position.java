package model;

/**
 * Represents a specific position on the game board.
 */
public class Position {
    private int row;
    private int column;
    private Artifact artifact;

    /**
     * Initializes a position with specified coordinates.
     * Preconditions: Coordinates must be within board limits.
     * Postconditions: Position is created with the given coordinates.
     *
     * @param row The row index of the position.
     * @param column The column index of the position.
     */
    public Position(int row, int column) {
        this.row = row;
        this.column = column;
        this.artifact = null; // Initially no artifact
    }

    /**
     * Sets an artifact at this position.
     * Preconditions: Position must be unoccupied.
     * Postconditions: Artifact is placed at the position.
     *
     * @param artifact The artifact to place.
     */
    public void setArtifact(Artifact artifact) {
        this.artifact = artifact;
    }

    /**
     * Gets the artifact at this position.
     * Preconditions: None.
     * Postconditions: Returns the artifact at the position, or null if unoccupied.
     *
     * @return The artifact at the position.
     */
    public Artifact getArtifact() {
        return artifact;
    }
}

