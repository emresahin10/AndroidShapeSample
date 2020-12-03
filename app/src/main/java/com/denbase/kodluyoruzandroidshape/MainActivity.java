package com.denbase.kodluyoruzandroidshape;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnCloudy, btnSunny, btnSnowy, btnRainy;
    private ImageView imgDurum, imageView;
    private Drawable drawable;
    private TextView txtDurum, txtDerece;
    private ConstraintLayout background;

    int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCloudy = findViewById(R.id.btnCloudy);
        btnSunny = findViewById(R.id.btnSunny);
        btnSnowy = findViewById(R.id.btnSnowy);
        btnRainy = findViewById(R.id.btnRainy);

        imgDurum = findViewById(R.id.imgDurum);
        background = findViewById(R.id.background);

        txtDerece = findViewById(R.id.txtDerece);
        txtDurum = findViewById(R.id.txtDurum);


        btnCloudy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level = 0;
                imgDurum.setImageLevel(level);
                txtDerece.setText(R.string.cloduyDerece);
                txtDurum.setText(R.string.cloudy);
                background.setBackgroundResource(R.drawable.cloudy);
            }
        });


        btnSunny.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level = 1;
                imgDurum.setImageLevel(level);
                txtDerece.setText(R.string.sunnyDerece);
                txtDurum.setText(R.string.sunny);
                background.setBackgroundResource(R.drawable.sunny);


            }
        });

        btnSnowy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level = 2;
                imgDurum.setImageLevel(level);
                txtDerece.setText(R.string.snowyDerece);
                txtDurum.setText(R.string.snowy);
                background.setBackgroundResource(R.drawable.snowy);
            }
        });

        btnRainy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level = 3;
                imgDurum.setImageLevel(level);
                txtDerece.setText(R.string.rainyDerece);
                txtDurum.setText(R.string.rainy);
                background.setBackgroundResource(R.drawable.rainy);
            }
        });


    }
}