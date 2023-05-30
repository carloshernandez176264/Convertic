package com.ConverticStore.Convertic.domain.model;

public class Color {

    private Integer id;
    private String color;

    public Color(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
