package com.study6.d03.array;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayDemo6 {

    public static void main(String[] args) {
        String s = "she sel sea shell on the sea shore";
        System.out.println(s.length());
        System.out.printf("%d 個字元\n", s.length());
        String[] sArray = s.split(" ");
        System.out.println (sArray[0]);
        System.out.printf("%d 個字\n",sArray.length);
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='s') {
                sum++;
            }
        }
        System.out.printf("總共有%d個\n",sum);
        
        long sum2=s.chars().filter(x->x==(int)'s').count();
        System.out.printf("總共有%d個\n",sum2);
    }
}
