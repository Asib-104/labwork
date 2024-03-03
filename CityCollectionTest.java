package org.example;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CityCollectionTest {

    @Test
    public void testDelete() {
        CityCollection cityCollection = new CityCollection();
        City city = new City("City1", "Province1");
        cityCollection.add(city);
        cityCollection.delete(city);
        assertEquals(0, cityCollection.count());
    }

    @Test
    public void testDeleteException() {
        CityCollection cityCollection = new CityCollection();
        City city = new City("City1", "Province1");
        assertThrows(IllegalArgumentException.class, () -> cityCollection.delete(city));
    }

    @Test
    public void testCount() {
        CityCollection cityCollection = new CityCollection();
        cityCollection.add(new City("City1", "Province1"));
        cityCollection.add(new City("City2", "Province2"));
        assertEquals(2, cityCollection.count());
    }

    @Test
    public void testSort() {
        CityCollection cityCollection = new CityCollection();
        cityCollection.add(new City("City3", "Province3"));
        cityCollection.add(new City("City1", "Province1"));
        cityCollection.add(new City("City2", "Province2"));
        assertEquals("City1", cityCollection.getCities(true).get(0).getCityName());
    }
}
