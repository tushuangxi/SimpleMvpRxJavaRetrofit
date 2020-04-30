package com.lding.tshyserial.simplemvprxjavaretrofit.application;

import android.content.Context;

/**
 * Created by tushuangxi 2019.1.26
 */
public class AppProfile {
    private static AppProfile appProfile = null;
    public static Context context;

    private AppProfile(Context context) {
        AppProfile.context = context;
    }

    public static AppProfile getAppProfile(Context context) {
        if (appProfile == null) {
            synchronized (AppProfile.class) {
                if (appProfile == null) {
                    appProfile = new AppProfile(context);
                }
            }
        }
        return appProfile;
    }

    public static void exit() {
        System.exit(0);
    }

    public void init() {
        // TODO
    }

    public void onTerminate() {
        // TODO
    }

    public void onLowMemory() {
        // TODO
    }
}
