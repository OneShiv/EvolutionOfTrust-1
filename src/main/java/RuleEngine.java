
public class RuleEngine {

    private static final int BOTH_COOPERATED = 2;
    private static final int BOTH_CHEATED = 0;
    private static final int OPPONENT_CHEATED = -1;
    private static final int OPPONENT_COOPERATED = 3;

    public ScoreBoard getScore(MoveType firstMove, MoveType secondMove) {
        ScoreBoard scores = new ScoreBoard(BOTH_CHEATED, BOTH_CHEATED);
        if(MoveType.COOPERATE.equals(firstMove) && MoveType.COOPERATE.equals(secondMove)) {
            scores = new ScoreBoard(BOTH_COOPERATED, BOTH_COOPERATED);
        } else if(MoveType.COOPERATE.equals(firstMove) && MoveType.CHEAT.equals(secondMove)) {
            scores = new ScoreBoard(OPPONENT_CHEATED, OPPONENT_COOPERATED);
        } else if(MoveType.CHEAT.equals(firstMove) && MoveType.COOPERATE.equals(secondMove)) {
            scores = new ScoreBoard(OPPONENT_COOPERATED, OPPONENT_CHEATED);
        }
        return scores;
    }
}
