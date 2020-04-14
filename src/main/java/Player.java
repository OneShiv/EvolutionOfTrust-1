public class Player {

    private PlayerBehavior playerBehavior;

    public Player(PlayerBehavior playerBehavior) {
        this.playerBehavior = playerBehavior;
    }

    public MoveType makeMove() {
        return this.playerBehavior.move();
    }
}
