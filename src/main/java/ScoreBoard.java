import com.sun.tools.javac.util.Pair;

public class ScoreBoard {

    private int playerOneScore;
    private int playerTwoScore;

    public ScoreBoard(int playerOneScore, int playerTwoScore) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
    }

    @Override
    public String toString() {
        return "ScoreBoard:\n" +
                "\t playerOneScore=" + playerOneScore +
                "\n\t playerTwoScore=" + playerTwoScore;
    }

    public void updateScores(int playerOneScore, int playerTwoScore) {
        this.playerOneScore += playerOneScore;
        this.playerTwoScore += playerTwoScore;

    }

    public Pair<Integer, Integer> getScores() {
        return new Pair<>(playerOneScore,playerTwoScore);
    }
}
