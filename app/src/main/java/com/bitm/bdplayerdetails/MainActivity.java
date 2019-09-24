package com.bitm.bdplayerdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView  sakibIV,masrafiIV,musfiqIV,riadIV,taskinIV,tamimIV;
    private String sakib,masrafee,tamim,musfiq,riad,taskin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        init();

        imageclickaction();
    }



    private void init() {


        sakibIV=findViewById(R.id.sakibIV);
        masrafiIV=findViewById(R.id.masrafiIV);
        musfiqIV=findViewById(R.id.musfiqIV);
        riadIV=findViewById(R.id.riadIV);
        taskinIV=findViewById(R.id.taskinIV);
        tamimIV=findViewById(R.id.tamimIV);
    }


    private void imageclickaction() {

        sakibIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,PlayerDetails.class);
                intent.putExtra("name","Sakib");
                startActivity(intent);

            }
        });

        masrafiIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,PlayerDetails.class);
                intent.putExtra("name","Masrafi");

                startActivity(intent);


            }
        });

        musfiqIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PlayerDetails.class);
                intent.putExtra("name","Musfiq");
                startActivity(intent);
            }
        });
        riadIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PlayerDetails.class);
                intent.putExtra("name","Riad");
                startActivity(intent);
            }
        });

        taskinIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PlayerDetails.class);
                intent.putExtra("name","Taskin");
                startActivity(intent);
            }
        });


        tamimIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,PlayerDetails.class);
                intent.putExtra("name","Tamim");
                startActivity(intent);
            }
        });

    }

}
