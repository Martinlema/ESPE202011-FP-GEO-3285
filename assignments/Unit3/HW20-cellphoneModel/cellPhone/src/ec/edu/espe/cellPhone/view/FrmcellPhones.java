/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.cellPhone.view;


import ec.edu.espe.cellPhone.contoller.Search;
import static ec.edu.espe.cellPhone.contoller.Search.Searcherr;
import ec.edu.espe.cellPhone.contoller.SortingcellPhone;

import javax.swing.JOptionPane;

/**
 *
 * @author martin lema
 */
public class FrmcellPhones extends javax.swing.JFrame {

    /**
     * Creates new form FrmcellPhones
     */
    public FrmcellPhones() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtCELL1 = new javax.swing.JTextField();
        txtCELL2 = new javax.swing.JTextField();
        txtCELL3 = new javax.swing.JTextField();
        txtCELL4 = new javax.swing.JTextField();
        txtCELL5 = new javax.swing.JTextField();
        txtCELL6 = new javax.swing.JTextField();
        txtNamerToSearch = new javax.swing.JTextField();
        txtSortedcell = new javax.swing.JTextField();
        btnSort = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setForeground(new java.awt.Color(255, 255, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 51));
        jLabel1.setFont(new java.awt.Font("Vladimir Script", 0, 36)); // NOI18N
        jLabel1.setText("UNIVERSITY OF THE ARMED FORCES ESPE");

        jLabel2.setBackground(new java.awt.Color(255, 255, 0));
        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel2.setText("CELL 1");
        jLabel2.setAutoscrolls(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 0));
        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel3.setText("CELL 2");
        jLabel3.setAutoscrolls(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 0));
        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel4.setText("CELL 3");
        jLabel4.setAutoscrolls(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 0));
        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel5.setText("CELL 4");
        jLabel5.setAutoscrolls(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 0));
        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel6.setText("CELL 5");
        jLabel6.setAutoscrolls(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 0));
        jLabel7.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel7.setText("CELL 6");
        jLabel7.setAutoscrolls(true);

        jLabel8.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jLabel8.setText("Name to cell search");

        jLabel9.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jLabel9.setText("SORTED CELL");

        txtCELL1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtCELL2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtCELL3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtCELL4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtCELL5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtCELL6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtNamerToSearch.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N

        txtSortedcell.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtSortedcell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSortedcellActionPerformed(evt);
            }
        });

        btnSort.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        btnSort.setText("SORT");
        btnSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortActionPerformed(evt);
            }
        });

        btnSearch.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(btnSort)
                        .addGap(147, 147, 147)
                        .addComponent(btnSearch))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel3)))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtSortedcell, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCELL6, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                    .addComponent(txtCELL5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCELL1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCELL2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCELL3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCELL4, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNamerToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(157, 157, 157))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCELL1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNamerToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCELL2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCELL3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtCELL4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCELL5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCELL6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 6, Short.MAX_VALUE)
                        .addComponent(txtSortedcell, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSort)
                    .addComponent(btnSearch))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortActionPerformed
         String[] cellPhones = new String[6];
        String[] Sortedcell;
        int n  = cellPhones.length;
        String sortedArraycellPhone= "";
         
       Sortedcell= new String[6];
       
        SortingcellPhone SortingcellPhone = new SortingcellPhone();
        
        readNameToArray(cellPhones);
        
         Sortedcell= SortingcellPhone.sortBycellPhone(cellPhones);

           for(int i=0;i<n;i++) { 
        sortedArraycellPhone = sortedArraycellPhone + "\n" + cellPhones[i];
    }
       txtSortedcell.setText(sortedArraycellPhone);
     
    }
      public void readNameToArray(String []  cellPhones ) throws NumberFormatException {
           cellPhones[0]=txtCELL1.getText();
           cellPhones[1]=txtCELL2.getText();
           cellPhones[2]=txtCELL3.getText();  
           cellPhones[3]= txtCELL4.getText(); 
           cellPhones[4]=txtCELL5.getText();
           cellPhones[5]=txtCELL6.getText();
           
                                                  
    }//GEN-LAST:event_btnSortActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        int index;
           Search Searcherr  = new Search(); 
         String[] cellPhone;
          String findcellPhones;
         cellPhone = new String[6];
          findcellPhones=txtNamerToSearch.getText();
           readNameToArray(cellPhone);
           index =Searcherr.Searcherr(cellPhone,findcellPhones);
          if(index == -1){
       JOptionPane.showMessageDialog(null, "<---------------IS NOT FOUND------------>" ,findcellPhones+ " is NOT found",JOptionPane.ERROR_MESSAGE);
            }else{
           JOptionPane.showMessageDialog(null, findcellPhones+ " <------------IS FOUND------------>");
       }
                                             

        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtSortedcellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSortedcellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSortedcellActionPerformed

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
            java.util.logging.Logger.getLogger(FrmcellPhones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmcellPhones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmcellPhones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmcellPhones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmcellPhones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSort;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCELL1;
    private javax.swing.JTextField txtCELL2;
    private javax.swing.JTextField txtCELL3;
    private javax.swing.JTextField txtCELL4;
    private javax.swing.JTextField txtCELL5;
    private javax.swing.JTextField txtCELL6;
    private javax.swing.JTextField txtNamerToSearch;
    private javax.swing.JTextField txtSortedcell;
    // End of variables declaration//GEN-END:variables
}
