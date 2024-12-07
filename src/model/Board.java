package model;

/**
 * Represents the game board, consisting of 4 paths.
 */
public class Board {
    private Path[] paths;

    /**
     * Initializes the game board with 4 paths of 9 steps each.
     * Preconditions: None.
     * Postconditions: Board is initialized with 4 paths.
     */
    public Board() {
        paths = new Path[4];
        for (int i = 0; i < paths.length; i++) {
            paths[i] = new Path(9); // 9 steps per path
        }
    }

    /**
     * Places an artifact on the board.
     * Preconditions: Position must be valid and unoccupied.
     * Postconditions: Artifact is placed at the given position.
     *
     * @param position The position to place the artifact.
     * @param artifact The artifact to place.
     */
    public void placeArtifact(Position position, Artifact artifact) {
        // Implementation pending
    }
}

