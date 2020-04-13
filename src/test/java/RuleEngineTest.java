import org.junit.Test;
import org.junit.Assert.*;
import com.sun.tools.javac.util.Pair;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {

    private static final String COOPERATE = "cooperate";
    private static final String CHEAT = "cheat";
    private static final RuleEngine ruleEngine = new RuleEngine();

    Pair<Integer, Integer> scores;

    @Test
    public void shouldReturnScoreWhenBothCooperate() {
        scores = ruleEngine.getScore(COOPERATE, COOPERATE);
        assertEquals(new Pair<>(2,2), scores);
    }

    @Test
    public void shouldReturnScoreWhenFirstCooperateAndSecondCheat() {
        scores = ruleEngine.getScore(COOPERATE, CHEAT);
        assertEquals(new Pair<>(-1,3), scores);
    }

    @Test
    public void shouldReturnScoreWhenFirstCheatAndSecondCooperate() {
        scores = ruleEngine.getScore(CHEAT,COOPERATE);
        assertEquals(new Pair<>(3,-1), scores);
    }

    @Test
    public void shouldReturnScoreWhenBothCheat() {
        scores = ruleEngine.getScore(CHEAT, CHEAT);
        assertEquals(new Pair<>(0,0), scores);
    }
}
