package com.example.saathi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bottom_Nav;
FrameLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottom_Nav=findViewById(R.id.bottom_Nav);
        container=findViewById(R.id.container);
        loadFragment(new Home_fragment(),true);
        bottom_Nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id=item.getItemId();
                if(id==R.id.home){

                    loadFragment(new Home_fragment(),false);
                }else if(id== R.id.profile)
                {
                    loadFragment(new Profile_fragment(),false);

                }else if(id==R.id.chats){
                    loadFragment(new Chats_fragment(),false);


                }else if(id==R.id.location){

                    loadFragment(new Location_fragment(),false);
                }
                else if(id==R.id.notify){

                    loadFragment(new Notifiaction_fragment(),false);

                }











                return false;
            }
        });
    }
    public void loadFragment(Fragment fragment,boolean flag){
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        if(flag==true)
        ft.add(R.id.container,fragment);
        else
            ft.replace(R.id.container,fragment);
        ft.commit();
    }
}