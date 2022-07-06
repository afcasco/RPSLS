package app.model;

import app.utils.IOUtils;

import java.util.Random;

public class RockPaperScissors extends Game {

    private final static int BETS = 3;

    @Override
    public int[] getIntBets() {
        Random random = new Random();
        int cpuBet = random.nextInt(BETS);
        int playerBet = IOUtils.getInteger("Make a bet: " +
                                           "0.ROCK, 1.PAPER, 2.SCISSORS");
        return new int[]{cpuBet, playerBet};
    }
}
