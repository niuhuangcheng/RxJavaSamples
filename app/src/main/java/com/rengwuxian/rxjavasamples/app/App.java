// (c)2016 Flipboard Inc, All Rights Reserved.

package com.rengwuxian.rxjavasamples.app;

import android.app.Application;
import android.content.Intent;

import com.tencent.tinker.loader.app.TinkerApplication;

public class App extends SampleApplicationLike {
    private static App INSTANCE;

    public App(Application application,
                                 int tinkerFlags,
                                 boolean tinkerLoadVerifyFlag,
                                 long applicationStartElapsedTime,
                                 long applicationStartMillisTime,
                                 Intent tinkerResultIntent
    ) {
        super(
                application,
                tinkerFlags,
                tinkerLoadVerifyFlag,
                applicationStartElapsedTime,
                applicationStartMillisTime,
                tinkerResultIntent
        );
    }
    public static App getInstance() {
        return INSTANCE;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
    }
}
