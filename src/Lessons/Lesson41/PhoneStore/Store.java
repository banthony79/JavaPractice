package Lessons.Lesson41.PhoneStore;

import java.util.*;

public class Store {

    private String storeName;
    public LinkedList<Product> productList;

    static final Comparator<Product> PRICE_COMPARISON = new Comparator<Product>() {
        @Override
        public int compare(Product product1, Product product2) {
            if (product1.getPrice() < product2.getPrice()) {
                return -1;
            } else if (product1.getPrice() > product2.getPrice()) {
                return 1;
            } else {
                return 0;
            }
        }
    };


    public Store(String storeName) {
        this.storeName = storeName;
        this.productList = new LinkedList<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public LinkedList<Product> getProductList() {
        return productList;
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
        product.purchase();
        return true;
    }

    public Product productSearch(String productCode) {
        int foundProduct = 0;
        Product product = new Product(productCode, productList.get(foundProduct).getName(), productList.get(foundProduct).getPrice());
        foundProduct = Collections.binarySearch(productList, product, null);
        product = new Product(productCode, productList.get(foundProduct).getName(), productList.get(foundProduct).getPrice());
        if (foundProduct > 0) {
            return productList.get(foundProduct);
        } else {
            //System.out.println("Product code not found");
            return null;
        }
    }


    public String priceLookUp(String code) {
        Product product = productSearch(code);
        return product.getProductCode() + " - " + product.getPrice();


    }


    public class Product implements Comparable<Product> {

        private String productCode;
        private String name;
        private double price;
        private boolean available;

        public Product(String productCode, String name, double price) {
            this.productCode = productCode;
            this.name = name;
            this.price = price;
            this.available = true;
        }

        @Override
        public int compareTo(Product product) {
            return this.getProductCode().compareTo(product.getProductCode());
        }


        public int stringCompare(Product product) {
            return this.getName().compareTo(product.getName());
        }

        public String getName() {
            return name;
        }

        public boolean isAvailable() {
            return available;
        }

        public String getProductCode() {
            return productCode;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return this.productCode + " - " + this.name + " - " + this.price;
        }

        public boolean purchase() {
            if (this.available) {
                this.available = false;
                System.out.println("Please pay $" + String.format("%.2f", this.price));
                return true;
            } else {
                System.out.println("That product is not available");
                return false;
            }
        }


    }

}
