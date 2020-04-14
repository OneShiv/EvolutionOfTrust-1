import org.junit.Test;
import com.sun.tools.javac.util.Pair;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {

    private static final RuleEngine ruleEngine = new RuleEngine();

    Pair<Integer, Integer> scores;

    @Test
    public void shouldReturnScoreWhenBothCooperate() {
        scores = ruleEngine.getScore(MoveType.COOPERATE, MoveType.COOPERATE);
        assertEquals(new Pair<>(2,2), scores);
    }

    @Test
    public void shouldReturnScoreWhenFirstCooperateAndSecondCheat() {
        scores = ruleEngine.getScore(MoveType.COOPERATE, MoveType.CHEAT);
        assertEquals(new Pair<>(-1,3), scores);
    }

    @Test
    public void shouldReturnScoreWhenFirstCheatAndSecondCooperate() {
        scores = ruleEngine.getScore(MoveType.CHEAT,MoveType.COOPERATE);
        assertEquals(new Pair<>(3,-1), scores);
    }

    @Test
    public void shouldReturnScoreWhenBothCheat() {
        scores = ruleEngine.getScore(MoveType.CHEAT, MoveType.CHEAT);
        assertEquals(new Pair<>(0,0), scores);
    }
}
