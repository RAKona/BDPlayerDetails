package com.bitm.bdplayerdetails;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlayerDetails extends AppCompatActivity {

    private TextView detailsTV;
    private ImageView imagesakib,imagetamim,imageriad,imagetaskin,imagemusfiq,imagemasrafi;
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player_details);

        init();

        name=getIntent().getStringExtra("name");

        detailsTV=findViewById(R.id.detalsTV);
        getIntent().getStringExtra("details");

        if (name.equals("Sakib")

        ) {

            detailsTV.setText(R.string.sakib);
            imagesakib.setVisibility(View.VISIBLE);
        }

        else if(name.equals("Masrafi")) {


            detailsTV.setText(R.string.masrafi);
            imagemasrafi.setVisibility(View.VISIBLE);


        }

        else if(name.equals("Musfiq")){

            detailsTV.setText(R.string.musfiq);
            imagemusfiq.setVisibility(View.VISIBLE);

        }




        else if(name.equals("Riad")){

            detailsTV.setText(R.string.riad);
            imageriad.setVisibility(View.VISIBLE);

        }


        else if(name.equals("Taskin")){

            detailsTV.setText(R.string.taskin);
            imagetaskin.setVisibility(View.VISIBLE);

        }

        else if(name.equals("Tamim")){

            detailsTV.setText(R.string.tamim);
            imagetamim.setVisibility(View.VISIBLE);

        }


    }

    private void init() {

        imagesakib=findViewById(R.id.imagesakib);
        imagetamim=findViewById(R.id.imagetamim);
        imagemasrafi=findViewById(R.id.imagemasrafi);
        imagemusfiq=findViewById(R.id.imagemusfiq);
        imageriad=findViewById(R.id.imageriad);
        imagetaskin=findViewById(R.id.imagetaskin);
    }
}
