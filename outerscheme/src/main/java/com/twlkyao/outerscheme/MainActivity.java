package com.twlkyao.outerscheme;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button activityButton;

    private Button broadcastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        activityButton = (Button) this.findViewById(R.id.activity);
        activityButton.setOnClickListener(this);

        broadcastButton = (Button) this.findViewById(R.id.broadcast);
        broadcastButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up activityButton, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.activity:
                Intent activityIntent = new Intent("SecondActivity");
                activityIntent.setData(Uri.parse("SteveqiSecondActivity://"));
                startActivity(activityIntent);
                break;
            case R.id.broadcast:
                Intent broadcastIntent = new Intent();
                broadcastIntent.setAction("Broadcast");
                // add this the app module may be wakeup.
                broadcastIntent.setData(Uri.parse("SteveqiBroadcast://"));
                sendBroadcast(broadcastIntent);
            default:
                break;
        }
    }
}
