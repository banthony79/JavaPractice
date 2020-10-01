package Accounts;

public class Customer {

    public int getCustomerAccountnumber() {
        return customerAccountnumber;
    }

    public void setCustomerAccountnumber(int customerAccountnumber) {
        this.customerAccountnumber = customerAccountnumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public boolean isNeedPO() {
        return needPO;
    }

    public void setNeedPO(boolean needPO) {
        this.needPO = needPO;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    private int customerAccountnumber;
    private String customerName;
    private String phoneNumber;
    private boolean needPO;
    private String address;
    private String city;
    private String postalcode;

    public Customer(int customerAccountnumber, String customerName, String phoneNumber, boolean needPO, String address, String city, String postalcode) {
        this.customerAccountnumber = customerAccountnumber;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.needPO = needPO;
        this.address = address;
        this.city = city;
        this.postalcode = postalcode;
    }
}
