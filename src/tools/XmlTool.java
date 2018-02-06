package tools;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 * This class is dedicated to the handling of several XML files in order to
 * properly run the RPGGameChoose project.
 * 
 * These XML files are used to:
 * - read the available game and intel on them;
 * 
 * As these files are designed to be part of the project, their names are
 * hard coded and should not be modified. With a little chance, the project
 * will give the ability to modify theses files to stick to the user preference.
 * Maybe.
 * 
 * @author Nicolas Brax
 */
public class XmlTool {
  
  /**
   * Relatively to the project, the path of the file that contains all the 
   * game information.
   */
  private final String dataPath = System.getProperty("user.dir") + "/data/games.xml";
  
  /****************************************************************************/
  /** Constructor Methods                                                    **/
  /****************************************************************************/
  
  /**
   * The Default Constructor that does nothing.
   */
  public XmlTool(){
    // things to do ?
  }
  
  
  /****************************************************************************/
  /** Tool Methods                                                           **/
  /****************************************************************************/
  
  /**
   * This method provides a list of all the scenario stored in the save folder.
   * Each file is named after the title of the scenario so the file name is 
   * then deconstructed in order to provide the right scenario name.
   * 
   * @return An array list containing all the scenario in the save folder.
   */
  public HashMap<String,ArrayList<String>> getAllGames(){
    HashMap<String,ArrayList<String>> toReturn = new HashMap<>();
    
    File inputFile = new File(dataPath);
    
    /* XML BLOCK */
    try{
      SAXBuilder saxBuilder = new SAXBuilder();
      Document document = saxBuilder.build(inputFile);
      Element root = document.getRootElement();
      for(Element game : root.getChildren()){
        ArrayList<String> tmp = new ArrayList<>();
        tmp.add(game.getChildText("name"));
        tmp.add(game.getChildText("short"));
        tmp.add(game.getChildText("description"));
        toReturn.put(tmp.get(0),tmp);
      }//for
    }catch(JDOMException | IOException e){
      e.printStackTrace();
    }//catch
    /* END of XML BLOCK */
    
    return toReturn;
  }
}