package com.muhammadpen.onestopsocial;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {


    //Initializing WebViews
   WebView facebookView;
    WebView twitterView;
    WebView flickrView;



    Button facebookButton;
    Button twitterButton;
    Button flickrButton;
    //ImageView facebookView;
    //ImageView twitterView;
    //ImageView flickrView;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebookButton = (Button) findViewById(R.id.facebookButton);
        twitterButton = (Button) findViewById(R.id.twitterButton);
        flickrButton = (Button) findViewById(R.id.flickrButton);
       // facebookView = (ImageView) findViewById(R.id.facebookView);
       // twitterView = (ImageView) findViewById(R.id.twitterView);
       // flickrView = (ImageView) findViewById(R.id.flickrView);
        facebookView = (WebView) findViewById(R.id.facebookView);
        twitterView= (WebView) findViewById(R.id.twitterView);
        flickrView = (WebView) findViewById(R.id.flickrView);

        //Initially moving the views out of the user FOV
         facebookView.setTranslationX(-1500);
        twitterView.setTranslationX(1500);
        flickrView.setTranslationX(2000);




        //setting up button listeners
         facebookButton.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View view) {

                 if (facebookView.getTranslationX() == -1500) {
                     facebookView.animate().translationXBy(1500);
                     if (twitterView.getTranslationX() == 0) {
                         twitterView.animate().translationXBy(1500);
                     }
                     if (flickrView.getTranslationX() == 0) {
                         flickrView.animate().translationXBy(2000);
                     }
                 }
             }
         });

         twitterButton.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick (View view) {
                 if (twitterView.getTranslationX() == 1500){
                     twitterView.animate().translationXBy(-1500);
                     if (facebookView.getTranslationX() == 0) {
                         facebookView.animate().translationXBy(-1500);
                     }
                     if (flickrView.getTranslationX() == 0) {
                         flickrView.animate().translationXBy(2000);
                     }
                 }
             }
         });

         flickrButton.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick (View view){
                 if (flickrView.getTranslationX() == 2000){
                     flickrView.animate().translationXBy(-2000);
                     if(facebookView.getTranslationX()== 0){
                         facebookView.animate().translationXBy(-1500);
                     }
                     if (twitterView.getTranslationX() == 0){
                         twitterView.animate().translationXBy(1500);
                     }
                 }
             }
         });


            CustomWebView myWebView = new CustomWebView();

        //Changing facebookView Settings
       facebookView.setWebViewClient(myWebView);
        facebookView.getSettings().setDomStorageEnabled(true);
        facebookView.setVerticalScrollBarEnabled(false);
        facebookView.setHorizontalScrollBarEnabled(false);
        facebookView.getSettings().setJavaScriptEnabled(true);
        facebookView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        facebookView.getSettings().setPluginState(WebSettings.PluginState.ON);
        facebookView.getSettings().setMediaPlaybackRequiresUserGesture(false);


        //Changing twitterView Settings
        twitterView.setWebViewClient(myWebView);
        twitterView.getSettings().setDomStorageEnabled(true);
        twitterView.setVerticalScrollBarEnabled(false);
        twitterView.setHorizontalScrollBarEnabled(false);
        twitterView.getSettings().setJavaScriptEnabled(true);
        twitterView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        twitterView.getSettings().setPluginState(WebSettings.PluginState.ON);
        twitterView.getSettings().setMediaPlaybackRequiresUserGesture(false);

        //Changing flickrView Settings
        flickrView.setWebViewClient(myWebView);
        flickrView.getSettings().setDomStorageEnabled(true);
        flickrView.setVerticalScrollBarEnabled(false);
        flickrView.setHorizontalScrollBarEnabled(false);
        flickrView.getSettings().setJavaScriptEnabled(true);
        flickrView.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
        flickrView.getSettings().setPluginState(WebSettings.PluginState.ON);
        flickrView.getSettings().setMediaPlaybackRequiresUserGesture(false);




        //Adding web adresses
        facebookView.loadUrl("https://www.facebook.com");
        twitterView.loadUrl("https://www.twitter.com");
        flickrView.loadUrl("https://www.flickr.com");


    }

    //Adding back functionality
    @Override
    public void onBackPressed(){
        if(facebookView.canGoBack()){
            facebookView.goBack();
        }else{
            super.onBackPressed();
        }
    }

}
