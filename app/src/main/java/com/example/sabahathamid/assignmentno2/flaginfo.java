package com.example.sabahathamid.assignmentno2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class flaginfo extends AppCompatActivity {

    private TextView Counrty_Name;
    private ImageView Country_flag_img;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_flaginfo);

            Counrty_Name = (TextView) findViewById(R.id.Country_Name_Id);
            Country_flag_img = (ImageView) findViewById(R.id.Country_Image_Id);

            // Retrieve Data
            Intent intent = getIntent();
            String Name = intent.getExtras().getString("c_name");
            int flag = intent.getExtras().getInt("c_thumbnail");

            Counrty_Name.setText(Name);
            Country_flag_img.setImageResource(flag);
    }
}
