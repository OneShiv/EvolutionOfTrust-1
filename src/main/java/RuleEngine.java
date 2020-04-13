import com.sun.tools.javac.util.Pair;

public class RuleEngine {

    private static final String COOPERATE = "cooperate";
    private static final String CHEAT = "cheat";

    public Pair<Integer, Integer> getScore(String firstMove, String secondMove) {
        int playerOneScore = 0, playerTwoScore = 0;
        if(COOPERATE.equals(firstMove) && COOPERATE.equals(secondMove)) {
            playerOneScore = 2;
            playerTwoScore = 2;
        } else if(COOPERATE.equals(firstMove) && CHEAT.equals(secondMove)) {
            playerOneScore = -1;
            playerTwoScore = 3;
        } else if(CHEAT.equals(firstMove) && COOPERATE.equals(secondMove)) {
            playerOneScore = 3;
            playerTwoScore = -1;
        }
        return new Pair<>(playerOneScore, playerTwoScore);
    }
}
