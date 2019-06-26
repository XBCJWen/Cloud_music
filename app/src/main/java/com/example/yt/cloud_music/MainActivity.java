package com.example.yt.cloud_music;

import android.annotation.SuppressLint;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TabHost;

import com.example.yt.cloud_music.Fragment.FxFragment;
import com.example.yt.cloud_music.Fragment.MeFragment;
import com.example.yt.cloud_music.Fragment.VideoFragment;
import com.example.yt.cloud_music.Fragment.YcFragment;

public class MainActivity extends AppCompatActivity {


    private TabHost tabHost;
    private DrawerLayout drawerLayout;
    private ImageButton btn_drawer;
    private MeFragment MeFr;
    private FxFragment FxFr;
    private YcFragment YcFr;
    private VideoFragment VideoFr;

    private android.support.v4.app.FragmentManager fM;
    private android.support.v4.app.FragmentTransaction fT;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        addlayout();
        setOn();

    }

    private void addlayout() {
        tabHost.setup();
        tabHost.addTab(tabHost.newTabSpec("tab1").setIndicator("我的",null).setContent(R.id.f_me));
        tabHost.addTab(tabHost.newTabSpec("tab2").setIndicator("发现",null).setContent(R.id.f_fx));
        tabHost.addTab(tabHost.newTabSpec("tab3").setIndicator("云村",null).setContent(R.id.f_yc));
        tabHost.addTab(tabHost.newTabSpec("tab4").setIndicator("视频",null).setContent(R.id.f_video));

        MeFr= new MeFragment();
        fM=getSupportFragmentManager();
        fT=fM.beginTransaction();
        fT.replace(R.id.f_me,MeFr);
        fT.commit();

        FxFr= new FxFragment();
        fM=getSupportFragmentManager();
        fT=fM.beginTransaction();
        fT.replace(R.id.f_fx,FxFr);
        fT.commit();

        YcFr= new YcFragment();
        fM=getSupportFragmentManager();
        fT=fM.beginTransaction();
        fT.replace(R.id.f_yc,YcFr);
        fT.commit();

        VideoFr= new VideoFragment();
        fM=getSupportFragmentManager();
        fT=fM.beginTransaction();
        fT.replace(R.id.f_video,VideoFr);
        fT.commit();
    }

    private void setOn() {
        btn_drawer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout.openDrawer(Gravity.LEFT);
            }
        });
    }

    @SuppressLint("WrongViewCast")
    private void init() {
        tabHost=(TabHost)findViewById(android.R.id.tabhost);
        btn_drawer=(ImageButton)findViewById(R.id.imgBtn_Drawer);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);




    }
}
