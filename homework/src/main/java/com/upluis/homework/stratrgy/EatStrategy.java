package com.upluis.homework.stratrgy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author luis
 * @date 2020/3/17
 */
public class EatStrategy {
    public static  final String BREAKFAST = "breakfast";
    public static  final String LUNCH = "lunch";
    public static  final String DINNER = "dinner";
    public static final String EMPTY = "lunch";

    private static Map<String,Eat> strategy = new HashMap<String,Eat>();

    static {
        strategy.put(BREAKFAST,new Breakfast());
        strategy.put(LUNCH,new Lunch());
        strategy.put(DINNER,new Dinner());
        strategy.put(EMPTY,new Lunch());
    }

    public static String get(String type){
        if(!strategy.containsKey(type)){
            return strategy.get(EMPTY).getName();
        }
        return strategy.get(type).getName();
    }
}
