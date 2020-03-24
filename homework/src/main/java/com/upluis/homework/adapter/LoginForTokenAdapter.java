package com.upluis.homework.adapter;


/**
 * Created by Tom.
 */
public class LoginForTokenAdapter extends AbstraceAdapter {
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTokenAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
