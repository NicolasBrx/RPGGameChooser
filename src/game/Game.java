package game;

/**
 * This is class to unify and handle the choice of game by the user. This is part
 * of a plugin for the RPG Software Suit and it is dedicated to be used as a 
 * reference for the launching and the initialisation of all the other plugin.
 * 
 * @author Nicolas Brax
 */
public class Game {
  
  /****************************************************************************/
  /** Private Attributes                                                     **/
  /****************************************************************************/
  
  /**
   * The name of the game.
   */
  private String gameName;
  
  /**
   * The short name of the game.
   */
  private String gameShort;
  
  /**
   * The description of the game.
   */
  private String gameDescription;

  
  /****************************************************************************/
  /** Constructor Methods                                                    **/
  /****************************************************************************/
  
  /**
   * The constructor of the Game Class, called with the name, the nickname and 
   * the description of the Game to represent.
   * 
   * @param gameName         The name of the game.
   * @param gameShort        The short name of the game.
   * @param gameDescription  The description of the game.
   */
  public Game(String gameName, String gameShort, String gameDescription) {
    this.gameName = gameName;
    this.gameShort = gameShort;
    this.gameDescription = gameDescription;
  }
  
  
  /****************************************************************************/
  /** Getter and Setter Methods                                              **/
  /****************************************************************************/

  /**
   * Give the name of the game.
   * 
   * @return The name of the game.
   */
  public String getGameName() {
    return gameName;
  }

  /**
   * Modify the name of the game according to the one in parameter.
   * 
   * @param gameName The new name of the game.
   */
  public void setGameName(String gameName) {
    this.gameName = gameName;
  }

  /**
   * Give the short name of the game.
   * 
   * @return The short name of the game.
   */
  public String getGameShort() {
    return gameShort;
  }

  /**
   * Modify the short name of the game according to the one in parameter.
   * 
   * @param gameShort  The new short name of the game.
   */
  public void setGameShort(String gameShort) {
    this.gameShort = gameShort;
  }

  /**
   * Give the description of the game.
   * 
   * @return The description of the game.
   */
  public String getGameDescription() {
    return gameDescription;
  }

  /**
   * Modify the description of the game according to the one in parameter.
   * 
   * @param gameDescription The new description of the game.
   */
  public void setGameDescription(String gameDescription) {
    this.gameDescription = gameDescription;
  }
}
