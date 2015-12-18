package com.vaibhav.developer.ad.findings.news;

import com.vaibhav.developer.ad.findings.R;
import com.vaibhav.developer.ad.findings.news.data.ItemManager;

/**
 * Created by Administrator on 05-05-2015.
 */


public class JobsActivity extends BaseStoriesActivity {

    @Override
    protected String getDefaultTitle() {
        return getString(R.string.title_activity_jobs);
    }

    @Override
    protected ItemManager.FetchMode getFetchMode() {
        return ItemManager.FetchMode.jobs;
    }

}
