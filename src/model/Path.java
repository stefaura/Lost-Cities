package model;

import java.util.ArrayList;
import java.util.List;

public class Path {
    private String palace; // The name of the palace this path belongs to.
    private List<Position> positions; // The 9 spaces (positions) of the path.

    public Path(String palace) {
        this.palace = palace;
        this.positions = new ArrayList<>();
    }

    /**
     * Adds a position to the path.
     * @param position the position to add to the path.
     */
    public void addPosition(Position position) {
        if (positions.size() < 9) {
            positions.add(position);
        } else {
            System.out.println("Path already has 9 positions!");
        }
    }

    /**
     * Retrieves the list of positions on this path.
     * @return the list of positions.
     */
    public List<Position> getPositions() {
        return new ArrayList<>(positions); // Return a copy to protect internal data.
    }

    /**
     * Retrieves the name of the palace.
     * @return the palace name.
     */
    public String getPalace() {
        return palace;
    }

    @Override
    public String toString() {
        return "Path{" +
                "palace='" + palace + '\'' +
                ", positions=" + positions +
                '}';
    }
}
