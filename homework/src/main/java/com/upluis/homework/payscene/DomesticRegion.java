package com.upluis.homework.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class DomesticRegion implements IRegion{


    @Override
    public ApplePayFactory getRegionForeign() {
        return null;
    }

    @Override
    public AliPayFactory getRegionForeign_Ali() {
        return new AliPayFactory();
    }

    @Override
    public WechatPayFactory getRegionForeign_Wechat() {
        return new WechatPayFactory();
    }

    @Override
    public UniPayFactory getRegionForeign_Uni() {
        return new UniPayFactory();
    }
}
