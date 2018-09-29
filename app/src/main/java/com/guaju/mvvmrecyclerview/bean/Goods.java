package com.guaju.mvvmrecyclerview.bean;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.guaju.mvvmrecyclerview.BR;

/**
 * Created by guaju on 2018/8/5.
 */

public class Goods extends BaseObservable{
    String title;
    String price;
    String img;

    public Goods(String title, String price, String img) {
        this.title = title;
        this.price = price;
        this.img = img;
    }
    @Bindable
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        notifyPropertyChanged(BR.title);
    }
    @Bindable
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }
     @Bindable
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
        notifyPropertyChanged(BR.img);
    }


    @BindingAdapter("app:img")
    public static void setImg(ImageView iv,String  img){
        Glide.with(iv.getContext()).load(img).into(iv);
    }

}
