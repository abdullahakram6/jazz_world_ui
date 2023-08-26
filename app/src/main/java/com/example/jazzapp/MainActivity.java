package com.example.jazzapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ProgressBar;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CircularProgressBar circularProgressBar = findViewById(R.id.simpleProgressBar);
        CircularProgressBar circularProgressBar2 = findViewById(R.id.simpleProgressBar2);
        CircularProgressBar circularProgressBar3 = findViewById(R.id.simpleProgressBar3);


        // Set Progress

        circularProgressBar.setProgress(85f);
        circularProgressBar2.setProgress(25f);
        circularProgressBar3.setProgress(100f);


        MyListData[] myListData = new MyListData[] {
                new MyListData(R.drawable.jazz_internet_packages5, "1/5"),
                new MyListData(R.drawable.jazz_internet_packages2, "2/5"),
                new MyListData(R.drawable.jazz_internet_packages3, "3/5"),
                new MyListData(R.drawable.jazz_internet_packages4, "4/5"),
                new MyListData(R.drawable.jazz_internet_packages1, "5/5"),

        };

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        MyListAdapter adapter = new MyListAdapter(myListData);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(adapter);

    }
}