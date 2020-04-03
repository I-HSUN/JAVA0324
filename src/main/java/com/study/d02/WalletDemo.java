package com.study.d02;

import java.util.Scanner;

public class WalletDemo {
    public static void main(String[] args) {
        Wallet w1 =new Wallet();
           w1.setMoney(7000);
        w1.printWallet();
        w1.updateMoney(-50000);
        int money=w1.getMoney();
        System.out.println(money);

    }
    
}
