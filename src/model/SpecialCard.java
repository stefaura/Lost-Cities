package model;

public abstract class SpecialCard extends Card {

    public SpecialCard(String palace, String name) {
        super(palace, name);
    }

    /**
     * Special cards may have unique matching rules.
     */
    @Override
    public abstract boolean matchCard(Card otherCard);
}