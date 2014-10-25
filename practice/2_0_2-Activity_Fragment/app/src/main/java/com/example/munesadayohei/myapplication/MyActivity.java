package com.example.munesadayohei.myapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MyActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Activityが一番最初にとる状態
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my10);
    }

    @Override
    protected void onStart() {
        // Activityの画面が構築され、ユーザーに見える状態
        super.onStart();
    }

    @Override
    protected void onRestart() {
        // onStopの後、ユーザーが戻ってきた状態。onStartの前に呼び出される
        super.onRestart();
    }

    @Override
    protected void onResume() {
        // Activityの画面が構築され、ユーザーがUIに触れてインタラクションを実施できる状態
        super.onResume();
    }

    @Override
    protected void onPause() {
        // ユーザーがActivityを離れようとしている状態。永続化すべき情報はここで永続化する
        super.onPause();
    }

    @Override
    protected void onStop() {
        // Activityがユーザーから見えなくなった状態。この後ユーザーが戻ってきたらonRestart→onStartと状態遷移する
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        // Activityがシステムによって、メモリから追い出される直前の状態。ここではメモリリーク防止のため、すべての参照を切る
        super.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
