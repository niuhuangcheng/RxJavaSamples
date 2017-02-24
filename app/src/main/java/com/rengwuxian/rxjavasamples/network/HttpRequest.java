package com.rengwuxian.rxjavasamples.network;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nhc on 2017/2/21.
 */

public class HttpRequest {
    private List<HttpParam> paramList = new ArrayList<HttpParam>();
    private String requestUrl;
//    private String
    public HttpRequest(String requestUrl){
        this.requestUrl = requestUrl;
    }

    public void addHttpHeader(HttpParam httpParam){
        if(httpParam!=null){
            paramList.add(httpParam);
        }
    }
    public void addHttpHeaders(List<HttpParam> params){
        if(params!=null){
            paramList.addAll(params);
        }
    }



}
