/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package supermart.manager;

import java.awt.Color;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hp
 */
public class ShopManagementScreen extends javax.swing.JFrame {

    
    public ShopManagementScreen() {
        
        initComponents();
        productList = new java.util.ArrayList<>();
        cart = new ShoppingCart();
        DataHandler.loadProducts(productList);
        productTableModel = new DefaultTableModel(new String[]{"Product ID", "Product Name", "Price", "Stock"}, 0);
        cartTableModel = new DefaultTableModel(new String[]{"Product ID", "Product Name", "Quantity", "Price", "Total"}, 0);
        productTable.setModel(productTableModel);
        cartTable.setModel(cartTableModel);
        updateProductDisplay();
        this.setResizable(false);
     
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
        javax.swing.JLabel cartLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cartTable = new javax.swing.JTable();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        javax.swing.JButton addToCart = new javax.swing.JButton();
        javax.swing.JButton removeFromCart = new javax.swing.JButton();
        javax.swing.JButton clrBtn = new javax.swing.JButton();
        javax.swing.JButton checkout = new javax.swing.JButton();
        totalCostLabel = new javax.swing.JLabel();
        javax.swing.JButton closeBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Billing Page");

        jPanel1.setBackground(new java.awt.Color(255, 102, 0));

        cartLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cartLabel.setText("Cart Items");

        productTable.setBackground(new java.awt.Color(204, 204, 204));
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.setShowGrid(true);
        jScrollPane1.setViewportView(productTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Available Products");

        cartTable.setBackground(new java.awt.Color(204, 204, 204));
        cartTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Quantity", "Price", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        cartTable.setShowGrid(true);
        jScrollPane2.setViewportView(cartTable);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/supermart/icon/bill.png"))); // NOI18N
        jLabel2.setText("Generate Bill");

        addToCart.setBackground(new java.awt.Color(51, 153, 0));
        addToCart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        addToCart.setText("AddCart");
        addToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addToCartActionPerformed(evt);
            }
        });

        removeFromCart.setBackground(new java.awt.Color(153, 153, 0));
        removeFromCart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        removeFromCart.setText("RemoveCart");
        removeFromCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeFromCartActionPerformed(evt);
            }
        });

        clrBtn.setBackground(new java.awt.Color(204, 204, 0));
        clrBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        clrBtn.setText("ClearCart");
        clrBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clrBtnActionPerformed(evt);
            }
        });

        checkout.setBackground(new java.awt.Color(102, 204, 0));
        checkout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        checkout.setText("Checkout");
        checkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkoutActionPerformed(evt);
            }
        });

        totalCostLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        closeBtn.setBackground(new java.awt.Color(255, 0, 0));
        closeBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Note : Members will get 5 % discount on any purchase");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cartLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(271, 271, 271))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(closeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(clrBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(345, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(checkout, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(removeFromCart))
                                .addContainerGap(285, Short.MAX_VALUE))))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(484, 484, 484)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cartLabel)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 353, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalCostLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addToCart)
                    .addComponent(removeFromCart))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clrBtn)
                    .addComponent(checkout)
                    .addComponent(closeBtn))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addToCartActionPerformed
        
        
        
        int selectedRow = productTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(frame, "Please select a product to add to the cart.");
            return;
        }

        Product selectedProduct = productList.get(selectedRow);
        if (selectedProduct.getStock() <= 0) {
            JOptionPane.showMessageDialog(frame, "Selected product is out of stock.");
            return;
        }

        String quantityInput = JOptionPane.showInputDialog("Enter quantity:");
        if (quantityInput == null) return;

        try {
            int quantity = Integer.parseInt(quantityInput);
            if (quantity <= 0 || quantity > selectedProduct.getStock()) {
                JOptionPane.showMessageDialog(frame, "Invalid quantity. Please enter a valid amount.");
                return;
            }

            cart.addToCart(selectedProduct, quantity);
            selectedProduct.setStock(selectedProduct.getStock() - quantity);
            DataHandler.saveProducts(productList);
            updateProductDisplay();
            updateCartDisplay();
            updateTotalCost();

            JOptionPane.showMessageDialog(frame, "Product added to cart successfully!");
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(frame, "Invalid input! Please enter numeric values.");
        }
    }//GEN-LAST:event_addToCartActionPerformed

    private void removeFromCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeFromCartActionPerformed
                                              
    int selectedRow = cartTable.getSelectedRow();
    if (selectedRow == -1) {
        JOptionPane.showMessageDialog(this, "Please select a product to remove from the cart.");
        return;
    }

    
    int productId = (int) cartTableModel.getValueAt(selectedRow, 0);
    int quantity = (int) cartTableModel.getValueAt(selectedRow, 2);
    cart.removeFromCart(productId);

   
    for (Product product : productList) {
        if (product.getProductId() == productId) {
            product.setStock(product.getStock() + quantity);
            break;
        }
    }

   
    updateCartDisplay();
    updateProductDisplay();
    updateTotalCost();
    JOptionPane.showMessageDialog(this, "Product removed from cart successfully!");
      
    
    }//GEN-LAST:event_removeFromCartActionPerformed

    private void checkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkoutActionPerformed
       
                                             
   
    if (cart.getCartItems().isEmpty()) {
        JOptionPane.showMessageDialog(frame, "Your cart is empty. Please add items before checking out.");
        return;
    }

   
    JFrame customerFrame = new JFrame("Customer Details");
    customerFrame.setSize(400, 300);
    customerFrame.setLayout(null);

    JLabel nameLabel = new JLabel("Customer Name:");
    nameLabel.setBounds(50, 30, 120, 25);
    JTextField nameField = new JTextField();
    nameField.setBounds(180, 30, 150, 25);

    JLabel billLabel = new JLabel("Bill No:");
    billLabel.setBounds(50, 70, 120, 25);
    JTextField billField = new JTextField();
    billField.setBounds(180, 70, 150, 25);

    JButton submitButton = new JButton("Submit");
    submitButton.setBounds(80, 120, 100, 30);
    JButton cancelButton = new JButton("Cancel");
    cancelButton.setBounds(200, 120, 100, 30);

    customerFrame.add(nameLabel);
    customerFrame.add(nameField);
    customerFrame.add(billLabel);
    customerFrame.add(billField);
    customerFrame.add(submitButton);
    customerFrame.add(cancelButton);

    customerFrame.setVisible(true);

    submitButton.addActionListener(e -> {
        customerFrame.dispose();
        processCheckout(nameField.getText(), billField.getText());
    });

    cancelButton.addActionListener(e -> customerFrame.dispose());
}

