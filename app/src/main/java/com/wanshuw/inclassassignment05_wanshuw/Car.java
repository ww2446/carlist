package com.wanshuw.inclassassignment05_wanshuw;

import java.io.Serializable;

/**
 * Created by candice on 2017/2/24.
 */
public class Car implements Serializable {
    String name;
    int age;
    double mile;

    public Car(String name, int age, double mile) {
        this.name = name;
        this.mile = mile;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getMile()
    {
        return mile;
    }

    public void setMile(double mile) {
        this.mile = mile;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Car List for You:" +"\n"+"\n"+
                "** Car brand: " + name  +"\n"+
                "** Car year: " + age +"\n"+
                "** Mileage: " + mile;
    }
}