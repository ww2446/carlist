package com.wanshuw.inclassassignment05_wanshuw;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Car> carArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    public void save(View view) {


        EditText name = (EditText)findViewById(R.id.name);
        String carName = name.getText().toString();

        EditText age = (EditText)findViewById(R.id.age);
        int carAge = Integer.parseInt(age.getText().toString());

        EditText mile = (EditText)findViewById(R.id.mile);
        double carMile = Double.parseDouble(mile.getText().toString());

        Car car = new Car(carName, carAge, carMile);
        carArrayList.add(car);
        name.setText("");
        age.setText("");
        mile.setText("");

        Toast.makeText(this, "Your car information has been saved.", Toast.LENGTH_SHORT).show();

    }

    public void display(View view) {

        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("Car List", carArrayList);
        carArrayList = new ArrayList<>();
        startActivity(intent);


    }
}

