package br.com.coletafacilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Handler handle = new Handler();
        handle.postDelayed(new Runnable() {
            @Override public void run() {
                mostrarIndex();
            }
        }, 2000);
    }

    private void mostrarIndex(){
        Intent intent = new Intent(MainActivity.this, IndexActivity.class);
        startActivity(intent);
        finish();
    }
}