package com.glf.rxjavademo;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.glf.rxjavademo.model.Api;
import com.glf.rxjavademo.fragment.HomeFragment;
import com.glf.rxjavademo.fragment.NormalFragment;
import com.glf.rxjavademo.fragment.RedPacketFragment;
import com.glf.rxjavademo.fragment.SearchFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Api api;

    @BindView(R.id.main_navigation)
    public BottomNavigationView mainNavigation;

    private HomeFragment homeFragment;
    private NormalFragment normalFragment;
    private RedPacketFragment redPacketFragment;
    private SearchFragment searchFragment;

    private FragmentManager fragmentManager;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        fragmentManager = getSupportFragmentManager();

        initLister();
        initFragment();

    }

    private void initFragment() {
        homeFragment = new HomeFragment();
        normalFragment = new NormalFragment();
        redPacketFragment = new RedPacketFragment();
        searchFragment = new SearchFragment();
        initView(homeFragment);
    }

    private void initLister() {
        mainNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.home) {
                    initView(homeFragment);
                } else if (item.getItemId() == R.id.selected) {
                    initView(normalFragment);
                } else if (item.getItemId() == R.id.red_packet) {
                    initView(redPacketFragment);
                } else if (item.getItemId() == R.id.search) {
                    initView(searchFragment);
                }
                return true;
            }
        });
    }

    private void initView(Fragment fragment) {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.main_pager_content, fragment);
        fragmentTransaction.commit();
    }

}
