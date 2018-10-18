package com.example.t_cash;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class DetailMenuActivity extends AppCompatActivity {
    List<String> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Detail");
        setSupportActionBar(toolbar);

        list = new ArrayList<>();
        for (int i=0; i<5; i++){
            list.add("Menu "+i);
        }

        DetailAdapter adapter = new DetailAdapter(this, list);

        RecyclerView rvMenu = findViewById(R.id.rvDetail);
        rvMenu.setLayoutManager(new LinearLayoutManager(this));
        rvMenu.setHasFixedSize(true);
        rvMenu.setAdapter(adapter);


    }
}
