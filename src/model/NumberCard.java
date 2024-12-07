package model;

/**
 * Represents a card with a numerical value.
 */
public class NumberCard implements Card {
    private String type;
    private int value;

    /**
     * Creates a number card.
     * Preconditions: Value must be between 1 and 10.
     * Postconditions: Number card is created with the specified type and value.
     *
     * @param type  The type of the card (e.g., palace name).
     * @param value The value of the card.
     */
    public NumberCard(String type, int value) {
        this.type = type;
        this.value = value;
    }

    @Override
    public String getType() {
        return type;
    }

    /**
     * Gets the value of the card.
     * Preconditions: None.
     * Postconditions: Returns the value of the card.
     *
     * @return The card value.
     */
    public int getValue() {
        return value;
    }
}

