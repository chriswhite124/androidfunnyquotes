package com.medialets.funnyquotes;

import android.app.Activity;
import android.os.Bundle;

buildbreak

public class funnyquotes extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    public void foo() {
        int x = 3;
        x = x;
      }
}