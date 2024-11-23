package model;

/**
 * Abstract class representing a card in the game.
 */
public abstract class Card {
    protected String palace; // The palace the card belongs to (e.g., "Red", "Blue").
    protected String name; // A unique identifier for the card (e.g., "Minotaur").

    public Card(String palace, String name) {
        this.palace = palace;
        this.name = name;
    }

    /**
     * Checks if the card can be played over another card.
     * @param otherCard the card to compare against
     * @return true if the card can be played; false otherwise
     */
    public abstract boolean matchCard(Card otherCard);

    // Getters
    public String getPalace() {
        return palace;
    }

    public String getName() {
        return name;
    }

    // Representation
    @Override
    public String toString() {
        return "Card{name='" + name + "', palace='" + palace + "'}";
    }
}
