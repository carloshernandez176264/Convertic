package com.ConverticStore.Convertic.domain.model;

public class User {
    private Integer id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private TypeDocument typeDocument;
    private String numberDocument;

    public User(String name, String lastName, String email, String password, TypeDocument typeDocument, String numberDocument) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.typeDocument = typeDocument;
        this.numberDocument = numberDocument;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public TypeDocument getTypeDocument() {
        return typeDocument;
    }

    public String getNumberDocument() {
        return numberDocument;
    }
}
