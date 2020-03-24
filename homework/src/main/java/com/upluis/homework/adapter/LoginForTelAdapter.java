package com.upluis.homework.adapter;


/**
 * Created by Tom.
 */
public class LoginForTelAdapter extends AbstraceAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }

}
