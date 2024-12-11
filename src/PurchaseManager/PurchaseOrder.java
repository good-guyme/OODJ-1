/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package PurchaseManager;

import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import Login.LoginForm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gorde
 */
public class PurchaseOrder extends javax.swing.JFrame {

    /**
     * Creates new form TEST
     */
    LoginForm lf = new LoginForm();

    public PurchaseOrder() {
        initComponents();
        LoginForm lf = new LoginForm();
        usernametxt1.setText(lf.getUsername());

        loadDataIntoTable();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernametxt1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        amounttxt = new javax.swing.JTextField();
        nametxt = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        usernametxt2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        orderTable = new javax.swing.JTable();
        refreshbtn = new javax.swing.JButton();
        returnButton = new javax.swing.JButton();
        datetxt = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setForeground(new java.awt.Color(255, 204, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("WELCOME,");

        usernametxt1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        usernametxt1.setText("jLabel2");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel10.setText("PURCHASE ORDER");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usernametxt1))
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(usernametxt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("ITEM ID :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("ITEM NAME :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("QUANTITY :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("PURCHASE DATE :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("PURCHASED BY :");

        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });

        editBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        editBtn.setText("EDIT");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        orderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ITEM ID", "ITEM NAME", "QUANTITY", "PURCHASE DATE", "PURCHASE BY"
            }
        ));
        jScrollPane1.setViewportView(orderTable);

        jScrollPane2.setViewportView(jScrollPane1);

        refreshbtn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        refreshbtn.setText("REFRESH");
        refreshbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshbtnActionPerformed(evt);
            }
        });

        returnButton.setBackground(new java.awt.Color(255, 102, 153));
        returnButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        returnButton.setText("BACK");
        returnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(returnButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(amounttxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nametxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(idtxt, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(usernametxt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 652, Short.MAX_VALUE)
                                    .addComponent(datetxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(usernametxt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadDataIntoTable() {
        DefaultTableModel model = (DefaultTableModel) orderTable.getModel(); // Get the table model
        model.setRowCount(0); // Clear existing data in the table

        // Read the data from the text file
        try (BufferedReader br = new BufferedReader(new FileReader("order.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue; // Skip empty lines
                }
                System.out.println("Read line: " + line); // for internal checking purpose on output
                String[] data = line.split(";");

                // Check the data before adding to the model
                System.out.println("Data length: " + data.length); // for internal checking purpose on output
                for (int i = 0; i < data.length; i++) {
                    System.out.println("Data[" + i + "]: " + data[i]); // Print each piece of data
                }

                // Adjust this check to ensure you have the expected number of columns
                if (data.length == 6) {

                    model.addRow(data); // Add each row of data to the table

                } else {
                    System.out.println("Invalid data format: " + line);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Unable to load data!"); // Handle the exception
        }
    }

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // Validate the ID (it must be a number)
        String ID = idtxt.getText();
        String Name = nametxt.getText();
        String Amount = amounttxt.getText();
        Date InputDate = datetxt.getDate();
        if (ID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid ID. Please enter a valid number.", "ID Error", JOptionPane.INFORMATION_MESSAGE);
            return; // Stop the process if the ID is empty
        }
        if (Name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Invalid Name. Please enter a valid name.", "Name input Error", JOptionPane.INFORMATION_MESSAGE);
            return; // Stop the process if the Name is empty
        }
        if (Amount.isEmpty() || !Amount.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Invalid ID. Please enter a valid number for quantity(ONLY NUMBERS).", "Quantity Error", JOptionPane.ERROR_MESSAGE);
            return; // Stop the process if the amount is empty or not number
        }

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy"); // Customize format as needed
        String date = dateFormat.format(InputDate);

        try {

            String filename = "order.txt";
            FileWriter fw = new FileWriter(filename);

            fw.write(idtxt.getText() + ";"
                    + nametxt.getText() + ";"
                    + amounttxt.getText() + ";"
                    + date + ";"
                    + usernametxt2.getText() + "; \n");

            fw.close();
            JOptionPane.showMessageDialog(this, "Successfully added item!", "Saved!!", JOptionPane.INFORMATION_MESSAGE);
            this.refreshData();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e.getMessage());

        }
    }//GEN-LAST:event_addBtnActionPerformed

    public void refreshData() {
        try {
            LoginForm lf = new LoginForm();
            DefaultTableModel model = (DefaultTableModel) orderTable.getModel();
            model.setRowCount(0);
            FileReader fr = new FileReader("order.txt");
            BufferedReader br = new BufferedReader(fr);
            String read;
            while ((read = br.readLine()) != null) {

                String itemID = read.split(";")[0];
                String itemName = read.split(";")[1];
                String Quantity = read.split(";")[2];
                String purchaseDate = read.split(";")[3];
                String Purchaser = read.split(";")[4];

                model.addRow(
                        new Object[]{itemID, itemName, Quantity, purchaseDate, Purchaser});

            }
        } catch (IOException e) {

            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            //get selected row of data
            int selectedRow = orderTable.getSelectedRow();
            String orderId = (String) orderTable.getValueAt(selectedRow, 0);
            FileReader fr = new FileReader("order.txt");
            BufferedReader br = new BufferedReader(fr);
            String read;

            ArrayList<ArrayList<String>> orderList = new ArrayList<>();
            while ((read = br.readLine()) != null) {
                ArrayList<String> record = new ArrayList<>();
                record.add(read.split(";")[0]);
                record.add(read.split(";")[1]);
                record.add(read.split(";")[2]);
                record.add(read.split(";")[3]);
                record.add(read.split(";")[4]);

                orderList.add(record);
            }
            for (int row = 0; row < orderList.size(); row++) {
                System.out.println(orderId);
                if (orderList.get(row).get(0).equals(orderId)) {
                    System.out.println("delete");
                    orderList.remove(row);
                    break;
                }
            }

            // Writing the updated TODO records back to the file
            FileWriter fw = new FileWriter("order.txt");
            for (int i = 0; i < orderList.size(); i++) {
                fw.write(orderList.get(i).get(0) + ";");
                fw.write(orderList.get(i).get(1) + ";");
                fw.write(orderList.get(i).get(2) + ";");
                fw.write(orderList.get(i).get(3) + ";");
                fw.write(orderList.get(i).get(4) + ";\n");

            }

            fw.close();
            JOptionPane.showMessageDialog(null, "successfully deleted a record");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Successfully deleted Item");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error ||  No record Selected");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void refreshbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshbtnActionPerformed
        refreshData();
        loadDataIntoTable();
    }//GEN-LAST:event_refreshbtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        try {
            // Read all data from file into a list
            BufferedReader br = new BufferedReader(new FileReader("order.txt"));
            ArrayList<String> Lines = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                Lines.add(line);
            }
            br.close();

            // Get the ID of the current record being edited
            String orderToUpdate = idtxt.getText();
            Date InputDate = datetxt.getDate();

            // Rewrite file with updated record
            FileWriter fw = new FileWriter("order.txt");
            for (String orderLine : Lines) {
                String[] orderData = orderLine.split(";");
                if (orderData[0].equals(orderToUpdate)) { // If ID matches, update record
                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy"); // Customize format as needed
                    String date = dateFormat.format(InputDate);
                    fw.write(
                            idtxt.getText() + ";"
                            + nametxt.getText() + ";"
                            + amounttxt.getText() + ";"
                            + date + ";"
                            + usernametxt2.getText() + ";\n"
                    );
                } else { // Keep the record as it is
                    fw.write(orderLine + "\n");
                }
            }
            fw.close();

            JOptionPane.showMessageDialog(null, "Record updated successfully!");
            this.refreshData(); // Refresh table data
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating record: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Error updating record: " + e.getMessage());
        }

    }//GEN-LAST:event_editBtnActionPerformed

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtActionPerformed

    private void returnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnButtonActionPerformed
        this.dispose();
        new HomeFormPurchaseManager().setVisible(true);
    }//GEN-LAST:event_returnButtonActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PurchaseOrder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField amounttxt;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser datetxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTable orderTable;
    private javax.swing.JButton refreshbtn;
    private javax.swing.JButton returnButton;
    private javax.swing.JLabel usernametxt1;
    private javax.swing.JTextField usernametxt2;
    // End of variables declaration//GEN-END:variables
}
