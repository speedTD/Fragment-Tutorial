package com.developer.dinhduy.fragmenttutorial;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    SelectAdapter adapter;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     adapter=new SelectAdapter(getSupportFragmentManager());
     viewPager=(ViewPager) findViewById(R.id.viewPager);
     viewPager.setAdapter(adapter);
     tabLayout=(TabLayout) findViewById(R.id.tablayout) ;
     tabLayout.setupWithViewPager(viewPager);
    }
}
