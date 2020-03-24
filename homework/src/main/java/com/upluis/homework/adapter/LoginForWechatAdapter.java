package com.upluis.homework.adapter;



/**
 * Created by Tom.
 */
public class LoginForWechatAdapter extends AbstraceAdapter{
    @Override
    public boolean support(Object adapter) {
        return adapter instanceof LoginForWechatAdapter;
    }
    @Override
    public ResultMsg login(String id, Object adapter) {
        return super.loginForRegist(id,null);
    }


}
