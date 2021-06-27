package com.example.unconvertow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void btnClick(View view) {

        EditText kg_amount = (EditText) findViewById(R.id.editTextNumber);
        String kgvalue = kg_amount.getText().toString();
        Double kgDouble = Double.parseDouble(kgvalue);
        Double double_pound = 2.205 * kgDouble;

        TextView txtoutput = findViewById(R.id.textView3);


        txtoutput.setText("The Coresponding Pound Value is " + double_pound);


    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}