package com.sls.wyguide.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.sls.wyguide.Constants;
import com.sls.wyguide.Fragments.AbstractBlankFragment;
import com.sls.wyguide.Fragments.BlankFragment;
import com.sls.wyguide.Fragments.SettingsFragment;
import com.sls.wyguide.R;

import java.util.HashMap;
import java.util.Map;


public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractBlankFragment>mTabs = new HashMap<>();
    private Context mCtx;

    public TabsFragmentAdapter(Context ctx,FragmentManager fm) {
        super(fm);
        mCtx = ctx;
        mTabs.put((int) Constants.TAB_NUMBER_MAP,
                                    new SettingsFragment(mCtx.getString(R.string.menu_item_settings)));
        mTabs.put((int) Constants.TAB_NUMBER_SETTINGS,
                                    new BlankFragment(mCtx.getString(R.string.menu_item_map)));


    }

    @Override
    public Fragment getItem(int position) {

        return mTabs.get(position);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        return mTabs.size();
    }
}
