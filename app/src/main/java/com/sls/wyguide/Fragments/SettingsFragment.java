package com.sls.wyguide.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.preference.Preference;
import android.preference.PreferenceFragment;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sls.wyguide.R;

import java.util.Set;

/**
 * Created by bertalt on 22.01.16.
 */
public class SettingsFragment extends AbstractBlankFragment {


    public SettingsFragment(String title) {
        super(title);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_db_list, container, false);

    }
}
