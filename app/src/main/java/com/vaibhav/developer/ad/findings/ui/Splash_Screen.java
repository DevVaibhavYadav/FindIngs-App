package com.vaibhav.developer.ad.findings.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import com.vaibhav.developer.ad.findings.R;
import com.vaibhav.developer.ad.findings.news.ListActivity;
import com.vaibhav.developer.ad.wave_text_vai.Titanic;
import com.vaibhav.developer.ad.wave_text_vai.TitanicTextView;

public class Splash_Screen extends Activity {

    private static int SPLASH_TIMER = 10500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);




        TitanicTextView txt = (TitanicTextView) findViewById(R.id.floting_txt);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Satisfy-Regular.ttf");

        txt.setTypeface(custom_font);
        Titanic vaibhav = new Titanic();
        vaibhav.start(txt);

        vaibhav.cancel();

        SharedPreferences wmbPreference= PreferenceManager.getDefaultSharedPreferences(this);
        boolean isFirstRun=wmbPreference.getBoolean("FIRST_RUN", true);

        if(isFirstRun)
        {





            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    Intent i = new Intent(Splash_Screen.this, Google_Plus_login.class);
                    startActivity(i);
                    finish();

                }
            }, SPLASH_TIMER);
            SharedPreferences.Editor editor=wmbPreference.edit();
            editor.putBoolean("FIRST_RUN", false);
            editor.commit();


        }

        else{
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {


                    Intent i = new Intent(Splash_Screen.this, ListActivity.class);
                    startActivity(i);
                    finish();

                }
            }, SPLASH_TIMER);




        }
    }}