package com.sls.wyguide.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.sls.wyguide.Constants;
import com.sls.wyguide.Fragments.MapFragment;
import com.sls.wyguide.R;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by bertalt on 22.01.16.
 */
public class TabsPagerFragmentAdapter extends FragmentPagerAdapter{

    private Map<Integer,String>mTabs = new HashMap<>();
    private Context mCtx;

    public TabsPagerFragmentAdapter(Context ctx,FragmentManager fm) {
        super(fm);
        mCtx = ctx;

        mTabs.put((int) Constants.TAB_NUMBER_MAP, mCtx.getString(R.string.menu_item_map));

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
        return mTabs.get(position);
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }
}
