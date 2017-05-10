package com.example.wojtekkurylo.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RecentlyListened extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recently_listened);

        //open MainActivity Java from MyMusic, which will open activity_main
        Button openMainActivity = (Button) findViewById(R.id.back);
        openMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainActivity = new Intent(RecentlyListened.this, MainActivity.class);
                startActivity(mainActivity);
            }
        });
    }
}
