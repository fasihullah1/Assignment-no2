package com.example.sabahathamid.assignmentno2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<flag> Istflag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Istflag = new ArrayList<>();


        Istflag.add(new flag("Afghanistan",R.drawable.af));
        Istflag.add(new flag("Bangladesh",R.drawable.bd));
       // Istflag.add(new flag("Brazil",R.drawable.flag_brazil_XL));
        Istflag.add(new flag("Canada",R.drawable.canada));
        Istflag.add(new flag("England",R.drawable.england));
        Istflag.add(new flag("Germany",R.drawable.germany));
        Istflag.add(new flag("Ireland",R.drawable.ir));
        Istflag.add(new flag("Pakistan",R.drawable.pakistan));
        Istflag.add(new flag("India",R.drawable.india));
        Istflag.add(new flag("Nepal",R.drawable.np));
        Istflag.add(new flag("Turkey",R.drawable.tr));
        Istflag.add(new flag("USA",R.drawable.united));

        RecyclerView my_rcview = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter madapter = new RecyclerViewAdapter(this, Istflag);
        my_rcview.setLayoutManager(new GridLayoutManager(this, 3));
        my_rcview.setAdapter(madapter);



    }
}
