package com.example.p0121logandmess;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView tvOut;
    Button btnOk;
    Button btnCancel;

    private static final String Tag = "myLogs";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d(Tag, "Найдем Вью - элементы");
        tvOut = (TextView) findViewById(R.id.tvOut);
        btnOk = (Button) findViewById(R.id.btnOk);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        Log.d(Tag, "присваиваем обработчик кнопкам");
        btnOk.setOnClickListener (this);
        btnCancel.setOnClickListener (this);
    }

    @Override
    public void onClick(View v) {
        Log.d(Tag, "по id определяем кнопку, вызвавшую этот обработчик");
        switch (v.getId()){
            case R.id.btnOk:
                tvOut.setText("Нажал кнопку ОК");
                Toast.makeText(this, "Нажата кнопка ОК", Toast.LENGTH_LONG).show();
                break;
            case R.id.btnCancel:
                tvOut.setText("Нажал кнопку ОТМЕНА");
                Toast.makeText(this, "Нажата кнопка Отмена", Toast.LENGTH_LONG).show();
                break;
        }
    }
}
