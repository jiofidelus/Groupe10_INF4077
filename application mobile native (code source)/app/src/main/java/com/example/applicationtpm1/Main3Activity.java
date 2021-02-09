package com.example.applicationtpm1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class Main3Activity extends AppCompatActivity {
//WebView browser = (WebView) findViewById(R.id.webview);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mapok2);
        //browser.loadUrl("google.com");
       // webView.loadUrl("https://www.journaldev.com");
        WebView webView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        webView.loadUrl("https://www.google.com/maps/@3.8633472,11.5146752,13z");
    }
}
