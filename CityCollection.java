package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This class represents a collection of cities.
 */
public class CityCollection {
    private List<City> cities;

    /**
     * Initializes a new instance of CityCollection.
     */
    public CityCollection() {
        cities = new ArrayList<>();
    }

    /**
     * Deletes a city from the collection.
     *
     * @param city The city to delete.
     * @throws IllegalArgumentException if the city doesn't exist in the collection.
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City does not exist in the collection.");
        }
        cities.remove(city);
    }

    /**
     * Counts the total number of cities in the collection.
     *
     * @return The total number of cities.
     */
    public int count() {
        return cities.size();
    }

    /**
     * Adds a city to the collection.
     *
     * @param city The city to add.
     */
    public void add(City city) {
        cities.add(city);
    }

    /**
     * Gets the list of cities sorted either by city name or province name.
     *
     * @param sortByCityName If true, sort by city name. If false, sort by province name.
     * @return The sorted list of cities.
     */
    public List<City> getCities(boolean sortByCityName) {
        List<City> sortedCities = new ArrayList<>(cities);
        if (sortByCityName) {
            Collections.sort(sortedCities, Comparator.comparing(City::getCityName));
        } else {
            Collections.sort(sortedCities, Comparator.comparing(City::getProvince));
        }
        return sortedCities;
    }
}
