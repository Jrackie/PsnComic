package com.jrackie.psncomic.apps.homepage;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

import com.jrackie.psncomic.R;

/**
 * Created by Administrator on 2017/6/19.
 */

public class NaviActivity extends BaseActivity {
    private ViewPager vp_content;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_navi);
        initView();
    }

    private void initView() {
        vp_content = (ViewPager) findViewById(R.id.vp_navi);
    }

    private void fillContent() {

    }
}
