package com.upluis.homework.patterns.stratrgy;

/**
 * @author luis
 * @date 2020/3/17
 */
public abstract class Eat {

    public abstract String getName();

    public void doEat(String type){
        System.out.println(type);

    }
}
