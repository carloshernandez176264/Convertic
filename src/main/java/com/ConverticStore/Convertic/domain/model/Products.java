package com.ConverticStore.Convertic.domain.model;

public class Products {
    private Integer id;
    private Color color;

    private Size size;

    private Brand brand;

    private Gender gender;

    private String description;
    private String image;
    private Integer price;
    private Integer stock;
    private Integer idCategory;

    private Integer mosWanted;

    public Products(Color color, Size size, Brand brand, Gender gender, String description, String image, Integer price,
                    Integer stock, Integer idCategory, Integer mosWanted) {
        this.color = color;
        this.size = size;
        this.brand = brand;
        this.gender = gender;
        this.description = description;
        this.image = image;
        this.price = price;
        this.stock = stock;
        this.idCategory = idCategory;
        this.mosWanted = mosWanted;
    }

    public String getDescription() {
        return description;
    }

    public String getImage() {
        return image;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getStock() {
        return stock;
    }

    public Integer getIdCategory() {
        return idCategory;
    }

    public Integer getMosWanted() {
        return mosWanted;
    }

}
