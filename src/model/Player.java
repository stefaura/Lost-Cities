package model;

import java.util.List;

/**
 * Represents a player in the game.
 */
public class Player {
    private String name;
    private List<Pawn> pawns;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
    }

    /**
     * Adds a card to the player's hand.
     * Preconditions: Card must not already be in hand.
     * Postconditions: Card is added to the player's hand.
     *
     * @param card The card to add.
     */
    public void addCard(Card card) {
        // Implementation pending
    }

    /**
     * Removes a card from the player's hand.
     * Preconditions: Card must exist in hand.
     * Postconditions: Card is removed from the player's hand.
     *
     * @param card The card to remove.
     */
    public void removeCard(Card card) {
        // Implementation pending
    }

    /**
     * Gets the player's current hand of cards.
     * Preconditions: None.
     * Postconditions: Returns the list of cards in the player's hand.
     *
     * @return The list of cards.
     */
    public List<Card> getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }
}

