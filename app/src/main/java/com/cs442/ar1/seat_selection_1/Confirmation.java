package com.cs442.ar1.seat_selection_1;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by ar1 on 11/7/2016.
 */
public class Confirmation extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation_page);
        Toast toast= Toast.makeText(getApplicationContext(),"Confirmation Page", Toast.LENGTH_LONG);
    }
}
