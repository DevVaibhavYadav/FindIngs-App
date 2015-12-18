package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
import android.support.v4.view.MenuItemCompat;
import android.view.MenuItem;
import android.view.View;

/**
 * Injectable utility to resolve action view for menu items
 */
public class ActionViewResolver {
    /**
     * Returns the currently set action view for this menu item.
     *
     * @param menuItem the item to query
     * @return This item's action view
     */
    public View getActionView(MenuItem menuItem) {
        return MenuItemCompat.getActionView(menuItem);
    }
}
