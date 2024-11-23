package model;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Path> paths; // A list of paths (palaces) on the board.
    private List<Card> cardStack; // The stack of cards for the game.

    public Board() {
        this.paths = new ArrayList<>();
        this.cardStack = new ArrayList<>();
    }

    /**
     * Adds a path to the board.
     * @param path the path to add to the board.
     */
    public void addPath(Path path) {
        paths.add(path);
    }

    /**
     * Adds a card to the stack of cards.
     * @param card the card to add to the stack.
     */
    public void addCardToStack(Card card) {
        cardStack.add(card);
    }

    /**
     * Retrieves the list of paths on the board.
     * @return the list of paths.
     */
    public List<Path> getPaths() {
        return new ArrayList<>(paths); // Return a copy to protect internal data.
    }

    /**
     * Retrieves the stack of cards.
     * @return the stack of cards.
     */
    public List<Card> getCardStack() {
        return new ArrayList<>(cardStack);
    }

    @Override
    public String toString() {
        return "Board{" +
                "paths=" + paths +
                ", cardStack=" + cardStack +
                '}';
    }
}
