package com.android.tonyvu.sc.demo.model;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.android.tonyvu.sc.demo.MainActivity;
import com.android.tonyvu.sc.demo.R;

/**
 * Created by divya on 4/4/2016.
 */
public class Splashscreen extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        Thread timer= new Thread()
        {
            public void run()
            {
                try
                {
                    //Display for 3 seconds
                    sleep(3000);
                }
                catch (InterruptedException e)
                {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                finally
                {
                    //Goes to Activity  StartingPoint.java(STARTINGPOINT)
                    Intent openstartingpoint=new Intent(Splashscreen.this, MainActivity.class);
                    startActivity(openstartingpoint);
                    finish();
                }
            }
        };
        timer.start();
    }

}
