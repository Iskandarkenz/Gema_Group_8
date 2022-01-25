package com.example.gema.Main;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;

import com.example.gema.Adapter.FragmentAdapter;
import com.example.gema.Profil.BuatProfil;
import com.example.gema.Profil.Grid.MyLibrary;
import com.example.gema.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

    public class MainActivity extends AppCompatActivity {

        TabLayout tabLayout;
        ViewPager2 pager2;
        FragmentAdapter adapter;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            tabLayout = findViewById(R.id.tab_layout);
            pager2 = findViewById(R.id.view_pager2);

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
            });

            //initialize And Assign Variable
            BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

            //set Home,pustaka and profil Selected
            bottomNavigationView.setSelectedItemId(R.id.home);
            bottomNavigationView.setSelectedItemId(R.id.pustaka);
            bottomNavigationView.setSelectedItemId(R.id.profil);

            //Perform ItemSelectedListener
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                    switch (menuItem.getItemId()) {
                        case R.id.home:
                            startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            overridePendingTransition(0, 0);
                            return true;

                        case R.id.pustaka:
                            startActivity(new Intent(getApplicationContext(), MyLibrary.class));
                            overridePendingTransition(0, 0);
                            return true;

                            case R.id.profil:
                                startActivity(new Intent(getApplicationContext(), BuatProfil.class));
                                overridePendingTransition(0, 0);
                                return true;
                    }
                    return false;
                }
              }
            );
        }
    }

