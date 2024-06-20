package me.arithesage.java.android.apps.asynctasktest;

import android.os.AsyncTask;

/**
 * Class for doing network stuff.
 *
 * Networking needs to be accessed from another thread,
 * so, we make use of AsyncTask
 *
 * Deprecation is ignored because we want to use AsyncTask in lower
 * Android versions, like 4.4 (KitKat)
 */
@SuppressWarnings("deprecation")
public class NetTask extends AsyncTask {
    @Override
    protected Object doInBackground(Object[] objects) {
        return null;
    }
}
