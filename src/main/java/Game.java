
public class Game {

    private ScoreBoard scoreBoard;

    Game() {
        super();
        scoreBoard = new ScoreBoard(0,0);
    }

    public ScoreBoard play() {
        Player playerOne = new Player();
        Player playerTwo = new Player();
        RuleEngine ruleEngine = new RuleEngine();

        return ruleEngine.getScore(playerOne.makeMove(),playerTwo.makeMove());
    }

    public ScoreBoard playForNRounds(int numberOfRounds) {
        for(int round = 0; round < numberOfRounds; round++) {
            ScoreBoard score = play();
            scoreBoard.updateScores(score);
        }
        System.out.println(scoreBoard);
        return scoreBoard;
    }
}
