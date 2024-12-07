package controller;

import model.Board;
import model.Card;
import model.Deck;
import model.Player;

import java.util.List;

/**
 * Manages the flow of the Lost Cities game.
 */
public class Controller {
    private Player[] players;
    private Board board;
    private Deck deck;
    private int currentPlayerIndex;

    /**
     * Initializes the game with two players, a deck of cards, and a game board.
     * Preconditions: None.
     * Postconditions: Game is initialized with players, deck, and board.
     */
    public Controller() {
        players = new Player[2];
        players[0] = new Player("Player 1");
        players[1] = new Player("Player 2");
        board = new Board();
        deck = new Deck();
        currentPlayerIndex = 0; // Player 1 starts
    }

    /**
     * Starts the game by shuffling the deck and dealing cards to both players.
     * Preconditions: Deck must be initialized.
     * Postconditions: Cards are shuffled and dealt to players.
     */
    public void startGame() {
        deck.shuffle();
        dealCards();
    }

    /**
     * Deals 8 cards to each player.
     * Preconditions: Deck must be shuffled.
     * Postconditions: 8 cards are dealt to each player.
     */
    private void dealCards() {
        for (Player player : players) {
            for (int i = 0; i < 8; i++) {
                Card card = deck.drawCard();
                player.addCard(card);
            }
        }
    }

    /**
     * Executes a player's turn.
     * Preconditions: The player must be the current one.
     * Postconditions: The player's turn is executed and the next player is selected.
     */
    public void playerTurn() {
        Player currentPlayer = players[currentPlayerIndex];

        // Example of handling turn: drawing a card and making a move
        Card drawnCard = deck.drawCard();
        currentPlayer.addCard(drawnCard);

        // Further logic can be added for player actions (like making moves or discarding cards)

        // Switch to the next player
        currentPlayerIndex = (currentPlayerIndex + 1) % 2;
    }

    /**
     * Determines the winner of the game based on the current game state.
     * Preconditions: The game must have finished.
     * Postconditions: Returns the winner.
     *
     * @return The player who has won the game.
     */
    public Player determineWinner() {
        // Placeholder logic for determining winner (could be based on scores or other game rules)
        return players[0]; // Example: Player 1 wins for now
    }

    /**
     * Displays the game state (players, board, etc.) for debugging purposes.
     * Preconditions: None.
     * Postconditions: Outputs the current game state.
     */
    public void displayGameState() {
        System.out.println("Current player: " + players[currentPlayerIndex].getName());
        // Display board state, players' hands, etc.
    }
}

