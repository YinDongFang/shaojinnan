/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.User.User;
import Business.Role.CustomerRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.MainJFrame;

/**
 *
 * @author shaojinnan
 */
public class CreateRestaurant extends javax.swing.JPanel {

    /**
     * Creates new form CreateCustomer
     */
    CreateRestaurant() {
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
        btnCreate = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtUserName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("Create new restaurant");

        btnCreate.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("UserName:");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Password:");

        txtName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        txtUserName.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("Re-password:");

        txtRePassword.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N

        btnBack.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPassword)
                            .addComponent(txtUserName)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnBack)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel3)
                        .addGap(33, 33, 33)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        /*Container.remove(this);
        Component [] componentArray = Container.getComponents();
        Component c = componentArray[componentArray.length-1];
        ManageFlight m = (ManageFlight) c;
        m.refreshTable();
        CardLayout layout = (CardLayout) Container.getLayout();
        layout.previous(Container);*/
    }//GEN-LAST:event_btnBackActionPerformed

    private boolean NamePattern() {
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(txtName.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean UserNamePattern() {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+");
        Matcher m = p.matcher(txtUserName.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean PasswordPattern() {
        Pattern p = Pattern.compile("[a-zA-Z0-9]+");
        Matcher m = p.matcher(txtPassword.getText());
        boolean b = m.matches();
        return b;
    }

    private boolean samePattern() {
        boolean b = false;
        if (txtPassword.getText().equals(txtRePassword.getText())) {
            b = true;
        }
        return b;
    }

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        txtName.setForeground(Color.black);
        txtUserName.setForeground(Color.black);
        txtPassword.setForeground(Color.black);
        txtRePassword.setForeground(Color.black);

        if (NamePattern() == false) {
            JOptionPane.showMessageDialog(null, "Name should be composed of letters!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtName.setForeground(Color.red);
        } else if (UserNamePattern() == false) {
            JOptionPane.showMessageDialog(null, "Username should be composed of letters or numbers!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtUserName.setForeground(Color.red);
        } else if (PasswordPattern() == false) {
            JOptionPane.showMessageDialog(null, "Password should be composed of letters or numbers!!", "Warning", JOptionPane.WARNING_MESSAGE);
            txtPassword.setForeground(Color.red);
        } else if (samePattern() == false) {
            JOptionPane.showMessageDialog(null, "Please input consistent password", "Warning", JOptionPane.WARNING_MESSAGE);
            txtRePassword.setForeground(Color.red);
        } else if (MainJFrame.system.checkIfUserIsUnique(txtUserName.getText())) {
            JOptionPane.showMessageDialog(null, "The account has been exist", "Warning", JOptionPane.WARNING_MESSAGE);
            txtUserName.setForeground(Color.red);
        } else {
            /*
            Customer customer = MainJFrame.system.getCustomerDirectory().createCustomer();
            customer.setName(txtName.getText());
            customer.setUserName(txtUserName.getText());

            User employee = MainJFrame.system.getEmployeeDirectory().createEmployee(txtName.getText());
            UserAccount ua = MainJFrame.system.getUserAccountDirectory().createUserAccount(txtUserName.getText(), txtPassword.getText(), employee, new CustomerRole());

            JOptionPane.showMessageDialog(null, "Customer create successfully!!", "Info", JOptionPane.INFORMATION_MESSAGE);
            txtName.setText("");
            txtUserName.setText("");
            txtPassword.setText("");
            txtRePassword.setText("");
            */
        }
    }//GEN-LAST:event_btnCreateActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRePassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
