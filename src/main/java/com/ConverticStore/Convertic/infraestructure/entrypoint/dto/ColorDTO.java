package com.ConverticStore.Convertic.infraestructure.entrypoint.dto;

import com.ConverticStore.Convertic.domain.model.Color;

public class ColorDTO {

    private Integer id;
    private String color;

    public Color toDomain(String color) {
        return new Color(color);
    }

}
