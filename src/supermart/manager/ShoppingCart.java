/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermart.manager;

/**
 *
 * @author Hp
 */
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> cartItems; 
    private final List<Integer> quantities;

    public ShoppingCart() {
        cartItems = new ArrayList<>();
        quantities = new ArrayList<>();
    }

   
    public void addToCart(Product product, int quantity) {
        int index = findProductIndex(product.getProductId());
        if (index != -1) {
            
            quantities.set(index, quantities.get(index) + quantity);
        } else {
            cartItems.add(product);
            quantities.add(quantity);
        }
    }

   
    public void removeFromCart(int productId) {
        int index = findProductIndex(productId);
        if (index != -1) {
            cartItems.remove(index);
            quantities.remove(index);
        }
    }

    // Update the quantity of a product in the cart
    public void updateCartQuantity(int productId, int newQuantity) {
        int index = findProductIndex(productId);
        if (index != -1) {
            if (newQuantity > 0) {
                quantities.set(index, newQuantity);
            } else {
                
                removeFromCart(productId);
            }
        }
    }

    
    public double calculateTotal() {
        double total = 0;
        for (int i = 0; i < cartItems.size(); i++) {
            total += cartItems.get(i).getPrice() * quantities.get(i);
        }
        return total;
    }

    
    public void clearCart() {
        cartItems.clear();
        quantities.clear();
    }

    
    private int findProductIndex(int productId) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getProductId() == productId) {
                return i;
            }
        }
        return -1;
    }

   
    public List<Product> getCartItems() {
        return new ArrayList<>(cartItems);
    }

    
    public List<Integer> getQuantities() {
        return new ArrayList<>(quantities);
    }

   
    public int getProductQuantity(int productId) {
        int index = findProductIndex(productId);
        if (index != -1) {
            return quantities.get(index);
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder cartDetails = new StringBuilder("Shopping Cart:\n");
        for (int i = 0; i < cartItems.size(); i++) {
            cartDetails.append(cartItems.get(i))
                    .append(" - Quantity: ").append(quantities.get(i))
                    .append("\n");
        }
        cartDetails.append("Total: ").append(calculateTotal()).append(" TK");
        return cartDetails.toString();
    }
}
