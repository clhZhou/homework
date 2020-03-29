package com.upluis.homework.patterns.interpreter.demo;

/**
 * Created by Tom.
 */
public class Test {

    public static void main(String[] args) {
//        System.out.println("result: " + new GPCalculator("10 + 30").calculate());
//        System.out.println("result: " + new GPCalculator("10 + 30 - 20").calculate());
//        System.out.println("result: " + new GPCalculator("100 * 2 + 400 * 1 + 66").calculate());


        System.out.println("result: " + new GPAdvancedCalculator("11+10+30/((6-4)*2-2)").calculate());
    }

}
