package com.example.p99buttonhomemade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView stroka;
    Button salmon;
    Button fish;
    Button kva;
    Button ali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stroka = (TextView) findViewById(R.id.stroka);
        salmon = (Button) findViewById(R.id.salmon);
        fish = (Button) findViewById(R.id.fish);
        kva = (Button) findViewById(R.id.kva);
        ali = (Button) findViewById(R.id.ali);

        salmon.setOnClickListener(this);
        fish.setOnClickListener(this);
        kva.setOnClickListener(this);
        ali.setOnClickListener(this);

    }




    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.salmon:
                stroka.setText("Это Лосось!");
                break;
            case R.id.fish:
                stroka.setText("Это Карп!");
                break;
            case R.id.kva:
                stroka.setText("Это Лягушка!");
                break;
            case R.id.ali:
                stroka.setText("Это Крокодил!");
                break;
        }
    }
}
