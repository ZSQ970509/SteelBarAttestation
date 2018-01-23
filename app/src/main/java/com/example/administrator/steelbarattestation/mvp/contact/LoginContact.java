package com.example.administrator.steelbarattestation.mvp.contact;


import com.example.administrator.steelbarattestation.bean.LoginBean;
import com.example.administrator.steelbarattestation.bean.UpdateBean;
import com.example.administrator.steelbarattestation.mvp.IView;

/**
 * Created by administration on 2017/9/4.
 */

public class LoginContact {
    public interface View extends IView {
        void onLoginSuccess(LoginBean loginBean);
        void onLoginFail();
        void onGetVersionSuccess(UpdateBean updateBean);
        void onGetVersionFail();
    }

    public interface Presenter {
        void login(String passWord, String userName,String imei);
        void getVersion(String  packageName,String updateVersionCode);
    }
}
