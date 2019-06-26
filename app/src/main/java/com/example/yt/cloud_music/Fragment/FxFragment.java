package com.example.yt.cloud_music.Fragment;


import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.yt.cloud_music.Adapter.ViewAdapter;
import com.example.yt.cloud_music.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/**
 * A simple {@link Fragment} subclass.
 */
public class FxFragment extends Fragment {
    private ViewPager viewPager;
    private ViewAdapter viewAdapter;
    private List<ImageView> mlist;
//    private Integer[] img = { R.drawable.a1, R.drawable.a2,R.drawable.a3, R.drawable.a4,R.drawable.a5, R.drawable.a6,R.drawable.a7, R.drawable.a8};
    private Integer[] img = {R.drawable.a1, R.drawable.a2,R.drawable.a3, R.drawable.a4,R.drawable.a5, R.drawable.a6,R.drawable.a7, R.drawable.a8};

    public FxFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_fx, container, false);
        init();
        Th();
        return view;

    }

    private void Th() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                  for (int i=0;i<img.length;i++){
                    ImageView iv=new ImageView(getActivity());
                    iv.setImageResource(img[i]);
                    iv.setScaleType(ImageView.ScaleType.FIT_XY);
                    mlist.add(iv);
                }
                 viewPager=(ViewPager)getActivity().findViewById(R.id.vp);
                  viewAdapter=new ViewAdapter(mlist);
                  viewPager.setAdapter(viewAdapter);


                //通过定时器，制作自动划动效果

            }
        }).start();
    }
    private void init() {
        mlist=new ArrayList<ImageView>();


    }

}
