package model;


/**
 * Represents a numbered card in the game.
 */
public class NumberCard extends Card {
    private int value; // The numeric value of the card (1-10).

    public NumberCard(String palace, int value) {
        super(palace, "Number " + value); // Assign a unique name based on value.
        this.value = value;
    }

    /**
     * Number cards can be played sequentially (e.g., 3 after 2).
     * @param otherCard the card to compare against
     * @return true if the card can be played over the other card
     */
    @Override
    public boolean matchCard(Card otherCard) {
        if (otherCard instanceof NumberCard) {
            NumberCard other = (NumberCard) otherCard;
            return this.palace.equals(other.palace) && this.value == other.value + 1;
        }
        return false;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString() + ", value=" + value;
    }
}
