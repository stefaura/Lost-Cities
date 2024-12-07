package model;

/**
 * Represents a generic card in the game.
 */
public interface Card {
    /**
     * Gets the type of the card.
     * Preconditions: None.
     * Postconditions: Returns the type of the card.
     *
     * @return The card type.
     */
    String getType();

    /**
     * Gets the value of the card.
     * Preconditions: Card must have a value.
     * Postconditions: Returns the value of the card.
     *
     * @return The card value.
     */
    int getValue();
}

