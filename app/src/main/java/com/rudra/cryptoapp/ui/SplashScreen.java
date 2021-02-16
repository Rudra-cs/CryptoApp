package com.rudra.cryptoapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.rudra.cryptoapp.R;
import com.rudra.cryptoapp.auth.Login;

public class SplashScreen extends AppCompatActivity {
    private static int splash_time=4000;
    Animation top_animation,bottom_animation;
    ImageView image;
    TextView appname,tagline;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        top_animation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottom_animation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        image=findViewById(R.id.logo);
        appname=findViewById(R.id.orital);
        tagline=findViewById(R.id.tag);

        image.setAnimation(top_animation);
        appname.setAnimation(bottom_animation);
        tagline.setAnimation(bottom_animation);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i= new Intent(SplashScreen.this, Login.class);
                startActivity(i);
                finish();

            }
        },splash_time);
    }
}
