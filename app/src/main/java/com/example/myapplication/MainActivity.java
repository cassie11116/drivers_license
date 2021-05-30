package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;
// Group 2 : Leslie Benzyne T. Viluan
//           Mary Christine Cas
public class MainActivity extends AppCompatActivity {

    EditText editName,
             editAdr,
             editNat,
             editSex,
             editDob,
             editHeight,
             editWeight





            ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
        editAdr = findViewById(R.id.editAdr);
        editNat = findViewById(R.id.editNat);
        editSex = findViewById(R.id.editSex);
        editDob = findViewById(R.id.editDob);
        editHeight = findViewById(R.id.editHeight);
        editWeight = findViewById(R.id.editWeight);



    }


    public void buttonn(View view) {
        Intent LicenseIntent = new Intent(MainActivity.this, DriversLicenseView.class);
        String name = editName.getText().toString();
        String adress = editAdr.getText().toString();
        String nationality = editNat.getText().toString();
        String sex = editSex.getText().toString();
        String dob = editDob.getText().toString();
        String height = editHeight.getText().toString();
        String weight = editWeight.getText().toString();


        LicenseIntent.putExtra("Name", name);
        LicenseIntent.putExtra("Adress", adress);
        LicenseIntent.putExtra("Nationality",nationality);
        LicenseIntent.putExtra("Sex", sex);
        LicenseIntent.putExtra("Dob", dob);
        LicenseIntent.putExtra("Height", height);
        LicenseIntent.putExtra("Weight", weight);



        if (TextUtils.isEmpty(editName.getText())) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Name", Toast.LENGTH_SHORT).show();
            editName.setError("Field Cant Be Empty");
            View targetview1 = findViewById(R.id.editName);
            targetview1.getParent().requestChildFocus(targetview1, targetview1);
        }  if (TextUtils.isEmpty(editAdr.getText())) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Adress", Toast.LENGTH_SHORT).show();
            editName.setError("Field Cant Be Empty");
            View targetview = findViewById(R.id.editAdr);
            targetview.getParent().requestChildFocus(targetview, targetview);
        } if (TextUtils.isEmpty(editNat.getText())) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Nationality", Toast.LENGTH_SHORT).show();
            editNat.setError("Field Cant Be Empty");
            View targetview = findViewById(R.id.editNat);
            targetview.getParent().requestChildFocus(targetview, targetview);
        } if (TextUtils.isEmpty(editSex.getText())) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Sex", Toast.LENGTH_SHORT).show();
            editSex.setError("Field Cant Be Empty");
            View targetview = findViewById(R.id.editSex);
            targetview.getParent().requestChildFocus(targetview, targetview);
        } if (TextUtils.isEmpty(editDob.getText())) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Date of Birth", Toast.LENGTH_SHORT).show();
            editDob.setError("Field Cant Be Empty");
            View targetview = findViewById(R.id.editDob);
            targetview.getParent().requestChildFocus(targetview, targetview);
        } if (TextUtils.isEmpty(editWeight.getText())) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Weight", Toast.LENGTH_SHORT).show();
            editWeight.setError("Field Cant Be Empty");
            View targetview = findViewById(R.id.editWeight);
            targetview.getParent().requestChildFocus(targetview, targetview);
        } if (TextUtils.isEmpty(editHeight.getText())) {
            Toast.makeText(getApplicationContext(), "Please Enter Your Height", Toast.LENGTH_SHORT).show();
            editHeight.setError("Field Cant Be Empty");
            View targetview = findViewById(R.id.editHeight);
            targetview.getParent().requestChildFocus(targetview, targetview);
        }



        else {
            MaterialAlertDialogBuilder builder = new MaterialAlertDialogBuilder(this);
            builder.setTitle("Form Submission");
            builder.setMessage("Do you want to display your Driver's License");
            builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {


                    startActivity(LicenseIntent);

                }
            });
            builder.setNegativeButton("No",null);
            AlertDialog alert = builder.create();
            alert.show();

        }

    }
}

