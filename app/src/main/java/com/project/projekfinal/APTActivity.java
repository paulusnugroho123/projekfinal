package com.project.projekfinal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.navigation.NavigationView;
import com.project.projekfinal.APT.IsiDataActivity;
import com.project.projekfinal.APT.ReportRateActivity;
import com.project.projekfinal.APT.ScheduleActivity;

public class APTActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener{

    DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBar;
    Toolbar toolbar;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_p_t);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Dasboard");
        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);
        actionBar = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.false1);
        drawerLayout.addDrawerListener(actionBar);
        actionBar.setDrawerIndicatorEnabled(true);
        actionBar.syncState();

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            if (item.getItemId() == R.id.edit){
                startActivity(new Intent(APTActivity.this, SettingProfileActivity.class));
            }else if (item.getItemId() == R.id.schedule){
                startActivity(new Intent(APTActivity.this, ScheduleActivity.class));
            }else if (item.getItemId() == R.id.report_rate){
                startActivity(new Intent(APTActivity.this, ReportRateActivity.class));
            }else if (item.getItemId() == R.id.isi_data){
                startActivity(new Intent(APTActivity.this, IsiDataActivity.class));
            }
//            drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
//            drawerLayout.closeDrawer(GravityCompat.START);

            return true;
    }
}
