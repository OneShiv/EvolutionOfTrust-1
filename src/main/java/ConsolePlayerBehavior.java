import java.util.Scanner;

public class ConsolePlayerBehavior implements PlayerBehavior {
    private Scanner behaviorScanner;

    public ConsolePlayerBehavior(Scanner behaviorScanner) {
        this.behaviorScanner = behaviorScanner;
    }

    @Override
    public MoveType move() {
        String consoleInput = behaviorScanner.next();
        return MoveType.getMove(consoleInput);
    }
}
