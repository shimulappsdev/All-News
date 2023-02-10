package com.example.allnews.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.allnews.fragments.BanglaFragment;
import com.example.allnews.fragments.InternationalFragment;
import com.example.allnews.fragments.JobFragment;

public class FragmentAdapter extends FragmentPagerAdapter {

    String[] name = {"Bangla", "International", "Job"};

    public FragmentAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new BanglaFragment();
            case 1:
                return new InternationalFragment();
            case 2:
                return new JobFragment();
        }

        return null;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return name[position];
    }
}
