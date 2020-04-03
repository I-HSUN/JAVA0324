package com.study6.d04;

public class WrapperDemo3 {

    public static void main(String[] args) {
      Integer a=100;
      int b=200;
        print(a);
        print(b);//Integer.vluse auto-boxing
    }
    public static void print(Integer x) {
        System.out.println("我是接受Integer 參數的方法,Integer x"+x);
        }
        public static void print(int x) {
        System.out.println("我是接受int 參數的方法,int x"+x);
        }

}
