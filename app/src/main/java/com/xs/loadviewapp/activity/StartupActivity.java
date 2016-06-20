package com.xs.loadviewapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.xs.loadviewapp.R;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-06-20 14:07
 * @email Xs.lin@foxmail.com
 */
public class StartupActivity extends AppCompatActivity {
    private static final String TAG = "StartupActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button mBtn = (Button) findViewById(R.id.btn);
        mBtn.setText("jump");
        mBtn.setOnClickListener(view -> {
            Intent intent = new Intent(StartupActivity.this,MainActivity.class);
            startActivity(intent);
        });

    }
}
