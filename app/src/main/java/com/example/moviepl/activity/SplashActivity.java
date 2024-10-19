package com.example.moviepl.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.moviepl.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView logo = findViewById(R.id.logo);
        TextView appName = findViewById(R.id.appName);

        Animation logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation);
        Animation textAnimation = AnimationUtils.loadAnimation(this, R.anim.fade_in);

        logo.startAnimation(logoAnimation);
        appName.startAnimation(textAnimation);

        new Handler().postDelayed(() -> appName.startAnimation(textAnimation), 1500);
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
        }, 3000);

    }
}