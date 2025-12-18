package Shooping;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        ShoppingService service = new ShoppingService();
        Scanner sc = new Scanner(System.in);

        // Adding initial products
        service.addProduct(new Product(1, "Laptop", 999.99));
        service.addProduct(new Product(2, "Phone", 499.99));
        service.addProduct(new Product(3, "Headphones", 99.99));

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Remove from Cart");
            System.out.println("5. Remove Product from Store");
            System.out.println("6. Search Product by ID");
            System.out.println("7. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (service.productList.isEmpty()) {
                        System.out.println("No products available.");
                    } else {
                        System.out.println("--- Products Available ---");
                        for (Product p : service.productList) {
                            System.out.println(p);
                        }
                    }
                    break;

                case 2:
                    System.out.print("Enter Product ID: ");
                    int idToAdd = sc.nextInt();
                    System.out.print("Enter Quantity: ");
                    int qty = sc.nextInt();
                    service.addToCart(idToAdd, qty);
                    break;

                case 3:
                    service.showCart();
                    break;

                case 4:
                    System.out.print("Enter Product ID to remove from cart: ");
                    int idToRemove = sc.nextInt();
                    service.removeFromCart(idToRemove);
                    break;

                case 5:
                    System.out.print("Enter Product ID to remove from store: ");
                    int idToDelete = sc.nextInt();
                    service.removeProduct(idToDelete);
                    break;

                case 6:
                    System.out.print("Enter Product ID to search: ");
                    int searchId = sc.nextInt();
                    Product found = service.findProductById(searchId);
                    if (found != null) {
                        System.out.println("Product found: " + found);
                    } else {
                        System.out.println("Product with ID " + searchId + " not found.");
                    }
                    break;

                case 7:
                    System.out.println("Thank you for shopping with us!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
