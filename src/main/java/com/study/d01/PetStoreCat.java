
package com.study.d01;
public class PetStoreCat {

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.color = "花貓";
        cat1.name = "家貓";
        cat1.price=10000;
        Cat cat2 = new Cat();
        cat2.color = "白貓";
        cat2.name = "三花貓";
        cat2.price=20000;
        System.out.printf("我有一隻貓顏色是%s 品種是%s 價格是 %d",cat1.color,cat1.name,cat1.price);
    System.out.printf("我有一隻貓顏色是%s 品種是%s 價格是 %d",cat2.color,cat2.name,cat2.price);
    }
    
}
