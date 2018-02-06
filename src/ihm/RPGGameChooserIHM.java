/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ihm;

import game.Game;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import tools.XmlTool;


/**
 *
 * @author Nicolas Brax
 */
public class RPGGameChooserIHM extends javax.swing.JFrame {
  
  private Game choosenGame;

  /**
   * Creates new form RPGGameChooser
   */
  public RPGGameChooserIHM() {
    initComponents();
    
    XmlTool xml = new XmlTool();
    jcbbGameChoice.addItem("");
    for(String game : xml.getAllGames().keySet()){
      jcbbGameChoice.addItem(game);
    }
    
    this.setTitle("RPG Game Chooser v.1.0.0");
    URL iconURL = getClass().getResource("favicon.png");
    ImageIcon icon = new ImageIcon(iconURL);
    this.setIconImage(icon.getImage());
    
    this.setSize(324,100);
    
  }

  /**
   * This method is called from within the constructor to initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is always
   * regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jbtnChoose = new javax.swing.JButton();
    jbtnQuit = new javax.swing.JButton();
    jcbbGameChoice = new javax.swing.JComboBox<>();
    jcbDescription = new javax.swing.JCheckBox();
    jlblDescription = new javax.swing.JLabel();

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setMaximumSize(new java.awt.Dimension(324, 274));
    setMinimumSize(new java.awt.Dimension(324, 72));
    setResizable(false);

    jbtnChoose.setText("Choose");
    jbtnChoose.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtnChooseActionPerformed(evt);
      }
    });

    jbtnQuit.setText("Quit");
    jbtnQuit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jbtnQuitActionPerformed(evt);
      }
    });

    jcbbGameChoice.setMaximumSize(new java.awt.Dimension(300, 23));
    jcbbGameChoice.setMinimumSize(new java.awt.Dimension(300, 23));
    jcbbGameChoice.setPreferredSize(new java.awt.Dimension(300, 23));
    jcbbGameChoice.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbbGameChoiceActionPerformed(evt);
      }
    });

    jcbDescription.setText("description?");
    jcbDescription.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jcbDescriptionActionPerformed(evt);
      }
    });

    jlblDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    jlblDescription.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addComponent(jcbbGameChoice, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addGroup(layout.createSequentialGroup()
            .addComponent(jcbDescription)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jbtnChoose)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jbtnQuit)
            .addGap(13, 13, 13))
          .addComponent(jlblDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap())
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(jcbbGameChoice, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jbtnChoose)
          .addComponent(jbtnQuit)
          .addComponent(jcbDescription))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addComponent(jlblDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jbtnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnQuitActionPerformed
    System.exit(0); 
  }//GEN-LAST:event_jbtnQuitActionPerformed

  private void jbtnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnChooseActionPerformed
    XmlTool xml = new XmlTool();
    ArrayList<String> tmp = new ArrayList<>();
    tmp.addAll(xml.getAllGames().get((String)jcbbGameChoice.getSelectedItem()));
    this.choosenGame = new Game(tmp.get(0),tmp.get(1),tmp.get(2));
  }//GEN-LAST:event_jbtnChooseActionPerformed

  private void jcbbGameChoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbbGameChoiceActionPerformed
    if(!((String)jcbbGameChoice.getSelectedItem()).equalsIgnoreCase("")){
      this.setSize(324,274);
      XmlTool xml = new XmlTool();
      if(jcbDescription.isSelected()){
        final String html1 = "<html><body style='width:225px'>";
        final String toDisplay = xml.getAllGames().get((String)jcbbGameChoice.getSelectedItem()).get(2);
        jlblDescription.setText(html1 + toDisplay);
      }
      else{
        this.setSize(324,100);
        jlblDescription.setText("");
      }
    }
    else{
      this.setSize(324,100);
      jlblDescription.setText("");
    }
  }//GEN-LAST:event_jcbbGameChoiceActionPerformed

  private void jcbDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDescriptionActionPerformed
    if(!((String)jcbbGameChoice.getSelectedItem()).equalsIgnoreCase("")){
      if(jcbDescription.isSelected()){
        this.setSize(324,274);
        XmlTool xml = new XmlTool();
        final String html1 = "<html><body style='width:225px'>";
        final String toDisplay = xml.getAllGames().get((String)jcbbGameChoice.getSelectedItem()).get(2);
        jlblDescription.setText(html1 + toDisplay);
      }
      else{
        this.setSize(324,100);
        jlblDescription.setText("");
      }
    }
    else{
      this.setSize(324,100);
      jlblDescription.setText("");
    }
  }//GEN-LAST:event_jcbDescriptionActionPerformed

  /**
   * @param args the command line arguments
   */
  public static void main(String args[]) {
    /* Set the Nimbus look and feel */
    //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
     */
    try {
      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
        }
      }
    } catch (ClassNotFoundException ex) {
      java.util.logging.Logger.getLogger(RPGGameChooserIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(RPGGameChooserIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(RPGGameChooserIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(RPGGameChooserIHM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      public void run() {
        new RPGGameChooserIHM().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jbtnChoose;
  private javax.swing.JButton jbtnQuit;
  private javax.swing.JCheckBox jcbDescription;
  private javax.swing.JComboBox<String> jcbbGameChoice;
  private javax.swing.JLabel jlblDescription;
  // End of variables declaration//GEN-END:variables

 }
