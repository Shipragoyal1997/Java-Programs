package com.rat.demo;
public class Calc
{
 double num1,num2;
 public Calc(double num1,double num2)
 {
  this.num1=num1;
  this.num2=num2;
 }
 public void sum()
 {
  System.out.println("sum is" +(num1+num2));
 } 
 public void multiplication()
 {
  System.out.println("multiplication is"+(num1*num2));
 }
 public double getPower(double a,double b)
 {
  return Math.pow(a,b);
 }
 public double getSqrt(double a)
 { 
  return Math.sqrt(a);
 }
 }
 