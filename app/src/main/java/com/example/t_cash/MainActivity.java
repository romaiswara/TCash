package com.example.t_cash;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.kidach1.tinderswipe.model.CardModel;
import com.kidach1.tinderswipe.view.CardContainer;
import com.kidach1.tinderswipe.view.SimpleCardStackAdapter;
import com.yuyakaido.android.cardstackview.CardStackView;

import org.jetbrains.annotations.NotNull;

public class MainActivity extends AppCompatActivity {
    Button btbMenu1, btbMenu2, btbMenu3, btbMenu4, btbMenu5, btbMenu6, btbMenu7, btbMenu8,btbMenu9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cardView = (CardView) findViewById(R.id.cardView);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DetailActivity.class));
            }
        });

        btbMenu1 = findViewById(R.id.btnMenu1);
        btbMenu2 = findViewById(R.id.btnMenu2);
        btbMenu3 = findViewById(R.id.btnMenu3);
        btbMenu4 = findViewById(R.id.btnMenu4);
        btbMenu5 = findViewById(R.id.btnMenu5);
        btbMenu6 = findViewById(R.id.btnMenu6);
        btbMenu7 = findViewById(R.id.btnMenu7);
        btbMenu8 = findViewById(R.id.btnMenu8);
        btbMenu9 = findViewById(R.id.btnMenu9);

        onClick(btbMenu1);
        onClick(btbMenu2);
        onClick(btbMenu3);
        onClick(btbMenu4);
        onClick(btbMenu5);
        onClick(btbMenu6);
        onClick(btbMenu7);
        onClick(btbMenu8);
        onClick(btbMenu9);


//        CardModel cardModel = new CardModel("Coba Swipe", "Deskripsi dari Card", "https://dw9to29mmj727.cloudfront.net/misc/newsletter-naruto3.png");
//        SimpleCardStackAdapter adapter = new SimpleCardStackAdapter(this);
//        adapter.add(cardModel);
//
//        CardContainer cardContainer = (CardContainer) findViewById(R.id.cardContainer);
//        cardContainer.setAdapter(adapter);
//
//        cardModel.setOnCardDismissedListener(new CardModel.OnCardDismissedListener() {
//            @Override
//            public void onLike(@NotNull CardContainer.OnLikeListener onLikeListener) {
//                Toast.makeText(MainActivity.this, "Like", Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onDislike() {
//                Toast.makeText(MainActivity.this, "Dislike", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    private void onClick(Button btn){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, DetailMenuActivity.class));
            }
        });
    }
}
