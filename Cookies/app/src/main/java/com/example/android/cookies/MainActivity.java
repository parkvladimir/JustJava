package com.example.android.cookies;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Called when the cookie should be eaten.
     */
    public void eatCookie(View view) {
        ImageView imageViewPicture = (ImageView)  findViewById(R.id.android_cookie_image_view);
        imageViewPicture.setImageResource(R.drawable.after_cookie); ;

        TextView soFullText = (TextView) findViewById(R.id.status_text_view);
        soFullText.setText ("I'm so full!");

        // TODO: Find a reference to the ImageView in the layout. Change the image.

        // TODO: Find a reference to the TextView in the layout. Change the text.

    }
}