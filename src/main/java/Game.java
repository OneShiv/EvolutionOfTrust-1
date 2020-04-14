import com.sun.tools.javac.util.Pair;

public class Game {
    public Pair<Integer,Integer> play() {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        RuleEngine ruleEngine = new RuleEngine();

        return ruleEngine.getScore(playerOne.makeMove(),playerTwo.makeMove());
    }
}
