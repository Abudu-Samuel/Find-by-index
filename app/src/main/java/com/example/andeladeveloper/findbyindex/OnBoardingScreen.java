package com.example.andeladeveloper.findbyindex;

import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class OnBoardingScreen extends AppCompatActivity {
//    @BindView(R.id.view_page)
//    ViewPager viewPager;
    @BindView(R.id.next_button)
    TextView nextButton;
    @BindView(R.id.cyan)
    ImageView cyan;
    @BindView(R.id.yellow)
    ImageView yellow;
    @BindView(R.id.prev_button)
    TextView previousButton;
    @BindView(R.id.change_text)
    TextView changeText;
    @BindView(R.id.change_image)
    ImageView changeImage;
    @BindView(R.id.on_login)
    Button onLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);

        ButterKnife.bind(this);

//        ImageAdapter adapterView = new ImageAdapter(this);
//        viewPager.setAdapter(adapterView);

        nextColor();
        previousColor();
        yellow.setAlpha(.2f);

        changeText.setText("Upload your recipe or food");
        changeImage.setImageResource(R.drawable.summer_barbeque_feast);
        previousButton.setVisibility(View.INVISIBLE);

       onLogin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(getApplicationContext(), Login.class);
               startActivity(intent);
           }
       });

    }

    public void nextColor() {
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cyan.setAlpha(.2f);
                yellow.setAlpha(1f);
                previousButton.setVisibility(View.VISIBLE);
                nextButton.setVisibility(View.INVISIBLE);
                changeText.setText("Get paid for your delicious meal");
                changeImage.setImageResource(R.drawable.sbs_jollof);

            }
        });
    }

    public void previousColor() {
        previousButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cyan.setAlpha(1f);
                yellow.setAlpha(.2f);
                changeText.setText("Upload your recipe or food");
                previousButton.setVisibility(View.INVISIBLE);
                nextButton.setVisibility(View.VISIBLE);
                changeImage.setImageResource(R.drawable.summer_barbeque_feast);
            }
        });
    }

}
