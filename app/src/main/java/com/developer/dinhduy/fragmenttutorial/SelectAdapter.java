package com.developer.dinhduy.fragmenttutorial;

import android.app.FragmentManager;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

public class SelectAdapter extends FragmentPagerAdapter {


    public SelectAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: Fragment1 fragment1=new Fragment1();
            return fragment1;
            case 1: Fragment2 fragment2=new Fragment2();
                return fragment2;
            case 2: Fragment3 fragment3=new Fragment3();
                return fragment3;
                default: return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0: return  "Fragment 1";
            case 1: return  "Fragment 2";
            case 2: return  "Fragmennt 3";
            default: return null;
        }
    }
}
