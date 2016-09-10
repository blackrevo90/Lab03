package com.example.apple.welcomepage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class WelcomeActivity extends AppCompatActivity {

    private Button btNext,btSkip;
    private SmartTabLayout indicator;
    private ViewPager pager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        btNext = (Button) findViewById(R.id.btNext);
        btSkip = (Button) findViewById(R.id.btSkip);
        indicator = (SmartTabLayout) findViewById(R.id.indicator);
        pager = (ViewPager) findViewById(R.id.pager);

        FragmentPagerAdapter adapter = new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return null;
            }

            @Override
            public int getCount() {
                return 0;
            }
        };
    }
}
