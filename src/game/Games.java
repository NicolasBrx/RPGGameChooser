package game;

import java.util.ArrayList;

/**
 *
 * @author Nicolas Brax
 */
public enum Games {
  ADD("AD&D"),
  CTHULHU("Cthulhu"),
  FENGSHUI("Feng Shui"),
  PATIENT13("Patient 13"),
  SHADOWRUN("Shadowrun");
  
  private final String gameName;
  
  private Games(final String gameName){
    this.gameName = gameName;
  }
  
  public ArrayList<String> gameList(){
    ArrayList<String> toReturn = new ArrayList<>();
    for(Games g : Games.values()){
      toReturn.add(g.toString());
    }
    return toReturn;
  }
  
  @Override
  public String toString(){
    return this.gameName;
  }
}
