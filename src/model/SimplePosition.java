package model;

public class SimplePosition extends Position {
    public SimplePosition(String path, int score) {
        super(path, score);
    }

    @Override
    public String toString() {
        return super.toString() + ", type=Regular";
    }
}