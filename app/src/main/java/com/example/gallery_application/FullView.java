package com.example.gallery_application;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class FullView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.full_image_view);

        ImageView imageView = (ImageView) findViewById(R.id.img_full);
        int img_id = getIntent().getExtras().getInt("img_id");

        imageView.setImageResource(img_id);
        getSupportActionBar().hide();
    }
}
