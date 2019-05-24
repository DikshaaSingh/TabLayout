package com.example.tablayout;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
private TabLayout tabLayout;
private AppBarLayout appBarLayout;
private ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout) findViewById(R.id.tabb);
        appBarLayout=(AppBarLayout) findViewById(R.id.appbar);
        viewPager=(ViewPager) findViewById(R.id.viewpager);
        ViewPageAdapter adapter=new ViewPageAdapter(getSupportFragmentManager());
        //Adding Fragments
        adapter.AddFragment(new quizFragment(),"Quiz");
        adapter.AddFragment(new exploreFragment(),"Explore");
        adapter.AddFragment(new storeFragment(),"Store");
        //adapter setup
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}
