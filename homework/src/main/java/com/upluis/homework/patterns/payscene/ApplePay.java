package com.upluis.homework.patterns.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class ApplePay implements IPay{

    @Override
    public void ToPay() {
        System.out.println("欢迎使用苹果支付");
    }
}
