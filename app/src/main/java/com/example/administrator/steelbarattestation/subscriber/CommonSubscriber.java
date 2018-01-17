package com.example.administrator.steelbarattestation.subscriber;

import android.content.Context;

import com.example.administrator.steelbarattestation.base.BaseSubscriber;
import com.example.administrator.steelbarattestation.exception.ApiException;
import com.example.administrator.steelbarattestation.utils.LogUtils;
import com.example.administrator.steelbarattestation.utils.NetworkUtil;


/**
 * Created by gaosheng on 2016/11/6.
 * 22:42
 * com.example.gaosheng.myapplication.subscriber
 */

public abstract class CommonSubscriber<T> extends BaseSubscriber<T> {

    private Context context;

    public CommonSubscriber(Context context) {
        this.context = context;
    }

    private static final String TAG = "CommonSubscriber";

    @Override
    public void onStart() {

        if (!NetworkUtil.isNetworkAvailable(context)) {
            LogUtils.e(TAG, "网络不可用");
        } else {
            LogUtils.e(TAG, "网络可用");
        }
    }



    @Override
    protected void onError(ApiException e) {
        LogUtils.e(TAG, "错误信息为 " + "code:" + e.code + "   message:" + e.message);
    }

    @Override
    public void onCompleted() {
        LogUtils.e(TAG, "成功了");
    }

}
