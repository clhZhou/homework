package com.upluis.homework.composite;

/**
 * @author luis
 * @date 2020/3/8
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("============安全组合模式===========");


        Top main = new Top("公司", 1);


//        for (int i = 2; i <= 5; i++) {
//            Top top = new Top("" + i + "级部门", i);
//            for (int j = 1; j <= i; j++) {
//                Low low = new Low("部门" + j);
//                top.add(low);
//            }
//            main.add(top);
//        }

        Top top2 = new Top("2级部门", 2);
        main.add(top2);
        Top top3 = new Top("3级部门", 3);
        top2.add(top3);
        Top top4 = new Top("4级部门", 4);
        top3.add(top4);


        Low low1 = new Low("部门2");
        top2.add(low1);
        Low low2 = new Low("部门3");
        top3.add(low2);
        Low low3 = new Low("部门4");
        top4.add(low3);


        main.show();

    }
}
