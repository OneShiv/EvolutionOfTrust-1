import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    private Game game;

    @Test
    public void shouldProcessWhenBothMovesAreCooperate() {
        Player cooperatePlayer = new Player(new CooperatePlayerBehavior());
        Player cheatPlayer = new Player(new CooperatePlayerBehavior());
        game = new Game(cooperatePlayer, cheatPlayer);
        ScoreBoard scores = game.play();

        assertEquals(new ScoreBoard(2,2), scores);
    }

    @Test
    public void shouldGetFinalScoreAfterFiveRoundsForBothCooperate() {
        Player cooperatePlayerOne = new Player(new CooperatePlayerBehavior());
        Player cooperatePlayerTwo = new Player(new CooperatePlayerBehavior());
        game = new Game(cooperatePlayerOne, cooperatePlayerTwo);
        ScoreBoard finalScore = game.playForNRounds(5);

        assertEquals(new ScoreBoard(10,10), finalScore);
    }

    @Test
    public void shouldGetFinalScoreAfterFiveRoundsForCooperateAndCheat() {
        Player cooperatePlayer = new Player(new CooperatePlayerBehavior());
        Player cheatPlayer = new Player(new CheatPlayerBehavior());
        game = new Game(cooperatePlayer, cheatPlayer);
        ScoreBoard finalScore = game.playForNRounds(5);

        assertEquals(new ScoreBoard(-5,15), finalScore);
    }
}
