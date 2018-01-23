package com.example.administrator.steelbarattestation.mvp.model;


import com.example.administrator.steelbarattestation.http.NetTransformer;
import com.example.administrator.steelbarattestation.http.RetrofitUtils;
import com.example.administrator.steelbarattestation.mvp.IModel;

import io.reactivex.Observable;

/**
 * Created by administration on 2017/9/8.
 */

public class LoginModel implements IModel {
    public Observable login(String passWord, String userName,String imei) {
        return RetrofitUtils.Instance
                .getApiService()
                .login(passWord, userName, imei)
                .compose(NetTransformer.compose());
    }
    public Observable getVersion(String packageName, String updateVersionCode) {
        return RetrofitUtils.Instance
                .getApiService()
                .getVersion(packageName, updateVersionCode)
                .compose(NetTransformer.compose());
    }
}
