package com.samsul.aplikasiresepmakanan.common;

import android.app.AlertDialog;
import android.content.Context;

import com.samsul.aplikasiresepmakanan.remote.api.DrinksApi;
import com.samsul.aplikasiresepmakanan.remote.api.FoodClient;
import com.samsul.aplikasiresepmakanan.remote.api.FoodsApi;

public class Utils {

    public static FoodsApi getApi(){
        return FoodClient.getFoodClient().create(FoodsApi.class);
    }

//    public static DrinksApi getDrinkApi(){
//        return FoodClient.getDrinksClient().create(DrinksApi.class);
//    }
    public static AlertDialog showDialogMessage(Context mContext, String title, String message){
        AlertDialog alertDialog = new AlertDialog.Builder(mContext)
                .setTitle(title)
                .setMessage(message)
                .show();
        if(alertDialog.isShowing()){
            alertDialog.cancel();
        }

        return alertDialog;
    }

}
