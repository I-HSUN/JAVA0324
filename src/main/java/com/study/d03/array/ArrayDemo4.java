package com.study6.d03.array;

import java.util.Random;

public class ArrayDemo4 {

    public static void main(String[] args) {
        int[] lottos = new int[6];
        for (int i = 0; i < lottos.length; i++) {
            lottos[i] = new Random().nextInt(9) + 1;
            for (int j = 0; j < lottos.length; j++) {

                if (lottos[i] == lottos[j]) {
                   break;
                } else {
                System.out.print(lottos[i] + ",");    
                }
                
            }
        }
        System.out.println();
    }

}
