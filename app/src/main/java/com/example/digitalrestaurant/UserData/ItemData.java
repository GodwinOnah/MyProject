package com.example.digitalrestaurant.UserData;



public class ItemData {

    private int price,id;
    private String name, nationality,addtocart;

    public ItemData(int price,  String name, String nationality) {
        this.price = price;
        this.name = name;
        this.nationality = nationality;

    }



    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
