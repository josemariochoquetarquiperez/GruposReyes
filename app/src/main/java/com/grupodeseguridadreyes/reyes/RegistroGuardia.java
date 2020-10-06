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

public class RegistroGuardia extends AppCompatActivity {
    EditText TXTNombreGuardia;
    EditText TXTCIGuardia;
    EditText TXTContraseñaGuardia;

    Button BTNGuardarGuardia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_guardia);

        TXTNombreGuardia=(EditText)findViewById(R.id.txtNombreGuardia);
        TXTCIGuardia=(EditText)findViewById(R.id.txtCIGuardia);
        TXTContraseñaGuardia=(EditText)findViewById(R.id.txtContraseñaGuardia);

        BTNGuardarGuardia=(Button)findViewById(R.id.btnGuardarGuardia);

    }

    public void onClick(View view) {
        registrar_guardia();
    }

    private void registrar_guardia() {
        ConexionSQLinteHelper conn= new ConexionSQLinteHelper(this,"bd_reyes",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPOguardia_NOMBRE_COMPLETO,TXTNombreGuardia.getText().toString());
        values.put(Utilidades.CAMPOguardia_CI,TXTCIGuardia.getText().toString());
        values.put(Utilidades.CAMPOguardia_CONTRASEÑA,TXTContraseñaGuardia.getText().toString());

        Long idResultante =db.insert(Utilidades.TABLA_EMPRESA,Utilidades.CAMPOempresa_ID,values);

        Toast.makeText(getApplicationContext(),"GUARDIA REGISTRADO:"+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }
}