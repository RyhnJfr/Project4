package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void onTransfer(View v){
        TextView disname =(TextView) findViewById(R.id.textView);
        Intent intent1= getIntent();

        Bundle b =intent1.getBundleExtra("bundleData");
        String uname=b.getString("name1");
        disname.setText("your name is:"+uname);
    }
    public void onClickBack(View v){
        finish();
    }
}