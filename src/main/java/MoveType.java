public enum MoveType {
    COOPERATE("CO"),
    CHEAT("CH");

    private String consoleInput;

    MoveType(String consoleInput) {
        this.consoleInput = consoleInput;
    }

    public static MoveType getMove(String consoleInput) {
        for (MoveType moveType: MoveType.values()) {
            if(moveType.consoleInput.equals(consoleInput)) {
                return moveType;
            }
        }
        return null;
    }
}
