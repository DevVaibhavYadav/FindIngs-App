package com.vaibhav.developer.ad.fab;

/**
 * Created by Administrator on 23-04-2015.
 */
import android.annotation.TargetApi;
import android.graphics.Outline;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;

/**
 * An implementation of the {@link android.view.ViewOutlineProvider}
 * for <b>Action Button</b>
 *
 * Used for drawing the elevation shadow for {@code API 21 Lollipop} and higher
 *
 * @author Vladislav
 * @version 1.0.0
 * @since 1.0.0
 */
@TargetApi(Build.VERSION_CODES.LOLLIPOP)
class ActionButtonOutlineProvider extends ViewOutlineProvider {

    /**
     * Outline provider width
     */
    private int width;

    /**
     * Outline provider height
     */
    private int height;

    /**
     * Creates an instance of the {@link com.vaibhav.developer.ad.fab.ActionButtonOutlineProvider}
     *
     * @param width initial outline provider width
     * @param height initial outline provider height
     */
    ActionButtonOutlineProvider(int width, int height) {
        this.width = width;
        this.height = height;
    }

    /**
     * Called to get the provider to populate the Outline. This method will be called by a View
     * when its owned Drawables are invalidated, when the View's size changes, or if invalidateOutline()
     * is called explicitly. The input outline is empty and has an alpha of 1.0f
     *
     * @param view a view, which builds the outline
     * @param outline an empty outline, which is to be populated
     */
    @Override
    public void getOutline(View view, Outline outline) {
        outline.setOval(0, 0, width, height);
    }

}
