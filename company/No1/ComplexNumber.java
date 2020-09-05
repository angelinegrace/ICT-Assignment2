package com.company.No1;

public class ComplexNumber {
   double real;
   double imaginary;
   public ComplexNumber(double r,double i){
      this.real=r;
      this.imaginary=i;
   }
   public double getReal(){
      return this.real;
   }
   public double getImaginary(){
      return this.imaginary;
   }
    public void add(double r,double i){
       System.out.println(this.real+this.imaginary);
   }
   public ComplexNumber add(ComplexNumber c){
      ComplexNumber temp=new ComplexNumber(this.real,this.imaginary);
      temp.real=this.real+c.real;
      temp.imaginary=this.imaginary+c.imaginary;
      return(temp);
      }
   public void subtract(double r,double i){
      System.out.println(this.real-this.imaginary);

   }
   public ComplexNumber subtract(ComplexNumber number){
            ComplexNumber temp = new ComplexNumber(real,imaginary);
            temp.real=this.real+ number.real;
            temp.imaginary=this.imaginary+ number.imaginary;
            return temp;
   }

   }
