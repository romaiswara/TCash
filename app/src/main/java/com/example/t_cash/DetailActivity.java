package com.example.t_cash;

import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbarLayout.setTitle("");
        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.appbar);
        appBarLayout.setExpanded(true);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);


        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            boolean isShow = false;
            int scrollRange = -1;
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
                if (scrollRange == -1){
                    scrollRange = appBarLayout.getTotalScrollRange();
                }
                if (scrollRange + i == 0){
//                    getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//                    getSupportActionBar().setDisplayShowHomeEnabled(true);
                    collapsingToolbarLayout.setTitle("Detail Blog");
                    isShow = true;
                } else if (isShow){
//                    getSupportActionBar().setDisplayHomeAsUpEnabled(false);
//                    getSupportActionBar().setDisplayShowHomeEnabled(false);
                    collapsingToolbarLayout.setTitle("");
                    isShow=false;
                }
            }
        });
    }
}
