package br.com.coletafacilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FormEsqueceuSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_esqueceu_senha);
        getSupportActionBar().hide();
    }
}