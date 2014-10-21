package com.example.rdominguez.testanalytics;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Tracker;

/**
 * Created by rdominguez on 21/10/2014.
 */
public class GoogleAnalyticsHelper{
    public enum CategoryType {
        PERSONALITZACIO_EDIT,
        PERSONALITZACIO_ADD,
        ACCES_SERVEI,
        CONFIGURACIO,
        ACCES_AVIS,
        ACCES_INFORMACIO
    }

    public static void stopActivityTracking(Activity activity) {
        EasyTracker.getInstance()
                .activityStop(activity);
    }

    public static void startActivityTracking(Activity activity) {
        EasyTracker.getInstance()
                .activityStart(activity);
    }


    public static void trackScreen(Context context, String screen){
        EasyTracker.getInstance().setContext(context);
        EasyTracker.getTracker().trackView(screen);
    }

    public static void trackEvent(Context context, CategoryType category, String action, String label, Long value) {
        EasyTracker tracker = EasyTracker.getInstance();
        tracker.setContext(context);
        EasyTracker.getTracker()
                .trackEvent(category.toString(), action, label, value);

        Log.d("ANALYTICS", "TRACK EVENT.");
    }

    public static void trackSocial(String network, String action, String target) {
        Tracker tracker = EasyTracker.getTracker();
        tracker.trackSocial(network, action, target);
    }
}
