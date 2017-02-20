package com.rengwuxian.rxjavasamples.app;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.rengwuxian.rxjavasamples.R;
import com.rengwuxian.rxjavasamples.module.cache_6.CacheFragment;
import com.rengwuxian.rxjavasamples.module.elementary_1.ElementaryFragment;
import com.rengwuxian.rxjavasamples.module.map_2.MapFragment;
import com.rengwuxian.rxjavasamples.module.token_4.TokenFragment;
import com.rengwuxian.rxjavasamples.module.token_advanced_5.TokenAdvancedFragment;
import com.rengwuxian.rxjavasamples.module.zip_3.ZipFragment;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @Bind(android.R.id.tabs) TabLayout tabLayout;
    @Bind(R.id.viewPager) ViewPager viewPager;
    @Bind(R.id.toolBar) Toolbar toolBar;
    MyFragmentAdatper myFragmentAdatper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolBar);
        myFragmentAdatper = new MyFragmentAdatper(getSupportFragmentManager());
        myFragmentAdatper.addFragment(new ElementaryFragment(),getString(R.string.title_elementary));
        myFragmentAdatper.addFragment(new MapFragment(),getString(R.string.title_map));
        myFragmentAdatper.addFragment(new ZipFragment(),getString(R.string.title_zip));
        myFragmentAdatper.addFragment(new TokenFragment(),getString(R.string.title_token));
        myFragmentAdatper.addFragment(new TokenAdvancedFragment(),getString(R.string.title_token_advanced));
        myFragmentAdatper.addFragment(new CacheFragment(),getString(R.string.title_cache));
        viewPager.setAdapter(myFragmentAdatper);
        tabLayout.setupWithViewPager(viewPager);
    }
    class MyFragmentAdatper extends android.support.v4.app.FragmentPagerAdapter {
        MyFragmentAdatper(FragmentManager fragmentManager){
            super(fragmentManager);
        }
        List<android.support.v4.app.Fragment> fragmentList = new ArrayList<android.support.v4.app.Fragment>();
        List<String> fragmentTitleList = new ArrayList<String>();
        public void addFragment(Fragment fragment, String fragmentTitle){
            fragmentList.add(fragment);
            fragmentTitleList.add(fragmentTitle);
        }
        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitleList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }
    }
}