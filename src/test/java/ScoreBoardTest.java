import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ScoreBoardTest {

    ScoreBoard scoreBoard = new ScoreBoard(0, 0);

    @Test
    public void shouldUpdatedPlayersScores() {
        scoreBoard.updateScores(2,2);
        Pair<Integer, Integer> finalScore = scoreBoard.getScores();

        assertEquals(new Pair<>(2,2), finalScore);
    }
}
