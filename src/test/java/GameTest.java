import org.junit.Test;
import org.mockito.Mockito;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;
    private RuleEngine ruleEngine = new RuleEngine();

    @Test
    public void shouldProcessWhenBothMovesAreCooperate() {
        Player cooperatePlayer = new Player(new CooperatePlayerBehavior());
        Player cheatPlayer = new Player(new CooperatePlayerBehavior());

        game = new Game(cooperatePlayer, cheatPlayer, ruleEngine);
        ScoreBoard scores = game.play();

        assertEquals(new ScoreBoard(2,2), scores);
    }

    @Test
    public void shouldGetFinalScoreAfterFiveRoundsForBothCooperate() {
        Player cooperatePlayerOne = new Player(new CooperatePlayerBehavior());
        Player cooperatePlayerTwo = new Player(new CooperatePlayerBehavior());

        game = new Game(cooperatePlayerOne, cooperatePlayerTwo, ruleEngine);
        ScoreBoard finalScore = game.playForNRounds(5);

        assertEquals(new ScoreBoard(10,10), finalScore);
    }

    @Test
    public void shouldGetFinalScoreAfterFiveRoundsForCooperateAndCheat() {
        Player cooperatePlayer = new Player(new CooperatePlayerBehavior());
        Player cheatPlayer = new Player(new CheatPlayerBehavior());

        game = new Game(cooperatePlayer, cheatPlayer, ruleEngine);
        ScoreBoard finalScore = game.playForNRounds(5);

        assertEquals(new ScoreBoard(-5,15), finalScore);
    }

    @Test
    public void shouldReturnScoreCheatPlayerAndConsolePlayer() {
        Player cheatPlayer = Mockito.mock(Player.class);
        Player consolePlayer = Mockito.mock(Player.class);
        ruleEngine = Mockito.mock(RuleEngine.class);

        Mockito.when(cheatPlayer.makeMove()).thenReturn(MoveType.CHEAT);
        Mockito.when(consolePlayer.makeMove())
                .thenReturn(MoveType.CHEAT)
                .thenReturn(MoveType.COOPERATE);
        Mockito.when(ruleEngine.getScore(MoveType.CHEAT, MoveType.CHEAT))
                .thenReturn(new ScoreBoard(0,0));
        Mockito.when(ruleEngine.getScore(MoveType.CHEAT, MoveType.COOPERATE))
                .thenReturn(new ScoreBoard(3,-1));

        game = new Game(cheatPlayer, consolePlayer, ruleEngine);
        ScoreBoard finalScore = game.playForNRounds(2);

        assertEquals(new ScoreBoard(3,-1), finalScore);
    }

    @Test
    public void shouldReturnFinalScoreCooperatePlayerAndConsolePlayer() {
        Player cooperatePlayer = new Player(new CooperatePlayerBehavior());
        Player consolePlayer = new Player(new ConsolePlayerBehavior(new Scanner("CH\nCO")));

        game = new Game(cooperatePlayer, consolePlayer, ruleEngine);
        ScoreBoard finalScore = game.playForNRounds(2);

        assertEquals(new ScoreBoard(1,5), finalScore);
    }
}
