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
        String url = "http://img.mianbao99.com:88/newpic/201207/04/4ff3f0e439bf3.jpg";
        Glide.with(this)
                .load(url)
                .placeholder(R.drawable.chaoren)                //添加占位图
                .error(R.drawable.error)                        //添加异常占位图
                .diskCacheStrategy(DiskCacheStrategy.NONE)      //设置缓存机制
                .into(imageView);
    }
}
