package com.example.mohsin.cardview;

/**
 * Created by mohsin on 10/10/2018.
 */

public class LayoutPojo {
    private int imagee;
    private String name;
    private String age;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public LayoutPojo(int imagee, String name, String age) {
        this.imagee = imagee;
        this.name = name;
        this.age=age;

    }



    public int getImage() {
        return imagee;
    }

    public void setImage(int image) {
        this.imagee = imagee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
