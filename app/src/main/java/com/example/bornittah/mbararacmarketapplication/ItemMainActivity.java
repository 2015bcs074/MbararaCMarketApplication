package com.example.bornittah.mbararacmarketapplication;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import com.example.bornittah.mbararacmarketapplication.Fragments.Clothes;
import com.example.bornittah.mbararacmarketapplication.Fragments.Fruits;
import com.example.bornittah.mbararacmarketapplication.Fragments.Vegetables;

/**
 * Created by Bornittah on 11/27/2017.
 */

public class ItemMainActivity extends AppCompatActivity {
    private static final String TAG = "ItemMainActivity";
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    private Context context;
    String choiceOfUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_main);
        context=ItemMainActivity.this;


        fragmentManager=getSupportFragmentManager();
        fragmentTransaction=fragmentManager.beginTransaction();

        if(choiceOfUser.equals("Vegetables")){
            Fragment frag=new Vegetables();
            fragmentTransaction.replace(R.id.item,frag);
            fragmentTransaction.commit();
        }
        if(choiceOfUser.equals("Fruits")){
            Fragment frag=new Fruits();
            fragmentTransaction.replace(R.id.item,frag);
            fragmentTransaction.commit();
        }

        if(choiceOfUser.equals("Clothings")){
            Fragment frag=new Clothes();
            fragmentTransaction.replace(R.id.item,frag);
            fragmentTransaction.commit();
        }

    }
}
