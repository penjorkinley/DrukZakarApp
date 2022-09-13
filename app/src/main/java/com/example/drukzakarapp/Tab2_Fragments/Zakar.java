package com.example.drukzakarapp.Tab2_Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.drukzakarapp.R;
import com.example.drukzakarapp.ZakarViewPager;
import com.google.android.material.tabs.TabLayout;

public class Zakar extends Fragment {
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    View zakarFragment;
    ZakarViewPager myViewPagerAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        zakarFragment = inflater.inflate(R.layout.fragment_zakar, container, false);
        tabLayout =zakarFragment.findViewById(R.id.tabLayout1);
        viewPager2 = zakarFragment.findViewById(R.id.viewPager2);
        myViewPagerAdapter = new ZakarViewPager(Zakar.this);
        viewPager2.setAdapter(myViewPagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                tabLayout.getTabAt(position).select();
            }
        });
        return zakarFragment;
    }
}