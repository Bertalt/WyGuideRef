package com.sls.wyguide;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.sls.wyguide.adapter.TabsPagerFragmentAdapter;


public class UserActivity extends AppCompatActivity {

    private static final int LAYOUT = R.layout.activity_main;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle toggle;
    private ViewPager viewPager;
    private Toolbar toolbar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(LAYOUT);
        initToolbar();
        initNavigationView();
        initTabs();

    }

    private void initToolbar() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.app_name);
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
                    case R.id.menu_item_map:
                    {
                         viewPager.setCurrentItem(Constants.TAB_NUMBER_MAP);
                    }

                }
                return true;
            }
        });
        toggle.setDrawerIndicatorEnabled(true);


    }

    private void initTabs() {

        viewPager = (ViewPager) findViewById(R.id.viewPager);

        TabsPagerFragmentAdapter tabAdapter = new TabsPagerFragmentAdapter(this,getSupportFragmentManager());
        viewPager.setAdapter(tabAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);


    }


}
