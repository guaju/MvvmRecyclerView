package com.guaju.mvvmrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.guaju.mvvmrecyclerview.adpter.CommonRecyclerViewAdapter;
import com.guaju.mvvmrecyclerview.bean.Goods;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    List<Goods> lists=new ArrayList<>();
    String[] imgs={
            "https://img13.360buyimg.com/n7/jfs/t19696/48/1597425277/98523/ef8ee3b8/5ad00ea3Nd107356e.jpg",
            "https://img11.360buyimg.com/n7/g12/M00/00/15/rBEQYVGBxngIAAAAAAJrcLQeY4EAAAIjACdq_8AAmuI360.jpg",
            "https://img13.360buyimg.com/n7/jfs/t2989/262/2257978894/120092/61d9bf0e/579fee8eN88544949.jpg",
            "https://img14.360buyimg.com/n7/g13/M05/0F/15/rBEhU1JV_IgIAAAAAAExt1xyxKAAAD9DADZv2sAATHP423.jpg",
            "https://img10.360buyimg.com/n7/jfs/t21136/207/1468150929/88854/50501dc8/5b2b568dNe77f64ce.jpg",
            "https://img13.360buyimg.com/n7/jfs/t21004/342/1560636709/139282/b6759551/5b2b55a3Nb4a3ff8c.jpg",
            "https://img14.360buyimg.com/n7/jfs/t20869/215/225981714/422234/8eecb0f3/5b052da9N7340cce8.jpg",
            "https://img13.360buyimg.com/n7/jfs/t17005/239/1075374687/144394/26fc704/5ab88d27Nc0aed7a1.jpg",
            "https://img14.360buyimg.com/n7/jfs/t529/66/1151306744/111916/498dd7d7/54b398a4N5bce6ffa.jpg",
            "https://img10.360buyimg.com/n7/jfs/t16927/93/942036517/86961/6f1b3a20/5ab3af1bN650b36c0.jpg"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        initData();
        }

    private void initData() {
        for (int i=0;i<10;i++){
            lists.add(new Goods("我是标题"+i,"12.9"+i,imgs[i]));
        }
        CommonRecyclerViewAdapter<Goods> goodsCommonRecyclerViewAdapter =
                new CommonRecyclerViewAdapter<Goods>(this, getLayoutInflater(), R.layout.item, com.guaju.mvvmrecyclerview.BR.goods,lists);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(goodsCommonRecyclerViewAdapter);

    }
}
