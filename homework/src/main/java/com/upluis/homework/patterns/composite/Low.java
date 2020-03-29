package com.upluis.homework.patterns.composite;

/**
 * @author luis
 * @date 2020/3/8
 */
public class Low extends Dept{
    public Low(String deptName) {
        super(deptName);
    }

    @Override
    public void show() {
        System.out.println(this.deptName);
    }

}
