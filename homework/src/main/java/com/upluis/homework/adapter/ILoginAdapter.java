package com.upluis.homework.adapter;


/**
 * Created by Tom.
 */
public interface ILoginAdapter {
    boolean support(Object object);
    ResultMsg login(String id, Object adapter);
}
