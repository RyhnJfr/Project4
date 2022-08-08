package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickSecond(View v) {
        EditText name1 = (EditText) findViewById(R.id.editTextText1);
        String stName = name1.getText().toString();

        Intent intent = new Intent(this, second.class);
        Bundle b = new Bundle();
        b.putString("name1", stName);
        intent.putExtra("bundleData", b);
        startActivity(intent);
    }
}