private void processCheckout(String customerName, String billNo) {
    int confirm = JOptionPane.showConfirmDialog(frame, "Confirm purchase?", "Checkout", JOptionPane.YES_NO_OPTION);
    if (confirm != JOptionPane.YES_OPTION) return;

    double subtotal = cart.calculateTotal();
    double tax = subtotal * 0.15;
    double discount = (subtotal + tax > 1000) ? (subtotal + tax) * 0.10 : 0;
    boolean isMember = checkMembership(customerName);

    if (isMember) {
        discount += (subtotal + tax - discount) * 0.05; // Additional 5% for members
    }

    double totalCost = subtotal + tax - discount;
    String dateTime = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

    StringBuilder receipt = new StringBuilder();
    receipt.append("********************************************\n");
    receipt.append("             SHOP MANAGEMENT SYSTEM\n");
    receipt.append("********************************************\n");
    if (!customerName.isEmpty() && !billNo.isEmpty()) {
        receipt.append(String.format("Customer: %32s\n", customerName));
        receipt.append(String.format("Bill No: %34s\n", billNo));
    }
    receipt.append(String.format("Date & Time: %26s\n", dateTime));
    receipt.append(String.format("Subtotal: %34.2f TK\n", subtotal));
    receipt.append(String.format("Tax (15%%): %32.2f TK\n", tax));
    if (discount > 0) {
        receipt.append(String.format("Discount: %33.2f TK\n", -discount));
    }
    receipt.append("--------------------------------------------\n");
    receipt.append(String.format("Total Amount: %27.2f TK\n", totalCost));
    receipt.append("********************************************\n");
    receipt.append("          THANK YOU FOR SHOPPING!\n");
    receipt.append("********************************************");

    JFrame receiptFrame = new JFrame("Receipt");
    receiptFrame.setSize(500, 400);
    receiptFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    receiptFrame.setLayout(null);

    JTextArea receiptArea = new JTextArea(receipt.toString());
    receiptArea.setEditable(false);
    receiptArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
    receiptArea.setBounds(20, 20, 440, 260);
    receiptFrame.add(receiptArea);

    JScrollPane scrollPane = new JScrollPane(receiptArea);
    scrollPane.setBounds(20, 20, 440, 260);
    receiptFrame.add(scrollPane);

    JButton closeButton = new JButton("Close");
    closeButton.setFont(new Font("Arial", Font.BOLD, 16));
    closeButton.setBackground(Color.RED);
    closeButton.setBounds(200, 300, 100, 40);
    closeButton.addActionListener(e -> receiptFrame.dispose());
    receiptFrame.add(closeButton);

    receiptFrame.setVisible(true);

    cart.clearCart();
    updateCartDisplay();
    updateTotalCost();
}

