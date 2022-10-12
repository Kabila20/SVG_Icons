package com.example.svg_icons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button);
        imageView = findViewById(R.id.image);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        imageView.setVisibility(View.VISIBLE);
    }
}