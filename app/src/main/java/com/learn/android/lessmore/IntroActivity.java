package com.learn.android.lessmore;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Amit Vishwakarma on 8/19/2015.
 */
public class IntroActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intro_activity);
    }
    public void startGame(View v)
    {
        Button ok =(Button)findViewById(R.id.button_ok);
        Intent i  =new Intent(getApplicationContext(),GameActivity.class);
        startActivity(i);
    }
}
