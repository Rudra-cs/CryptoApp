package com.rudra.cryptoapp.ui;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.rudra.cryptoapp.R;

import static android.content.ContentValues.TAG;

class MyFirebaseMessagingService extends FirebaseMessagingService {

    public MyFirebaseMessagingService(){
        super();
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        getfirebasemessage(remoteMessage.getNotification().getTitle(), remoteMessage.getNotification().getBody());
    }

    public void getfirebasemessage(String title,String msg)
    {
        NotificationCompat.Builder builder= new NotificationCompat.Builder(this,"myfirebasechannel")
                .setSmallIcon(R.drawable.ic__notifications)
                .setContentTitle(title)
                .setContentText(msg)
                .setAutoCancel(true);

        NotificationManagerCompat manager= NotificationManagerCompat.from(this);
        manager.notify(101,builder.build());


    }

}
