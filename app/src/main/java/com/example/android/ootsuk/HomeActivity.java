package com.example.android.ootsuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    CardView discover1;
    ImageView mtwitter ;
    ImageView minsta;
    ImageView mfb;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        discover1=findViewById(R.id.discover);

        discover1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Discover.class);
                startActivity(i);
            }
        });
        mtwitter=(ImageView)findViewById(R.id.twitter);
        mtwitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/BeMoreOotSuk")));
                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/BeMoreOotSuk")));
                }
            }
        });
        mfb=(ImageView)findViewById(R.id.fb);
        mfb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/BeMoreOotSuk/")));
                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/BeMoreOotSuk/")));
                }
            }
        });
        minsta=(ImageView)findViewById(R.id.insta);
        minsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/bemoreootsuk/")));
                }catch (Exception e) {
                    startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/bemoreootsuk/")));
                }
            }
        });

    }

    @Override
    public void onBackPressed() {

        super.onBackPressed();
    }



}
