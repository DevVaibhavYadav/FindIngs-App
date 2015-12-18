package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
public interface ItemObserver {
    /**
     * Fired when number of item's kids has been updated
     * @param kidCount  number of item's kids
     */
    void onKidChanged(int kidCount);
}
