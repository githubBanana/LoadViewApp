    usage method
====
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