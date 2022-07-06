package app.model;

import app.model.Game;
import app.utils.IOUtils;

import java.util.Random;

public class RockPaperScissors extends Game {

    private final static int BETS = 4;

    @Override
    public int[] getIntBets() {
        Random random = new Random();
        int cpuBet = random.nextInt(BETS);
        int playerBet = IOUtils.getInteger("Make a bet: "+
                                           "1.ROCK, 2.PAPER, 3.SCISSORS");
        return new int[]{cpuBet, playerBet};
    }
}
