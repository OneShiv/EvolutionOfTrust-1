import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void shouldMakeMoveAlwaysReturnsCooperate() {
        CooperatePlayerBehavior cooperateBehavior = new CooperatePlayerBehavior();
        MoveType moveType = new Player(cooperateBehavior).makeMove();

        assertEquals(MoveType.COOPERATE, moveType);
    }

    @Test
    public void shouldMakeMoveReturnsCheat() {
        CheatPlayerBehavior cheatBehavior = new CheatPlayerBehavior();
        MoveType moveType = new Player(cheatBehavior).makeMove();

        assertEquals(MoveType.CHEAT, moveType);
    }
}
