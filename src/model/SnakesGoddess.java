package model;

public class SnakesGoddess extends Finding {
    private boolean isLegendary; // Whether this artifact is legendary.

    public SnakesGoddess(String description, String image, boolean isLegendary) {
        super(description, image);
        this.isLegendary = isLegendary;
    }

    /**
     * Checks if the Snake Goddess artifact is legendary.
     * @return true if the artifact is legendary; false otherwise.
     */
    public boolean isLegendary() {
        return isLegendary;
    }

    @Override
    public String toString() {
        return super.toString() + ", isLegendary=" + isLegendary;
    }
}
