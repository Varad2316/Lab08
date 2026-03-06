package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
   Testing hasCity, delete and countCities methods using TDD
 */
public class CustomListTest {

    /**
     * Test hasCity method which checks if a city exists in the list
     * RED phase- this test will fail because hasCity() doesn't exist yet
     */
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");

        list.addCity(calgary);
        assertTrue(list.hasCity(calgary), "Should return true for city in list");

        City edmonton = new City("Edmonton", "AB");
        assertFalse(list.hasCity(edmonton), "Should return false for city not in list");
    }

    /**
     * Test delete method - removes a city from the list
     * RED phase - this test will fail because delete() doesn't exist yet
     */
    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);
        assertTrue(list.hasCity(vancouver), "City should be in list before deletion");
        list.delete(vancouver);
        assertFalse(list.hasCity(vancouver), "City should be removed from list");
    }

    /**
     * Test that delete throws exception when city doesn't exist
     */
    @Test
    public void testDeleteCityNotFound() {
        CustomList list = new CustomList();
        City toronto = new City("Toronto", "ON");

        assertThrows(IllegalArgumentException.class, () -> {
            list.delete(toronto);
        }, "Should throw exception when deleting non existent city");
    }
}