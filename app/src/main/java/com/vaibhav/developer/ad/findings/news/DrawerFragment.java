package com.vaibhav.developer.ad.findings.news;

/**
 * Created by Administrator on 05-05-2015.
 */
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.Toast;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.plus.Plus;
import com.google.android.gms.plus.model.people.Person;
import com.google.android.gms.common.SignInButton;
import com.neopixl.pixlui.components.textview.TextView;
import com.vaibhav.developer.ad.findings.MainActivity;
import com.vaibhav.developer.ad.findings.R;
import com.vaibhav.developer.ad.findings.books.BooksActivity;

import com.vaibhav.developer.ad.findings.resaerch.Research_Main;
import com.vaibhav.developer.ad.findings.resaerch.Test_Grid;
import com.vaibhav.developer.ad.findings.ui.Google_Plus_login;
import com.vaibhav.developer.ad.findings.ui.Google_Scholear;

import java.io.InputStream;

public class DrawerFragment extends Fragment  {

    private static final long DRAWER_SLIDE_DURATION_MS = 250;
    private static SignInButton signIn;
   private static final int RC_SIGN_IN = 0;

    // Google client to communicate with Google
    private GoogleApiClient mGoogleApiClient;
    private static final String TAG = "Google";
    private boolean mIntentInProgress;
    private boolean signedInUser;
    private ConnectionResult mConnectionResult;
    private static final int PROFILE_PIC_SIZE = 400;
    private boolean mRequestServerAuthCode = false;

    private static ImageView pro_pic;
    private static TextView user_name, user_email;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_drawer, container, false);

         



        view.findViewById(R.id.drawer_research).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(Test_Grid.class);
            }
        });




        view.findViewById(R.id.drawer_list).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(ListActivity.class);
            }
        });

        view.findViewById(R.id.drawer_books).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(BooksActivity.class);
            }
        });
        view.findViewById(R.id.drawer_google).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(Google_Scholear.class);
            }
        });

        view.findViewById(R.id.drawer_new).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(NewActivity.class);
            }
        });

        view.findViewById(R.id.drawer_show).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(ShowActivity.class);
            }
        });

        view.findViewById(R.id.drawer_ask).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(AskActivity.class);
            }
        });

        view.findViewById(R.id.drawer_job).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(JobsActivity.class);
            }
        });

        view.findViewById(R.id.drawer_settings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if ( Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                    navigate(ActionBarSettingsActivity.class);
                } else {
                    navigate(SettingsActivity.class);
                }
            }
        });
        view.findViewById(R.id.drawer_about).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(AboutActivity.class);
            }
        });
        view.findViewById(R.id.drawer_favorite).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigate(FavoriteActivity.class);
            }
        });
        return view;
    }

    private void navigate(final Class<? extends Activity> activityClass) {
        ((BaseActivity) getActivity()).closeDrawers();
        if (!getActivity().getClass().equals(activityClass)) {
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    final Intent intent = new Intent(getActivity(), activityClass);
                    getActivity().startActivity(intent);
                }
            }, DRAWER_SLIDE_DURATION_MS);
        }
    }


}

