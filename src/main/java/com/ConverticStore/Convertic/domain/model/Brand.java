package com.ConverticStore.Convertic.domain.model;

public class Brand {

    private Integer id;

    private String brandName;

    public Brand(String brandName) {
        this.brandName = brandName;
    }
    public String getBrandName() {
        return brandName;
    }

}
