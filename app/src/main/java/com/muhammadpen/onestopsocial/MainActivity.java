package com.muhammadpen.onestopsocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    WebView facebookView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebookView = (WebView) findViewById(R.id.facebookView);

        facebookView.setWebChromeClient(new WebChromeClient());
        facebookView.setWebViewClient(new WebViewClient());
        facebookView.setVerticalScrollBarEnabled(false);
        facebookView.setHorizontalScrollBarEnabled(false);
        facebookView.getSettings().setJavaScriptEnabled(true);
        facebookView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        facebookView.getSettings().setPluginState(WebSettings.PluginState.ON);
        facebookView.getSettings().setMediaPlaybackRequiresUserGesture(false);




        facebookView.loadUrl("https://www.facebook.com");


    }

}
