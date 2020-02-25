package com.upluis.homework.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public interface IRegion {

    ApplePayFactory getRegionForeign();

    AliPayFactory getRegionForeign_Ali();

    WechatPayFactory getRegionForeign_Wechat();

    UniPayFactory getRegionForeign_Uni();


}
