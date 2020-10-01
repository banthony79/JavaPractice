package Lessons.Lesson40.PhoneStore;

import java.util.*;

public class Store {

    private String storeName;
    private LinkedList<Product> productList;

    public Store(String storeName) {
        this.storeName = storeName;
        this.productList = new LinkedList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public boolean addProduct(String productCode, String description, double price) {
        if (returnProduct(productCode) == null) {
            this.productList.add(new Product(productCode, description, price));
            return true;
        }
        return false;
    }

    public Product returnProduct(String productCode) {
        for (Product product : productList) {
            if (product.productCode.equals(productCode)) {
                return product;
            }
        }
        return null;
    }

    public boolean purchase(String productCode) {
        Product product = productSearch(productCode);
        System.out.println(product.getName());
        if (product.isAvailable()) {
            product.available = false;
            System.out.println("Please pay $" + String.format("%.2f", product.getPrice()));
            return true;

        } else {
            System.out.println("Sorry that product is unavailable");
            return false;
        }
    }

    public Product productSearch(String productCode) {
        int foundProduct = 0;
        Product product = new Product(productCode, productList.get(foundProduct).getName(), productList.get(foundProduct).getPrice());
        foundProduct = Collections.binarySearch(productList, product, null);
        product = new Product(productCode, productList.get(foundProduct).getName(), productList.get(foundProduct).getPrice());
        if (foundProduct > 0) {
            return productList.get(foundProduct);
        } else {
            System.out.println("Product code not found");
            return null;
        }
    }


    public class Product implements Comparable<Product> {

        private String productCode;
        private String name;
        private double price;
        boolean available;

        public Product(String productCode, String name, double price) {
            this.productCode = productCode;
            this.name = name;
            this.price = price;
            this.available = true;
        }

        @Override
        public int compareTo(Product product) {
            return productCode.compareTo(product.getProductCode());
        }

        public boolean isAvailable() {
            return available;
        }

        public String getName() {
            return name;
        }

        public String getProductCode() {
            return productCode;
        }

        public double getPrice() {
            return price;
        }


    }

}
