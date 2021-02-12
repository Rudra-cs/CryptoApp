package com.rudra.cryptoapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

public class HomeActivity extends AppCompatActivity {
    private TextView username;
    private FirebaseFirestore firebaseFirestore;
    private FirebaseAuth firebaseAuthhome;
    private SharedPreferences prefManager;
    private SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        username=findViewById(R.id.username_display);
        prefManager = getApplicationContext().getSharedPreferences("LOGIN", MODE_PRIVATE);
        editor = prefManager.edit();

        FirebaseUser user=FirebaseAuth.getInstance().getCurrentUser();
        if (user!=null){
            username.setText(user.getDisplayName());
        }


    }

    public void onlogoutclicked(View view) {
        new AlertDialog.Builder(HomeActivity.this).setTitle("Alert")
                .setMessage("Are you sure you want to Logout")
                .setPositiveButton("Done", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        editor.putBoolean("ISLOGGEDIN", false);

                        editor.apply();
                        FirebaseAuth.getInstance().signOut();

                        startActivity(new Intent(HomeActivity.this, Login.class));
                        finish();
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

            }
        }).show();

    }
}
