package com.sajjad.viewpager2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import com.google.android.material.tabs.TabLayoutMediator;
import com.sajjad.viewpager2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //
        String[] tabTitles = {"First Fragment", "Second Fragment"};
        //
        binding.viewPager2.setAdapter(new ViewPagerAdapter(this));
        new TabLayoutMediator(binding.tabLayout, binding.viewPager2
                , (tab, position) -> tab.setText(tabTitles[position])).attach();
    }
}