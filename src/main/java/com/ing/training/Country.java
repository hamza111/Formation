package com.ing.training;

/**
 * Created by hamza on 3/25/19.
 */
public enum Country {


    FR("france"), UK("united kingdom"), US("united states"), DE("germany");

    private String name;

    private Country(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
