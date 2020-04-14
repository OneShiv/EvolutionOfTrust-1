import com.sun.tools.javac.util.Pair;

public class Game {

    private ScoreBoard scoreBoard;

    Game() {
        super();
        scoreBoard = new ScoreBoard(0,0);
    }

    public Pair<Integer,Integer> play() {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        RuleEngine ruleEngine = new RuleEngine();

        return ruleEngine.getScore(playerOne.makeMove(),playerTwo.makeMove());
    }

    public Pair<Integer, Integer> playForNRounds(int numberOfRounds) {
        for(int round = 0; round < numberOfRounds; round++) {
            Pair<Integer, Integer> score = play();
            scoreBoard.updateScores(score.fst, score.snd);
        }
        System.out.println(scoreBoard);
        return scoreBoard.getScores();
    }
}
