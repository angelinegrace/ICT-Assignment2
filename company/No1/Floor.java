package com.company.No1;

public class Floor {
    double width,length;
    public Floor(double w,double l) {
        this.width = w;
        this.length = l;
    }
    public double getArea(){
        return (this.width*this.length);
    }

}
