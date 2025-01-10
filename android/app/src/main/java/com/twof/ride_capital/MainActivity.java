package com.twof.ride_capital;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

import com.getcapacitor.BridgeActivity;
import android.webkit.WebView;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

import androidx.appcompat.app.ActionBar;

import com.google.firebase.crashlytics.FirebaseCrashlytics;



public class MainActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getBridge().getWebView().getSettings().setUserAgentString(
                getBridge().getWebView().getSettings().getUserAgentString() + " RideCapitalApp"
        );

        // Get the Window object
        Window window = getWindow();

        window.setStatusBarColor(Color.TRANSPARENT);
        window.setNavigationBarColor(Color.BLACK);

        window.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
        );


        // Optional: For Android 11+ devices, adjust appearance
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            WindowInsetsController insetsController = window.getInsetsController();
            if (insetsController != null) {
                insetsController.setSystemBarsAppearance(
                        0, // Clear any appearance flags
                        WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                );
            }
        }

        // Customize ActionBar (if needed)
        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            SpannableString title = new SpannableString("My App Title"); // Set your title
            title.setSpan(new ForegroundColorSpan(Color.RED), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            title.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            actionBar.setTitle(title);
        }

                WebView webView = (WebView) findViewById(com.getcapacitor.android.R.id.webview);
        if (webView != null) {
            webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        }

//        Force a test crash (remove or comment this in production)
//        FirebaseCrashlytics.getInstance().log("Crashlytics testing log");
//        throw new RuntimeException("Test Crash");
    }
}


// package com.twof.ride_capital;

// import android.content.Intent;
// import android.graphics.Color;
// import android.os.Build;
// import android.os.Bundle;
// import android.os.Handler;
// import android.view.View;
// import android.view.Window;
// import android.view.WindowInsetsController;
// import android.view.animation.AlphaAnimation;
// import android.widget.ImageView;

// import androidx.appcompat.app.ActionBar;
// import androidx.appcompat.app.AppCompatActivity;

// import com.getcapacitor.BridgeActivity;

// import android.webkit.WebView;
// import android.graphics.Typeface;
// import android.text.Spannable;
// import android.text.SpannableString;
// import android.text.style.ForegroundColorSpan;
// import android.text.style.StyleSpan;

// public class MainActivity extends BridgeActivity {

//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);

//         // Set custom user agent for WebView
//         getBridge().getWebView().getSettings().setUserAgentString(
//                 getBridge().getWebView().getSettings().getUserAgentString() + " RideCapitalApp"
//         );

//         // Set system bar colors
//         Window window = getWindow();
//         window.setStatusBarColor(Color.TRANSPARENT);
//         window.setNavigationBarColor(Color.BLACK);
//         window.getDecorView().setSystemUiVisibility(
//                 View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
//                         View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//         );

//         // Optional: For Android 11+ devices, adjust appearance
//         if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//             WindowInsetsController insetsController = window.getInsetsController();
//             if (insetsController != null) {
//                 insetsController.setSystemBarsAppearance(
//                         0, // Clear any appearance flags
//                         WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
//                 );
//             }
//         }

//         // Customize ActionBar (if needed)
//         ActionBar actionBar = getSupportActionBar();
//         if (actionBar != null) {
//             SpannableString title = new SpannableString("My App Title"); // Set your title
//             title.setSpan(new ForegroundColorSpan(Color.RED), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//             title.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//             actionBar.setTitle(title);
//         }

//         // WebView customizations
//         WebView webView = (WebView) findViewById(com.getcapacitor.android.R.id.webview);
//         if (webView != null) {
//             webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
//         }

//         // Set the layout for the splash screen animation
//         setContentView(R.layout.activity_splash);

//         // Handle splash screen animation
//         ImageView imageView = findViewById(R.id.imageView);

//         // Fade-out animation for the first image
//         AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
//         fadeOut.setDuration(1000); // 1 second
//         fadeOut.setFillAfter(true);

//         // Fade-in animation for the second image
//         AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
//         fadeIn.setDuration(1000); // 1 second
//         fadeIn.setFillAfter(true);

//         // Start fade-out for the first image
//         imageView.startAnimation(fadeOut);

//         // Delay to show the second image
//         new Handler().postDelayed(() -> {
//             imageView.setImageResource(R.drawable.image2); // Set the second image
//             imageView.startAnimation(fadeIn);

//             // Transition to the main WebView content after the animation
//             new Handler().postDelayed(() -> {
//                 startActivity(new Intent(MainActivity.this, HomeActivity.class));
//                 finish();
//             }, 2000); // 2 seconds for the second image

//         }, 1000); // 1 second delay for fade-out
//     }
// }

