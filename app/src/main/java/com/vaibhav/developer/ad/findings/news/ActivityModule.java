package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
import android.content.Context;

import com.vaibhav.developer.ad.findings.news.data.AlgoliaClient;
import com.vaibhav.developer.ad.findings.news.data.FavoriteManager;
import com.vaibhav.developer.ad.findings.news.data.HackerNewsClient;
import com.vaibhav.developer.ad.findings.news.data.ItemManager;
import com.vaibhav.developer.ad.findings.news.data.RestServiceFactory;
import com.vaibhav.developer.ad.findings.news.data.SessionManager;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


@Module(
        injects = {
                ActionBarSettingsActivity.class, // TODO remove
                AboutActivity.class, // TODO remove
                AskActivity.class,
                FavoriteActivity.class,
                ItemActivity.class,
                JobsActivity.class,
                ListActivity.class,
                NewActivity.class,
                SearchActivity.class,
                ShowActivity.class,
                WebActivity.class,
                FavoriteFragment.class,
                ItemFragment.class,
                ListFragment.class,
                WebFragment.class
        },
        library = true
)
public class ActivityModule {
    public static final String ALGOLIA = "algolia";
    public static final String HN = "hn";

    private final Context mContext;

    public ActivityModule(Context context) {
        mContext = context;
    }

    @Provides @Singleton
    public Context provideContext() {
        return mContext;
    }

    @Provides @Singleton @Named(HN)
    public ItemManager provideHackerNewsClient(HackerNewsClient client) {
        return client;
    }

    @Provides @Singleton @Named(ALGOLIA)
    public ItemManager provideAlgoliaClient(AlgoliaClient client) {
        return client;
    }

    @Provides @Singleton
    public FavoriteManager provideFavoriteManager() {
        return new FavoriteManager();
    }

    @Provides @Singleton
    public SessionManager provideSessionManager() {
        return new SessionManager();
    }

    @Provides @Singleton
    public RestServiceFactory provideRestServiceFactory(Context context) {
        return new RestServiceFactory.Impl(context);
    }

    @Provides @Singleton
    public ActionViewResolver provideActionViewResolver() {
        return new ActionViewResolver();
    }
}

