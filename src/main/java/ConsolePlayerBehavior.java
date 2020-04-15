import java.util.Scanner;

public class ConsolePlayerBehavior implements PlayerBehavior {
    private Scanner behaviorScanner;

    public ConsolePlayerBehavior(Scanner behaviorScanner) {
        this.behaviorScanner = behaviorScanner;
    }

    @Override
    public MoveType move() {
        System.out.println("Enter Your Move (CH or CO): ");
        String consoleInput = behaviorScanner.nextLine();
        return MoveType.getMove(consoleInput);
    }
}
