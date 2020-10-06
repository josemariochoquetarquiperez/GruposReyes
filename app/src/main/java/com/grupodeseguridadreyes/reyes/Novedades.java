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

import java.util.Date;

public class Novedades extends AppCompatActivity {
    EditText TXTDetalleNovedades;
    EditText TXTNombreNovedades;
    TextView TXTFechaNovedades;

    Button BTNEnviarNovedades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_novedades);
        TXTDetalleNovedades=(EditText)findViewById(R.id.txtDetalleNovedades);
        TXTNombreNovedades=(EditText)findViewById(R.id.txtNombreNovedades);
        TXTFechaNovedades=(TextView)findViewById(R.id.txtFechaNovedades);

        BTNEnviarNovedades=(Button)findViewById(R.id.btnEnviarNovedades);

        //la hora
        TXTFechaNovedades.setText(new Date().toString());

    }

    public void onClick(View view) {
        registar_novedades();
    }

    private void registar_novedades() {
        ConexionSQLinteHelper conn= new ConexionSQLinteHelper(this,"bd_reyes",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPOnovedad_DETALLE,TXTDetalleNovedades.getText().toString());
        values.put(Utilidades.CAMPOnovedad_NOMBRE,TXTNombreNovedades.getText().toString());
        values.put(Utilidades.CAMPOnovedad_FECHA,TXTFechaNovedades.getText().toString());


        Long idResultante =db.insert(Utilidades.TABLA_EMPRESA,Utilidades.CAMPOempresa_ID,values);

        Toast.makeText(getApplicationContext(),"EMPRESA REGISTRADA:"+idResultante,Toast.LENGTH_SHORT).show();
        db.close();

    }
}