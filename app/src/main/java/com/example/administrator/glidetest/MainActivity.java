package com.example.administrator.glidetest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);
    }

    public void loadImage(View view) {
        String url = "http://p1.pstatp.com/large/166200019850062839d3";     //Glide 可以自动判断传入的是动图还是静态图
        Glide.with(this)
                .load(url)
                .asBitmap()                                     //设定添加静态图；      .asGif() 设定添加动态图
                .placeholder(R.drawable.chaoren)                //添加占位图
                .error(R.drawable.error)                        //添加异常占位图
                .diskCacheStrategy(DiskCacheStrategy.NONE)      //设置缓存机制
                .into(imageView);
    }
}
