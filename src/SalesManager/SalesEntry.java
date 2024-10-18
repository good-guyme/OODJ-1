package SalesManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SalesEntry extends javax.swing.JFrame {

    public SalesEntry() {
        initComponents();
        refreshData();
    }

    public void refreshData() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbl1.getModel();
            model.setRowCount(0);
            FileReader fr = new FileReader("sales.txt");
            BufferedReader br = new BufferedReader(fr);
            String read;

            while ((read = br.readLine()) != null) {
                {
                    String barcode = read.split(";")[0];
                    String name = read.split(";")[1];
                    String quantity = read.split(";")[2];
                    String price = read.split(";")[3];

                    model.addRow(
                            new Object[]{barcode, name, quantity, price}
                    );

                }
            }

        } catch (IOException e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B3 = new javax.swing.JButton();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        spin1 = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        B5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl1.setBackground(new java.awt.Color(204, 204, 255));
        tbl1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbl1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Bar Code", "Name", "Quantity", "Price"
            }
        ));
        tbl1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 319, 392));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 120, 70, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("QUANTITY");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PRICE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 56, -1));

        B1.setText("ADD");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });
        getContentPane().add(B1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        B2.setText("EDIT");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });
        getContentPane().add(B2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, -1, -1));

        B3.setText("DELETE");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });
        getContentPane().add(B3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 320, -1, -1));

        T2.setBackground(new java.awt.Color(204, 204, 255));
        T2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T2ActionPerformed(evt);
            }
        });
        getContentPane().add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 165, -1));

        T3.setBackground(new java.awt.Color(204, 204, 255));
        getContentPane().add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 210, 89, -1));

        spin1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        spin1.setToolTipText("");
        getContentPane().add(spin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, 89, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BAR CODE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, 90, -1));

        T1.setBackground(new java.awt.Color(204, 204, 255));
        T1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T1ActionPerformed(evt);
            }
        });
        getContentPane().add(T1, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 80, 165, 30));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 478, 37, -1));

        B5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        B5.setText("BACK");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });
        getContentPane().add(B5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 80, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SalesManager/1.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void T2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T2ActionPerformed

    private void T1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T1ActionPerformed


    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

        try {
            //loginframe lf = new loginframe();
            String filename = "sales.txt";
            FileWriter fw = new FileWriter(filename, true);

            fw.write(
                    T1.getText() + ";"
                    + T2.getText() + ";"
                    + spin1.getValue() + ";"
                    + T3.getText() + ";\n"
            );

            fw.close();
            JOptionPane.showMessageDialog(
                    null, "Item Added Successfully !");
            this.refreshData();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(
                    null, e.getMessage());
        }
        T1.setText("");
        T2.setText("");
        T3.setText("");
        spin1.setValue(0);

// TODO add your handling code here:
    }//GEN-LAST:event_B1ActionPerformed

    private void tbl1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl1MouseClicked
        DefaultTableModel df = (DefaultTableModel) tbl1.getModel();
        int selectIndex = tbl1.getSelectedRow();
        // Check if a row is selected
        T1.setText(tbl1.getValueAt(selectIndex, 0).toString());
        T2.setText(tbl1.getValueAt(selectIndex, 1).toString());
        spin1.setValue(Integer.parseInt(df.getValueAt(selectIndex, 2).toString()));
        T3.setText(tbl1.getValueAt(selectIndex, 3).toString());

        B1.setEnabled(false);

// TODO add your handling code here:
    }//GEN-LAST:event_tbl1MouseClicked


    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed

        try {
            String filename = "sales.txt";
            StringBuilder fileContent = new StringBuilder();
            String itemIdToEdit = T1.getText(); // Assuming T1 contains the ID of the item to edit
            boolean itemFound = false;

            // Read the current file contents
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";"); // Split the line by ';'

                // Check if this line matches the ID to edit
                if (parts[0].equals(itemIdToEdit)) {
                    // Modify this line with new values
                    line = T1.getText() + ";" + T2.getText() + ";" + spin1.getValue() + ";" + T3.getText() + ";";
                    itemFound = true; // Mark as found
                }

                // Append the (possibly modified) line to the StringBuilder
                fileContent.append(line).append("\n");
            }
            br.close();

            // Show message if the item was not found
            if (!itemFound) {
                JOptionPane.showMessageDialog(null, "Item not found!");
                return;
            }

            // Write the modified contents back to the file
            FileWriter fw = new FileWriter(filename);
            fw.write(fileContent.toString());
            fw.close();

            JOptionPane.showMessageDialog(null, "Item Edited Successfully!");
            this.refreshData();
            B1.setEnabled(true);

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        T1.setText("");
        T2.setText("");
        T3.setText("");
        spin1.setValue(0);

// TODO add your handling code here:
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed

        try {
            String filename = "sales.txt";
            StringBuilder fileContent = new StringBuilder();
            String itemIdToDelete = T1.getText(); // Assuming T1 contains the ID of the item to delete
            boolean itemFound = false;

            // Read the current file contents
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";"); // Split the line by ';'

                // Check if this line matches the ID to delete
                if (parts[0].equals(itemIdToDelete)) {
                    itemFound = true; // Mark as found, do not append this line
                    continue; // Skip appending this line to fileContent
                }

                // Append the line to the StringBuilder if it is not the one to delete
                fileContent.append(line).append("\n");
            }
            br.close();

            // Show message if the item was not found
            if (!itemFound) {
                JOptionPane.showMessageDialog(null, "Item not found!");
                T1.setText("");
                T2.setText("");
                T3.setText("");
                spin1.setValue(0);
                return;
            }

            // Write the modified contents back to the file
            FileWriter fw = new FileWriter(filename);
            fw.write(fileContent.toString());
            fw.close();

            JOptionPane.showMessageDialog(null, "Item Deleted Successfully!");
            this.refreshData();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

        T1.setText("");
        T2.setText("");
        T3.setText("");
        spin1.setValue(0);

        B1.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_B3ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        this.dispose();
        new HomeFormSalesManager().setVisible(true);

// TODO add your handling code here:
    }//GEN-LAST:event_B5ActionPerformed

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
            java.util.logging.Logger.getLogger(SalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B5;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spin1;
    private javax.swing.JTable tbl1;
    // End of variables declaration//GEN-END:variables
}
