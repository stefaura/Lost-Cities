package model;

/**
 * Represents an Ariadne's thread card.
 */
public class AriadneCard extends SpecialCard {
    /**
     * Creates an Ariadne card.
     * Preconditions: None.
     * Postconditions: An Ariadne card is created.
     */
    public AriadneCard() {
        this.type = "Ariadne";
    }

    @Override
    public int getValue() {
        return 0;
    }
}

