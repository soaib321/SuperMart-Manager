/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermart.manager;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class UserManagement extends javax.swing.JFrame {

   
    public UserManagement() {
        initComponents();
        users = new Users("C:\\Users\\Hp\\OneDrive\\Documents\\GitHub\\SuperMart-Manager\\user.txt");
        tableModel = new DefaultTableModel(new String[]{"Username", "Role", "Status"}, 0);
        userTable = new JTable(tableModel);
        userscroll.setViewportView(userTable); 
        
        userTable.getSelectionModel().addListSelectionListener(e -> {
            int selectedRow = userTable.getSelectedRow();
            if (selectedRow != -1) {
                usernameField.setText((String) tableModel.getValueAt(selectedRow, 0));
                passwordField.setText(""); 
                roleComboBox.setSelectedItem(tableModel.getValueAt(selectedRow, 1));
                statusComboBox.setSelectedItem(tableModel.getValueAt(selectedRow, 2));
            }
        });
        loadUserData();
        this.setResizable(false);
        this.setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        userscroll = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        roleComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        statusComboBox = new javax.swing.JComboBox<>();
        javax.swing.JButton addButton = new javax.swing.JButton();
        javax.swing.JButton updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        clrBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Dashboard");

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        userscroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        userTable.setBackground(new java.awt.Color(153, 153, 153));
        userTable.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UserName", "Role", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        userscroll.setViewportView(userTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Username");

        usernameField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("Password");

        passwordField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Select Role");

        roleComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        roleComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "manager", "cashier", " " }));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setText("Status");

        statusComboBox.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "active", "inactive" }));

        addButton.setBackground(new java.awt.Color(255, 255, 51));
        addButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(153, 255, 0));
        updateButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(204, 204, 0));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        closeButton.setBackground(new java.awt.Color(255, 0, 0));
        closeButton.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermart/icon/user.png"))); // NOI18N
        jLabel5.setText("Manage Users");

        clrBtn.setBackground(new java.awt.Color(153, 153, 153));
        clrBtn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        clrBtn.setText("Clear");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(passwordField)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addComponent(deleteButton))
                            .addComponent(clrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(userscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(userscroll, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(roleComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(statusComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(updateButton)
                            .addComponent(deleteButton))))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeButton)
                    .addComponent(clrBtn))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        
        addUser();
    }                                         

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        
        updateUser();
    }                                            

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
       
        deleteUser();
    }                                            

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
        dispose();
    }                                           

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        usernameField.setText(""); 
        passwordField.setText("");
        roleComboBox.setSelectedIndex(0); 
        statusComboBox.setSelectedIndex(0);
    }                                      

    /**
     * @param args the command line arguments
     */

    private void loadUserData() {
    try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\GitHub\\SuperMart-Manager\\user.txt"))) {
        String line;
        tableModel.setRowCount(0); 
        boolean isFirstLine = true; 

        while ((line = br.readLine()) != null) {
            if (isFirstLine) { 
                isFirstLine = false; 
                continue;
            }

            String[] parts = line.split(","); 
            if (parts.length == 4) {
                tableModel.addRow(new Object[]{parts[0], parts[2], parts[3]}); 
            }
        }
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error loading users: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private void addUser() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());
        String role = (String) roleComboBox.getSelectedItem();
        boolean isActive = statusComboBox.getSelectedItem().equals("active");

       
        if (users.findUser(username) != null) {
            JOptionPane.showMessageDialog(this, "User already exists!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        User newUser = new User(username, password, role, isActive);
        users.addUser(newUser);
        users.saveUsersToFile("C:\\Users\\Hp\\OneDrive\\Documents\\GitHub\\SuperMart-Manager\\user.txt"); // add manually
        tableModel.addRow(new Object[]{username, role, isActive ? "active" : "inactive"});
    }

    private void updateUser() {
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow != -1) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());
            String role = (String) roleComboBox.getSelectedItem();
            boolean isActive = statusComboBox.getSelectedItem().equals("active");

            User updatedUser = new User(username, password, role, isActive);
            users.updateUser(updatedUser);
            users.saveUsersToFile("C:\\Users\\Hp\\OneDrive\\Documents\\GitHub\\SuperMart-Manager\\user.txt");
            tableModel.setValueAt(username, selectedRow, 0);
            tableModel.setValueAt(role, selectedRow, 1);
            tableModel.setValueAt(isActive ? "active" : "inactive", selectedRow, 2);
        }
    }

    private void deleteUser() {
        int selectedRow = userTable.getSelectedRow();
        if (selectedRow != -1) {
            String username = (String) tableModel.getValueAt(selectedRow, 0);
            users.removeUser(username);
            users.saveUsersToFile("C:\\Users\\Hp\\OneDrive\\Documents\\GitHub\\SuperMart-Manager\\user.txt");
            tableModel.removeRow(selectedRow);
        }
    }
    
    private DefaultTableModel tableModel;
    private Users users;
    // Variables declaration - do not modify                     
    private javax.swing.JButton closeButton;
    private javax.swing.JButton clrBtn;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JComboBox<String> roleComboBox;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JTable userTable;
    private javax.swing.JTextField usernameField;
    private javax.swing.JScrollPane userscroll;
    // End of variables declaration                   
}