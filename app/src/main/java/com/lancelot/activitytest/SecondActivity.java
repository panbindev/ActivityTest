package com.lancelot.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        String data =intent.getStringExtra("extra_data");

//        Log.d("SecondActivity",data);
        Toast.makeText(SecondActivity.this,data,Toast.LENGTH_LONG).show();
    }
}
