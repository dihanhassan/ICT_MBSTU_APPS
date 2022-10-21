package com.example.imageslide;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageButton;

import com.google.android.material.navigation.NavigationView;

public class routine_1y1s extends AppCompatActivity {
    WebView webView;
    ImageButton imageButton;
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    androidx.appcompat.widget.Toolbar toolbar;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_routine1y1s);
        // Tool Bar
        drawerLayout = (DrawerLayout) findViewById(R.id.drawerLayoutr_1y2sID);
        navigationView = (NavigationView) findViewById(R.id.navigatio_r1y2sID);
        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolBar_r1y2sID);
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigration_open, R.string.navigration_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();


        // web view

        webView = (WebView) findViewById(R.id.webView_1y2s_ID);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/r1y1s.html");
    }
    public void funShow (View view){
        Intent intent;
        if (view.getId()==R.id.r1y1s_backID){
            intent = new Intent(routine_1y1s.this,classRoutine.class);
            startActivity(intent);
        }
    }
}