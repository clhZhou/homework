package com.upluis.homework.stratrgy;

/**
 * @author luis
 * @date 2020/3/17
 */
public class Lunch extends Eat{
    @Override
    public String getName() {
        System.out.println("中饭");
        return "中饭";
    }

    @Override
    public void doEat(String type) {
        super.doEat(type);
    }
}
