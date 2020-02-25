package com.upluis.homework.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class DomesticFactory extends RegionFactory{

    @Override
    protected IRegion createRegion() {
        return new DomesticRegion();
    }
}
