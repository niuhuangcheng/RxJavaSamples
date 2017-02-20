package com.rengwuxian.rxjavasamples.app;

import android.util.Log;

import com.tencent.tinker.loader.app.TinkerApplication;

/**
 *
 * Generated application for tinker life cycle
 *
 */
public class SampleApplication extends TinkerApplication {
    private static final String TAG = "SampleApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.e(TAG,"classLoader->"+getClass().getClassLoader());
    }

    public SampleApplication() {
        super(7, "com.rengwuxian.rxjavasamples.app.App", "com.tencent.tinker.loader.TinkerLoader", false);
    }

}