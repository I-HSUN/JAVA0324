package com.study6.d04;

public class RefCase {

    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java");
        System.out.println(sb);
        addVersion(sb);
        System.out.println(sb);
    }
    public static void addVersion(StringBuilder datas) {
        datas.append("8");
        
    }
}
