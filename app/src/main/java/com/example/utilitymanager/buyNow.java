package com.example.utilitymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class buyNow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_now);

        Button buynow = (Button) findViewById(R.id.submit);

        buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(buyNow.this, room.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),
                        "Success",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}