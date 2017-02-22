package com.github.vinci.coordinatorlayoutdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IndexActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);
    }
    public void one(View view){
        startActivity(new Intent(this,ScrollingActivity.class));
    }
    public void two(View view){
        startActivity(new Intent(this,MainActivity.class));
    }
    public void three(View view){
        startActivity(new Intent(this,CustermActivity.class));
    }
    public void four(View view){
        startActivity(new Intent(this,ScrollingActivity.class));
    }

}
