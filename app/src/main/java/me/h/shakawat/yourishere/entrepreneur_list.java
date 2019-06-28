package me.h.shakawat.yourishere;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class entrepreneur_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrepreneur_list);

        Toast.makeText(entrepreneur_list.this, "Data is loading!",
                Toast.LENGTH_LONG).show();

        WebView myWebView = (WebView)findViewById(R.id.list);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("http://binimoi.com/android/entrepreneur_list.php");
        myWebView.setWebViewClient(new WebViewClient());
    }

}