//
//package com.twof.ride_capital;
//
//import android.content.Intent;
//import android.graphics.Color;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowInsetsController;
//import android.view.animation.AlphaAnimation;
//import android.widget.ImageView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//import com.getcapacitor.BridgeActivity;
//
//public class MainActivity extends BridgeActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Set system bar colors for splash screen
//        Window window = getWindow();
//        window.setStatusBarColor(Color.TRANSPARENT);
//        window.setNavigationBarColor(Color.BLACK);
//        window.getDecorView().setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
//                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//        );
//
//        // Optional: For Android 11+ devices, adjust appearance
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//            WindowInsetsController insetsController = window.getInsetsController();
//            if (insetsController != null) {
//                insetsController.setSystemBarsAppearance(
//                        0, // Clear any appearance flags
//                        WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
//                );
//            }
//        }
//
//        // Set the layout for the splash screen
//        setContentView(R.layout.activity_splash);
//
//        // Handle splash screen animation
//        ImageView imageView = findViewById(R.id.imageView);
//
//        // Fade-out animation for the first image
//        AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
//        fadeOut.setDuration(1000); // 1 second
//        fadeOut.setFillAfter(true);
//
//        // Fade-in animation for the second image
//        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
//        fadeIn.setDuration(1000); // 1 second
//        fadeIn.setFillAfter(true);
//
//        // Start fade-out for the first image
//        imageView.startAnimation(fadeOut);
//
//        // Delay to show the second image
//        new Handler().postDelayed(() -> {
//            imageView.setImageResource(R.drawable.image2); // Set the second image
//            imageView.startAnimation(fadeIn);
//
//            // Transition to HomeActivity after the animation
//            new Handler().postDelayed(() -> {
//                startActivity(new Intent(MainActivity.this, HomeActivity.class));
//                finish();
//            }, 2000); // 2 seconds for the second image
//
//        }, 1000); // 1 second delay for fade-out
//    }
//}

//
//package com.twof.ride_capital;
//
//import android.content.Intent;
//import android.graphics.Color;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowInsetsController;
//import android.view.animation.AlphaAnimation;
//import android.widget.ImageView;
//
//import com.getcapacitor.BridgeActivity;
//
//public class MainActivity extends BridgeActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Set system bar colors for splash screen
//        Window window = getWindow();
//        window.setStatusBarColor(Color.TRANSPARENT);
//        window.setNavigationBarColor(Color.BLACK);
//        window.getDecorView().setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
//                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//        );
//
//        // Optional: For Android 11+ devices, adjust appearance
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//            WindowInsetsController insetsController = window.getInsetsController();
//            if (insetsController != null) {
//                insetsController.setSystemBarsAppearance(
//                        0, // Clear any appearance flags
//                        WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
//                );
//            }
//        }
//
//        // Set the layout for the splash screen
//        setContentView(R.layout.activity_splash);
//
//        // Handle splash screen animation
//        ImageView imageView = findViewById(R.id.imageView);
//
//        // Fade-out animation for the first image
//        AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
//        fadeOut.setDuration(1000); // 1 second
//        fadeOut.setFillAfter(true);
//
//        // Fade-in animation for the second image
//        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
//        fadeIn.setDuration(1000); // 1 second
//        fadeIn.setFillAfter(true);
//
//        // Start fade-out for the first image
//        imageView.startAnimation(fadeOut);
//
//        // Delay to show the second image
//        new Handler().postDelayed(() -> {
//            imageView.setImageResource(R.drawable.image2); // Set the second image
//            imageView.startAnimation(fadeIn);
//
//            // Transition to the web view (BridgeActivity) after the animation
//            new Handler().postDelayed(() -> {
//                setContentView(R.layout.activity_main); // Set your WebView layout
//                // No need to load URL manually; Capacitor does that automatically
//                // Manually configure the WebView (needed for proper rendering)
//                WebView webView = (WebView) findViewById(com.getcapacitor.android.R.id.webview);
//                if (webView != null) {
//                    webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
//                }
//            }, 2000); // 2 seconds for the second image
//
//        }, 1000); // 1 second delay for fade-out
//    }
//}

//
//package com.twof.ride_capital;
//
//import android.content.Intent;
//import android.graphics.Color;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowInsetsController;
//import android.view.animation.AlphaAnimation;
//import android.widget.ImageView;
//
//import com.getcapacitor.BridgeActivity;
//import android.webkit.WebView;
//
//public class MainActivity extends BridgeActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Set system bar colors for splash screen
//        Window window = getWindow();
//        window.setStatusBarColor(Color.TRANSPARENT);
//        window.setNavigationBarColor(Color.BLACK);
//        window.getDecorView().setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
//                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//        );
//
//        // Optional: For Android 11+ devices, adjust appearance
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//            WindowInsetsController insetsController = window.getInsetsController();
//            if (insetsController != null) {
//                insetsController.setSystemBarsAppearance(
//                        0, // Clear any appearance flags
//                        WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
//                );
//            }
//        }
//
//        // Set the layout for the splash screen
//        setContentView(R.layout.activity_splash);
//
//        // Handle splash screen animation
//        ImageView imageView = findViewById(R.id.imageView);
//
//        // Fade-out animation for the first image
//        AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
//        fadeOut.setDuration(1000); // 1 second
//        fadeOut.setFillAfter(true);
//
//        // Fade-in animation for the second image
//        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
//        fadeIn.setDuration(1000); // 1 second
//        fadeIn.setFillAfter(true);
//
//        // Start fade-out for the first image
//        imageView.startAnimation(fadeOut);
//
//        // Delay to show the second image
//        new Handler().postDelayed(() -> {
//            imageView.setImageResource(R.drawable.image2); // Set the second image
//            imageView.startAnimation(fadeIn);
//
//
//
//        }, 1000); // 1 second delay for fade-out
//
//        // Transition to the web view (BridgeActivity) after the animation
////        new Handler().postDelayed(() -> {
////            setContentView(R.layout.activity_main); // Set your WebView layout
//
//            // Manually configure the WebView (needed for proper rendering)
//            WebView webView = (WebView) findViewById(com.getcapacitor.android.R.id.webview);
//            if (webView != null) {
//                webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
//            }
//
////        }, 2000); // 2 seconds for the second image
//    }
//}

