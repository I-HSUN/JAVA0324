package com.study6.d04;

public class MultiArray3 {

    public static void main(String[] args) {
        int[][] scores = {//一年甲班的月考成績
            {100, 50, 95},//Jhon的分數
            {90, 75, 40} //Mary的分數
        };
        print(scores);
        //1.試問Jhon 與 Mary 的平均分數
        printAvgByPerson(scores);
        //2.試問一年甲班的月考班級的平均成績
        int avg= getAvg(scores);
        System.out.printf("班平均=%d\n",avg);
    }

    public static void printAvgByPerson(int[][] datas) {
        for (int i = 0; i < datas.length; i++) {
            int sum = 0;
            int lens = datas[i].length;
            for (int k = 0; k < lens; k++) {
                sum += datas[i][k];

            }
            int avg = sum / lens;
            System.out.printf("第%d位平均=%d\n", i+1, avg);
        }
    }

    public static void print(int[][] datas) {
        for (int i = 0; i < datas.length; i++) {
            for (int k = 0; k < datas[i].length; k++) {
                System.out.print(datas[i][k] + ",");

            }
            System.out.println();
        }
    }

    public static int getAvg(int[][] datas) {
        int sumAvg = 0;
        for (int i = 0; i < datas.length; i++) {
            int sum = 0;
            int lens = datas[i].length;
            for (int k = 0; k < lens; k++) {
                sum += datas[i][k];
            }
            sumAvg += sum/lens;
        }
        return sumAvg/datas.length;
    }
}
