import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RuleEngineTest {

    private static final RuleEngine ruleEngine = new RuleEngine();

    ScoreBoard scores;

    @Test
    public void shouldReturnScoreWhenBothCooperate() {
        scores = ruleEngine.getScore(MoveType.COOPERATE, MoveType.COOPERATE);
        assertEquals(new ScoreBoard(2,2), scores);
    }

    @Test
    public void shouldReturnScoreWhenFirstCooperateAndSecondCheat() {
        scores = ruleEngine.getScore(MoveType.COOPERATE, MoveType.CHEAT);
        assertEquals(new ScoreBoard(-1,3), scores);
    }

    @Test
    public void shouldReturnScoreWhenFirstCheatAndSecondCooperate() {
        scores = ruleEngine.getScore(MoveType.CHEAT,MoveType.COOPERATE);
        assertEquals(new ScoreBoard(3,-1), scores);
    }

    @Test
    public void shouldReturnScoreWhenBothCheat() {
        scores = ruleEngine.getScore(MoveType.CHEAT, MoveType.CHEAT);
        assertEquals(new ScoreBoard(0,0), scores);
    }
}
