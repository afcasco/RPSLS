package app.game;

import app.model.Game;
import app.utils.IOUtils;

public class Main {
    public static void main(String[] args) {

        int option;

        do {
            IOUtils.showMainMenu();
            option = IOUtils.getInteger();
            switch (option) {
                case 1 -> playGame();
                case 2 -> viewRules();
            }
        } while (option != 0);
    }

    public static void playGame() {
        GameController controller = new GameController();
        Game game = controller.newGame();
        controller.playGame(game);
        controller.showGameResults(game);
    }

    public static void viewRules() {
        System.out.println("PRINTING RULES....");
    }
}