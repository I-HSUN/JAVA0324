package com.study6.d04;

public class RefCase3 {

    public static void main(String[] args) {
        String sb= new String("Java");
        System.out.println(sb);
        sb= addVersion(sb);
        System.out.println(sb);
    }
    public static String addVersion(String datas) {
        datas=datas.concat("8");
        return  datas;
    }
}
