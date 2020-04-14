import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void makeMoveShouldAlwaysReturnCooperate() {
        String moveType = new Player().makeMove();

        assertEquals("cooperate", moveType);
    }
}
