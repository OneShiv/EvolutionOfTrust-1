import java.util.Scanner;

public class EoTGameApplication {
    public static void main(String[] args){
        Scanner inputScanner = new Scanner(System.in);
        Player consolePlayerOne = new Player(new ConsolePlayerBehavior(inputScanner));
        Player consolePlayerTwo = new Player(new ConsolePlayerBehavior(inputScanner));
        RuleEngine ruleEngine = new RuleEngine();
        Game game = new Game(consolePlayerOne, consolePlayerTwo, ruleEngine);
        ScoreBoard scores = game.playForNRounds(3);

        System.out.println("\nFinal Score at the end of the game:\n"+ scores);
    }
}
