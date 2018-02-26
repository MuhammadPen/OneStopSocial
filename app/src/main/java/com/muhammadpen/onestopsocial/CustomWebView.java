package com.muhammadpen.onestopsocial;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Muhammad on 2/26/2018.
 */

public class CustomWebView extends WebViewClient {

    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url){
        if(Uri.parse(url).getHost().endsWith("facebook.com")){
            return false;
        }

        if(Uri.parse(url).getHost().endsWith("flickr.com")){
            return false;
        }

        if(Uri.parse(url).getHost().endsWith("twitter.com")){
            return false;
        }

        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        view.getContext().startActivity(i);
        return true;
    }
}
