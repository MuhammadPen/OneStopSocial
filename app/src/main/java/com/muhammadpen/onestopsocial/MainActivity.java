package com.muhammadpen.onestopsocial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity {

    //Initializing WebViews
    WebView facebookView;
    WebView twitterView;
    WebView flickrView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Setting up WebViews
        facebookView = (WebView) findViewById(R.id.facebookView);
        twitterView = (WebView) findViewById(R.id.twitterView);
        flickrView = (WebView) findViewById(R.id.flickrView);


        //Changing facebookView Settings
        facebookView.setWebChromeClient(new WebChromeClient());
        facebookView.setWebViewClient(new WebViewClient());
        facebookView.setVerticalScrollBarEnabled(false);
        facebookView.setHorizontalScrollBarEnabled(false);
        facebookView.getSettings().setJavaScriptEnabled(true);
        facebookView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        facebookView.getSettings().setPluginState(WebSettings.PluginState.ON);
        facebookView.getSettings().setMediaPlaybackRequiresUserGesture(false);

        //Changing twitterView Settings
        twitterView.setWebChromeClient(new WebChromeClient());
        twitterView.setWebViewClient(new WebViewClient());
        twitterView.setVerticalScrollBarEnabled(false);
        twitterView.setHorizontalScrollBarEnabled(false);
        twitterView.getSettings().setJavaScriptEnabled(true);
        twitterView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        twitterView.getSettings().setPluginState(WebSettings.PluginState.ON);
        twitterView.getSettings().setMediaPlaybackRequiresUserGesture(false);

        //Changing flickrView Settings
        flickrView.setWebChromeClient(new WebChromeClient());
        flickrView.setWebViewClient(new WebViewClient());
        flickrView.setVerticalScrollBarEnabled(false);
        flickrView.setHorizontalScrollBarEnabled(false);
        flickrView.getSettings().setJavaScriptEnabled(true);
        flickrView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        flickrView.getSettings().setPluginState(WebSettings.PluginState.ON);
        flickrView.getSettings().setMediaPlaybackRequiresUserGesture(false);




        //Adding web adresses
        facebookView.loadUrl("https://www.facebook.com");
        twitterView.loadUrl("https://www.twitter.com");
        facebookView.loadUrl("https://www.flickr.com");


    }

}
