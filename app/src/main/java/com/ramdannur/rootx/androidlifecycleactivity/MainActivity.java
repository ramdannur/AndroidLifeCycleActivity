package com.ramdannur.rootx.androidlifecycleactivity;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Oncreate active!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("Onstart active!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("Onpause active!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("Onresume active!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("Onstop active!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("Ondestroy active!");
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
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
