package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents the deck of 100 cards in the Lost Cities game.
 */
public class Deck {
    private List<Card> cards;

    /**
     * Initializes the deck with 100 cards.
     * Preconditions: None.
     * Postconditions: The deck is initialized with 100 cards, including NumberCards, AriadneCards, and MinotaurCards.
     */
    public Deck() {
        cards = new ArrayList<>();
        initializeDeck();
    }

    /**
     * Initializes the deck with the 100 cards (20 NumberCards for each palace, 12 AriadneCards, 8 MinotaurCards).
     * Preconditions: None.
     * Postconditions: The deck is populated with all required cards.
     */
    private void initializeDeck() {
        // Add NumberCards (20 cards for each palace, values 1-10)
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 2; j++) {
                cards.add(new NumberCard(i)); // Number cards for each palace
            }
        }

        // Add AriadneCards (12 cards, 3 for each palace)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                cards.add(new AriadneCard());
            }
        }

        // Add MinotaurCards (8 cards, 2 for each palace)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 2; j++) {
                cards.add(new MinotaurCard());
            }
        }
    }

    /**
     * Shuffles the deck of cards.
     * Preconditions: None.
     * Postconditions: The cards in the deck are shuffled randomly.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Draws a card from the deck.
     * Preconditions: Deck must contain cards.
     * Postconditions: A card is drawn and removed from the deck.
     *
     * @return The drawn card.
     */
    public Card drawCard() {
        if (cards.isEmpty()) {
            return null; // Or throw exception if deck is empty
        }
        return cards.remove(cards.size() - 1);
    }

    /**
     * Gets the number of remaining cards in the deck.
     * Preconditions: None.
     * Postconditions: Returns the number of cards remaining in the deck.
     *
     * @return The number of remaining cards.
     */
    public int getRemainingCards() {
        return cards.size();
    }

    /**
     * Returns a string representation of the deck.
     * Preconditions: None.
     * Postconditions: Returns a string with information about the remaining cards.
     *
     * @return A string representation of the deck.
     */
    @Override
    public String toString() {
        return "Deck has " + cards.size() + " remaining cards.";
    }
}

