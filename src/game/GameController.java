package app.game;

import app.model.Game;
import app.utils.IOUtils;

public class GameController {

    private static final int CPU = 0;
    private static final int PLAYER = 1;
    private static final int DRAW = 2;

    // creates and plays one game for given number of rounds
    public void playGame(Game game) {

        for (int i = 0; i < game.getRounds(); i++) {
            int[] bets = game.getIntBets();
            game.updateOutcome(roundWinner(bets));
        }
    }

    // creates a new game using a game factory
    public Game newGame() {
        GameFactory gameFactory = new GameFactory();
        Game game = gameFactory.createGame(IOUtils.getInteger("""
                Enter game type:
                1. ROCK PAPER SCISSORS
                2. ROCK PAPER SCISSORS LIZARD SPOCK"""));
        // modify later
        game.setRounds(IOUtils.getInteger("How many rounds would you like to play?"));
        game.setPlayerName(IOUtils.getString("Enter your name: "));
        game.setOutcome();
        return game;
    }

    public int roundWinner(int[] bets) {
        int winner = CPU;
        int resultat = Math.abs(bets[CPU] - bets[PLAYER]) % 2;
        if (resultat == 0) {
            if (bets[CPU] == bets[PLAYER]) {
                winner = DRAW;
            } else if (bets[CPU] >= bets[PLAYER]) {
                winner = PLAYER;
            }
        } else if (bets[CPU] <= bets[PLAYER]) {
            winner = PLAYER;
        }
        //System.out.println("CPU TOOK: " + Game.BET_OPTIONS[bets[CPU]]);
        System.out.println("CPU TOOK: " + Bets.values()[bets[CPU]]);
        System.out.println("PLAYER TOOK: " + Bets.values()[bets[PLAYER]]);
        //System.out.println("PLAYER TOOK: " + Game.BET_OPTIONS[bets[PLAYER]]);
        switch (winner) {
            case 0 -> System.out.println("WINNER IS CPU");
            case 1 -> System.out.println("WINNER IS PLAYER");
            case 2 -> System.out.println("IT'S A DRAW");
        }
        return winner;
    }

    public void showGameResults(Game game) {
        System.out.println(game);
    }

    private enum Bets {
        ROCK, PAPER, SCISSORS, SPOCK, LIZARD
    }
}