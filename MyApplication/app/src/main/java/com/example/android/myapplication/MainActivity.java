package com.example.android.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView textView = new TextView (this);
        textView.setText("Wooow!");
        textView.setTextColor(0xff00ff00);
        setContentView(textView);
    }
}
