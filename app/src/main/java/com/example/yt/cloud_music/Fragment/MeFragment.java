package com.example.yt.cloud_music.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.yt.cloud_music.Adapter.ReAdapter;
import com.example.yt.cloud_music.R;
import com.example.yt.cloud_music.bean.IcBean;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class MeFragment extends Fragment {

    private List<IcBean> mlist=new ArrayList<>();
    public MeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_me, container, false);
        initIcbens();

        th();
        return  view;
    }

    private void th() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                RecyclerView recyclerView=(RecyclerView)getActivity().findViewById(R.id.recyclerview);
                LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getActivity());
                linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                recyclerView.setLayoutManager(linearLayoutManager);
                ReAdapter adapter=new ReAdapter(mlist);
                recyclerView.setAdapter(adapter);
            }
        }).start();
    }


    private void initIcbens() {
        for (int i = 0; i<2; i++){
           IcBean  fm = new IcBean("私人FM", R.drawable.fn);
            mlist.add(fm);
            IcBean dian = new IcBean("最新电竞", R.drawable.dian);
            mlist.add(dian);
            IcBean sa = new IcBean("Sati空间", R.drawable.sa);
            mlist.add(sa);
            IcBean cang = new IcBean("私藏推荐", R.drawable.cang);
            mlist.add(cang);
            IcBean qin = new IcBean("亲子频道", R.drawable.qin);
            mlist.add(qin);
            IcBean you = new IcBean("因乐交友", R.drawable.you);
            mlist.add(you);
            IcBean run = new IcBean("跑步FM", R.drawable.run);
            mlist.add(run);

        }

    }


}
