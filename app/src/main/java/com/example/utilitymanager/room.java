package com.example.utilitymanager;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class room extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);
        toolbar = findViewById(R.id.toolbarhome);
        setSupportActionBar(toolbar);

        Button buynow = (Button) findViewById(R.id.buynow);

        buynow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(room.this, buyNow.class);
                startActivity(intent);
            }
        });

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.navigationView);
        navigationView.setNavigationItemSelectedListener(this);

        actionBarDrawerToggle = new ActionBarDrawerToggle(room.this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.setDrawerIndicatorEnabled(true);
        actionBarDrawerToggle.syncState();

        final ListView lv = (ListView) findViewById(R.id.list);
        final EditText editText = (EditText) findViewById(R.id.roomId);
        final Button btn = (Button) findViewById(R.id.submit);

        String[] roomId = new String[]{
                "Member 1: Ujval",
                "Member 2: Dhruvil",
                "Member 3: Yash H. Patel",
                "Member 4: Ishan",
                "Member 5: Soham",
                "Member 6: JD",
                "Member 7: Joshi",
                "Member 8: Dhruv",
                "Member 9: Yash Shah",
                "Member 10: Parva",
        };

        final List<String> Room_list = new ArrayList<String>(Arrays.asList(roomId));

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>
                (this, R.layout.row, Room_list);

        lv.setAdapter(arrayAdapter);

        arrayAdapter.notifyDataSetChanged();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}