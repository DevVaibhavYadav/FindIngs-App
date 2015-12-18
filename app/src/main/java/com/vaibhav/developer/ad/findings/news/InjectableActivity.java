package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
import android.os.Bundle;

import com.vaibhav.developer.ad.findings.books.AppController;

import dagger.ObjectGraph;

public abstract class InjectableActivity extends TrackableActivity implements Injectable {
    private ObjectGraph mActivityGraph;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityGraph = ((AppController) getApplication()).getApplicationGraph()
                .plus(new ActivityModule(this));
        mActivityGraph.inject(this);
    }

    @Override
    protected void onDestroy() {
        mActivityGraph = null;
        super.onDestroy();
    }

    @Override
    public void inject(Object object) {
        mActivityGraph.inject(object);
    }
}

