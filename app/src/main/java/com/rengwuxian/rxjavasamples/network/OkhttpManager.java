package com.rengwuxian.rxjavasamples.network;

import okhttp3.OkHttpClient;

/**
 * Created by Administrator on 2017/2/21.
 */

public class OkhttpManager {
    private static OkhttpManager okhttpManager;
    private OkHttpClient okHttpClient;
    private OkhttpManager(){}
    public static  OkhttpManager getInstance(){
        if(okhttpManager==null){
            synchronized (OkhttpManager.class){
                if(okhttpManager==null){
                    okhttpManager = new OkhttpManager();
                    okhttpManager.initOkClient();
                }
            }
        }
        return okhttpManager;
    }
    private void initOkClient(){
        okHttpClient = new OkHttpClient();
    }




}
