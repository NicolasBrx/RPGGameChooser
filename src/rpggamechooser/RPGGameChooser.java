package rpggamechooser;

import ihm.RPGGameChooserIHM;

/**
 *
 * @author Nicolas Brax
 */
public class RPGGameChooser {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    }catch(Exception ex){}
    new RPGGameChooserIHM().setVisible(true);
  }
}
