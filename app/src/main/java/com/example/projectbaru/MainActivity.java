package com.example.projectbaru;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.projectbaru.Diana1;
import com.example.projectbaru.Diana2;
import com.example.projectbaru.Diana3;
import com.example.projectbaru.Diana4;
import com.example.projectbaru.Diana5;
import com.example.projectbaru.Diana6;


public class MainActivity extends AppCompatActivity {

    ImageView ivwhatsapp, ivfacebook, ivinstagram, ivtwitter, ivwordpress, ivyoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ivwhatsapp = findViewById(R.id.iv_whatsapp);
        ivwhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Diana1.class);
                startActivity(intent);
            }
        });

        ivfacebook= findViewById(R.id.iv_facebook);
        ivfacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Diana2.class);
                startActivity(intent);
            }
        });

        ivinstagram = findViewById(R.id.iv_instagram);
        ivinstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Diana3.class);
                startActivity(intent);
            }
        });

        ivtwitter = findViewById(R.id.iv_twitter);
        ivtwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Diana4.class);
                startActivity(intent);
            }
        });

        ivwordpress = findViewById(R.id.iv_wordpress);
        ivwordpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Diana5.class);
                startActivity(intent);
            }
        });

        ivyoutube = findViewById(R.id.iv_youtube);
        ivyoutube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent( MainActivity.this, Diana6.class);
                startActivity(intent);
            }
        });



    }
}