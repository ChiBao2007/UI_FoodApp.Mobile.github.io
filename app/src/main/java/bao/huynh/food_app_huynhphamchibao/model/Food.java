package bao.huynh.food_app_huynhphamchibao.model;

import java.io.Serializable;

public class Food implements Serializable {
    private String name,price,detail;
    private  int image;

    public Food(String name, int image, String price, String detail) {
        this.name = name;
        this.image = image;
        this.price = price;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getPrice() {
        return price;
    }
    public String getDetail(){
        return detail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
