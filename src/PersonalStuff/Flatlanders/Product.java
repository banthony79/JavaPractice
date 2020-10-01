package PersonalStuff.Flatlanders;

public class Product {

    public String getName() {
        return name;
    }

    public String getProductClass() {
        return productClass;
    }

    public int getProductCode() {
        return productCode;
    }

    public Product(String name, String productClass, int productCode) {
        this.name = name;
        this.productClass = productClass;
        this.productCode = productCode;
    }

    String name;
    String productClass;
    int productCode;
}
