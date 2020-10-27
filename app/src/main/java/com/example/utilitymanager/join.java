package com.example.utilitymanager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class join extends AppCompatActivity {

    private static final String TAG = "join";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);

        final ListView lv = (ListView) findViewById(R.id.list);
        final EditText editText = (EditText) findViewById(R.id.roomId);
        final Button btn = (Button) findViewById(R.id.submit);

        String[] roomId = new String[] {
                "Room ID: XYCRES",
                "Room ID: CAYBVD"
        };

        final List<String> Room_list = new ArrayList<String>(Arrays.asList(roomId));

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>
                (this, R.layout.row, Room_list);

        lv.setAdapter(arrayAdapter);


        
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add new Items to List
                String input= editText.getText().toString();
                Room_list.add("Room ID: " + input);
                Log.d(TAG, "onClick: clicked");
                arrayAdapter.notifyDataSetChanged();
                Intent intent = new Intent(join.this, room.class);
                startActivity(intent);
                Toast.makeText(getApplicationContext(),
                        "Joined Successfully",
                        Toast.LENGTH_LONG)
                        .show();
            }
        });
    }
}