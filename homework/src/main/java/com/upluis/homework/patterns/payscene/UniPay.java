package com.upluis.homework.patterns.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class UniPay implements IPay{

    @Override
    public void ToPay() {
        System.out.println("欢迎使用银联支付");
    }
}
