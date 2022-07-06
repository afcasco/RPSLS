package app.game;

import app.model.Game;
import app.model.RockPaperScissors;
import app.model.RockPaperScissorsLizardSpock;

public class GameFactory {

    /**
     * Needs payer name, #rounds and gameType
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