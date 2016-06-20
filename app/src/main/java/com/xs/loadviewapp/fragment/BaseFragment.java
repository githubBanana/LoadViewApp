package com.xs.loadviewapp.fragment;

import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;

import com.xs.loadinglib.LoadingFragment;
import com.xs.loadviewapp.R;

/**
 * @version V1.0 <描述当前版本功能>
 * @author: Xs
 * @date: 2016-06-20 16:14
 * @email Xs.lin@foxmail.com
 */
public class BaseFragment extends Fragment{


    protected void showProgress(String message) {
        getActivity().runOnUiThread(() -> LoadingFragment.getLoad(message).show(getChildFragmentManager(),"load"));
    }

    protected void showProgress() {
        showProgress(getString(R.string.loading));
    }

    protected void dismissProgress() {
        getActivity().runOnUiThread(() -> {
            Fragment prev = getChildFragmentManager().findFragmentByTag("load");
            if (prev != null) {
                DialogFragment df = (DialogFragment) prev;
                df.dismiss();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        dismissProgress();
    }
}
