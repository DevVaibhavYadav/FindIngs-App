package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
import android.support.v4.app.Fragment;

import com.vaibhav.developer.ad.findings.news.data.ItemManager;

import javax.inject.Inject;
import javax.inject.Named;




public abstract class BaseStoriesActivity extends BaseListActivity {
    @Inject @Named(ActivityModule.HN)
    ItemManager mItemManager;

    protected abstract ItemManager.FetchMode getFetchMode();

    @Override
    protected Fragment instantiateListFragment() {
        return ListFragment.instantiate(this, mItemManager, getFetchMode().name());
    }

    @Override
    protected boolean isItemOptionsMenuVisible() {
        return mSelectedItem != null;
    }
}
