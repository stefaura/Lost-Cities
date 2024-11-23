package model;

public class RareFinding extends Finding {
    private int value; // The value or points associated with the rare finding.

    public RareFinding(String description, String image, int value) {
        super(description, image);
        this.value = value;
    }

    /**
     * Retrieves the value of the rare finding.
     * @return the value of the finding.
     */
    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return super.toString() + ", value=" + value;
    }
}
