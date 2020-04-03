package com.study.d02;

public class Wallet {

    private int money;//私有變數,只有Wallet自己可以"直接"用

    Wallet() {

    }

    Wallet(int m) {//建構子
        money = m;//修改money的資料
    }

    //設定money
    void setMoney(int m) {//封裝
        if (m >= 0) {
            money = m;
        } else {
            System.out.println("皮夾裡的money不可以<0");
        }
    }

    //取得money
    int getMoney() {
        return money;
    }
//修改(增加+或減少-)money
    void updateMoney(int m){
    if(m>=0||(m<0&&money>=Math.abs(m))){
        money+=m;
    }else{
        System.out.println("扣款失敗，餘額不足");
    }
    }
    //印出皮夾內的資料
    void printWallet() {

        System.out.printf("我的皮夾裡面有:$%d", money);
    }
}
