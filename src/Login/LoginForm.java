/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Login;

import Admin.HomeFormAdmin;
import SalesManager.HomeFormSalesManager;
import FinanceManager.HomeFormFinanceManager;
import InventoryManager.HomeFormInventoryManager;
import PurchaseManager.HomeFormPurchaseManager;
import PurchaseManager.ListOfItems;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author yihan
 */
public class LoginForm extends javax.swing.JFrame {

    private static String username;

    /**
     * Creates new form Login
     */
    public LoginForm() {
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
        jSeparator1 = new javax.swing.JSeparator();
        usernametxt = new javax.swing.JTextField();
        passwordtxt = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        showpasswordcb = new javax.swing.JCheckBox();
        loginbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 48)); // NOI18N
        jLabel1.setText("LOGIN FORM");

        usernametxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        passwordtxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password: ");

        showpasswordcb.setText("Show Password");
        showpasswordcb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showpasswordcbActionPerformed(evt);
            }
        });

        loginbtn.setText("Login");
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showpasswordcb, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(loginbtn)
                                        .addGap(130, 130, 130)
                                        .addComponent(clearbtn))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(usernametxt)
                                        .addComponent(passwordtxt)))))))
                .addGap(220, 220, 220))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 192, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(showpasswordcb)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginbtn)
                    .addComponent(clearbtn))
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        usernametxt.setText("");
        passwordtxt.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void showpasswordcbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showpasswordcbActionPerformed
        if (showpasswordcb.isSelected()) {
            passwordtxt.setEchoChar((char) 0);//Show password
        } else {
            passwordtxt.setEchoChar('•');//Encrypt password
        }
    }//GEN-LAST:event_showpasswordcbActionPerformed

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        try {
            String filename = "admin.txt";
            FileReader fr = new FileReader(filename);
            BufferedReader br = new BufferedReader(fr);
            String read;
            String username = usernametxt.getText().trim();
            String password = new String(passwordtxt.getPassword()).trim();
            boolean loginStatus = false;

            // Try to scan the file line by line
            while ((read = br.readLine()) != null) {
                // Split the line once and store the result
                String[] userDetails = read.split(";");

                // Ensure the array has at least 4 elements before accessing them
                if (userDetails.length >= 4) {
                    if (userDetails[1].trim().equals(username) && userDetails[2].trim().equals(password)) {
                        this.setUsername(username);
                        loginStatus = true;
                        break; // Break out of the loop if login is successful
                    }
                }
            }

            // If login fails
            if (!loginStatus) {
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            } else {
                // Check the user's role and navigate to the appropriate form
                String role = read.split(";")[3].trim(); // Now we can split the line again for the role
                if (role.equals("AD")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    this.dispose(); // Close the current form
                    new HomeFormAdmin().setVisible(true); // Open the admin home form
                } else if (role.equals("FM")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    this.dispose(); // Close the current form
                    new HomeFormFinanceManager().setVisible(true); // Open the Finance Manager home form
                } else if (role.equals("IM")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    this.dispose(); // Close the current form
                    new HomeFormInventoryManager().setVisible(true); // Open the Inventory Manager home form
                } else if (role.equals("PM")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    this.dispose(); // Close the current form
                    new HomeFormPurchaseManager().setVisible(true); // Open the Purchase Manager home form
                }
                else if (role.equals("SM")) {
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    this.dispose(); // Close the current form
                    new HomeFormSalesManager().setVisible(true); // Open the Sales Manager home form
                }

                br.close(); // Close the BufferedReader after use
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "File Error: " + e.getMessage());
        }
    }//GEN-LAST:event_loginbtnActionPerformed

    public void setUsername(String username) {
        LoginForm.username = username;
    }

    public String getUsername() {
        return LoginForm.username;
    }

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JCheckBox showpasswordcb;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
