package com.sls.wyguide;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.sls.wyguide.adapter.TabsFragmentAdapter;


public class UserActivity extends FragmentActivity {

    private static final int LAYOUT = R.layout.activity_main;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle toggle;
    private ViewPager viewPager;
    private Toolbar toolbar;

    public static FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar();
        initNavigationView();
        initTabs();
        fragmentManager = getSupportFragmentManager();
    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
        toolbar.setTitleTextColor(getResources().getColor(R.color.colorBackground));
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });

       // toolbar.inflateMenu(R.menu.menu);
    }

    private void initNavigationView() {
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        toggle = new ActionBarDrawerToggle(
                this,
                mDrawerLayout,
                toolbar,
                R.string.drawer_open,
                R.string.drawer_close);

        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation);
        navigationView.setNavigationItemSelectedListener( new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(MenuItem item) {

                mDrawerLayout.closeDrawers();
                switch (item.getItemId()){
                    case R.id.menu_item_settings:
                    {
                        viewPager.setCurrentItem(Constants.TAB_NUMBER_SETTINGS);
                        break;
                    }
                    case R.id.menu_item_map:
                    {
                        Intent map_activity = new Intent(getApplicationContext(), MapsActivity.class);
                        startActivity(map_activity);
                        break;
                    }

                }
                return true;
            }
        });
        toggle.setDrawerIndicatorEnabled(true);


    }

    private void initTabs() {

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        TabsFragmentAdapter tabAdapter = new TabsFragmentAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }


}
