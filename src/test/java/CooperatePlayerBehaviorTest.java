import org.junit.Test;

import static org.junit.Assert.*;

public class CooperatePlayerBehaviorTest {

    @Test
    public void shouldMakeMoveAlwaysReturnsCooperate() {
        CooperatePlayerBehavior cooperateBehavior = new CooperatePlayerBehavior();

        assertEquals(MoveType.COOPERATE, cooperateBehavior.move());
    }

}