
public class Game {

    private ScoreBoard scoreBoard;
    private Player playerOne;
    private Player playerTwo;

    Game(Player playerOne, Player playerTwo) {
        super();
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        scoreBoard = new ScoreBoard(0,0);
    }

    public ScoreBoard play() {
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
