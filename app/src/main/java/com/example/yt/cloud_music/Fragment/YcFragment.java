package com.example.yt.cloud_music.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yt.cloud_music.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class YcFragment extends Fragment {


    public YcFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_yc, container, false);
        return view;
    }

}
