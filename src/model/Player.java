package model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name; // The player's name.
    private int score; // The player's current score.
    private List<Card> hand; // The cards currently in the player's hand.
    private List<Finding> findings; // The archaeological finds collected by the player.
    private List<String> murals; // The murals collected by the player.
    private List<String> statuettes; // The statuettes collected by the player.
    private int pawns; // The number of pawns the player has (default: 4).

    public static final int MAX_PAWNS = 4;

    /**
     * Creates a new player with the specified name.
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.hand = new ArrayList<>();
        this.findings = new ArrayList<>();
        this.murals = new ArrayList<>();
        this.statuettes = new ArrayList<>();
        this.pawns = MAX_PAWNS;
    }

    // --- Methods ---

    /**
     * Adds a card to the player's hand.
     * @param card the card to add
     */
    public void addCard(Card card) {
        hand.add(card);
    }

    /**
     * Removes a card from the player's hand.
     * @param card the card to remove
     * @return true if the card was removed; false otherwise
     */
    public boolean playCard(Card card) {
        return hand.remove(card);
    }

    /**
     * Adds a finding to the player's collection.
     * @param finding the finding to add
     */
    public void collectFinding(Finding finding) {
        findings.add(finding);
    }

    /**
     * Adds points to the player's score.
     * @param points the points to add
     */
    public void addScore(int points) {
        this.score += points;
    }

    /**
     * Deducts a pawn from the player (e.g., when a pawn is used).
     * @return true if a pawn was deducted; false if none are left
     */
    public boolean usePawn() {
        if (pawns > 0) {
            pawns--;
            return true;
        }
        return false;
    }

    /**
     * Restores a pawn to the player.
     */
    public void restorePawn() {
        if (pawns < MAX_PAWNS) {
            pawns++;
        }
    }

    /**
     * Adds a mural to the player's collection.
     * @param mural the mural to add
     */
    public void addMural(String mural) {
        murals.add(mural);
    }

    /**
     * Adds a statuette to the player's collection.
     * @param statuette the statuette to add
     */
    public void addStatuette(String statuette) {
        statuettes.add(statuette);
    }

    // --- Getters ---
    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public List<Card> getHand() {
        return new ArrayList<>(hand); // Return a copy to protect internal data.
    }

    public List<Finding> getFindings() {
        return new ArrayList<>(findings);
    }

    public List<String> getMurals() {
        return new ArrayList<>(murals);
    }

    public List<String> getStatuettes() {
        return new ArrayList<>(statuettes);
    }

    public int getPawns() {
        return pawns;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", pawns=" + pawns +
                ", hand=" + hand +
                ", findings=" + findings +
                ", murals=" + murals +
                ", statuettes=" + statuettes +
                '}';
    }
}
