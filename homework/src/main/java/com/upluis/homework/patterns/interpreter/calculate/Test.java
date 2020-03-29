package com.upluis.homework.patterns.interpreter.calculate;

/**
 * Created by Tom.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println("result: " + new GPCalculator("10 + 30").calculate());
//        System.out.println("result: " + new GPCalculator("10 + 30 - 20").calculate());
//        System.out.println("result: " + new GPCalculator("100 * 2 + 400 * 1 + 66").calculate());

        //乘除大于加减，先算括号内部，从左到右一次计算
//        System.out.println("result: " + new GPCalculator("(10*(10+10))*10").calculate());

//        System.out.println((10*(10+10))*10);
    }

}
