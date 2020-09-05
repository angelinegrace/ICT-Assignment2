package com.company.No1;

public class Circle {

     double radius;


    public Circle(double r) {

        radius = r;
    }

    public double getRadius(){


        return radius;

    }
    public double getArea(){

        return Math.PI*radius*radius;
    }
}
