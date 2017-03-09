package com.example.jisung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DegreeActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_degree);

        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        final String subsi = e1.getText().toString();
        final String whasi = e2.getText().toString();

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = Integer.parseInt(subsi)*1.8+32;
                Toast.makeText(getApplicationContext(),"화씨 온도는"+result+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double result = (Integer.parseInt(whasi)-32)/1.8;
                Toast.makeText(getApplicationContext(),"섭씨 온도는"+result+"입니다.",Toast.LENGTH_SHORT).show();

            }
        });
    }
}