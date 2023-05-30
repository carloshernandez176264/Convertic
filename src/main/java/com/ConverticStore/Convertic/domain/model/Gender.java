package com.ConverticStore.Convertic.domain.model;

public class Gender {

    private Integer id;
    private String gender;

    public Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }
}
