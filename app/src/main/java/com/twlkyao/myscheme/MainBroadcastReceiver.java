package com.twlkyao.myscheme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;

/**
 * Created by steveqi on 2016/4/7.
 */
public class MainBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d("steveqi", "action=" + intent.getAction() + " scheme=" + intent.getScheme());
        Intent newIntent = new Intent(context, ThirdActivity.class);
        // Because the context is not Activity context, so need to add the flag, else it will crash.
        newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(newIntent);
    }
}
