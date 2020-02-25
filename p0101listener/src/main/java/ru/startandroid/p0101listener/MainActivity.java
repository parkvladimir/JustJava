package ru.startandroid.p0101listener;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ScrollView sv = new ScrollView(this);
        final LinearLayout ll = new LinearLayout(this);
        ll.setOrientation(LinearLayout.VERTICAL);
        sv.addView(ll);

        TextView tv = new TextView(this);
        tv.setText("Суши Бар чек лист");
        ll.addView(tv);

        EditText et = new EditText(this);
        et.setText("weeeeeeeeeee~!");
        ll.addView(et);

        Button b = new Button(this);
        b.setText("Создать чеклист");
        ll.addView(b);



        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for(int i = 0; i < 20; i++) {
                    CheckBox cb = new CheckBox(getApplicationContext());
                    cb.setText("I'm dynamic!");
                    ll.addView(cb);
                }
            }
        });


        this.setContentView(sv);

    }
}