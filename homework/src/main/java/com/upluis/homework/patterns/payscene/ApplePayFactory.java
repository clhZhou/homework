package com.upluis.homework.patterns.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class ApplePayFactory extends PayFactory{

    @Override
    protected IPay createPay() {
        return new ApplePay();
    }
}
