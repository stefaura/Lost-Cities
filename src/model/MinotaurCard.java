package model;

/**
 * Represents a Minotaur card.
 */
public class MinotaurCard extends SpecialCard {
    /**
     * Creates a Minotaur card.
     * Preconditions: None.
     * Postconditions: A Minotaur card is created.
     */
    public MinotaurCard() {
        this.type = "Minotaur";
    }

    @Override
    public int getValue() {
        return 0;
    }
}

