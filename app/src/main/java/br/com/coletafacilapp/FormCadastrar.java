package br.com.coletafacilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class FormCadastrar extends AppCompatActivity {

    TextView goto_formEntrar;
    EditText edit_nome, edit_email,edit_senha;
    Spinner spinner_usuario;
    Button btn_registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastrar);
        getSupportActionBar().hide();
        IniciarComponentes();

        goto_formEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormCadastrar.this,FormLogin.class);
                startActivity(intent);
            }
        });
    }


    private void IniciarComponentes() {
        edit_email = findViewById(R.id.edit_email);
        edit_nome = findViewById(R.id.edit_nome);
        edit_senha = findViewById(R.id.edit_senha);
        btn_registrar= findViewById(R.id.btn_registrar);
        goto_formEntrar = findViewById(R.id.txt_entrar);
    }

}