
import javax.swing.DefaultListModel;
import java.util.List;
import java.util.ArrayList;
        
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Gui extends javax.swing.JFrame {
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Gui.class.getName());
    DefaultListModel<String> dlm;
    List<String> items = new ArrayList<>();
    String[] datas = {"buku", "meja", "kursi", "tas", "pintu"};

    public Gui(){
        initComponents();
        this.dlm = new DefaultListModel<String>();
        this.jListItem.setModel(dlm);

        for (String data : datas) {
            dlm.addElement(data);
        }
        updateJumDataTersimpan();
    }
    
    private void addItem(String namaItem) {
        dlm.addElement(namaItem);
    }
    
    private void deleteItem(int index) {
        if (index >= 0) {
            dlm.removeElementAt(index);
            jTextFieldNamaItem.setText("");
        }
    }
    
    private void updateJumDataTersimpan() {
        jLabel1.setText("Data tersimpan = " + items.size());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListItem = new javax.swing.JList<>();
        jTextFieldNamaItem = new javax.swing.JTextField();
        jLabelNamaItem = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonDelete = new javax.swing.JButton();
        jButtonUpdate = new javax.swing.JButton();
        jButtonClearAll = new javax.swing.JButton();
        jButtonInsertData = new javax.swing.JButton();
        jButtonSaveData = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(jListItem);

        jTextFieldNamaItem.addActionListener(this::jTextFieldNamaItemActionPerformed);

        jLabelNamaItem.setText("Nama Item");

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(this::jButtonAddActionPerformed);

        jButtonDelete.setText("Delete");
        jButtonDelete.addActionListener(this::jButtonDeleteActionPerformed);

        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(this::jButtonUpdateActionPerformed);

        jButtonClearAll.setText("Clear All");
        jButtonClearAll.addActionListener(this::jButtonClearAllActionPerformed);

        jButtonInsertData.setText("Insert Data");
        jButtonInsertData.addActionListener(this::jButtonInsertDataActionPerformed);

        jButtonSaveData.setText("Save Data");
        jButtonSaveData.addActionListener(this::jButtonSaveDataActionPerformed);

        jLabel1.setText("Data tersimpan = 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelNamaItem)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonAdd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonInsertData, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonDelete, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButtonClearAll, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                        .addComponent(jButtonUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonSaveData)))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNamaItem)
                            .addComponent(jTextFieldNamaItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonAdd)
                            .addComponent(jButtonUpdate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonDelete)
                            .addComponent(jButtonClearAll))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonInsertData)
                            .addComponent(jButtonSaveData)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNamaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNamaItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNamaItemActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
        addItem(jTextFieldNamaItem.getText());
        
        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteActionPerformed
        int index = jListItem.getSelectedIndex();
        deleteItem(index);
    }//GEN-LAST:event_jButtonDeleteActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        // TODO add your handling code here:
        int index = jListItem.getSelectedIndex();
        String selected = jTextFieldNamaItem.getText();
        dlm.setElementAt(selected, index);

        jTextFieldNamaItem.setText("");
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void jButtonClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearAllActionPerformed
        // TODO add your handling code here:
        dlm.clear();
    }//GEN-LAST:event_jButtonClearAllActionPerformed

    private void jButtonInsertDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInsertDataActionPerformed
        // TODO add your handling code here:
        for (String item : items) {
            dlm.addElement(item);
        }
    }//GEN-LAST:event_jButtonInsertDataActionPerformed

    private void jButtonSaveDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveDataActionPerformed
        // TODO add your handling code here:
        if (!items.isEmpty()) {
            items.clear();
        }
        for (int i = 0; i < dlm.getSize(); i++) {
            items.add(dlm.getElementAt(i));
        }
        updateJumDataTersimpan();
    }//GEN-LAST:event_jButtonSaveDataActionPerformed
    
    
    
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Gui().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonClearAll;
    private javax.swing.JButton jButtonDelete;
    private javax.swing.JButton jButtonInsertData;
    private javax.swing.JButton jButtonSaveData;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelNamaItem;
    private javax.swing.JList<String> jListItem;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldNamaItem;
    // End of variables declaration//GEN-END:variables

}
