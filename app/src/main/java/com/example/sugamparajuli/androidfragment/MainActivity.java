package com.example.sugamparajuli.androidfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void selectFrag(View view){
        Fragment fr;
        if (view== findViewById(R.id.button2)){
            fr = new FragmentTwo();
        }else{
            fr = new FragmentOne();
        }
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_place, fr);
        fragmentTransaction.commit();
    }
}
