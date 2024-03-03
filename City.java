package org.example;

/**
 * This class represents a city.
 */
public class City {
    private String cityName;
    private String province;

    // Constructor
    public City(String cityName, String province) {
        this.cityName = cityName;
        this.province = province;
    }

    /**
     * Gets the name of the city.
     *
     * @return The city name.
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * Gets the name of the province.
     *
     * @return The province name.
     */
    public String getProvince() {
        return province;
    }
}
