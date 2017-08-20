package com.android.elliotmiller.androidapp.activities;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.android.elliotmiller.androidapp.R;
import com.android.elliotmiller.androidapp.fragments.Home;

public class MainActivity extends AppCompatActivity implements Home.HomeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            FragmentTransaction ft = getFragmentTransaction();
            ft.add(R.id.root_layout, Home.newInstance());
            ft.commit();
        }
    }

    @Override
    public void onSubmitCredentials(String name, String email) {
        Log.d(getClass().getSimpleName(), "Submit -> name: " + name + " email: " + email);
    }

    private FragmentTransaction getFragmentTransaction() {
        return getSupportFragmentManager().beginTransaction();
    }
}
