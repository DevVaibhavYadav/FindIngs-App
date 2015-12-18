package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.vaibhav.developer.ad.findings.R;

public abstract class TrackableActivity extends ActionBarActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if (Preferences.darkThemeEnabled(this)) {
            setTheme(R.style.AppTheme_Dark);
        }
        getTheme().applyStyle(Preferences.resolveTextSizeResId(this), true);
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        GoogleAnalytics.getInstance(this).reportActivityStart(this);
    }

    @Override
    protected void onStop() {
        GoogleAnalytics.getInstance(this).reportActivityStop(this);
        super.onStop();
    }
}
