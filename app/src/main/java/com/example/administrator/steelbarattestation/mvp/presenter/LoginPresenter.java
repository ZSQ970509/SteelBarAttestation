package com.example.administrator.steelbarattestation.mvp.presenter;


import com.example.administrator.steelbarattestation.bean.LoginBean;
import com.example.administrator.steelbarattestation.bean.UpdateBean;
import com.example.administrator.steelbarattestation.exception.ApiException;
import com.example.administrator.steelbarattestation.http.BaseObserver;
import com.example.administrator.steelbarattestation.mvp.BasePresenter;
import com.example.administrator.steelbarattestation.mvp.contact.LoginContact;
import com.example.administrator.steelbarattestation.mvp.model.LoginModel;

/**
 * 登录Presenter
 */

public class LoginPresenter extends BasePresenter<LoginContact.View> implements LoginContact.Presenter {
    @Override
    public void login(String passWord, String userName, String imei) {
        new LoginModel()
                .login(passWord, userName, imei)
                .compose(getIView().bindLifecycle())
                .subscribe(new BaseObserver<LoginBean>() {
                    @Override
                    public void onSuccess(LoginBean loginBean) {
                        getIView().onLoginSuccess(loginBean);
                    }

                    @Override
                    public void onFail(ApiException msg) {
                        getIView().onLoginFail();
                    }
                });
    }

    @Override
    public void getVersion(String packageName, String updateVersionCode) {
        new LoginModel()
                .getVersion(packageName, updateVersionCode)
                .compose(getIView().bindLifecycle())
                .subscribe(new BaseObserver<UpdateBean>() {
                    @Override
                    public void onSuccess(UpdateBean loginBean) {
                        getIView().onGetVersionSuccess(loginBean);
                    }

                    @Override
                    public void onFail(ApiException msg) {
                        getIView().onGetVersionFail();
                    }
                });
    }
}
