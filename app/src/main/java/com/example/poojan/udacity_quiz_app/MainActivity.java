package com.example.poojan.udacity_quiz_app;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private Window window;
ImageView Computer;
ImageView Gk;
ImageView Sport;
ImageView Science;
ImageView Politics;
ImageView Geography;
ImageView GameOfthrones;
ImageView Friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        window=getWindow();
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LAYOUT_STABLE);
        setup();
        Click();

    }
    void setup()
    {
        Computer=(ImageView)findViewById(R.id.computer);
        Gk=(ImageView)findViewById(R.id.gk);
        Sport=(ImageView)findViewById(R.id.sport);
        Science=(ImageView)findViewById(R.id.science);
        Politics=(ImageView)findViewById(R.id.politics);
        Geography=(ImageView)findViewById(R.id.geography);
        GameOfthrones=(ImageView)findViewById(R.id.got);
        Friends=(ImageView)findViewById(R.id.friends);
    }
    void Click()
    {
        Computer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Computer.class);

                startActivity(i);
            }
        });
        Gk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,GK.class);

                startActivity(i);
            }
        });
        Sport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Sport.class);
                startActivity(i);
            }
        });
        Science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Science.class);
                startActivity(i);
            }
        });
        Politics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Politics.class);
                startActivity(i);
            }
        });
        Geography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Geography.class);
                startActivity(i);
            }
        });
        GameOfthrones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,GameOfThrones.class);
                startActivity(i);
            }
        });
        Friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Friends.class);
                startActivity(i);
            }
        });
    }

}
