package com.study6.d04;

public class RefCase2 {

    public static void main(String[] args) {
        String sb= new String("Java");
        System.out.println(sb);
        addVersion(sb);
        System.out.println(sb);
    }
    public static void addVersion(String datas) {
        datas=datas.concat("8");
        
    }
}