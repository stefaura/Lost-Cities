package model;

public class Fresco extends Finding {
    private String era; // The historical era or style of the fresco.

    public Fresco(String description, String image, String era) {
        super(description, image);
        this.era = era;
    }

    /**
     * Retrieves the era or style of the fresco.
     * @return the era of the fresco.
     */
    public String getEra() {
        return era;
    }

    @Override
    public String toString() {
        return super.toString() + ", era='" + era + "'";
    }
}
