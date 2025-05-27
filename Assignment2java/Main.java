import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of products you want to add: ");
        int productCount = scanner.nextInt();
        scanner.nextLine();

        product[] products = new product[productCount];

        for (int i = 0; i < productCount; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.println("Furniture or clothes...(Type F for Furniture or C for clothes)");
            char type = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.println("Enter product name: ");
            String name = scanner.nextLine();

            System.out.println("Enter product price: ");
            double price = scanner.nextDouble();

            System.out.println("Enter product ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            if (type == 'F' || type == 'f') {
                System.out.println("Enter material: ");
                String material = scanner.nextLine();
                products[i] = new furniture(name, price, id, material);

            } else if (type == 'C' || type == 'c') {
                System.out.println("Enter size");
                String size = scanner.nextLine();
                products[i] = new clothes(name, price, id, size);

            } else {
                System.out.println("Invalid product type");
            }

        }

        // application of discounts
        for (int i = 0; i < productCount; i++) {
            System.out.println("Enter discount type for ");
            System.out.println("1. Percentage Discount");
            System.out.println("2. Direct amount Discount");
            int discountType = scanner.nextInt();

            if (discountType == 1) {
                System.out.println("Enter discount percentage");
                double percentage = scanner.nextDouble();
                products[i].discount(percentage);

            } else if (discountType == 2) {
                System.out.println("Enter direct discount amount");
                double Amount = scanner.nextDouble();
                products[i].discount(Amount, true);

            } else {
                System.out.println("Invalid discount type");
            }

        }

        // Display
        System.out.println("Items display");
        for (product product : products) {
            product.displayDetails();
            System.out.println();
        }

        scanner.close();

    }
}
