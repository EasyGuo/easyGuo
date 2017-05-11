package com.example.asus.guoyizhi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//这是主程序，实现onCreate方法。：


public class Guoyizhi extends Activity {
    GobangView gbv;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_guoyizhi);


        gbv = (GobangView) this.findViewById(R.id.gobangview);//实例化
        gbv.setTextView((TextView) this.findViewById(R.id.text));

        Button restart = (Button)findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gbv.restart();
            }
        });

    }
}