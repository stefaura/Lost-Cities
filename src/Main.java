import model.*;

public class Main {
    public static void main(String[] args) {
        // Create the board
        Board board = new Board();

        // Create paths (palaces)
        Path minoanPath = new Path("Minoan Palace");
        Path cretanPath = new Path("Cretan Palace");

        // Create positions (both regular and archaeological find positions)
        Position regularPos1 = new SimplePosition("Minoan Palace", 5);
        Position regularPos2 = new SimplePosition("Minoan Palace", 3);
        Finding fresco = new Fresco("Ancient Fresco", "/images/fresco.png", "Bronze Age");
        FindingPosition archaeologicalPos1 = new FindingPosition("Cretan Palace", 10, fresco);

        // Add positions to the paths
        minoanPath.addPosition(regularPos1);
        minoanPath.addPosition(regularPos2);
        cretanPath.addPosition(archaeologicalPos1);

        // Add paths to the board
        board.addPath(minoanPath);
        board.addPath(cretanPath);

        // Add cards to the board's stack
        Card card1 = new NumberCard("Red", 5);
        board.addCardToStack(card1);

        // Print the board details
        System.out.println(board);

        // Test taking an archaeological finding
        System.out.println("Is finding available? " + archaeologicalPos1.isAvailable());
        archaeologicalPos1.takeFinding();
        System.out.println("Is finding available after taking? " + archaeologicalPos1.isAvailable());
    }
}