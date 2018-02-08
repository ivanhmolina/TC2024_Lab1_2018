package com.example.ivanh.tc2024_lab1_2018;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        context = getApplicationContext();

        Intent intent = getIntent();
        String username = intent.getStringExtra("USER_NAME");
        String password = intent.getStringExtra("USER_PASSWORD");
        String wrong = "Wrong!";

        TextView Title;
        Title = (TextView) findViewById(R.id.title2);

        Toast MyToast = Toast.makeText(context, "Password OK!",Toast.LENGTH_SHORT);

        AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);

        DialogConf.setTitle("Oops!!!");
        DialogConf.setMessage("Wrong Password");
        DialogConf.setIcon(R.mipmap.ic_launcher);
        DialogConf.setNeutralButton("Retry", new DialogInterface.OnClickListener(){
            public void onClick(DialogInterface dialog, int id){
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }
        });
        AlertDialog MyDialog = DialogConf.create();

        if(password.equals("LaLlave")){
            Title.setText("Welcome "+username+"!");
            MyToast.show();
        }else{
            Title.setText(wrong);
            MyDialog.show();
        }
    }
}
