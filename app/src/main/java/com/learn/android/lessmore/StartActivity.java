package com.learn.android.lessmore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Amit Vishwakarma on 8/19/2015.
 */
public class StartActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start_activity);
    }
    public void startIntro(View v)
    {
        Button playButton=(Button)findViewById(R.id.button_Play);
        Intent i=new Intent(getApplicationContext(),IntroActivity.class);
        startActivity(i);
    }
}
