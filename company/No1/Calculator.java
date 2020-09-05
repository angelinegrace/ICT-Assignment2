package com.company.No1;

public class Calculator {
    Floor floor;
    Carpet carpet;
    public Calculator(Floor f,Carpet c){
        this.floor=f;
        this.carpet=c;
    }
    public double getTotalCost(){
        return (this.floor.getArea() * this.carpet.getCost());
    }
}
