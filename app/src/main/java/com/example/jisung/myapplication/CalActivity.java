package com.example.jisung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalActivity extends AppCompatActivity {
    EditText e1,e2;
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        setTitle("계산기");
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        b1 = (Button)findViewById(R.id.b1);
        b2 = (Button)findViewById(R.id.b2);
        b3 = (Button)findViewById(R.id.b3);
        b4 = (Button)findViewById(R.id.b4);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하세요.", Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하세요.", Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    String tmp1 = e1.getText().toString();
                    String tmp2 = e2.getText().toString();
                    int a = Integer.parseInt(tmp1);
                    int b = Integer.parseInt(tmp2);
                    int result = a + b;
                    Toast.makeText(getApplicationContext(), "더하기 계산 결과는" + result + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하세요.", Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하세요.", Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    String tmp1 = e1.getText().toString();
                    String tmp2 = e2.getText().toString();
                    int a = Integer.parseInt(tmp1);
                    int b = Integer.parseInt(tmp2);
                    int result = a - b;
                    Toast.makeText(getApplicationContext(), "빼기 계산결과는" + result + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하세요.", Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하세요.", Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    String tmp1 = e1.getText().toString();
                    String tmp2 = e2.getText().toString();
                    int a = Integer.parseInt(tmp1);
                    int b = Integer.parseInt(tmp2);
                    int result = a * b;
                    Toast.makeText(getApplicationContext(), "곱하기 계산결과는" + result + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(e1.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하세요.", Toast.LENGTH_SHORT).show();
                    e1.requestFocus();
                }
                else if(e2.getText().toString().equals("")) {
                    Toast.makeText(getApplicationContext(), "입력하세요.", Toast.LENGTH_SHORT).show();
                    e2.requestFocus();
                }
                else {
                    String tmp1 = e1.getText().toString();
                    String tmp2 = e2.getText().toString();
                    double a = Integer.parseInt(tmp1);
                    double b = Integer.parseInt(tmp2);
                    double result = a / b;
                    Toast.makeText(getApplicationContext(), "나누기 계산결과는" + (int) result + "입니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
