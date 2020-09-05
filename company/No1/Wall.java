package com.company.No1;

public class Wall {
    double width,height;

    public Wall( double w,double h){
        this.width = w;
        this.height= h;
    }
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }
    public void setWidth(double w){
        this.width=w;

    }
    public void setHeight(double h){
        this.height=0;

    }
    public double getArea(){
        return width*height;
    }
}
