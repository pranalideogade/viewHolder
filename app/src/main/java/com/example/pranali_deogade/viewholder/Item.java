package com.example.pranali_deogade.viewholder;

/**
 * Created by pranali_deogade on 06-12-2017.
 */

public class Item {
private  String name;
    private  String college;


    public Item(String name,String college) {
        this.name = name;
        this.college=college;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
