package com.example.nasadailypic;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class NASADailyPic extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nasadaily_pic);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_nasadaily_pic, menu);
        return true;
    }
}
