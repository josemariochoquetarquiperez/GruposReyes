package com.grupodeseguridadreyes.reyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class VerificarSupervisor extends AppCompatActivity {
    EditText TXTVeUsuario;
    EditText TXTVeContraseña;

    Button BTNVeInicioSesion;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verificar_supervisor);
        TXTVeUsuario=(EditText)findViewById(R.id.txtVeUsuario);
        TXTVeContraseña=(EditText)findViewById(R.id.txtVeContraseña);

        BTNVeInicioSesion=(Button)findViewById(R.id.btnVeInicioSesion);
    }

    public void EntrarMenu(View view) {
        Intent miIntent = new Intent(VerificarSupervisor.this,MenuGuardia.class);
        startActivity(miIntent);
    }
}