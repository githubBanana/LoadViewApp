package com.xs.loadviewapp.activity;

import android.os.Bundle;
import android.widget.Button;

import com.xs.loadviewapp.R;


public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button mBtn = (Button) findViewById(R.id.btn);
        mBtn.setText("show");
        mBtn.setOnClickListener((view) -> {
            showProgress();
            mBtn.postDelayed(() -> dismissProgress(),5000);
        });
    }

}
