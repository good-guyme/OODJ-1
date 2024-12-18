package SalesManager;

import Login.LoginForm;

public class HomeFormSalesManager extends javax.swing.JFrame {

    public HomeFormSalesManager() {
        initComponents();
        LoginForm lf = new LoginForm();
//       lvl1.setText(lf.getUsername());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lvl1 = new javax.swing.JLabel();
        B3 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        B7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(lvl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 21, 37, -1));

        B3.setBackground(new java.awt.Color(255, 204, 204));
        B3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B3.setText("SalesEntry");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, 130, 60));

        B5.setBackground(new java.awt.Color(255, 204, 204));
        B5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/list.png"))); // NOI18N
        B5.setText("ItemList");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 170, -1));

        B1.setBackground(new java.awt.Color(255, 204, 204));
        B1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/purcaseorder.png"))); // NOI18N
        B1.setText("List Of Purchase Orders");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 60));

        B6.setBackground(new java.awt.Color(255, 204, 204));
        B6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B6.setText("Stock Level");
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });
        getContentPane().add(B6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 130, 60));

        B2.setBackground(new java.awt.Color(255, 204, 204));
        B2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/supplier.png"))); // NOI18N
        B2.setText("Sales Report");
        B2.setPreferredSize(new java.awt.Dimension(100, 200));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 180, 60));

        B4.setBackground(new java.awt.Color(255, 204, 204));
        B4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        B4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/reqform.png"))); // NOI18N
        B4.setText("Create Requisition");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });
        getContentPane().add(B4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 260, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("SALES MANAGER MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 280, 80));

        B7.setBackground(new java.awt.Color(255, 204, 204));
        B7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        B7.setText("QUIT");
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });
        getContentPane().add(B7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/background.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // this.dispose();
        new ItemList().setVisible(true);  // TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        this.dispose();
        new ListOfPurchaseOrders().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        this.dispose();
        new StockLevel().setVisible(true);    // TODO add your handling code here:
    }//GEN-LAST:event_B6ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        this.dispose();
        new SalesReport().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        this.dispose();
        new CreateRequisition().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_B4ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        this.dispose();
        new SalesEntry().setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_B7ActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFormSalesManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFormSalesManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFormSalesManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFormSalesManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFormSalesManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lvl1;
    // End of variables declaration//GEN-END:variables
}
