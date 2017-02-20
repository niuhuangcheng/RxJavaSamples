// (c)2016 Flipboard Inc, All Rights Reserved.

package com.rengwuxian.rxjavasamples.app;

import android.app.AlertDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.rengwuxian.rxjavasamples.R;

import butterknife.OnClick;
import rx.Subscription;

public abstract class BaseFragment extends Fragment {
    private static String TAG = "BaseFragment";
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG,"classLoader->"+getClass().getClassLoader());
    }

    protected Subscription subscription;
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unsubscribe();
    }

    protected void unsubscribe() {
        if (subscription != null && !subscription.isUnsubscribed()) {
            subscription.unsubscribe();
        }
    }


}
