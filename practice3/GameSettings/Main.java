package Practice_3.GameSettings;

public class Main {
    public static void main(String[] args) {
        GameSettings game1 = new GameSettings("Chess");
        GameSettings game2 = new GameSettings("Tennis");

        GameSettings.maxPlayers = 2;

        game1.addPlayer();
        game1.printGameStatus();
        game2.addPlayer();
        game2.printGameStatus();
        game1.addPlayer();
        game1.printGameStatus();
        game1.addPlayer();
        game2.printGameStatus();
    }
}
