package PersonalStuff.Flatlanders;

public class Address {

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return City;
    }

    public Address(String streetAddress, String city) {
        this.streetAddress = streetAddress;
        if (city.isEmpty()) {
            this.City = "Saskatoon";
        } else {
            City = city;
        }
    }

    String streetAddress;
    String City;

}
