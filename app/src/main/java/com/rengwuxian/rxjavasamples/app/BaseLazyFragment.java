package com.rengwuxian.rxjavasamples.app;

import android.os.Bundle;

/**
 * Created by nhc on 2017/2/16.
 */

public abstract class BaseLazyFragment extends BaseFragment {
    protected boolean isViewInitialted;
    protected boolean isVisiableToUser;
    protected boolean isDataInitialted;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        isViewInitialted = true;
        prepareFetchData();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        this.isVisiableToUser = isVisibleToUser;
        prepareFetchData();
    }

    public boolean prepareFetchData(){
        return prepareFetchData(false);
    }
    public boolean prepareFetchData(boolean forceUpdate){
        if(isViewInitialted && isVisiableToUser &&(!isDataInitialted || forceUpdate)){
            fetchData();
            isDataInitialted = true;
            return true;
        }
        return false;
    }
    public abstract void fetchData();
}
