package com.ConverticStore.Convertic.domain.model;

public class City {
    private Integer id;
    private String name;

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
