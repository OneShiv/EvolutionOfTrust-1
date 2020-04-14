import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreBoardTest {

    ScoreBoard scoreBoard = new ScoreBoard(0, 0);

    @Test
    public void shouldUpdatedPlayersScores() {
        scoreBoard.updateScores(new ScoreBoard(2,2));
        ScoreBoard finalScore = scoreBoard.getScores();

        assertEquals(new ScoreBoard(2,2), finalScore);
    }
}
