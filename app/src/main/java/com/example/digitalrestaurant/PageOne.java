package com.example.digitalrestaurant;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.digitalrestaurant.UserData.ItemData;

import java.util.ArrayList;

public class PageOne extends AppCompatActivity {

    ArrayList<ItemData> myItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_one);

        myItems=new ArrayList<ItemData>();

        populateItemInfo();


    }

    public void makeAdaptor(){



    }

   public void populateItemInfo(){


       myItems.add(new ItemData(12,"meat","European" ));


    }


}