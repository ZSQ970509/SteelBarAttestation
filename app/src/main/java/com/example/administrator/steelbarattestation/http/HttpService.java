package com.example.administrator.steelbarattestation.http;




import com.example.administrator.steelbarattestation.base.BaseHttpResult;
import com.example.administrator.steelbarattestation.bean.LoginBean;
import com.example.administrator.steelbarattestation.url.UrlHelper;

import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Streaming;
import retrofit2.http.Url;
import rx.Observable;

/**
 * Created by GaoSheng on 2016/9/13.
 * 网络请求的接口都在这里
 */

public interface HttpService {
    //获取banner
    //String url = "";

    @FormUrlEncoded
    @POST(UrlHelper.API.API+UrlHelper.API.Login)
    Observable<BaseHttpResult<LoginBean>> login(@Field("password") String passWord, @Field("account") String userName, @Field("imei") String imei);


}
