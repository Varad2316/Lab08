package com.example.lab08;

import java.util.ArrayList;
import java.util.List;

public class CustomList {
    private List<City> cities;

    public CustomList() {
        this.cities = new ArrayList<>();
    }
    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * Checks if a city exists in the list
     * @param city The city to search for
     * @return true if city is in the list, false otherwise
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list
     * @param city The city to delete
     * @throws IllegalArgumentException if city is not found in the list
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException("City not found in list");
        }
        cities.remove(city);
    }

    /**
     * Returns the number of cities in the list
     * @return The count of cities
     */
    public int countCities() {
        return cities.size();
    }
}