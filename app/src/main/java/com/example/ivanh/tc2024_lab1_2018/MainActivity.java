package com.example.ivanh.tc2024_lab1_2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnStartAnotherActivity;
        Button myOtherButton;

        btnStartAnotherActivity = (Button) findViewById(R.id.button);
        myOtherButton = (Button) findViewById(R.id.button2);

        btnStartAnotherActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(MainActivity.this, ChildActivity.class);
                startActivity(intent);
            }
        });

        myOtherButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent2 = new Intent(MainActivity.this, OtherActivity.class);
                startActivity(intent2);
            }
        });

    }
}
