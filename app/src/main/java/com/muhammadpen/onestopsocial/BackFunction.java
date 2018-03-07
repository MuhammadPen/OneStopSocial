package com.muhammadpen.onestopsocial;


public class BackFunction extends MainActivity {


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
