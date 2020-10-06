package com.grupodeseguridadreyes.reyes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Enviar extends AppCompatActivity {
    Button BTNEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enviar);

        BTNEnviar=(Button)findViewById(R.id.btnEnviarEnviar);
    }
}