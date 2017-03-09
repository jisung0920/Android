package com.example.jisung.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//asdfsd
        Button b1,b2,b3,b4,b5;

        b1 = (Button)findViewById(R.id.button);
        b2 = (Button)findViewById(R.id.button2);
        b3 = (Button)findViewById(R.id.button3);
        b4 = (Button)findViewById(R.id.button4);
        b5 = (Button)findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {//button 클릭 이벤트리스너
            @Override
            public void onClick(View v) {//클릭시 행동
                Intent intent = new Intent(MainActivity.this,appleCalActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {//button 클릭 이벤트리스너
            @Override
            public void onClick(View v) {//클릭시 행동
                Intent intent = new Intent(MainActivity.this,AgeActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {//button 클릭 이벤트리스너
            @Override
            public void onClick(View v) {//클릭시 행동
                Intent intent = new Intent(MainActivity.this,DegreeActivity.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {//button 클릭 이벤트리스너
            @Override
            public void onClick(View v) {//클릭시 행동
                Intent intent = new Intent(MainActivity.this,RestoActivity.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {//button 클릭 이벤트리스너
            @Override
            public void onClick(View v) {//클릭시 행동
                Intent intent = new Intent(MainActivity.this,CalActivity.class);
                startActivity(intent);
            }
        });
    }
}
