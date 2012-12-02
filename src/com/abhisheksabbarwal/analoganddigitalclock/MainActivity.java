package com.abhisheksabbarwal.analoganddigitalclock;

import android.os.Bundle;
import android.widget.AnalogClock;
import android.widget.DigitalClock;
import android.app.Activity;


public class MainActivity extends Activity {
	
	private AnalogClock analogClock;
	private DigitalClock digitalClock;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

   
}
