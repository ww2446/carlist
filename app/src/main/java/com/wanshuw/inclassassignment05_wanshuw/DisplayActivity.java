package com.wanshuw.inclassassignment05_wanshuw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        Intent intent = getIntent();
        ArrayList<Car> car = (ArrayList<Car>) intent.getSerializableExtra("Car List");

        String displayMessage = "";
        for(int i= 0;i<car.size();i++)
        {
            String list = car.get(i).toString();
            displayMessage= displayMessage + list;
        }

        TextView show = (TextView)findViewById(R.id.show);
        show.setText(displayMessage);


    }
}
