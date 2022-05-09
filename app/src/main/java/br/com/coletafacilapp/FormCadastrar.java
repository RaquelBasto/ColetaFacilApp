package br.com.coletafacilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormCadastrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastrar);
        getSupportActionBar().hide();
    }
}