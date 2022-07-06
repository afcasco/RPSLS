package app.model;

public abstract class Game {

    /**
     * rounds: number of rounds
     * players: {"CPU","?"}
     * outcome: {int,int,int} 0: rounds won by cpu
     * 1: rounds won by player, 2: rounds ended in draw
     * gameType 1 for rock/paper/scissors 2 for rock paper scissors lizard spock
     **/
    private final static String[] BET_OPTIONS = {"ROCK", "PAPER", "SCISSORS", "SPOCK", "LIZARD"};
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

    public String getBet(int bet) {
        return BET_OPTIONS[bet];
    }

    @Override
    public String toString() {
        return outcome[0]
               + "\t"
               + outcome[1]
               + "\t"
               + playerName
               + "\t"
               + rounds;
    }


}