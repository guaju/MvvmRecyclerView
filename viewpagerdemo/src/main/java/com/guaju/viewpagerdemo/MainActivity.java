package com.guaju.viewpagerdemo;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.guaju.viewpagerdemo.adapter.CommonViewPagerAdapter;
import com.guaju.viewpagerdemo.databinding.ActivityMainBinding;
import com.guaju.viewpagerdemo.viewmodel.ViewPagerItemModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] guide={"http://oucijhbtq.bkt.clouddn.com/01.png",
                    "http://oucijhbtq.bkt.clouddn.com/02.png",
                    "http://oucijhbtq.bkt.clouddn.com/03.png",
                    "http://oucijhbtq.bkt.clouddn.com/04.png"};
    List<ViewPagerItemModel> lists=new ArrayList<>();
    private CommonViewPagerAdapter<ViewPagerItemModel> adapter;

    private ActivityMainBinding binding;
    private ViewPager viewpager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = (ActivityMainBinding) DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewpager = binding.viewpager;
        initData();
        adapter = new CommonViewPagerAdapter<ViewPagerItemModel>(this, lists, BR.itemmodel, R.layout.viewpager_item,getLayoutInflater());
        viewpager.setAdapter(adapter);
    }

    private void initData() {
        for (int i = 0; i<guide.length; i++){
              lists.add(new ViewPagerItemModel(guide[i]));
        }
    }

}
