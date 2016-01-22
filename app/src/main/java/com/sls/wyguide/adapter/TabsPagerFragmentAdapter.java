package com.sls.wyguide.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sls.wyguide.Fragments.MapFragment;

/**
 * Created by bertalt on 22.01.16.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private String[]tabs;

    public TabsPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs=new String[] {
                "Карта" , "Настройки"
        };
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {

            case 0:
            {
               return MapFragment.newInstance();

            }
            case 1:
            {
                return MapFragment.newInstance();

            }
        }
        return MapFragment.newInstance();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }

    @Override
    public int getCount() {
        return tabs.length;
    }
}
