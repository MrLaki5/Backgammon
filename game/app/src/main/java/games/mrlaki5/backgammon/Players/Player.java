package games.mrlaki5.backgammon.Players;

import games.mrlaki5.backgammon.GameActivity;

public abstract class Player {

    private GameActivity CurrGame;
    private String PlayerName;

    public Player(GameActivity currGame, String playerName) {
        CurrGame = currGame;
        PlayerName = playerName;
    }

    public String getPlayerName() {
        return PlayerName;
    }

    public GameActivity getCurrGame() {
        return CurrGame;
    }

    public void setCurrGame(GameActivity currGame) {
        CurrGame = currGame;
    }

    public void setPlayerName(String playerName) {
        PlayerName = playerName;
    }

    public abstract void actionMove();
    public abstract void actionRoll();
}
