package com.example.jisung.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class RestoActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    CheckBox c1;
    Button b1;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);
        b1 = (Button)findViewById(R.id.b1);
        e1 = (EditText)findViewById(R.id.e1);
        e2 = (EditText)findViewById(R.id.e2);
        e3 = (EditText)findViewById(R.id.e3);
        c1 = (CheckBox) findViewById(R.id.c1);
        t1 = (TextView)findViewById(R.id.t1);
        t2 = (TextView)findViewById(R.id.t2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pizza = e1.getText().toString();
                String spageti = e2.getText().toString();
                String salad = e3.getText().toString();
                int result = Integer.parseInt(pizza)*15000 + Integer.parseInt(spageti)*13000 + Integer.parseInt(salad)*9000;
                if(c1.isChecked()) {
                    result = (int) 0.9 * result;
                    Log.d("check","ok");
                }
                t1.setText(result+"개");
            }
        });
    }
}
