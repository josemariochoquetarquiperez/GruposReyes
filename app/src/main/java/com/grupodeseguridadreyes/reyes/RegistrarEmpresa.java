package com.grupodeseguridadreyes.reyes;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.grupodeseguridadreyes.reyes.Utilidades.Utilidades;

public class RegistrarEmpresa extends AppCompatActivity {
    EditText TXTNombreRegEmpresa;
    EditText TXTDireccionRegEmpresa;

    Button BTNGuardarRegEmpresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_empresa);

        TXTNombreRegEmpresa =(EditText)findViewById(R.id.txtNombreRegEmpresa);
        TXTDireccionRegEmpresa=(EditText)findViewById(R.id.txtDireccionRegEmpresa);

        BTNGuardarRegEmpresa=(Button)findViewById(R.id.btnGuardarGuardia);

    }

    public void onClick(View view) {
        registar_empresa();
    }

    private void registar_empresa() {
        ConexionSQLinteHelper conn= new ConexionSQLinteHelper(this,"bd_reyes",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPOempresa_NOMBRE_EMPRESA,TXTNombreRegEmpresa.getText().toString());
        values.put(Utilidades.CAMPOempresa_DIRECCION,TXTDireccionRegEmpresa.getText().toString());

        Long idResultante =db.insert(Utilidades.TABLA_EMPRESA,Utilidades.CAMPOempresa_ID,values);

        Toast.makeText(getApplicationContext(),"EMPRESA REGISTRADA:"+idResultante,Toast.LENGTH_SHORT).show();
        db.close();

    }
}