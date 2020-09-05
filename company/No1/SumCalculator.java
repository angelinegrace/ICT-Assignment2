package com.company.No1;

public class SumCalculator {
     double firstNumber;
    double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNum){
         firstNumber=firstNum;
           }
    public void setSecondNumber(double secondNum){
          secondNumber=secondNum;
    }
    public double getAdditionResult(){
        return firstNumber+ secondNumber;
    }
    public double getSubtractionResult(){
        return firstNumber-secondNumber;
    }
    public double getMultiplicationResult(){
        return firstNumber*secondNumber;
    }
    public double getDivisionResult(){
        if(secondNumber==0) {
            return 0;

        }

        return 0;
    }
}
