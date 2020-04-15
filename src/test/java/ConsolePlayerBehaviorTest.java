import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class ConsolePlayerBehaviorTest {

    @Test
    public void shouldReturnCheatMoveForCHInput() {
        ConsolePlayerBehavior consoleBehavior = new ConsolePlayerBehavior(new Scanner("CH"));

        assertEquals(MoveType.CHEAT, consoleBehavior.move());
    }

    @Test
    public void shouldReturnCheatMoveForCOInput() {
        ConsolePlayerBehavior consoleBehavior = new ConsolePlayerBehavior(new Scanner("CO"));

        assertEquals(MoveType.COOPERATE, consoleBehavior.move());
    }

}