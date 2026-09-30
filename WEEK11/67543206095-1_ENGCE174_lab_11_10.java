import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;

    Product(String name) {
        this.name = name;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(sc.next()));
        products.add(new Product(sc.next()));

        String target = sc.next();
        sc.close();

        boolean found = false;
        for (Product p : products) {
            if (p.name.equals(target)) {
                found = true;
                break;
            }
        }
        System.out.println(found ? "FOUND" : "NOT FOUND");
    }
}