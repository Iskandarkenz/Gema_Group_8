package com.example.gema.Home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import com.example.gema.Adapter.FragmentAdapter;
import com.example.gema.Deskripsi.DeskripsiAntariksa;
import com.example.gema.R;
import com.google.android.material.tabs.TabLayout;

public class SemuaBukuFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager2 pager2;
    FragmentAdapter adapter;
    public CardView buku;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public SemuaBukuFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static SemuaBukuFragment newInstance(String param1, String param2) {
        SemuaBukuFragment fragment = new SemuaBukuFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

        /*tabLayout = getView().findViewById(R.id.tab_layout);
        pager2 = getView().findViewById(R.id.view_pager2);

        FragmentManager fm = getSupportFragmentManager();
        adapter = new FragmentAdapter(fm, getLifecycle());
        pager2.setAdapter(adapter);

        tabLayout.addTab(tabLayout.newTab().setText("Semua Buku"));
        tabLayout.addTab(tabLayout.newTab().setText("Populer"));
        tabLayout.addTab(tabLayout.newTab().setText("Buku Baru"));
        tabLayout.addTab(tabLayout.newTab().setText("Pengetahuan"));

        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                pager2.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) { tabLayout.selectTab(tabLayout.getTabAt(position)); }
        });*/

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_semua_buku, container, false);


           /* }findViewById(R.id.danau_toba).setOnClickListener(this);

            // function tombol
        }
        @Override
        public void onClick(View v) {
            Intent i;

            switch (v.getId()) {
                case R.id.antariksa:
                    i = new Intent(this, SemuaBukuFragment.class);
                    startActivity(i);
                    break;
            }*/
    }
}