package com.grupodeseguridadreyes.reyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConexionSQLinteHelper conn=new ConexionSQLinteHelper(this,"BD_REYES",null,1);
    }
    public void onClick(View view) {
        Intent miIntent=null;
        switch (view.getId()){
            case R.id.btnMSRegistroEmpresa:
                miIntent=new Intent(MainActivity.this,RegistrarEmpresa.class);
                break;
            case R.id.btnMSCrearPunto:
                miIntent=new Intent(MainActivity.this,RegistroPunto.class);
                break;
            case R.id.bntMSHistorial:
                miIntent=new Intent(MainActivity.this,Historial.class);
                break;
            case R.id.btnMSNovedades:
                miIntent=new Intent(MainActivity.this,Novedades.class);
                break;
            case R.id.btnMSSOS:
                miIntent=new Intent(MainActivity.this,MarcarControl.class);
                break;

        }
        startActivity(miIntent);
    }
}