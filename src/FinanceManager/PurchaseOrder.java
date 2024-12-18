package FinanceManager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PurchaseOrder extends javax.swing.JFrame {

    public PurchaseOrder() {
        initComponents();
        loadDataIntoTable();
        refreshData();
    }

    @SuppressWarnings("unchecked")
    private void loadDataIntoTable() {
        // Initialize the table model
        String[] columnNames = {"ID", "Product", "Quantity", "Date", "Customer", "Status"};
        DefaultTableModel model = (DefaultTableModel) T1.getModel();
        model.setRowCount(0); // Clear existing rows

        try (BufferedReader br = new BufferedReader(new FileReader("order.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // Skip empty lines
                }

                System.out.println("Line read: " + line); // Debugging
                String[] data = line.split(";");
                if (data.length != 7) {
                    System.out.println("Skipping invalid row: " + line);
                    continue; // Skip rows that do not have 6 values
                }

                model.addRow(data); // Add valid rows to the table model
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unable to load data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private void updateOrderStatus(String orderId, String newStatus) {
        try {
            String filename = "order.txt";
            StringBuilder updatedContent = new StringBuilder();
            boolean orderFound = false;

            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");

                // Ensure the line has exactly 6 elements (ID, Product, Quantity, Date, Customer, Status)
                if (parts.length == 6) {
                    if (parts[0].equals(orderId)) {
                        orderFound = true;
                        parts[5] = newStatus; // Update the status in the 6th position (index 5)
                        updatedContent.append(String.join(";", parts)).append("\n");
                    } else {
                        updatedContent.append(line).append("\n");
                    }
                } else {
                    System.out.println("Skipping invalid row: " + line); // Debugging invalid rows
                }
            }
            br.close();

            if (!orderFound) {
//                JOptionPane.showMessageDialog(null, "Order not found!");
                return;
            }

            FileWriter fw = new FileWriter(filename);
            fw.write(updatedContent.toString());
            fw.close();

            JOptionPane.showMessageDialog(null, "Order updated successfully!");
            refreshData(); // Refresh the table to reflect changes when the order is updated

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }

    public void refreshData() {
        try {
            DefaultTableModel model = (DefaultTableModel) T1.getModel();
            model.setRowCount(0); // Clear current table data

            // Read data from file
            BufferedReader br = new BufferedReader(new FileReader("order.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(";");
                model.addRow(parts); // Add rows to the table
            }
            br.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error loading data: " + e.getMessage());
        }
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        T1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, -1, -1));

        T1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product", "Quantity", "Date", "Customer", "Status"
            }
        ));
        jScrollPane1.setViewportView(T1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 470, 340));

        jButton2.setBackground(new java.awt.Color(204, 204, 255));
        jButton2.setText("Approve");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, -1, -1));

        jButton3.setBackground(new java.awt.Color(204, 204, 255));
        jButton3.setText("Reject");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("PURCHASE ORDERS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/FinanceManager/Image/Cart.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(500, 800));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new HomeFormFinanceManager().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int selectedRow = T1.getSelectedRow(); // Get the selected row
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select an order to Accept!");
            return;
        }

        String orderId = T1.getValueAt(selectedRow, 0).toString(); // Get the Order ID
        updateOrderStatus(orderId, "Accepted"); // Update the status in the file       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRow = T1.getSelectedRow(); // Get the selected row
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select an order to Reject!");
            return;
        }

        String orderId = T1.getValueAt(selectedRow, 0).toString(); // Get the Order ID
        String reason = JOptionPane.showInputDialog("Enter reason for rejection:");
        if (reason != null && !reason.trim().isEmpty()) {
            updateOrderStatus(orderId, "Rejected;Reason:" + reason); // Update the status with reason
        } else {
            JOptionPane.showMessageDialog(null, "Rejection requires a reason!");
        }
        updateOrderStatus(orderId, "Rejected"); // Update the status in the file    
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable T1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
