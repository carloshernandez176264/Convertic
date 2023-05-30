package com.ConverticStore.Convertic.domain.model;

import org.springframework.data.annotation.Id;

public class TypeDocument {

    private Integer id;

    private String description;

    public TypeDocument(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
