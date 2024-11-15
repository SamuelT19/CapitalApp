package com.twof.ride_capital;

import com.getcapacitor.BridgeActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.webkit.WebView;

public class MainActivity extends BridgeActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Window window = this.getWindow();
       window.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
       window.setStatusBarColor(Color.BLACK);  // Change to your desired color
        window.setNavigationBarColor(Color.BLACK);
        WebView webView = (WebView) findViewById(com.getcapacitor.android.R.id.webview);
        if (webView != null) {
            webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        }
    }
}
