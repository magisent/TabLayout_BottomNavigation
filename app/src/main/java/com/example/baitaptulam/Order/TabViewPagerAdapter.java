package com.example.baitaptulam.Order;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabViewPagerAdapter extends FragmentStateAdapter {
    public TabViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch(position){
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            case 2:
                return new Tab3Fragment();
            default:
                return new Tab1Fragment();
        }

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public String getTabTitle(int position) {
        switch (position){
            case 0:
                return "Tab 1";

            case 1:
                return "Tab 2";
            case 2:
                return "Tab 3";
            default: return "Tab 1";
        }
    }
}
