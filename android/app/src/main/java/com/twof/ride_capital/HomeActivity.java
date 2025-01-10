// package com.twof.ride_capital;

// import android.os.Bundle;
// import android.webkit.WebView;

// import androidx.appcompat.app.AppCompatActivity;

// public class HomeActivity extends AppCompatActivity {
//     @Override
//     protected void onCreate(Bundle savedInstanceState) {
//         super.onCreate(savedInstanceState);
//         // WebView customizations
//         WebView webView = (WebView) findViewById(com.getcapacitor.android.R.id.webview);
//         if (webView != null) {
//             webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
//         }
//         setContentView(R.layout.activity_main);
//     }
// }

//
//package com.twof.ride_capital;
//
//import android.os.Bundle;
//import android.webkit.WebView;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//public class HomeActivity extends AppCompatActivity {
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        // Set the layout for HomeActivity
//        setContentView(R.layout.activity_main);
//
//        // Initialize WebView after the layout is set
//        WebView webView = findViewById(R.id.webview); // Use the id defined in activity_main.xml
//        webView.loadUrl("https://app.rideshop.et");
//        if (webView != null) {
//            webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER); // Customize WebView if needed
//        }
//    }
//}
