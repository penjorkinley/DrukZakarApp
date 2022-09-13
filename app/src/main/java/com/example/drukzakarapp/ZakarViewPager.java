package com.example.drukzakarapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.drukzakarapp.Tab1_Fragments.Audio;
import com.example.drukzakarapp.Tab1_Fragments.Dzongkha;
import com.example.drukzakarapp.Tab1_Fragments.English;
import com.example.drukzakarapp.Tab1_Fragments.SelectDate;
import com.example.drukzakarapp.Tab2_Fragments.Zakar;

public class ZakarViewPager extends FragmentStateAdapter {
    public ZakarViewPager(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    public ZakarViewPager(Zakar zakar) {
        super(zakar);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 1:
                return new Dzongkha();
            case 2:
                return new English();
            case 3:
                return new Audio();
            default:
                return new SelectDate();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
