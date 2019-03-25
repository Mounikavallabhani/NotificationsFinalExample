package com.arkainfoteck.notificationsfinalexample;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;



public class MyFirebaseInstanceIdService extends FirebaseInstanceIdService {
    private  static final String REG_TOKEN="REG_TOKEN";
    String recent_token;

    @Override
    public void onTokenRefresh() {
         recent_token=FirebaseInstanceId.getInstance().getToken();
        //Log.d(REG_TOKEN, "Refreshed token: " + recent_token);

        // If you want to send messages to this application instance or
        // manage this apps subscriptions on the server side, send the
        // Instance ID token to your app server.
        sendRegistrationToServer(recent_token);
    }

    private void sendRegistrationToServer(String recent_token) {
    }


}
