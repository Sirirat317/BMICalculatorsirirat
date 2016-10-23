package com.example.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.bmicalculator.model.Human;

import java.text.DecimalFormat;

import static com.example.bmicalculator.R.id.button_ca;
import static com.example.bmicalculator.R.id.editText;

public class MainActivity extends AppCompatActivity {
private Human H;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        H = new Human(" "," ");

        Button Calclate = (Button) findViewById(R.id.button_ca);
        Calclate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {




                Intent go = new Intent(MainActivity.this , GoActivity.class);
                EditText Hi = (EditText) findViewById(editText);
                EditText We = (EditText) findViewById(R.id.editText2);
                ///go.putExtra("numHi",Hi.getText().toString());
                ///go.putExtra("numWe",We.getText().toString());
                startActivity(go);


            }
        });

           AlertDialog.Builder builder = new AlertDialog.Builder(this);
           builder.setTitle("ผิดพลาด");
           builder.setMessage("ป้อนข้อมูลไม่ครบ");
           builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialog, int which) {


               }
           });
           builder.show();




    }

    public void onClick(View v) {
        int id = v.getId();

        if(id == button_ca){
            Calu(editText);

        }


    }

    public void Calu(double i){
        H.calHi(i);
    }


    }

