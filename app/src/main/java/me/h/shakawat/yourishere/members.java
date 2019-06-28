package me.h.shakawat.yourishere;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.support.v7.widget.SearchView;
import android.widget.TextView;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class members extends AppCompatActivity {

    SearchView searchview;
    ListView listview;

    //test
    TextView showdata;
    String t1= "";
    String t2 = "";

    //    String [] name = {"Name : ahmad shofiq" + "\n" + "Blood : A+ " + "\n" + "Distict: Pabna" +"\n"+"Mobile: 01767-404822",
    //            "Name : mostofa shofiq" + "\n" + "Blood : B+ " + "\n" + "Distict: Pabna" +"\n"+"Mobile: 01767-404822",
//            "Name : habib shofiq" + "\n" + "Blood : B- " + "\n" + "Distict: Pabna" +"\n"+"Mobile: 01767-404822",
//            "Name : nehal shofiq" + "\n" + "Blood : A- " + "\n" + "Distict: dhaka" +"\n"+"Mobile: 01767-404822",
//            "Name : ahmad shofiq" + "\n" + "Blood : A+ " + "\n" + "Distict: pabna" +"\n"+"Mobile: 01767-404822",
//            "Name : mostofa shofiq" + "\n" + "Blood : B+ " + "\n" + "Distict: Pabna" +"\n"+"Mobile: 01767-404822",
//            "Name : habib shofiq" + "\n" + "Blood : B- " + "\n" + "Distict: Pabna" +"\n"+"Mobile: 01767-404822",
//            "Name : nehal shofiq" + "\n" + "Blood : A- " + "\n" + "Distict: dhaka" +"\n"+"Mobile: 01767-404822",
//    };

    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_members);

        //Webview code
//        WebView myWebView = (WebView)findViewById(R.id.webView);
//        WebSettings webSettings = myWebView.getSettings();
//        webSettings.setJavaScriptEnabled(true);
//        myWebView.loadUrl("http://binimoi.com/android/search.php");
//        myWebView.setWebViewClient(new WebViewClient());

        showdata = findViewById(R.id.showdata);
        parsedata();
    }

     void parsedata(){
        String myurl = "http://binimoi.com/android/dataparse.php";

        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(myurl, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for(int i =1; i < response.length(); i++){
                    try {
                        JSONObject jsonObject = (JSONObject) response.get(i);

                        t1 = t1 + jsonObject.getString("name")+"\n";
                        t2 = t2 + jsonObject.getString("address")+"\n";


                    }catch (JSONException e){
                        e.printStackTrace();
                    }
                }

                showdata.setText(t1);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("volley log", error);
            }
        });

        me.h.shakawat.yourishere.AppController.getInstance().addToRequestQueue(jsonArrayRequest);


    }
}
