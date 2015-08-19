package com.learn.android.lessmore;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;


/**
 * Created by Amit Vishwakarma on 8/19/2015.
 */
public class GameActivity extends Activity{
    public static TextView number;
    public static TextView score;
    public static Button more;
    public static Button less;
    public Random r;
    int prw,cur;
    public int getNumber()
    {
        return r.nextInt(100-1+1)+1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_activity);
        number=(TextView)findViewById(R.id.textView_Number);
        score=(TextView)findViewById(R.id.textView_Score);
        more=(Button)findViewById(R.id.button_More);
        less=(Button)findViewById(R.id.button_Less);
        r=new Random();
        prw=10;
        number.setText(Integer.toString(prw));
    }
    public void onButtonClick(View v)
    {
        cur=getNumber();
        number.setText(Integer.toString(cur)+"+"+Integer.toString(prw));
        if(prw<cur)
        {
            if(v.getId()==R.id.button_Less)
            {
                score.setText("Yes it was less---!");
            }
            else
            {
                score.setText("Ups it was less---!");
            }
        }
        else
        {
            if(v.getId()==R.id.button_More)
            {
                score.setText("Yes it was more!");
            }
            else
            {
                score.setText("Ups it was more!");
            }
        }
        prw=cur;
    }
}
