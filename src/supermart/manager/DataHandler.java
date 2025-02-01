/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermart.manager;

/**
 *
 * @author Hp
 */
import java.io.*;
import java.util.List;

public class DataHandler {

    private static final String FILE_PATH = "C:\\Users\\Hp\\OneDrive\\Documents\\NetBeansProjects\\SuperMart Manager\\data.txt"; //manual path input needed

    public static void saveProducts(List<Product> productList) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Product product : productList) {
                writer.write(product.getProductId() + "," + product.getName() + "," +
                        product.getPrice() + "," + product.getStock());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public static void loadProducts(List<Product> productList) {
        productList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int productId = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                int stock = Integer.parseInt(parts[3]);
                productList.add(new Product(name, price, stock, productId));
            }
        } catch (IOException e) {
            System.out.println("No existing data found.");
        }
    }
}

