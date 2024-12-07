package model;

/**
 * Represents a special card in the game.
 */
public abstract class SpecialCard implements Card {
    protected String type;

    @Override
    public String getType() {
        return type;
    }
}

