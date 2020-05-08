package com.example.android.ootsuk;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class Know extends AppCompatActivity {
    ProgressBar progressbar;
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know);
        webview = findViewById(R.id.webview);
        progressbar = findViewById(R.id.progressbar);
        webview.getSettings().setJavaScriptEnabled(true);
        //its launching in browser let's fixed it
        webview.setWebViewClient(new WebViewClient() {
            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
                progressbar.setVisibility(View.VISIBLE);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
                progressbar.setVisibility(View.GONE);
            }
        });
        webview.loadUrl("https://www.ootsuk.com/aboutus.html");
    }
        @Override
        public void onBackPressed() {
            if(webview.canGoBack()){
                webview.goBack();
            }
            else {
                super.onBackPressed();
            }

    }
}
