import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void shouldMakeMoveAlwaysReturnsCooperate() {
        MoveType moveType = new Player().makeMove();

        assertEquals(MoveType.COOPERATE, moveType);
    }
}
