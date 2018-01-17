package com.example.administrator.steelbarattestation.activity;


import android.os.Bundle;

import android.view.View;


import com.example.administrator.steelbarattestation.R;
import com.example.administrator.steelbarattestation.base.BaseActivity;
import com.example.administrator.steelbarattestation.contact.LoginContact;
import com.example.administrator.steelbarattestation.mvp.IView;
import com.example.administrator.steelbarattestation.presenter.LoginPresenter;





public class LoginActivity extends BaseActivity<LoginPresenter> implements LoginContact.LoginView, IView {




    @Override
    protected LoginPresenter loadPresenter() {
        return new LoginPresenter();
    }

    @Override
    protected void initData(Bundle savedInstanceState) {

    }

    @Override
    protected void changeScreen() {

    }


    @Override
    protected void initListener() {

    }

    @Override
    protected void initView() {


    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void otherViewClick(View view) {

    }
    public void onViewClicked(View view) {

    }

    @Override
    protected void onStart() {
        super.onStart();

    }






}
