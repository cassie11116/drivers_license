package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DriversLicenseView extends AppCompatActivity {
TextView displayName,
         displayAdr,
         displayNat,
         displaySex,
         displayDob,
         displayHeight,
         displayWeight;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drivers_license_view);

        displayName = findViewById(R.id.displayName);
        displayAdr = findViewById(R.id.displayAdr);
        displayNat = findViewById(R.id.displayNat);
        displaySex = findViewById(R.id.displaySex);
        displayDob = findViewById(R.id.displayDob);
        displayHeight = findViewById(R.id.displayHeight);
        displayWeight = findViewById(R.id.displayWeight);

        Intent LicenseIntent = getIntent();
        String name = LicenseIntent.getStringExtra("Name");
        String adress = LicenseIntent.getStringExtra("Adress");
        String nationality = LicenseIntent.getStringExtra("Nationality");
        String sex = LicenseIntent.getStringExtra("Sex");
        String dob = LicenseIntent.getStringExtra("Date Of Birth");
        String height = LicenseIntent.getStringExtra("Height");
        String weight = LicenseIntent.getStringExtra("Weight");

        displayName.setText(name);
        displayAdr.setText(adress);
        displayNat.setText(nationality);
        displayDob.setText(dob);
        displayHeight.setText(height);
        displayWeight.setText(weight);

    }
}

