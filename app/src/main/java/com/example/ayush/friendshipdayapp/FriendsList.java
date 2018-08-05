package com.example.ayush.friendshipdayapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FriendsList extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.friendslist);


        RelativeLayout akshitprofile = (RelativeLayout) findViewById(R.id.akshit_profile);
        akshitprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AkshitProfile;
                AkshitProfile = new Intent(FriendsList.this, AkshitProfile.class);
                startActivity(AkshitProfile);
            }
        });


        RelativeLayout alokprofile = (RelativeLayout) findViewById(R.id.alok_profile);
        alokprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AlokProfile;
                AlokProfile = new Intent(FriendsList.this, AlokProfile.class);
                startActivity(AlokProfile);
            }
        });


        RelativeLayout bhaveshprofile = (RelativeLayout) findViewById(R.id.bhavesh_profile);
        bhaveshprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BhaveshProfile;
                BhaveshProfile = new Intent(FriendsList.this, BhaveshProfile.class);
                startActivity(BhaveshProfile);
            }
        });


        RelativeLayout deepamprofile = (RelativeLayout) findViewById(R.id.deepam_profile);
        deepamprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DeepamProfile;
                DeepamProfile = new Intent(FriendsList.this, DeepamProfile.class);
                startActivity(DeepamProfile);
            }
        });


        RelativeLayout divyaprofile = (RelativeLayout) findViewById(R.id.divya_profile);
        divyaprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent DivyaProfile = new Intent(FriendsList.this, DivyaProfile.class);
                startActivity(DivyaProfile);
            }
        });


    }


}