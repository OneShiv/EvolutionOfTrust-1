import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game = new Game();

    @Test
    public void shouldProcessWhenBothMovesAreCooperate() {
        ScoreBoard scores = game.play();

        assertEquals(new ScoreBoard(2,2), scores);
    }

    @Test
    public void shouldGetFinalScoreAfterFiveRounds() {
        ScoreBoard finalScore = game.playForNRounds(5);

        assertEquals(new ScoreBoard(10,10), finalScore);
    }
}
