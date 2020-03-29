package com.upluis.homework.patterns.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class AliPayFactory extends PayFactory{
    @Override
    protected IPay createPay() {
        return new AliPay();
    }
}
