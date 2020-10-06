package com.grupodeseguridadreyes.reyes;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;

public class RegistroPunto extends AppCompatActivity {
    private EditText TXTNombreEmpresaQR;
    private EditText TXTPuntoQR;

    private Button BTNGenerarQR;
    private Button BTNGuardarQR;

    private ImageView IMGImganenQR;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_punto);

        TXTNombreEmpresaQR =(EditText) findViewById(R.id.txtNombreEmpresaQR);
        TXTPuntoQR = (EditText) findViewById(R.id.txtPuntoQR);

        BTNGenerarQR=(Button)findViewById(R.id.btnGenerarQR);
        BTNGuardarQR=(Button)findViewById(R.id.btnGuardarQR);

        IMGImganenQR = findViewById(R.id.imgImagenQR);

    }

    public void generadorQR(View view) {
        QRCodeWriter qrCodeWriter = new QRCodeWriter();
        try {
            BitMatrix bitMatrix = qrCodeWriter.encode(TXTNombreEmpresaQR.getText().toString()+""+TXTPuntoQR.getText().toString(), BarcodeFormat.QR_CODE, 200,200);
            Bitmap bitmap = Bitmap.createBitmap(200, 200, Bitmap.Config.RGB_565);
            for (int x = 0; x < 200; x++) {
                for (int y = 0; y < 200; y++) {
                    bitmap.setPixel(x, y, bitMatrix.get(x,y)? Color.BLACK : Color.WHITE);
                }
            }
            IMGImganenQR.setImageBitmap(bitmap);
        }
        catch (Exception e){
            e.printStackTrace();
        }



    }
}