package br.com.coletafacilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    EditText edit_email, edit_senha;
    TextView esqueceu_senha, goto_formCadastrar;
    Button btn_entrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);
        getSupportActionBar().hide();
        IniciarComponentes();



        esqueceu_senha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this,FormEsqueceuSenha.class);
                startActivity(intent);
            }
        });

        goto_formCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this,FormCadastrar.class);
                startActivity(intent);
            }
        });




    }

    private void IniciarComponentes() {
        edit_email = findViewById(R.id.edit_email);
        edit_senha = findViewById(R.id.edit_senha);
        esqueceu_senha = findViewById(R.id.esqueceusenha);
        goto_formCadastrar = findViewById(R.id.txt_registrar);
        btn_entrar = findViewById(R.id.btn_entrar);
    }
}