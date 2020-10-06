package com.grupodeseguridadreyes.reyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuGuardia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_guardia);
    }

    public void onClick(View view) {
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.btnMGSOS:
                miIntent=new Intent(MenuGuardia.this,SOS.class);
                break;
            case R.id.btnMGMarcar:
                miIntent=new Intent(MenuGuardia.this,MarcarControl.class);
                break;
            case R.id.btnMGHistorial:
                miIntent=new Intent(MenuGuardia.this,Historial.class);
                break;
            case R.id.btnMGNovedades:
                miIntent=new Intent(MenuGuardia.this,Novedades.class);
                break;
            case R.id.btnMGEnviar:
                miIntent=new Intent(MenuGuardia.this,Enviar.class);
                break;

        }
        startActivity(miIntent);

    }
}