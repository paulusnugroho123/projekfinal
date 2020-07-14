package com.project.projekfinal;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;

import com.google.android.material.navigation.NavigationView;

public class KepalaKantorActivity extends AppCompatActivity {

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBar;
    Toolbar toolbar;
    NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kepala_kantor);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Dasboard");
        drawerLayout = findViewById(R.id.drawer_kepala_kantor);
        navigationView = findViewById(R.id.nav_view);
        actionBar = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.false1);
        drawerLayout.addDrawerListener(actionBar);
        actionBar.setDrawerIndicatorEnabled(true);
        actionBar.syncState();

    }
}
