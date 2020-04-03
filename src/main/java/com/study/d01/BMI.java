package com.study.d01;
public class BMI {
String name;
double h;
double w;

double getBMI(){
double bmi= w/Math.pow(h/100, 2);

    return bmi;
    }
}
