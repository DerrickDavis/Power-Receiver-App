package com.example.powerreceiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class Custom_receiver extends BroadcastReceiver {

    private static final String ACTION_CUSTOM_BROADCAST =
            BuildConfig.APPLICATION_ID + ".ACTION_CUSTOM_BROADCAST";

    @Override
    public void onReceive(Context context, Intent intent) {
       String intentAction = intent.getAction();
       if (intentAction != null){
          String toastMessage = "unknown intent action";

           switch(intentAction){

               case Intent.ACTION_POWER_CONNECTED:
                   toastMessage = "Power Connedted";
                   break;

               case Intent.ACTION_POWER_DISCONNECTED:
                   toastMessage ="Power Disconnected" ;
                   break;
               case ACTION_CUSTOM_BROADCAST: 
                   toastMessage =context.getString(R.string.custom_braodcast_toast);
                   
                   default:
           }
           Toast.makeText(context, toastMessage, Toast.LENGTH_SHORT).show();
       }
    }
}
