/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PurchaseManager;


import FinanceManager.*;
import Login.LoginForm;

/**
 *
 * @author michi
 */
public class HomeFormPurchaseManager extends javax.swing.JFrame {

    /**
     * Creates new form HomeFormAdmin
     */
    public HomeFormPurchaseManager() {
        initComponents();
        LoginForm lf = new LoginForm();
        usernamelbl.setText(lf.getUsername());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ListButton = new javax.swing.JButton();
        PurchaseOrderButton = new javax.swing.JButton();
        PurchaseListButt = new javax.swing.JButton();
        supplierList = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        reqFormButt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("Welcome,");

        usernamelbl.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        usernamelbl.setText("jLabel2");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernamelbl)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(usernamelbl))
                .addGap(16, 16, 16))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/menu.png"))); // NOI18N

        ListButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/list.png"))); // NOI18N
        ListButton.setText("ITEM LIST");
        ListButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListButtonActionPerformed(evt);
            }
        });

        PurchaseOrderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/purchase.png"))); // NOI18N
        PurchaseOrderButton.setText("PURCHASE ORDER");
        PurchaseOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseOrderButtonActionPerformed(evt);
            }
        });

        PurchaseListButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/purcaseorder.png"))); // NOI18N
        PurchaseListButt.setText("PURCHASE ORDER LIST");
        PurchaseListButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PurchaseListButtActionPerformed(evt);
            }
        });

        supplierList.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/supplier.png"))); // NOI18N
        supplierList.setText("SUPPLIER LIST");
        supplierList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierListActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/return.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reqFormButt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PurchaseManager/Image/reqform.png"))); // NOI18N
        reqFormButt.setText("REQUISITION FORM");
        reqFormButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqFormButtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(ListButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PurchaseOrderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PurchaseListButt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(supplierList)
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(reqFormButt, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(145, 145, 145)
                        .addComponent(jButton1)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PurchaseOrderButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ListButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PurchaseListButt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(supplierList, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(reqFormButt, javax.swing.GroupLayout.PREFERRED_SIZE, 77, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PurchaseOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseOrderButtonActionPerformed
        this.dispose();
        new PurchaseOrder().setVisible(true);
    }//GEN-LAST:event_PurchaseOrderButtonActionPerformed

    private void PurchaseListButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PurchaseListButtActionPerformed
        this.dispose();
        new ListOfPurchaseOrder().setVisible(true);
    }//GEN-LAST:event_PurchaseListButtActionPerformed

    private void ListButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListButtonActionPerformed
        this.dispose();
        new ListOfItems().setVisible(true);
    }//GEN-LAST:event_ListButtonActionPerformed

    private void supplierListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierListActionPerformed
        this.dispose();
        new ListOfSupplier().setVisible(true);
    }//GEN-LAST:event_supplierListActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new LoginForm().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void reqFormButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqFormButtActionPerformed
        this.dispose();
        new RequisitionForm().setVisible(true);
    }//GEN-LAST:event_reqFormButtActionPerformed

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
            java.util.logging.Logger.getLogger(HomeFormPurchaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeFormPurchaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeFormPurchaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeFormPurchaseManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeFormPurchaseManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ListButton;
    private javax.swing.JButton PurchaseListButt;
    private javax.swing.JButton PurchaseOrderButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton reqFormButt;
    private javax.swing.JButton supplierList;
    private javax.swing.JLabel usernamelbl;
    // End of variables declaration//GEN-END:variables
}
