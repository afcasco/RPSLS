package app.game;

import app.model.Game;
import app.model.RockPaperScissors;
import app.model.RockPaperScissorsLizardSpock;

public class GameFactory {

    /**
     * Instantiates a game as rockpaperscissors or rockpaperscissorslizardspock depending on gameType passed
     **/
    public Game createGame(int gameType) {
        if (gameType == 1) {
            return new RockPaperScissors();
        } else if (gameType == 2) {
            return new RockPaperScissorsLizardSpock();
        } else {
            return null;
        }
    }
}