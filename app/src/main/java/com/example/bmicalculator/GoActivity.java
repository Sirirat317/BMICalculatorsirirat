package com.example.bmicalculator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.bmicalculator.model.Human;

/**
 * Created by Kmsuju on 23/10/2559.
 */

public class GoActivity extends AppCompatActivity {
    private Human H;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);

        H = new Human(" "," ");

        Intent go2 = getIntent();
        String _Hi = go2.getStringExtra("numHi");
        String _We = go2.getStringExtra("numWe");







       TextView Mo = (TextView) findViewById(R.id.textView4);
        Mo.setText(H.get());

        /*TextView Mo2 = (TextView) findViewById(R.id.textView7);
        Mo2.setText(H.getdata());*/




    }




}
