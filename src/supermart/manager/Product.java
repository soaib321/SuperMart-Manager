/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermart.manager;

/**
 *
 * @author Hp
 */
import java.util.*;

public class Product {
    private int productId;
    private String name;
    private double price;
    private int stock;
    public Product(String name, double price, int stock, int productId) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.productId = productId;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean reduceStock(int quantity) {
        if (quantity > stock) {
            return false; // Not enough stock
        }
        stock -= quantity;
        return true;
    }

    public void increaseStock(int quantity) {
        stock += quantity;
    }

    @Override
    public String toString() {
        return "ID: " + productId + ", Name: " + name + ", Price: ৳" + price + ", Stock: " + stock;
    }

    // Static methods to manage a list of products
    static List<Product> productList = new ArrayList<>();

    public static List<Product> getProductList() {
        return new ArrayList<>(productList); // Return a copy of the product list
    }

    public static void setProductList(List<Product> newProductList) {
        productList = new ArrayList<>(newProductList); // Set a new product list
    }

    public static void addProduct(Product product) {
        productList.add(product);
    }

    public static Product findProductById(int productId) {
        for (Product product : productList) {
            if (product.getProductId() == productId) {
                return product;
            }
        }
        return null; // Product not found
    }

    public static boolean removeProduct(int productId) {
        Product product = findProductById(productId);
        if (product != null) {
            productList.remove(product);
            return true;
        }
        return false;
    }

    public static double calculateTotalPrice(int productId, int quantity) {
        Product product = findProductById(productId);
        if (product != null && product.getStock() >= quantity) {
            return product.getPrice() * quantity;
        }
        return -1; // Invalid product ID or insufficient stock
    }

    public static void displayAllProducts() {
        for (Product product : productList) {
            System.out.println(product);
        }
    }
}
