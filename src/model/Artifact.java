package model;

/**
 * Represents an artifact in the game.
 */
public class Artifact {
    private String type;
    private int value;

    /**
     * Creates an artifact with the specified type and value.
     * Preconditions: Type and value must be valid.
     * Postconditions: Artifact is created with the given attributes.
     *
     * @param type  The type of the artifact.
     * @param value The value of the artifact.
     */
    public Artifact(String type, int value) {
        this.type = type;
        this.value = value;
    }

    /**
     * Gets the type of the artifact.
     * Preconditions: None.
     * Postconditions: Returns the type of the artifact.
     *
     * @return The artifact type.
     */
    public String getType() {
        return type;
    }

    /**
     * Gets the value of the artifact.
     * Preconditions: None.
     * Postconditions: Returns the value of the artifact.
     *
     * @return The artifact value.
     */
    public int getValue() {
        return value;
    }
}

