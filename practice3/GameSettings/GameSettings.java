package Practice_3.GameSettings;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPLayers;

    public GameSettings(String someGameName) {
        this.gameName = someGameName;
        this.currentPLayers = 0;
    }
    public static void setMaxPlayers(int someMaxPlayers) {
        GameSettings.maxPlayers = someMaxPlayers;
    }
    public void addPlayer() {
        if (currentPLayers < maxPlayers) {
            currentPLayers ++;
        } else {
            System.out.println("Too many players!");
        }
    }
    public void printGameStatus() {
        System.out.println("Game Name: " + gameName +
                ", current players: " + currentPLayers +
                ", max players: " + maxPlayers);
    }
}
