package com.example.cherianyit.starterhacks2019;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;


import android.widget.ImageButton;

public class EmergencyListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_emergency_list_view);
    }

    private  void lauchActivity() {
        Intent intent = new Intent(this, MapsView.class);
        startActivity(intent);
    }


}
