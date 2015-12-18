package com.vaibhav.developer.ad.fab;
import android.content.Context;

/**
 * Contains utility methods for metrics conversion
 *
 * @author Vladislav
 * @version 1.0.0
 * @since 1.0.0
 */
public final class MetricsConverter {


    private MetricsConverter() {
    }

    /**
     * Converts the density-independent value into real pixel value based on display metrics
     *
     * @param context application context
     * @param dp density-independent value
     * @return converted real pixel value
     */
    public static float dpToPx(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return dp * scale;
    }

}
