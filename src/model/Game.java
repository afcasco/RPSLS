package app.model;

public abstract class Game {

    /**
     * rounds: number of rounds
     * players: {"CPU","?"}
     * outcome: {int,int,int} 0: rounds won by cpu
     * 1: rounds won by player, 2: rounds ended in draw
     **/
    private int rounds;
    private int[] outcome;
    private String playerName;

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void updateOutcome(int winner) {
        outcome[winner]++;
    }

    public void setOutcome() {
        outcome = new int[3];
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public abstract int[] getIntBets();

    @Override
    public String toString() {
        return outcome[0] + "\t" + outcome[1] + "\t" + outcome[2] + "\t" + playerName + "\t" + rounds;
    }


}