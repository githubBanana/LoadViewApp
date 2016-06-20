package com.xs.loadviewapp.activity;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.xs.loadinglib.LoadingFragment;
import com.xs.loadviewapp.R;


/**
 * @author CY
 * @date 2016/3/14 15:12
 * @email tmxdyf@163.com
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void showProgress(String message) {
        runOnUiThread(() -> LoadingFragment.getLoad(message).show(getSupportFragmentManager(),"load"));
    }

    protected void showProgress() {
        showProgress(getString(R.string.loading));
    }

    protected void dismissProgress() {
        runOnUiThread(() -> {
            Fragment prev = getSupportFragmentManager().findFragmentByTag("load");
            if (prev != null) {
                DialogFragment df = (DialogFragment) prev;
                df.dismiss();
            }
        });
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        dismissProgress();
    }

}
