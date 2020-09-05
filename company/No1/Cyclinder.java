package com.company.No1;

public class Cyclinder extends Circle {
     double height;
     public Cyclinder(double r,double h){
          super(r);
          height=h;
     }
     public double getHeight(){
          return height;

     }
     public double getVolume(){
          return getArea()*height;
     }


}


