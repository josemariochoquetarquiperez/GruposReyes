package com.grupodeseguridadreyes.reyes;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import com.grupodeseguridadreyes.reyes.Utilidades.Utilidades;

public class ConexionSQLinteHelper extends SQLiteOpenHelper {


    public ConexionSQLinteHelper(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(Utilidades.CREATE_TABLE_EMPRESA);
        db.execSQL(Utilidades.CREATE_TABLE_GUADIA);
        db.execSQL(Utilidades.CREATE_TABLE_NOVEDAD);
        db.execSQL(Utilidades.CREATE_TABLE_MARCAR);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int VersionAntigua, int VersionNueva) {
        db.execSQL("DROP TABLE IF EXISTS empresa");
        db.execSQL("DROP TABLE IF EXISTS guardia");
        db.execSQL("DROP TABLE IF EXISTS novedad");
        db.execSQL("DROP TABLE IF EXISTS marcar");
        onCreate(db);

    }
}
