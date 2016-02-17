package ru.asbvapps.android.mylibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyLib_MainActivity extends AppCompatActivity {

    private String joke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        joke = intent.getStringExtra("JOKE");
        setContentView(R.layout.activity_main2);
        ((TextView) findViewById(R.id.tv_joke)).setText(joke);
    }

    @Override
    protected void onStart() {
        super.onStart();

    }
}
