package com.example.ivanh.tc2024_lab1_2018;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = getApplicationContext();

        Button btnStartAnotherActivity;
        btnStartAnotherActivity = (Button) findViewById(R.id.buttonSubmit);

        final TextView userName;
        userName = (TextView) findViewById(R.id.username);

        final TextView userPassword;
        userPassword = (TextView) findViewById(R.id.password);

        btnStartAnotherActivity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(context, Activity2.class);
                final String username = userName.getText().toString();
                final String password = userPassword.getText().toString();
                intent.putExtra("USER_NAME",username);
                intent.putExtra("USER_PASSWORD",password);
                startActivity(intent);
            }
        });

    }
}
