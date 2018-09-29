package com.guaju.viewpagerdemo.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.guaju.viewpagerdemo.BR;

/**
 * Created by guaju on 2018/8/8.
 */

public class ViewPagerItemModel  extends BaseObservable{

    String img;
    @Bindable
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
        notifyPropertyChanged(BR.img);
    }


    public ViewPagerItemModel(String img) {
        this.img = img;
    }

    @BindingAdapter("app:img")
    public static void setImg(ImageView view,String img){
        Glide.with(view.getContext()).load(img).into(view);
    }
}
