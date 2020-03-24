package com.upluis.homework.adapter;


/**
 * Created by Tom.
 */
public abstract class AbstraceAdapter extends PassportService implements ILoginAdapter {
    protected ResultMsg loginForRegist(String username, String password) {
        if (null == password) {
            password = "THIRD_EMPTY";
        }
        ResultMsg resultMsg = super.regist(username, password);
        System.out.println(resultMsg.toString());
        return super.login(username, password);
    }
}