private boolean checkMembership(String customerName) {
    if (customerName == null || customerName.trim().isEmpty()) {
        return false;
    }
    
    customerName = customerName.trim(); 

    try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\SuperMart Manager\\member.txt"))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] data = line.split(",", 2); 
            if (data.length > 0 && data[0].trim().equalsIgnoreCase(customerName)) { 
                return true;
            }
        }
    } catch (IOException e) {
        System.err.println("Error reading file: " + e.getMessage());
    }
    
    return false;




    }//GEN-LAST:event_checkoutActionPerformed

    private void clrBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clrBtnActionPerformed
        
        if (cart.getCartItems().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Your cart is already empty.");
        return;
    }

    
    for (int i = 0; i < cart.getCartItems().size(); i++) {
        Product product = cart.getCartItems().get(i);
        int quantity = cart.getQuantities().get(i);

        
        for (Product p : productList) {
            if (p.getProductId() == product.getProductId()) {
                p.setStock(p.getStock() + quantity);
                break;
            }
        }
    }

    
    cart.clearCart();

    
    updateCartDisplay();
    updateProductDisplay();
    updateTotalCost();
    JOptionPane.showMessageDialog(this, "All items removed from cart successfully!");
 
        
    }//GEN-LAST:event_clrBtnActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed
    private void updateCartDisplay() {
        cartTableModel.setRowCount(0); 
        for (int i = 0; i < cart.getCartItems().size(); i++) {
            Product product = cart.getCartItems().get(i);
            int quantity = cart.getQuantities().get(i);
            cartTableModel.addRow(new Object[]{
                    product.getProductId(),
                    product.getName(),
                    quantity,
                    product.getPrice(),
                    product.getPrice() * quantity
            });
        }
    }
    private void updateTotalCost() {
        double totalCost = cart.calculateTotal();
        totalCostLabel.setText(String.format("Total Cost: %.2f TK", totalCost));
    }
     public void updateProductDisplay() {
        productTableModel.setRowCount(0); 
        for (Product p : productList) {
            productTableModel.addRow(new Object[]{
                    p.getProductId(),
                    p.getName(),
                    p.getPrice(),
                    p.getStock()
            });
        }
    }

    public java.util.List<Product> getProductList() {
        return productList;
    }

    public void setId() {
        for (int i = 0; i < productList.size(); i++) {
            productList.get(i).setProductId(i + 1);
        }
    }
    
   
    protected java.util.List<Product> productList;
    private ShoppingCart cart;
    private javax.swing.JFrame frame;
    private DefaultTableModel productTableModel;
    private DefaultTableModel cartTableModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTable cartTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    static javax.swing.JTable productTable;
    private javax.swing.JLabel totalCostLabel;
    // End of variables declaration//GEN-END:variables
}
