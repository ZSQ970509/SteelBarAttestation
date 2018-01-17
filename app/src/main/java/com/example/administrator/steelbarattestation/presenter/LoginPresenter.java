package com.example.administrator.steelbarattestation.presenter;



import com.example.administrator.steelbarattestation.activity.LoginActivity;
import com.example.administrator.steelbarattestation.base.BasePresenter;
import com.example.administrator.steelbarattestation.bean.LoginBean;
import com.example.administrator.steelbarattestation.contact.LoginContact;
import com.example.administrator.steelbarattestation.model.LoginModel;
import com.example.administrator.steelbarattestation.mvp.IModel;

import java.util.HashMap;

/**
 * Created by administration on 2017/9/4.
 */

public class LoginPresenter extends BasePresenter<LoginActivity> implements LoginContact.LoginPresenter{
    @Override
    public HashMap<String, IModel> getiModelMap() {
        return loadModelMap(new LoginModel());
    }

    @Override
    public HashMap<String, IModel> loadModelMap(IModel... models) {
        HashMap<String, IModel> map = new HashMap<>();
        map.put("login", models[0]);
        return map;
    }







}
