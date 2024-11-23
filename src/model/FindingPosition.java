package model;

public class FindingPosition extends Position {
    private Finding finding;    // The find located at this position.
    private boolean isAvailable; // Whether the find is still available.

    public FindingPosition(String path, int score, Finding finding) {
        super(path, score);
        this.finding = finding;
        this.isAvailable = true; // Finds are available initially.
    }

    /**
     * Retrieves the archaeological find at this position.
     * @return the finding, or null if not available.
     */
    public Finding getFinding() {
        return isAvailable ? finding : null;
    }

    /**
     * Marks the find as taken and makes it unavailable.
     */
    public void takeFinding() {
        if (isAvailable) {
            isAvailable = false;
        }
    }

    /**
     * Checks if the find is still available.
     * @return true if available, false otherwise.
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", finding=" + (isAvailable ? finding : "No longer available");
    }
}
