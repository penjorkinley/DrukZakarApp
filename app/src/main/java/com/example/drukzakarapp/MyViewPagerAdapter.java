package com.example.drukzakarapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.drukzakarapp.Tab1_Fragments.Audio;
import com.example.drukzakarapp.Tab1_Fragments.Dzongkha;
import com.example.drukzakarapp.Tab1_Fragments.English;
import com.example.drukzakarapp.Tab1_Fragments.SelectDate;
import com.example.drukzakarapp.Tab2_Fragments.About_Us;
import com.example.drukzakarapp.Tab2_Fragments.Calender;
import com.example.drukzakarapp.Tab2_Fragments.Contact;
import com.example.drukzakarapp.Tab2_Fragments.Datho;
import com.example.drukzakarapp.Tab2_Fragments.Zakar;

public class MyViewPagerAdapter extends FragmentStateAdapter {
    public MyViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 1:
                return new Calender();
            case 2:
                return new Datho();
            case 3:
                return new About_Us();
            case 4:
                return new Contact();
            default:
                return new Zakar();
        }
    }

    @Override
    public int getItemCount () {
        return 5;
    }
}

