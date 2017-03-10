package com.example.jisung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RestoActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    CheckBox c1;
    Button b1;
    TextView t1,t2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resto);
        setTitle("레스토랑 메뉴 주문");
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
                int pizza,spageti,salad,result,sum;

                if(e1.getText().toString().equals(""))
                    pizza = 0;
                else
                    pizza = Integer.parseInt(e1.getText().toString());
                if(e2.getText().toString().equals(""))
                    spageti =0;
                else
                    spageti = Integer.parseInt(e2.getText().toString());
                if(e3.getText().toString().equals(""))
                    salad = 0;
                else
                    salad = Integer.parseInt(e3.getText().toString());
                sum = pizza+spageti+salad;
                result = pizza*15000 + spageti*13000 + salad*9000;
                if(c1.isChecked()) {
                    result = (int) (0.9 * result);
                    Log.d("check","ok");
                }
                t1.setText(sum+"개");
                t2.setText(result+"원");
            }
        });
    }
}
