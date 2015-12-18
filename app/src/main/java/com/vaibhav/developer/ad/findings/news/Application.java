package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Logger;
import com.vaibhav.developer.ad.findings.R;

import dagger.ObjectGraph;

public class Application extends android.app.Application {
    private ObjectGraph mApplicationGraph;

    @Override
    public void onCreate() {
        super.onCreate();
        if (getResources().getBoolean(R.bool.debug)) {
            GoogleAnalytics.getInstance(this).getLogger().setLogLevel(Logger.LogLevel.VERBOSE);
            GoogleAnalytics.getInstance(this).setDryRun(true);
        }
        GoogleAnalytics.getInstance(this).newTracker(R.xml.ga_config);
        mApplicationGraph = ObjectGraph.create();
        Preferences.migrate(this);
    }

    public ObjectGraph getApplicationGraph() {
        return mApplicationGraph;
    }
}

