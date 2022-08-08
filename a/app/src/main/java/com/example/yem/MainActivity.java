package com.example.yem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }







    public void btnProcalculate(View view) {

        Intent intent = new Intent(this, Calculator.class);
        startActivity(intent);
    }

    public void btnProgradeclick(View view) {
        Intent intent = new Intent(this, totalGrade.class);
        startActivity(intent);
    }

    public void btnProtempclick(View view) {
        Intent intent = new Intent(this, Temperature.class);
        startActivity(intent);
    }
}