package com.dumb.adminpanel_alim;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.dumb.adminpanel_alim.Auth.login_page;
import com.dumb.adminpanel_alim.fragment.alim_fragment;
import com.dumb.adminpanel_alim.fragment.user_fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Main_Activity extends AppCompatActivity {

    String alimFragmentTag="alim";
    String userFragmentTag="user";

    @Override
    protected void onResume() {
        super.onResume();

    }

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        Window window = getWindow();

// clear FLAG_TRANSLUCENT_STATUS flag:
        window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
        window.setStatusBarColor(ContextCompat.getColor(this,R.color.nav_color));




        bottomNavigationView=findViewById(R.id.bottomNavigationView);

        Fragment selectedFragment = new alim_fragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container,
                selectedFragment,alimFragmentTag).commit();


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (item.getItemId()==R.id.alim){
                    Fragment selectedFragment = new alim_fragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,
                            selectedFragment,alimFragmentTag).commit();
                }
                if (item.getItemId()==R.id.users){
                    Fragment selectedFragment = new user_fragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,
                            selectedFragment,alimFragmentTag).commit();
                }
                if(item.getItemId()==R.id.logout) {
                    startActivity(new Intent(Main_Activity.this, login_page.class));
                    finish();
                }
                return false;
            }
        });

    }
}