package com.vaibhav.developer.ad.findings.news.preference;

/**
 * Created by Administrator on 05-05-2015.
 */
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

import com.vaibhav.developer.ad.findings.news.AppUtils;


public class CheckBoxPreference extends android.preference.CheckBoxPreference {

    public CheckBoxPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CheckBoxPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CheckBoxPreference(Context context) {
        super(context);
    }

    @Override
    protected void onBindView(View view) {
        super.onBindView(view);
        final TextView title = (TextView) view.findViewById(android.R.id.title);
        title.setTextColor(getContext().getResources().getColor(AppUtils.getThemedResId(
                getContext(), android.R.attr.textColorPrimaryInverse)));
        title.setEllipsize(null);
        title.setSingleLine(false);
    }
}
