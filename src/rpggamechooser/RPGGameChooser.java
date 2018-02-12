package rpggamechooser;

import game.Game;
import ihm.RPGGameChooserIHM;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.UnsupportedLookAndFeelException;
import tools.RPGGCException;
import tools.XmlTool;

/**
 * This plugin is dedicated to be used with the RPG whole software as a game
 * chooser for the user and the initialisation of the other plugns.
 * 
 * @author Nicolas Brax
 */
public class RPGGameChooser {
 
  /**
   * The IHM related to the plugin.
   */
  private static RPGGameChooserIHM ihm;
  
  /**
   * An HashMap to register and use the game names and description.
   */
  private static HashMap<String,ArrayList<String>> gameData = new HashMap<>();

  /**
   * The main method to launch the IHM and initialize the user interface
   * 
   * @param args The command line arguments
   * @throws tools.RPGGCException Error thrown if the XML file containing
   *                               the game names and descriptions is not read
   *                               for any reason.
   */
  public static void main(String[] args) throws RPGGCException {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }catch(ClassNotFoundException | InstantiationException 
         | IllegalAccessException | UnsupportedLookAndFeelException ex){
      throw new RPGGCException("Can't set the UI Look and Feel.");
    }
    ihm = new RPGGameChooserIHM();
    XmlTool xml = new XmlTool();
    gameData = xml.getAllGames();
    ihm.setGameNames(gameData);
    ihm.setVisible(true);
  }
  
  /**
   * Give an access to the IHM. Might be useful for integration in other
   * projects.
   * 
   * @return A link to the RPG Game Chooser IHM.
   */
  public RPGGameChooserIHM getMainFrame(){
    return ihm;
  }
  
  /**
   * Give the game choosen by the user. 
   * 
   * @return The choosen game.
   */
  public Game getChoosenGame(){
    return ihm.getChoosenGame();
  }
  
  /**
   * Enable or disable the plugin interactions.
   * 
   * @param enabled True to enable, false to disable interactions.
   */
  public void setEnabled(boolean enabled){
    ihm.setEnabled(enabled);
  }
}
