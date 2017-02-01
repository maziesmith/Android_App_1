package com.example.prati.mp2;

/**
 * Created by prati on 9/29/2016.
 */

public class Car {

    private String Carname;
    private int img;

    public Car(String Carname, int img){
        this.Carname=Carname;
        this.img=img;
    }

    public String getCarname() {
        return Carname;
    }

    public void setCarname(String carname) {
        Carname = carname;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
