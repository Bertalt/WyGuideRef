package com.sls.wyguide.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sls.wyguide.R;

/**
 * Created by bertalt on 22.01.16.
 */
public class BlankFragment extends AbstractBlankFragment{


    public BlankFragment(String title) {
        super(title);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_db_list, container, false);

    }

}
