package com.example.bornittah.mbararacmarketapplication.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.bornittah.mbararacmarketapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Home_Page extends Fragment {


    public Home_Page() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home__page, container, false);
    }

}
