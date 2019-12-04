package com.pritesh.midterm_spacexdata_android.ui.activities;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.gif.GifDrawable;
import com.bumptech.glide.request.target.ImageViewTarget;
import com.pritesh.midterm_spacexdata_android.R;

public class SplashActivity extends AppCompatActivity
{

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        imageView = findViewById(R.id.imageView);
        Glide.with(this)
                .asGif()
                .load("https://thumbs.gfycat.com/LargeShadyChamois-size_restricted.gif")
                .into(new ImageViewTarget<GifDrawable>(imageView)
                {
                    @Override
                    protected void setResource(@Nullable GifDrawable resource)
                    {
                        imageView.setImageDrawable(resource);
                    }
                });


        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(intent);
                finish();
            }
        },10000);
    }
}
