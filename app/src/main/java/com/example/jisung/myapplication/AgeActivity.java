package com.example.jisung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AgeActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_age);

        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String year = e1.getText().toString();
                int result = 2018-Integer.parseInt(year);
                Toast.makeText(getApplicationContext(),"당신의 나이는"+result+"입니다.",Toast.LENGTH_SHORT).show();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String age = e2.getText().toString();
                int result = 2018-Integer.parseInt(age);
                Toast.makeText(getApplicationContext(),"당신의 태어난연도는"+result+"입니다.",Toast.LENGTH_SHORT).show();

            }
        });

    }
}
