package com.upluis.homework.patterns.stratrgy;

/**
 * @author luis
 * @date 2020/3/17
 */
public class Dinner extends Eat{
    @Override
    public String getName() {
        System.out.println("晚饭");
        return "晚饭";
    }

    @Override
    public void doEat(String type) {
        super.doEat(type);
    }
}
