package com.guaju.viewpagerdemo.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by guaju on 2018/8/8.
 */

public class CommonViewPagerAdapter<T> extends PagerAdapter {
    Context context;
    List<T> lists;
    int variableId;
    int layoutId;
    LayoutInflater layoutInflater;

    public CommonViewPagerAdapter(Context context, List<T> lists, int variableId, int layoutId, LayoutInflater layoutInflater) {
        this.context = context;
        this.lists = lists;
        this.variableId = variableId;
        this.layoutId = layoutId;
        this.layoutInflater = layoutInflater;
    }
    @Override
    public int getCount() {
        //国际案例
        return lists.size();
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        ViewDataBinding binding = (ViewDataBinding) object;
        //国际按例
        return view==binding.getRoot();
    }
    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        //返回databinding绑定的view
        ViewDataBinding binding = DataBindingUtil.inflate(layoutInflater, layoutId, container, true);
        binding.setVariable(variableId,lists.get(position));
        //注意这里我们返回的是binding对象，这个binding对象是 isViewFromObject方法和destoryItem方法中的引用
        return binding;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        //同样,移除binding对应的view
        ViewDataBinding binding = (ViewDataBinding) object;
        container.removeView(binding.getRoot());
        
    }
}
