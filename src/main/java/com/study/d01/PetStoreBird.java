
package com.study.d01;
public class PetStoreBird {
    public static void main(String[] args) {
         Bird b1 = new Bird();
        b1.color = "彩色";
        b1.name = "鸚鵡";
        b1.price=10000;
        Bird b2 = new Bird();
        b2.color = "黑色";
        b2.name = "八哥";
        b2.price=4000;
        System.out.printf("我有一隻鳥顏色是%s 品種是%s 價格是 %d\n",b1.color,b1.name,b1.price);
    System.out.printf("我有一隻鳥顏色是%s 品種是%s 價格是 %d",b2.color,b2.name,b2.price);

    }
    
}
