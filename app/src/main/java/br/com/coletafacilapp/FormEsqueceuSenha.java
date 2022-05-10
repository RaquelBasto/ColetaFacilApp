package br.com.coletafacilapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FormEsqueceuSenha extends AppCompatActivity {

    EditText edit_email;
    Button btn_redefinirsenha;
    TextView goto_formlogin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_esqueceu_senha);
        getSupportActionBar().hide();
        IniciarComponentes();

        goto_formlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormEsqueceuSenha.this,FormLogin.class);
                startActivity(intent);
            }
        });

    }

    private void IniciarComponentes() {
       goto_formlogin = findViewById(R.id.txt_entrar);
       edit_email = findViewById(R.id.edit_email);
       btn_redefinirsenha = findViewById(R.id.btn_redefinirSenha);
    }


}