package Generics;

import java.util.ArrayList;
import java.util.List;

enum BookCategory {
    FICTION, NONFICTION, EDUCATIONAL
}

enum ClothingCategory {
    MEN, WOMEN, CHILDREN
}

enum GadgetCategory {
    MOBILE, LAPTOP, ACCESSORY
}

class Product<T> {
    private String name;
    private double price;
    private T category;

    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public T getCategory() { return category; }

    public void setPrice(double price) { this.price = price; }

    public void display() {
        System.out.println(name + " [" + category + "] " + price);
    }
}

class ProductUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discount = product.getPrice() * (percentage / 100);
        product.setPrice(product.getPrice() - discount);
    }
}

class Catalog {
    private List<Product<?>> products = new ArrayList<>();

    public void addProduct(Product<?> product) {
        products.add(product);
    }

    public void showCatalog() {
        for (Product<?> product : products) {
            product.display();
        }
    }
}

public class MarketplaceCatalog {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();

        Product<BookCategory> book = new Product<>("The Java Handbook", 799, BookCategory.EDUCATIONAL);
        Product<ClothingCategory> shirt = new Product<>("Cotton Shirt", 1299, ClothingCategory.MEN);
        Product<GadgetCategory> phone = new Product<>("Smartphone X", 19999, GadgetCategory.MOBILE);

        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);

        System.out.println("Original Catalog:");
        catalog.showCatalog();

        ProductUtils.applyDiscount(book, 10);
        ProductUtils.applyDiscount(shirt, 20);
        ProductUtils.applyDiscount(phone, 5);

        System.out.println("\nCatalog After Discounts:");
        catalog.showCatalog();
    }
}