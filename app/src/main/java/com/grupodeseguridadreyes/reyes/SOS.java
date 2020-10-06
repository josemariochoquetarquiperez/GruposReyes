package com.grupodeseguridadreyes.reyes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SOS extends AppCompatActivity {
    EditText TXTDetalleSOS;
    EditText TXTNombreSOS;

    Button BTNENviarSOS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_o_s);

        TXTDetalleSOS = (EditText) findViewById(R.id.txtDetalleSOS);
        TXTNombreSOS = (EditText) findViewById(R.id.txtNombreSOS);
        BTNENviarSOS = (Button) findViewById(R.id.btnEnviarSOS);

        BTNENviarSOS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sendIntent = new Intent ();
                sendIntent.setAction (Intent.ACTION_SEND);
                sendIntent.putExtra (Intent.EXTRA_TEXT,TXTNombreSOS.getText().toString()+"  "+TXTDetalleSOS.getText().toString());
                sendIntent.setType ("texto / plano");
                sendIntent.setPackage ("com.whatsapp");
                startActivity (sendIntent);
            }
        });

    }
}