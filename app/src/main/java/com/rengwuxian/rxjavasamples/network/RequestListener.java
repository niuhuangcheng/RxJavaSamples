package com.rengwuxian.rxjavasamples.network;

/**
 * Created by nhc on 2017/2/21.
 */

public interface RequestListener<T> {
    public void onStart();
    public void onProgress(String url,int total,int progress);
    public void onSuccess(String id, T object);
    public void onFailure(String id,int code,String str,Object obj);
    public void onEnd();
}
