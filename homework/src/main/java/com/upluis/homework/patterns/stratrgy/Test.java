package com.upluis.homework.patterns.stratrgy;

/**
 * @author luis
 * @date 2020/3/17
 */
public class Test {
    public static void main(String[] args) {
        EatStrategy.get(null);
        EatStrategy.get(EatStrategy.LUNCH);
        EatStrategy.get(EatStrategy.BREAKFAST);
        EatStrategy.get(EatStrategy.DINNER);
    }
}
