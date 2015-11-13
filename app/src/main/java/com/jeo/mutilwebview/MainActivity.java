package com.jeo.mutilwebview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {
    WebView webViewOne,webViewTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webViewOne = (WebView)findViewById(R.id.webViewOne);
        webViewTwo = (WebView)findViewById(R.id.webViewTwo);
        webViewOne.setWebChromeClient(new WebChromeClient());
        webViewTwo.setWebChromeClient(new WebChromeClient());
        webViewOne.setWebViewClient(new WebViewClient());
        webViewTwo.setWebViewClient(new WebViewClient());
        
        webViewOne.loadUrl("http://sina.cn");
        webViewTwo.loadUrl("http://souhu.com");
    }
}
