package com.lding.tshyserial.simplemvprxjavaretrofit.application;

import android.app.Application;

/**
 * Created by tushuangxi 2019.1.26
 */
public class PadApplication extends Application {
    private AppProfile appProfile;
    private static final String TAG = "PadApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        appProfile = AppProfile.getAppProfile(getApplicationContext());
        appProfile.init();

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        if (appProfile != null) {
            appProfile.onTerminate();
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        if (appProfile != null) {
            appProfile.onLowMemory();
        }
    }
}
