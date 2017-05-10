package com.example.wojtekkurylo.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MyMusic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_music);

        //open MainActivity Java from MyMusic, which will open activity_main
        Button openMainActivity = (Button) findViewById(R.id.back);
        openMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(MyMusic.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}
