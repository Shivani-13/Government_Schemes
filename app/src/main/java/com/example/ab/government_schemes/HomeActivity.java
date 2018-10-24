package com.example.ab.government_schemes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton b1= (ImageButton)findViewById(R.id.b1);
        ImageButton b2= (ImageButton)findViewById(R.id.b2);
        ImageButton b3= (ImageButton)findViewById(R.id.b3);
        ImageButton b4= (ImageButton)findViewById(R.id.b4);
        ImageButton b5= (ImageButton)findViewById(R.id.b5);
        ImageButton b6= (ImageButton)findViewById(R.id.b6);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent (HomeActivity.this,one.class);
                startActivity(i1);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent (HomeActivity.this,two.class);
                startActivity(i1);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent (HomeActivity.this,three.class);
                startActivity(i1);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent (HomeActivity.this,four.class);
                startActivity(i1);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent (HomeActivity.this,five.class);
                startActivity(i1);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1= new Intent (HomeActivity.this,six.class);
                startActivity(i1);
            }
        });

    }
}
