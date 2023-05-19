package ss12_module2.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void updateProduct(int id, String name, double price, String description) {
        for (Product p : products) {
            if (p.getId() == id) {
                p.setName(name);
                p.setPrice(price);
                p.setDescription(description);
            }
        }
    }

    public void removeProduct(int id) {
        products.removeIf(p -> p.getId() == id);
    }

    public void displayProducts() {
        System.out.println("List of Products:");
        for (Product p : products) {
            System.out.println(p.toString());
        }
    }

    public List<Product> searchProductByName(String name) {
        List<Product> list = new ArrayList<>();
        for (Product p : products) {
            if (p.getName().equalsIgnoreCase(name)) {
                list.add(p);
            }
        }
        return list;
    }

    public void sortProductsAscendingByPrice() {
        Comparator<Product> compareByPriceAsc = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());
        Collections.sort(products, compareByPriceAsc);
    }

    public void sortProductsDescendingByPrice() {
        Comparator<Product> compareByPriceDesc = (p1, p2) -> Double.compare(p2.getPrice(), p1.getPrice());
        Collections.sort(products, compareByPriceDesc);
    }
}

