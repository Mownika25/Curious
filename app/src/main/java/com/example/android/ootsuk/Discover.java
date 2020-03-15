package com.example.android.ootsuk;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Discover extends AppCompatActivity {
    private Question_Library mQuestionLibrary=new Question_Library();
    private TextView mScoreView;
    private TextView mQuestionView;
    int n;

    private CardView mButtonChoice1;
    private CardView mButtonChoice2;
    private CardView mButtonChoice3;
    private CardView mButtonChoice4;
    private CardView mButtonChoice5;
    private Button mnext;
    private Button mback;
   private TextView minc1;
    private TextView minc2;
    private TextView minc3;
    private TextView minc4;
    private TextView minc5;
     private String type;
     public double myCQ=2.0;
     public double myCQJoyous;
    public double myCQStress;
    public double myCQThrill;
    public double myCQSocial;
    public double myCQDeprivation;
    public double lowestValue;
    public String profile;
    public LinearLayout ll;
    public LinearLayout ll1;
    public ProgressBar pb1;
    public ProgressBar pb2;
    public ProgressBar pb3;
    public ProgressBar pb4;
    public ProgressBar pb5;
    public TextView txt1;
    public TextView txt2;
    public TextView txt3;
    public TextView txt4;
    public TextView txt5;
    public TextView res;



    private String mtype;
    private int mScore = 0;
    private int mQuestionNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (CardView) findViewById(R.id.choice1);
        mButtonChoice2 = (CardView) findViewById(R.id.choice2);
        mButtonChoice3 = (CardView) findViewById(R.id.choice3);
        mButtonChoice4 = (CardView) findViewById(R.id.choice4);
        mButtonChoice5 = (CardView) findViewById(R.id.choice5);
        mnext=(Button)findViewById(R.id.next) ;
        mback=(Button)findViewById(R.id.back);
       minc1=(TextView)findViewById(R.id.textinc1);
        minc2=(TextView)findViewById(R.id.textinc2);
        minc3=(TextView)findViewById(R.id.textinc3);
        minc4=(TextView)findViewById(R.id.textinc4);
        minc5=(TextView)findViewById(R.id.textinc5);
        ll=(LinearLayout)findViewById(R.id.results);
        pb1=(ProgressBar)findViewById(R.id.progress_horizontal1);
        pb2=(ProgressBar)findViewById(R.id.progress_horizontal2);
        pb3=(ProgressBar)findViewById(R.id.progress_horizontal3);
        pb4=(ProgressBar)findViewById(R.id.progress_horizontal4);
        pb5=(ProgressBar)findViewById(R.id.progress_horizontal5);
        ll.setVisibility(View.INVISIBLE);
        ll1=(LinearLayout)findViewById(R.id.questions);
        txt1=(TextView)findViewById(R.id.text1);
        txt2=(TextView)findViewById(R.id.text2);
        txt3=(TextView)findViewById(R.id.text3);
        txt4=(TextView)findViewById(R.id.text4);
        txt5=(TextView)findViewById(R.id.text5);
        res=(TextView)findViewById(R.id.profile) ;

        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //GradientDrawable gd = new GradientDrawable();
                mButtonChoice1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                mButtonChoice2.setBackgroundColor(Color.parseColor("#86eb34"));
                mButtonChoice3.setBackgroundColor(Color.parseColor("#eb8634"));
                mButtonChoice4.setBackgroundColor(Color.parseColor("#eb5c34"));
                mButtonChoice5.setBackgroundColor(Color.parseColor("#34b7eb"));

                //mButtonChoice1.setBackgroundColor(Color.GRAY);
                n=1;









            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonChoice1.setBackgroundColor(Color.parseColor("#ebe534"));
                //mButtonChoice2.setBackgroundColor(Color.parseColor("#86eb34"));
                mButtonChoice3.setBackgroundColor(Color.parseColor("#eb8634"));
                mButtonChoice4.setBackgroundColor(Color.parseColor("#eb5c34"));
                mButtonChoice5.setBackgroundColor(Color.parseColor("#34b7eb"));
                mButtonChoice2.setBackgroundColor(Color.parseColor("#FFFFFF"));

                mButtonChoice2.setPreventCornerOverlap(true);
                mButtonChoice3.setPreventCornerOverlap(true);

                n=2;



            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonChoice1.setBackgroundColor(Color.parseColor("#ebe534"));
                mButtonChoice2.setBackgroundColor(Color.parseColor("#86eb34"));
                mButtonChoice3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                mButtonChoice4.setBackgroundColor(Color.parseColor("#eb5c34"));
                mButtonChoice5.setBackgroundColor(Color.parseColor("#34b7eb"));
                //mButtonChoice3.setBackgroundColor(Color.BLACK);

                n=3;





            }
        });
        mButtonChoice4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonChoice1.setBackgroundColor(Color.parseColor("#ebe534"));
                mButtonChoice2.setBackgroundColor(Color.parseColor("#86eb34"));
                mButtonChoice3.setBackgroundColor(Color.parseColor("#eb8634"));
                mButtonChoice4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                mButtonChoice5.setBackgroundColor(Color.parseColor("#34b7eb"));
               // mButtonChoice4.setBackgroundColor(Color.BLACK);

                n=4;



            }
        });
        mButtonChoice5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mButtonChoice1.setBackgroundColor(Color.parseColor("#ebe534"));
                mButtonChoice2.setBackgroundColor(Color.parseColor("#86eb34"));
                mButtonChoice3.setBackgroundColor(Color.parseColor("#eb8634"));
                mButtonChoice4.setBackgroundColor(Color.parseColor("#eb5c34"));
                mButtonChoice5.setBackgroundColor(Color.parseColor("#FFFFFF"));
                //mButtonChoice5.setBackgroundColor(Color.BLACK);

                n=5;


            }
        });
         mnext.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 switch(n){
                     case 1:
                         if(mtype=="J" || mtype=="D" || mtype=="T" || mtype=="C")
                         { myCQ+=1;
                             myCQJoyous+=1;
                             myCQDeprivation+=1;
                             myCQThrill+=1;
                             myCQSocial=+1;
                         }
                         if(mtype=="S")
                         {
                             myCQ+=3;
                             myCQStress+=3;


                         }
                         break;
                     case 2:
                         if(mtype=="J" || mtype=="D" || mtype=="T" || mtype=="C")
                         { myCQ+=1.5;
                             myCQJoyous+=1.5;
                             myCQDeprivation+=1.5;
                             myCQThrill+=1.5;
                             myCQSocial=+1.5;
                         }
                         if(mtype=="S")
                         {
                             myCQ+=2.5;
                             myCQStress+=2.5;


                         }
                       break;
                     case 3:
                         if(mtype=="J" || mtype=="D" || mtype=="T" || mtype=="C")
                         { myCQ+=2;
                             myCQJoyous+=2;
                             myCQDeprivation+=2;
                             myCQThrill+=2;
                             myCQSocial=+2;
                         }
                         if(mtype=="S")
                         {
                             myCQ+=2;
                             myCQStress+=2;


                         }
                         break;
                     case 4:
                         if(mtype=="J" || mtype=="D" || mtype=="T" || mtype=="C")
                         { myCQ+=2.5;
                             myCQJoyous+=2.5;
                             myCQDeprivation+=2.5;
                             myCQThrill+=2.5;
                             myCQSocial=+2.5;
                         }
                         if(mtype=="S")
                         {
                             myCQ+=1.5;
                             myCQStress+=1.5;


                         }
                         break;
                     case 5:
                         if(mtype=="J" || mtype=="D" || mtype=="T" || mtype=="C")
                         { myCQ+=3;
                             myCQJoyous+=3;
                             myCQDeprivation+=3;
                             myCQThrill+=3;
                             myCQSocial=+3;
                         }
                         if(mtype=="S")
                         {
                             myCQ+=1;
                             myCQStress+=1;


                         }
                         break;

                 }

                 updateQuestion();
             }
         });
         mback.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 myCQStress=0;
                 myCQSocial=0;
                 myCQThrill=0;
                 myCQDeprivation=0;
                 myCQJoyous=0;
                 Intent i = new Intent(Discover.this, HomeActivity.class);
                 startActivity(i);
             }
         });


    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        minc1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        minc2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        minc3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
        minc4.setText(mQuestionLibrary.getChoice4(mQuestionNumber));
        minc5.setText(mQuestionLibrary.getChoice5(mQuestionNumber));
        mButtonChoice1.setBackgroundColor(Color.parseColor("#ebe534"));
        mButtonChoice2.setBackgroundColor(Color.parseColor("#86eb34"));
        mButtonChoice3.setBackgroundColor(Color.parseColor("#eb8634"));
        mButtonChoice4.setBackgroundColor(Color.parseColor("#eb5c34"));
        mButtonChoice5.setBackgroundColor(Color.parseColor("#34b7eb"));

        mtype= mQuestionLibrary.getType(mQuestionNumber);
        mQuestionNumber++;
        Log.v("no.of question","no2 is "+mQuestionNumber);
        if(mQuestionNumber>=20){
            Log.v("no.of question","no is "+mQuestionNumber);
            ll1.setVisibility(View.INVISIBLE);
            calculate();

        }
    }
    public void calculate(){
        myCQ=(myCQ*100)/60;
        myCQ = Math.round(myCQ*100)/100.0d;
        lowestValue=Math.min(myCQJoyous,Math.min(myCQDeprivation,Math.min(myCQSocial,Math.min(myCQStress,myCQThrill))));
        //profile
        if (myCQJoyous > 8 && lowestValue == myCQDeprivation) {
            profile = "Explorer";
        } else if (myCQDeprivation > 8 && lowestValue == myCQSocial) {
            profile = "Problem-Solver";
        } else if (myCQSocial > 8 && lowestValue == myCQThrill) {
            profile = "Empathizer";
        } else {
            profile = "Avoider";
        }
        Log.v("th","1no"+profile);
        res.setText(profile);

        ll.setVisibility(View.VISIBLE);
        Log.v("th","1no"+myCQJoyous);
        Log.v("th","1no"+myCQDeprivation);
        Log.v("th","1no"+myCQThrill);
        Log.v("th","1no"+myCQSocial);
        Log.v("th","1no"+myCQStress);
        myCQJoyous=(myCQJoyous*100)/48;
        myCQJoyous = Math.round(myCQJoyous*100)/100.0d;

        myCQDeprivation=(myCQDeprivation*100)/48;
        myCQDeprivation = Math.round(myCQDeprivation*100)/100.0d;

        myCQThrill=(myCQThrill*100)/48;
        myCQThrill = Math.round(myCQThrill*100)/100.0d;

        myCQSocial=(myCQSocial*100)/48;
        myCQSocial = Math.round(myCQSocial*100)/100.0d;

        myCQStress=(myCQStress*100)/12;
        myCQStress = Math.round(myCQStress*100)/100.0d;
        Log.v("th","no"+myCQJoyous);
        Log.v("th","no"+myCQDeprivation);
        Log.v("th","no"+myCQThrill);
        Log.v("th","no"+myCQSocial);
        Log.v("th","no"+myCQStress);

        pb1.setProgress((int)myCQJoyous);
        pb2.setProgress((int)myCQDeprivation);
        pb3.setProgress((int)myCQThrill);
        pb4.setProgress((int)myCQSocial);
        pb5.setProgress((int)myCQStress);
        String cqj= Double.toString(myCQJoyous);
        txt1.setText(cqj);
        String cqd= Double.toString(myCQDeprivation);
        txt2.setText(cqd);
        String cqt= Double.toString(myCQThrill);
        txt3.setText(cqt);
        String cqs= Double.toString(myCQSocial);
        txt4.setText(cqs);
        String cqst= Double.toString(myCQStress);
        txt5.setText(cqst);












    }

}

