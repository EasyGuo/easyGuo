package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    private static final String ACTVITY_TAG="MainActivity";
    private Button bt;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.bt);
        bt.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {
                Log.v(MainActivity.ACTVITY_TAG, "This is Verbose.");
                Log.d(MainActivity.ACTVITY_TAG, "This is Debug.");
                Log.i(MainActivity.ACTVITY_TAG, "This is Information");
                Log.w(MainActivity.ACTVITY_TAG, "This is Warnning.");
                Log.e(MainActivity.ACTVITY_TAG, "This is Error.");
            }
        });
    }
}
