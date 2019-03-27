package com.ing.training;

/**
 * Created by hamza on 3/25/19.
 */
public class Author {

    private Country country;
    private String name;

    public Author(Country country, String name) {
        this.country = country;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }
}
