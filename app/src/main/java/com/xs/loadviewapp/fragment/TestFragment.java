package com.xs.loadviewapp.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.xs.loadinglib.LoadingFragment;
import com.xs.loadviewapp.R;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-06-20 16:01
 * @email Xs.lin@foxmail.com
 */
public class TestFragment extends BaseFragment {
    private static final String TAG = "TestFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_test_layout,container,false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView(view);
    }

    private void initView(View view) {
        final Button mBtn = (Button) view.findViewById(R.id.btn_touch);
        mBtn.setOnClickListener((view1) -> {
            showProgress();
            Toast.makeText(getActivity(),"test",Toast.LENGTH_LONG).show();
            mBtn.postDelayed(() -> dismissProgress(),5000);
        });
    }

}
