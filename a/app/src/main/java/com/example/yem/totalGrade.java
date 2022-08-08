package com.example.yem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class totalGrade extends AppCompatActivity {
    private TextView txttot;
    private EditText edtno1;
    private  EditText edtno2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_grade);

        txttot =findViewById(R.id.Txttotal);
        edtno1 =findViewById(R.id.edtfirstno);
        edtno2  =findViewById(R.id.edtscondno);
        Button buttsal =findViewById(R.id.btncalculate);
    }
    public static int totalGrade(int numb1, int numb2){
        return (numb1 + numb2);
    }
    public void btnresult(View view) {
        String strno1=edtno1.getText().toString();

        String strno2=edtno2.getText().toString();
        if(strno1.length()==0){

            strno1="0";
        }


        if(strno2.length()==0){
            strno2="0";
        }


        try {
            String aString = Integer.toString(totalGrade(Integer.parseInt(strno1),Integer.parseInt(strno2)));
            txttot.setText(aString);

        } catch (Exception e) {
            // This will catch any exception, because they are all descended from Exception
            System.out.println("Error " + e.getMessage());

        }
    }

    public void btnback(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}