package com.upluis.homework.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class WechatPayFactory extends PayFactory{


    @Override
    protected IPay createPay() {
        return new WechatPay();
    }
}
