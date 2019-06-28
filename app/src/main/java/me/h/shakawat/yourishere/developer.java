package me.h.shakawat.yourishere;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class developer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developer);
    }

    public void shofiq(View v){
        String url = "https://www.facebook.com/ahmad.shofiq.7";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

//    yusuf
    public void yusuf(View v){
        String url = "https://www.facebook.com/shahyusufahmed";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }

    //    kaiyum
    public void kaiyum(View v){
        String url = "https://www.facebook.com/MDkaiumKhan307";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }


    //    rony
    public void rony(View v){
        String url = "https://www.facebook.com/syed.ashib.zaman";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}


