package model;

public class MinotaurCard extends SpecialCard {

    public MinotaurCard(String palace) {
        super(palace, "Minotaur");
    }

    /**
     * The Minotaur card can block any card except another Minotaur.
     */
    @Override
    public boolean matchCard(Card otherCard) {
        return !(otherCard instanceof MinotaurCard);
    }
}
