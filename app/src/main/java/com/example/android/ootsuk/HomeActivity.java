package com.example.android.ootsuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import android.media.Image;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    CardView discover1;
    ImageView mtwitter ;
    ImageView minsta;
    ImageView mfb;
    CardView know1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageSlider imageSlider=findViewById(R.id.slider);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.s1png));
        slideModels.add(new SlideModel(R.drawable.s2png));
        slideModels.add(new SlideModel(R.drawable.s3png));
        //slideModels.add(new SlideModel("https://picsum.photos/id/891/300/200","Image 4"));
        imageSlider.setImageList(slideModels,true);


        discover1=findViewById(R.id.discover);

        discover1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Discover.class);
                startActivity(i);
            }
        });
        know1=findViewById(R.id.know);
        know1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HomeActivity.this, Know.class);
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
