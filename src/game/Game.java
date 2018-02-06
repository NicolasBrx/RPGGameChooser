package game;

/**
 *
 * @author Nicolas Brax
 */
public class Game {
  
  private String gameName;
  private String gameShort;
  private String gameDescription;

  public Game(String gameName, String gameShort, String gameDescription) {
    this.gameName = gameName;
    this.gameShort = gameShort;
    this.gameDescription = gameDescription;
  }

  public String getGameName() {
    return gameName;
  }

  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  public String getGameShort() {
    return gameShort;
  }

  public void setGameShort(String gameShort) {
    this.gameShort = gameShort;
  }

  public String getGameDescription() {
    return gameDescription;
  }

  public void setGameDescription(String gameDescription) {
    this.gameDescription = gameDescription;
  }
}
