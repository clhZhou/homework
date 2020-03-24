package com.upluis.homework.adapter;

/**
 * Created by Tom.
 */
public class Test {
    public static void main(String[] args) {
        IPassportForThird adapter = new PassportForThirdAdapter();
        adapter.loginForQQ("sdfasdfasfasfas");
        adapter.loginForTelphone("123","123");
        adapter.loginForToken("123131");
        adapter.loginForWechat("13231");
    }
}
