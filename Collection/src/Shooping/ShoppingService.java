package Shooping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingService {

    // Product list and cart
    public List<Product> productList = new ArrayList<>();
    private Map<Integer, cardItem> cart = new HashMap<>();

    // Add product to store
    public void addProduct(Product product) {
        productList.add(product);
    }

    // Find product by ID from store
    public Product findProductById(int id) {
        for (Product p : productList) {
            if (p.getid() == id) {
                return p;
            }
        }
        return null;
    }

    // Add product to cart
    public void addToCart(int productId, int quantity) {
        Product product = findProductById(productId);
        if (product != null) {
            cardItem item = cart.get(productId);
            if (item != null) {
                item.setquantity(item.getquantity() + quantity);
            } else {
                cart.put(productId, new cardItem(product, quantity));
            }
            System.out.println(quantity + "x " + product.getname() + " added to cart");
        } else {
            System.out.println("Product not found in store.");
        }
    }

    // Remove product from cart
    public void removeFromCart(int productId) {
        if (cart.containsKey(productId)) {
            cart.remove(productId);
            System.out.println("Product with ID " + productId + " removed from cart.");
        } else {
            System.out.println("Product not found in cart.");
        }
    }

    // Show all items in cart
    public void showCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            for (cardItem item : cart.values()) {
                System.out.println(item);
            }
        }
    }

    // ✅ Remove product from store (and also from cart if exists)
    public void removeProduct(int productId) {
        Product product = findProductById(productId);
        if (product != null) {
            productList.remove(product);
            cart.remove(productId); // also remove from cart if exists
            System.out.println("Product with ID " + productId + " removed from store and cart.");
        } else {
            System.out.println("Product with ID " + productId + " not found in store.");
        }
    }
}
