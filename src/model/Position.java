package model;

public abstract class Position {
    private String path; // The path (palace) this position belongs to.
    private int score;   // The score value of the position.

    public Position(String path, int score) {
        this.path = path;
        this.score = score;
    }

    /**
     * Retrieves the path of this position.
     * @return the path this position belongs to.
     */
    public String getPath() {
        return path;
    }

    /**
     * Retrieves the score of this position.
     * @return the score value of the position.
     */
    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Position{" +
                "path='" + path + '\'' +
                ", score=" + score +
                '}';
    }
}
