import org.junit.Test;

import static org.junit.Assert.*;

public class CheatPlayerBehaviorTest {

    @Test
    public void shouldMakeMoveReturnsCheat() {
        CheatPlayerBehavior cheatBehavior = new CheatPlayerBehavior();

        assertEquals(MoveType.CHEAT, cheatBehavior.move());
    }

}