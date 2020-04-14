import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Game game = new Game();

    @Test
    public void shouldProcessWhenBothMovesAreCooperate() {
        Pair<Integer, Integer> scores = game.play();

        assertEquals(new Pair<>(2,2), scores);
    }

    @Test
    public void shouldGetFinalScoreAfterFiveRounds() {
        Pair<Integer, Integer> finalScore = game.playForNRounds(5);

        assertEquals(new Pair<>(10,10), finalScore);
    }
}
