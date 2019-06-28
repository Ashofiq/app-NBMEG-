package me.h.shakawat.yourishere;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AlbumActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        img = (ImageView) findViewById(R.id.img);
    }

    public void click(View v){
        Intent i = new Intent(AlbumActivity.this, fullscreen.class);
        i.putExtra("img", R.drawable.p1);
        startActivity(i);
    }

    public void click1(View v){
        Intent i = new Intent(AlbumActivity.this, fullscreen.class);
        i.putExtra("img", R.drawable.p2);
        startActivity(i);
    }

    public void click2(View v){
        Intent i = new Intent(AlbumActivity.this, fullscreen.class);
        i.putExtra("img", R.drawable.p3);
        startActivity(i);
    }

    public void click3(View v){
        Intent i = new Intent(AlbumActivity.this, fullscreen.class);
        i.putExtra("img", R.drawable.p4);
        startActivity(i);
    }

    public void click4(View v){
        Intent i = new Intent(AlbumActivity.this, fullscreen.class);
        i.putExtra("img", R.drawable.p5);
        startActivity(i);
    }

    public void click5(View v){
        Intent i = new Intent(AlbumActivity.this, fullscreen.class);
        i.putExtra("img", R.drawable.p6);
        startActivity(i);
    }

    public void click6(View v){
        Intent i = new Intent(AlbumActivity.this, fullscreen.class);
        i.putExtra("img", R.drawable.p8);
        startActivity(i);
    }

    public void click7(View v){
        Intent i = new Intent(AlbumActivity.this, fullscreen.class);
        i.putExtra("img", R.drawable.p8);
        startActivity(i);
    }
}
