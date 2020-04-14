import com.sun.tools.javac.util.Pair;

public class RuleEngine {

    //TODO: extract these magic numbers.
    private static final int BOTH_COOPERATED = 2;
    private static final int BOTH_CHEATED = 0;
    private static final int OPPONENT_CHEATED = -1;
    private static final int OPPONENT_COOPERATED = 3;

    public Pair<Integer, Integer> getScore(MoveType firstMove, MoveType secondMove) {
        Pair<Integer, Integer> scores = new Pair<>(BOTH_CHEATED, BOTH_CHEATED);
        if(MoveType.COOPERATE.equals(firstMove) && MoveType.COOPERATE.equals(secondMove)) {
            scores = new Pair<>(BOTH_COOPERATED, BOTH_COOPERATED);
        } else if(MoveType.COOPERATE.equals(firstMove) && MoveType.CHEAT.equals(secondMove)) {
            scores = new Pair<>(OPPONENT_CHEATED, OPPONENT_COOPERATED);
        } else if(MoveType.CHEAT.equals(firstMove) && MoveType.COOPERATE.equals(secondMove)) {
            scores = new Pair<>(OPPONENT_COOPERATED, OPPONENT_CHEATED);
        }
        return scores;
    }
}
