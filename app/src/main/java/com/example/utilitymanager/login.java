package com.example.utilitymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    Button mGuest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mGuest = findViewById(R.id.guestButton);

        mGuest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mGuest.animate().scaleX(1.05f).scaleY(1.05f).setDuration(1000);
                mGuest.setBackgroundResource(R.drawable.text_corner1);
                final Handler handler1 = new Handler();
                handler1.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        Intent i = new Intent(login.this, MainActivity.class);
                        startActivity(i);
                    }
                }, 1000);
            }
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        mGuest.setBackgroundResource(R.drawable.button_corner);
        mGuest.animate().scaleX(1.0f).scaleY(1.0f);
    }


}