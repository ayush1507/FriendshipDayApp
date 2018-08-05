package com.example.ayush.friendshipdayapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView viewFriends = (TextView) findViewById(R.id.View_Friends);
        viewFriends.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent friendList = new Intent(MainActivity.this, FriendsList.class);
                startActivity(friendList);

            }
        });


    }
}
