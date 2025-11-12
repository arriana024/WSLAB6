import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class number6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 75000.00));
        products.add(new Product("Mouse", 500.00));
        products.add(new Product("Keyboard", 1200.00));
        products.add(new Product("Smartphone", 25000.00));
        products.add(new Product("Charger", 450.00));
        products.add(new Product("Headphones", 1500.00));

        System.out.print("Enter minimum price to filter products: ");
        double minPrice = input.nextDouble();

        long count = products.stream()
                .filter(p -> p.price > minPrice)
                .count();

        System.out.println("Number of products priced above " + minPrice + ": " + count);

        input.close();
    }
}