//
//package com.twof.ride_capital;
//
//import android.content.Intent;
//import android.graphics.Color;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Handler;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowInsetsController;
//import android.view.animation.AlphaAnimation;
//import android.widget.ImageView;
//
//import com.getcapacitor.BridgeActivity;
//import android.webkit.WebView;
//
//
//import android.graphics.Color;
//import android.os.Build;
//import android.os.Bundle;
//import android.view.View;
//import android.view.Window;
//import android.view.WindowInsetsController;
//
//import com.getcapacitor.BridgeActivity;
//import android.webkit.WebView;
//
//import android.graphics.Typeface;
//import android.text.Spannable;
//import android.text.SpannableString;
//import android.text.style.ForegroundColorSpan;
//import android.text.style.StyleSpan;
//
//import androidx.appcompat.app.ActionBar;
//
//public class MainActivity extends BridgeActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        getBridge().getWebView().getSettings().setUserAgentString(
//                getBridge().getWebView().getSettings().getUserAgentString() + " RideCapitalApp"
//        );
//        // Set system bar colors for splash screen
//        Window window = getWindow();
//        window.setStatusBarColor(Color.TRANSPARENT);
//        window.setNavigationBarColor(Color.BLACK);
//        window.getDecorView().setSystemUiVisibility(
//                View.SYSTEM_UI_FLAG_LAYOUT_STABLE |
//                        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
//        );
//
//        // Optional: For Android 11+ devices, adjust appearance
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
//            WindowInsetsController insetsController = window.getInsetsController();
//            if (insetsController != null) {
//                insetsController.setSystemBarsAppearance(
//                        0, // Clear any appearance flags
//                        WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
//                );
//            }
//        }
//
//
////                 Customize ActionBar (if needed)
//        ActionBar actionBar = getSupportActionBar();
//        if (actionBar != null) {
//            SpannableString title = new SpannableString("My App Title"); // Set your title
//            title.setSpan(new ForegroundColorSpan(Color.RED), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            title.setSpan(new StyleSpan(Typeface.BOLD), 0, title.length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
//            actionBar.setTitle(title);
//        }
//        // Set the layout for the splash screen
//        setContentView(R.layout.activity_splash);
//
//        // Handle splash screen animation
//        ImageView imageView = findViewById(R.id.imageView);
//
//        // Fade-out animation for the first image
//        AlphaAnimation fadeOut = new AlphaAnimation(1.0f, 0.0f);
//        fadeOut.setDuration(1000); // 1 second
//        fadeOut.setFillAfter(true);
//
//        // Fade-in animation for the second image
//        AlphaAnimation fadeIn = new AlphaAnimation(0.0f, 1.0f);
//        fadeIn.setDuration(1000); // 1 second
//        fadeIn.setFillAfter(true);
//
//        // Start fade-out for the first image
//        imageView.startAnimation(fadeOut);
//
//        // Delay to show the second image
//        new Handler().postDelayed(() -> {
//            imageView.setImageResource(R.drawable.image2); // Set the second image
//            imageView.startAnimation(fadeIn);
//
//            // Transition to WebView after the animation
//            new Handler().postDelayed(() -> {
//                // Hide splash screen and show WebView
//                setContentView(R.layout.activity_main);
//                getBridge().getWebView().getSettings().setUserAgentString(
//                        getBridge().getWebView().getSettings().getUserAgentString() + " RideCapitalApp"
//                );
//                imageView.setVisibility(View.GONE);
////                findViewById(R.id.webview).setVisibility(View.VISIBLE);
//
//                // Set the WebView settings (for Capacitor)
//                WebView webView = findViewById(com.getcapacitor.android.R.id.webview);
//                if (webView != null) {
//                    webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
//                    // Add any additional WebView configuration here if needed
//                }
//
//            }, 200); // Wait 2 seconds for fade-in animation to complete
//
//        }, 1000); // 1 second delay for fade-out
//    }
//}
