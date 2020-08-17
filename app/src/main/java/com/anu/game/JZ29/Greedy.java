package com.anu.game.JZ29;

public class Greedy {

    public static void main(String[] args) {
        int a = maxProductAfterCuttingSolution2(10);
        System.out.println(a);
    }


    // 贪心算法
    public static int maxProductAfterCuttingSolution2(int length) {
        if (length < 2) {
            return 0;
        }
        if (length == 2) {
            return 1;
        }
        if (length == 3) {
            return 2;
        }

        // 尽可能多的剪出长度为3的绳子
        int timesOfThree = length / 3;

        // 当绳子最后剩下的长度为4时（剩下长度为1），不能再减去长度为3的绳子
        if ((length - timesOfThree * 3) == 1) {
            timesOfThree -= 1;
        }
        // 长度为2的绳子
        int timesOfTwo = (length - timesOfThree * 3) / 2;
        return (int) (Math.pow(2, timesOfTwo) + Math.pow(3, timesOfThree));

    }
}
