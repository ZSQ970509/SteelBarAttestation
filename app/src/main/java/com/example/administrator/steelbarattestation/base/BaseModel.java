package com.example.administrator.steelbarattestation.base;


import com.example.administrator.steelbarattestation.http.Http;
import com.example.administrator.steelbarattestation.http.HttpService;
import com.example.administrator.steelbarattestation.mvp.IModel;

/**
 * Created by gaosheng on 2016/12/1.
 * 23:13
 * com.example.gs.mvpdemo.base
 */

public class BaseModel implements IModel {
    protected static HttpService httpService;

    //初始化httpService
    static {
        httpService = Http.getHttpService();
    }

}
