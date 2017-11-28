package com.example.bornittah.mbararacmarketapplication;

import android.content.Context;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    String[] items={"Fruits","Clothings","Vegetables"};

    private Context context;
    String users_choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=MainActivity.this;


        int config=getResources().getConfiguration().orientation;
        if(config== Configuration.ORIENTATION_LANDSCAPE){


            setContentView(R.layout.landscape);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapt=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapt);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout Layout1= (RelativeLayout) findViewById(R.id.fruits);
                RelativeLayout Layout2= (RelativeLayout) findViewById(R.id.vegetables);
                RelativeLayout Layout3= (RelativeLayout) findViewById(R.id.clothes);
                RelativeLayout Layout4= (RelativeLayout) findViewById(R.id.homepage);

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    users_choice=String.valueOf(parent.getItemAtPosition(position));
                    switch (users_choice){
                        case "Vegetables":

                            Layout2.setVisibility(View.VISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);

                            break;
                        case "Fruits":

                            Layout2.setVisibility(View.INVISIBLE);
                            Layout1.setVisibility(View.VISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);
                            break;

                        case "Clothings":
                            Layout3.setVisibility(View.VISIBLE);
                            Layout2.setVisibility(View.INVISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);
                            break;

                    }
                }
            });


        }

        else if(config== Configuration.ORIENTATION_PORTRAIT){


            setContentView(R.layout.potrait);
            ListView listView= (ListView) findViewById(R.id.list);

            ListAdapter adapt=new ArrayAdapter<String>(context,android.R.layout.simple_list_item_1,items);
            listView.setAdapter(adapt);

            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                RelativeLayout Layout1= (RelativeLayout) findViewById(R.id.fruits);
                RelativeLayout Layout2= (RelativeLayout) findViewById(R.id.vegetables);
                RelativeLayout Layout3= (RelativeLayout) findViewById(R.id.clothes);
                RelativeLayout Layout4= (RelativeLayout) findViewById(R.id.homepage);

                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    users_choice=String.valueOf(parent.getItemAtPosition(position));
                    switch (users_choice){
                        case "Vegetables":

                            Layout1.setVisibility(View.INVISIBLE);
                            Layout2.setVisibility(View.VISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);

                            break;
                        case "Fruits":

                            Layout2.setVisibility(View.INVISIBLE);
                            Layout1.setVisibility(View.VISIBLE);
                            Layout3.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);
                            break;

                        case "Clothings":
                            Layout3.setVisibility(View.VISIBLE);
                            Layout2.setVisibility(View.INVISIBLE);
                            Layout1.setVisibility(View.INVISIBLE);
                            Layout4.setVisibility(View.INVISIBLE);
                            break;

                    }
                }
            });


        }

    }

}

