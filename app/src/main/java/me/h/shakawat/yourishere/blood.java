package me.h.shakawat.yourishere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class blood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood);

        Toast.makeText(blood.this, "loading....!",
                Toast.LENGTH_LONG).show();

        WebView myWebView = (WebView)findViewById(R.id.blood);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://binimoi.com/android/blood_donor.php");
        myWebView.setWebViewClient(new WebViewClient());
    }
}
