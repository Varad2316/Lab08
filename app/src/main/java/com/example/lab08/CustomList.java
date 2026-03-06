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
}