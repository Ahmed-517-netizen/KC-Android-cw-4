package com.example.yem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Temperature extends AppCompatActivity {
    private TextView txttot;
    private EditText edtno1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        txttot =findViewById(R.id.TxttempResult);
        edtno1 =findViewById(R.id.edttemp);
    }

    public void btntempclick(View view) {
        String strno1=edtno1.getText().toString();
        if(strno1.length()==0){

            strno1="0";
        }
        if(Integer.parseInt(strno1)>=23){
            txttot.setText("Hot");

        }else{

            txttot.setText("Cold");
        }
    }

    public void btnback(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}