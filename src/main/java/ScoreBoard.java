
import java.util.Objects;

public class ScoreBoard {

    private int playerOneScore;
    private int playerTwoScore;

    public ScoreBoard(int playerOneScore, int playerTwoScore) {
        this.playerOneScore = playerOneScore;
        this.playerTwoScore = playerTwoScore;
    }

    @Override
    public String toString() {
        return "Score: " +
                "\t player1 :" + playerOneScore +
                "\t player2 :" + playerTwoScore;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof ScoreBoard)) return false;
        ScoreBoard that = (ScoreBoard) other;
        return playerOneScore == that.playerOneScore &&
                playerTwoScore == that.playerTwoScore;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerOneScore, playerTwoScore);
    }

    public void updateScores(ScoreBoard scoreBoard) {
        this.playerOneScore += scoreBoard.playerOneScore;
        this.playerTwoScore += scoreBoard.playerTwoScore;

    }

    public ScoreBoard getScores() {
        return this;
    }
}
