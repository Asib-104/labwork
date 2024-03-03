package org.example;

public class Main {
    public static void main(String[] args) {
        // Initialize CityCollection with initial cities
        CityCollection cityCollection = new CityCollection();
        cityCollection.add(new City("City1", "Province1"));
        cityCollection.add(new City("City2", "Province2"));
        cityCollection.add(new City("City3", "Province3"));

        // Now you can delete cities from the collection
        cityCollection.delete(new City("City1", "Province1"));
        cityCollection.delete(new City("City2", "Province2"));
        cityCollection.delete(new City("City3", "Province3"));
    }
}
