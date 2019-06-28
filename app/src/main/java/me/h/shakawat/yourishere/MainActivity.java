package me.h.shakawat.yourishere;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    Toolbar toolbar;

    DrawerLayout drawerLayout;
    NavigationView navigationView;

    Button profileBtn, albumBtn, aboutBtn, quoteBtn, reviewBtn, notificationBtn, entid;

    Intent intent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbarId);

        setSupportActionBar(toolbar);


        profileBtn = findViewById(R.id.btnProfileId);
        albumBtn = findViewById(R.id.btnAlbumId);
        aboutBtn = findViewById(R.id.btnAboutId);
        quoteBtn = findViewById(R.id.btnQuoteId);
        reviewBtn = findViewById(R.id.btnReviewId);
        notificationBtn = findViewById(R.id.btnNotificationId);
        entid = findViewById(R.id.entid);

        Handler handler = new Handler();
        profileBtn.setOnClickListener(handler);
        albumBtn.setOnClickListener(handler);
        aboutBtn.setOnClickListener(handler);
        quoteBtn.setOnClickListener(handler);
        reviewBtn.setOnClickListener(handler);
        notificationBtn.setOnClickListener(handler);

        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView = findViewById(R.id.navigation_view);


        //navigationView.setNavigationItemSelectedListener(this);


        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawerLayout, toolbar, R.string.open_drawer, R.string.close_drawer);
        drawerLayout.setDrawerListener(toggle);

        toggle.syncState();
    }



    class Handler implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            if (v.getId()==R.id.btnProfileId){
                //Toast.makeText(MainActivity.this, "Clicked Profile", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(MainActivity.this, blood.class);
                startActivity(i);

            }
            else if (v.getId()==R.id.btnAlbumId){
                intent = new Intent(getApplicationContext(), AlbumActivity.class);
                startActivity(intent);
            }
            else if (v.getId()==R.id.btnAboutId){
                intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent);
            }
            else if (v.getId()==R.id.btnQuoteId){
                intent = new Intent(getApplicationContext(), content.class);
                startActivity(intent);
            }
            else if (v.getId()==R.id.btnReviewId){
                intent = new Intent(getApplicationContext(), content.class);
                startActivity(intent);
            }
            else if (v.getId()==R.id.btnNotificationId){
                Intent i = new Intent(getApplicationContext(), registration.class);
                startActivity(i);
            }
            else if (v.getId()==R.id.entid){
                Intent i = new Intent(getApplicationContext(), registration.class);
                startActivity(i);
            }
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main,menu);

        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        switch (id){

            case R.id.setting:
                String url = "https://www.facebook.com/Iqbalbahar28/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.dev:
                Intent i = new Intent(MainActivity.this, developer.class);
                startActivity(i);
                break;

            case R.id.exId:
                finish();
                System.exit(0);


        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        switch (id){

            case R.id.starredId:
                String url = "https://www.facebook.com/Iqbalbahar28/";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
                break;

            case R.id.sentEmailId:
                String urll = "https://www.youtube.com/channel/UCxvtB0vjoabTeK-JdajFyYA";
                Intent intentt = new Intent(Intent.ACTION_VIEW);
                intentt.setData(Uri.parse(urll));
                startActivity(intentt);
                break;

            case R.id.aboutUId:
                intent = new Intent(getApplicationContext(), AboutActivity.class);
                startActivity(intent);
                break;

            case R.id.exId:
                finish();
                System.exit(0);
        }
        drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed() {

        if (drawerLayout.isDrawerOpen(GravityCompat.START)){

            drawerLayout.closeDrawer(GravityCompat.START);

        }else{
            super.onBackPressed();
        }
    }
}
