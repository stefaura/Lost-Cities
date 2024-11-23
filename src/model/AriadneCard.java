package model;


/**
 * Represents Ariadne's Myth special card.
 */
public class AriadneCard extends SpecialCard {

    public AriadneCard(String palace) {
        super(palace, "Ariadne's Myth");
    }

    /**
     * Ariadne's Myth can always match any card in the same palace.
     */
    @Override
    public boolean matchCard(Card otherCard) {
        return this.palace.equals(otherCard.getPalace());
    }
}
