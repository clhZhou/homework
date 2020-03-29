package com.upluis.homework.patterns.stratrgy;

/**
 * @author luis
 * @date 2020/3/17
 */
public class Breakfast extends Eat{
    @Override
    public String getName() {
        System.out.println("早饭");
        return "早饭";
    }

    @Override
    public void doEat(String type) {
        super.doEat(type);
    }
}
