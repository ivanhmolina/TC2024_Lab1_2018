package com.example.ivanh.tc2024_lab1_2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        Button returnButton;

        returnButton = (Button) findViewById(R.id.returnChild);

        returnButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(ChildActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
