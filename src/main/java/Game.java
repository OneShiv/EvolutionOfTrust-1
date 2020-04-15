
public class Game {

    private ScoreBoard scoreBoard;
    private Player playerOne;
    private Player playerTwo;
    private RuleEngine ruleEngine;

    Game(Player playerOne, Player playerTwo, RuleEngine ruleEngine) {
        super();
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        scoreBoard = new ScoreBoard(0,0);
        this.ruleEngine = ruleEngine;
    }

    public ScoreBoard play() {
        return ruleEngine.getScore(playerOne.makeMove(),playerTwo.makeMove());
    }

    public ScoreBoard playForNRounds(int numberOfRounds) {
        for(int round = 0; round < numberOfRounds; round++) {
            ScoreBoard score = play();
            scoreBoard.updateScores(score);
            System.out.println(scoreBoard);
        }
        return scoreBoard;
    }
}
