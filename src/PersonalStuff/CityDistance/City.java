package PersonalStuff.CityDistance;

import java.util.ArrayList;

public class City {

    private String cityName;
    private String country;
    private double latitude;
    private double longitude;


    public City(String cityName, String country, double latitute, double longitude) {
        this.cityName = cityName;
        this.country = country;
        this.latitude = latitute;
        this.longitude = longitude;
    }

    public String getCityName() {
        return cityName;
    }

    public String getCountry() {
        return country;
    }

    public double getLatitute() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return cityName +
                ", the capital of " + country + ".";
    }

    public double getLatitude() {
        return latitude;
    }


}
