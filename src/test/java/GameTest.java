import com.sun.tools.javac.util.Pair;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {
    @Test
    public void shouldProcessWhenBothMovesAreCooperate() {
        Pair scores = new Game().play();

        assertEquals(new Pair<>(2,2), scores);
    }
}
