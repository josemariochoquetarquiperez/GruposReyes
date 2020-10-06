package com.grupodeseguridadreyes.reyes;

import android.Manifest;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.sqlite.SQLiteDatabase;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;
import com.grupodeseguridadreyes.reyes.Utilidades.Utilidades;

import java.util.Date;

public class MarcarControl extends AppCompatActivity {
    TextView TXTNombreMarcar;
    TextView TXTPuntoMarcar;
    TextView TXTGpsMarcar;
    TextView TXTFechaMarcar;
    TextView TXTDetalleMarcar;

    Button BTNScanerMarcar;
    Button BTNGuardarMarcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcar_control);

        TXTNombreMarcar =(TextView)findViewById(R.id.txtNombreMacar);
        TXTPuntoMarcar = (TextView) findViewById(R.id.txtPuntoMarcar);
        TXTGpsMarcar =(TextView)findViewById(R.id.txtgpsMarcar);
        TXTFechaMarcar=(TextView) findViewById(R.id.txtFechaMarcar);
        TXTDetalleMarcar=(TextView) findViewById(R.id.txtDetalleMarcar);

        BTNScanerMarcar = (Button) findViewById(R.id.btnScanearMarcar);
        BTNGuardarMarcar =(Button)findViewById(R.id.btnGuardarMarcar);
        //la hora
        TXTFechaMarcar.setText(new Date().toString());
        //la ubucacion


        LocationManager locationManager= (LocationManager) MarcarControl.this.getSystemService(Context.LOCATION_SERVICE);
        LocationListener locationListener=new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                TXTGpsMarcar.setText(" "+location.getLongitude()+" "+location.getLatitude());
            }

            @Override
            public void onStatusChanged(String provider, int status, Bundle extras) { }
            @Override
            public void onProviderEnabled(String provider) { }
            @Override
            public void onProviderDisabled(String provider) { }
        };

        //permisos para la ubicacion
        int permissionCheck = ContextCompat.checkSelfPermission(MarcarControl.this,
                Manifest.permission.ACCESS_FINE_LOCATION);

        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER,0,0, locationListener);

        if(permissionCheck== PackageManager.PERMISSION_DENIED){
            if(ActivityCompat.shouldShowRequestPermissionRationale(this,Manifest.permission.ACCESS_FINE_LOCATION)){
            }
            else{
                ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.ACCESS_FINE_LOCATION},1);
            }
        }



        //scaner QR
        final Activity activity= this;
        BTNScanerMarcar.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            IntentIntegrator integrator = new IntentIntegrator(activity);
            integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
            integrator.setPrompt("ESCANEADO CODIGO QR");
            integrator.setCameraId(0);
            integrator.initiateScan();
        }
    });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result= IntentIntegrator.parseActivityResult(requestCode,resultCode,data);
        if (result!= null){
            if (result.getContents() != null){
                alert(result.getContents());
            }else {
                alert("ESCANEO CANCELADO ");
            }

        }else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    private void alert(String msg){
        TXTPuntoMarcar.setText(msg);
    }

   /* public void onClick(View view) {
        ConexionSQLinteHelper conn= new ConexionSQLinteHelper(this,"bd_reyes",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values=new ContentValues();
        values.put(Utilidades.CAMPOmarcar_NOMBRE,TXTNombreMarcar.getText().toString());
        values.put(Utilidades.CAMPOmarcar_PUNTO,TXTPuntoMarcar.getText().toString());
        values.put(Utilidades.CAMPOmarcar_GPS,TXTGpsMarcar.getText().toString());
        values.put(Utilidades.CAMPOmarcar_FECHA,TXTFechaMarcar.getText().toString());
        values.put(Utilidades.CAMPOmarcar_DETALLE,TXTDetalleMarcar.getText().toString());

        Long idResultante =db.insert(Utilidades.TABLA_EMPRESA,Utilidades.CAMPOempresa_ID,values);

        Toast.makeText(getApplicationContext(),"SE GUARDO EL REGITRO:"+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }*/
}