package me.h.shakawat.yourishere;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;


public class fullscreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullscreen);

        ImageView fullscreenimage = findViewById(R.id.fullscreenimage);
        Bundle bundle = getIntent().getExtras();

        if (bundle != null){
            int name = bundle.getInt("img");
            fullscreenimage.setImageResource(name);
        }

        if (bundle != null){
            int name = bundle.getInt("img");
            fullscreenimage.setImageResource(name);
        }


    }
}
