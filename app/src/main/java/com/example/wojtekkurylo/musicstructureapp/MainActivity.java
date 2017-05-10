package com.example.wojtekkurylo.musicstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //open MyMusic Java from MainActivity, which will open activity_my_music

        // Find the View that shows the myMusic category
        // to show Android - "after clicking what part of screen" execute onClick method
        Button openActivityMusic = (Button) findViewById(R.id.myMusic);

        // Set a click listener on that View
        // setOnClickListener is a View class METHOD with input parameter OnClickListener
        // in bracket we are creating new object with variable which is its reference(address)
        openActivityMusic.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the myMusic View is clicked on.
            // onClick method belong to OnClickListener object (event Listener object)
            // method is not returning anything and is type View view = after clicking the screen
            // @Override because onCLick method is blank (Iterfrace) - thanks to that we can
            // ask Android to do anything we code.
            @Override
            public void onClick(View view) {
                Intent musicActivity = new Intent(MainActivity.this, MyMusic.class);
                startActivity(musicActivity);
//                Toast.makeText(view.getContext(),"Toast test in onClick method",Toast.LENGTH_SHORT).show();
            }
        });

        //open RecentlyListened Java from MainActivity, which will open activity_recently_plistened
        Button openRecListActivity = (Button) findViewById(R.id.recentlyListened);
        openRecListActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent recListActivity = new Intent(MainActivity.this, RecentlyListened.class);
                startActivity(recListActivity);
            }
        });

        //open ByArtist Java from MainActivity, which will open activity_by_artist
        Button openByArtistActivity = (Button) findViewById(R.id.byArtist);
        openByArtistActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent byArtistActivity = new Intent(MainActivity.this, ByArtist.class);
                startActivity(byArtistActivity);
            }
        });

        //open MyPlaylist Java from MainActivity, which will open activity_my_playlist
        Button openMyPlaylistActivity = (Button) findViewById(R.id.myPlaylist);
        openMyPlaylistActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myPlaylistActivity = new Intent(MainActivity.this, MyPlaylist.class);
                startActivity(myPlaylistActivity);
            }
        });
    }

}

