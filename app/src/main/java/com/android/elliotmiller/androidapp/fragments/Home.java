package com.android.elliotmiller.androidapp.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.elliotmiller.androidapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Home#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Home extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String PARAM_NAME = "param_name";
    private static final String PARAM_EMAIL = "param_email";

    private String name;
    private String email;


    public Home() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @param email User email
     * @param name User name
     *
     * @return A new instance of fragment Home.
     */
    public static Home newInstance(String name, String email) {
        Home fragment = new Home();
        Bundle args = new Bundle();
        args.putString(PARAM_NAME, name);
        args.putString(PARAM_EMAIL, email);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(PARAM_NAME);
            email = getArguments().getString(PARAM_EMAIL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ((TextView)view.findViewById(R.id.tv_name)).setText(this.name);
        ((TextView)view.findViewById(R.id.tv_email)).setText(this.email);
        return view;
    }

}
