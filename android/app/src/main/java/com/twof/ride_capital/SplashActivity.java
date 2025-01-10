// SplashActivity.java
package com.twof.ride_capital;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ImageView imageView = findViewById(R.id.imageView);

        // Set initial image
        imageView.setImageResource(R.drawable.image1);

        // Fade out the first image
        AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
        fadeOut.setDuration(1000); // 1 second
        fadeOut.setFillAfter(true);

        // Fade in the second image
        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
        fadeIn.setDuration(1000); // 1 second
        fadeIn.setFillAfter(true);

        // Start fade-out animation
        imageView.startAnimation(fadeOut);

        // Delay the fade-in animation
        new Handler().postDelayed(() -> {
            imageView.setImageResource(R.drawable.image1);
            imageView.startAnimation(fadeIn);

            // After the splash screen, move to the main activity
            new Handler().postDelayed(() -> {
                startActivity(new Intent(SplashActivity.this, MainActivity.class));
                finish();
            }, 2000); // 2 seconds delay for the second image
        }, 1000); // 1 second delay for fade-out
    }
}
