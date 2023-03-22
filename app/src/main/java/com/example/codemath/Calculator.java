package com.example.codemath;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Calculator extends AppCompatActivity{


    private EditText amount;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        amount = (EditText) findViewById(R.id.numberInput);
        Button enterButton =(Button) findViewById(R.id.enterButton);

        result = (TextView) findViewById(R.id.result);

        enterButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                            displayResult();
            }
        });
    }

    private void displayResult()
        {
           double amount__ = Double.valueOf(amount.getText().toString());

           double tip = amount__* 0.15;
           result.setText( " = " + tip);

        }
}