package com.study6.d01;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class BMIDemo {
    public static void main(String[] args) {
        BMI b1=new  BMI();
        b1.name="Jhon";b1.h=170;b1.w=60;
        BMI b2=new  BMI();
        b2.name="Tom";b2.h=180;b2.w=52;
        BMI b3=new  BMI();
        b3.name="Marry";b3.h=150;b3.w=70;
        System.out.printf("%s:%.2f,%s:%.2f,%s:%.2f\n",
                b1.name, b1.getBMI(),b2.name,b2.getBMI(),b3.name,b3.getBMI());
    
        Stream.of(b1,b2,b3)
                .filter(b->b.getBMI()>18&&b.getBMI()<=23)
                .forEach(b->System.out.printf("%s:%.2f\n",b1.name,b1.getBMI()));
        DoubleSummaryStatistics bmi =Stream.of(b1,b2,b3)
                .mapToDouble(b->b.getBMI())
                .summaryStatistics();
        System.out.printf("平均:%.2f",bmi.getAverage());
        
        double avg =Stream.of(b1,b2,b3)
                .mapToDouble(b->b.getBMI())
                .summaryStatistics().getAverage();
        System.out.println(avg);
    }
    
}
