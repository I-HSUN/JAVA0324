package com.study6.d03.array;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s="Java";
        s.concat("8");
        System.out.println(s);
        StringBuilder sb = new StringBuilder("Java");
        sb.append("8");
        System.out.println(sb);
    }
    
}
