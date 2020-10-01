package Products;

public class Products {

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    String productName;
    int productNumber;
    String productCategory;

    public Products(String productName, int productNumber, String productCategory) {
        this.productName = productName;
        this.productNumber = productNumber;
        this.productCategory = productCategory;
    }
}
