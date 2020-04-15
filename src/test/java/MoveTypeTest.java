import org.junit.Test;

import static org.junit.Assert.*;

public class MoveTypeTest {
    @Test
    public void shouldReturnCooperateWhenInputIsCH() {
        MoveType moveType = MoveType.getMove("CH");

        assertEquals(MoveType.CHEAT, moveType);
    }
}