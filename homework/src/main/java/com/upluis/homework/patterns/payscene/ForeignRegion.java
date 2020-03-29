package com.upluis.homework.patterns.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class ForeignRegion implements IRegion{

    @Override
    public ApplePayFactory getRegionForeign() {
        return new ApplePayFactory();
    }

    @Override
    public AliPayFactory getRegionForeign_Ali() {
        return null;
    }

    @Override
    public WechatPayFactory getRegionForeign_Wechat() {
        return null;
    }

    @Override
    public UniPayFactory getRegionForeign_Uni() {
        return null;
    }
}
