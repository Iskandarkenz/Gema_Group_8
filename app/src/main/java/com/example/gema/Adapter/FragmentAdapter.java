package com.example.gema.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.gema.Home.BukuBaruFragment;
import com.example.gema.Home.PengetahuanFragment;
import com.example.gema.Home.PopularFragment;
import com.example.gema.Home.SemuaBukuFragment;

public class FragmentAdapter extends FragmentStateAdapter {
    public FragmentAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position)
        {
            case 1 :
                return new PopularFragment();
            case 2 :
                return new BukuBaruFragment();
            case 3 :
                return new PengetahuanFragment();

        }

        return new SemuaBukuFragment();
    }

    @Override
    public int getItemCount() {
        return 4;
    }

}
