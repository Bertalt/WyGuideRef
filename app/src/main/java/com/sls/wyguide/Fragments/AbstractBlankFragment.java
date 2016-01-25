package com.sls.wyguide.Fragments;

import android.support.v4.app.Fragment;

public abstract class AbstractBlankFragment extends Fragment {
    private String mTitle;

    public AbstractBlankFragment(String title){

        mTitle = title;

    }

    public String getTitle() {

        return mTitle;
    }
}
