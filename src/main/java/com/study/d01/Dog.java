package com.study.d01;
public class Dog {
//物件屬性
String color; //毛色
String name;//狗的品種
int price;//狗的價格
//物件方法
void skill(){
    System.out.println("我會玩飛盤");
    if(price>=40000){//判斷金額
        System.out.println("我會看家");
    }
}
}
