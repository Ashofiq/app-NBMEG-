package me.h.shakawat.yourishere;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainNavActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_nav);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    public void btnbloodid(View v){
        Intent i = new Intent(MainNavActivity.this, blood.class);
        startActivity(i);
    }

    public void btnAlbumId(View v){
        Intent i = new Intent(MainNavActivity.this, AlbumActivity.class);
        startActivity(i);
    }

    public void btnAboutId(View v){
        Intent i = new Intent(MainNavActivity.this, AboutActivity.class);
        startActivity(i);
    }

    public void btnQuoteId(View v){
        Intent i = new Intent(MainNavActivity.this, content.class);
        startActivity(i);
    }

    public void entid(View v){
        Intent i = new Intent(MainNavActivity.this, entrepreneur_list.class);
        startActivity(i);
    }

    public void regid(View v){
        Intent i = new Intent(MainNavActivity.this, registration.class);
        startActivity(i);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
                Intent i = new Intent(MainNavActivity.this, developer.class);
                startActivity(i);
                break;

            case R.id.feedback:
                Intent f = new Intent(MainNavActivity.this, feedback.class);
                startActivity(f);
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

            case R.id.videoId:
                Intent in = new Intent(getApplicationContext(), video.class);
                startActivity(in);
                break;

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
        //drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
