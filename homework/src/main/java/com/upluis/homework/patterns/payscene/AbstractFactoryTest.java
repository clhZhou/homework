package com.upluis.homework.patterns.payscene;

/**
 * @author luis
 * @date 2020/2/24
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {

        DomesticFactory factory = new DomesticFactory();
        factory.createRegion().getRegionForeign_Ali().createPay().ToPay();
        factory.createRegion().getRegionForeign_Wechat().createPay().ToPay();
        factory.createRegion().getRegionForeign_Uni().createPay().ToPay();
//        factory.createRegion().getRegionForeign().createPay().ToPay();

        ForeignFactory factory1 = new ForeignFactory();
        factory1.createRegion().getRegionForeign().createPay().ToPay();
    }
}
