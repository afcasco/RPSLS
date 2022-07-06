package app.game;

import app.model.Game;
import app.utils.IOUtils;

public class GameController {

    private static final int CPU = 0;
    private static final int PLAYER = 1;
    private static final int DRAW = 2;

    // creates and plays one game for given number of rounds
    public Game playGame(Game game) {

        for (int i = 0; i < game.getRounds(); i++) {
            int[] bets = game.getIntBets();
            game.updateOutcome(roundWinner(bets));
        }
        return game;
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
        int winner = 0;
        return winner;
    }


    public void showGameResults(Game game) {
        System.out.println(game);
    }
}