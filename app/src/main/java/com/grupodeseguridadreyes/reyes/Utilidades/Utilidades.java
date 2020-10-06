package com.grupodeseguridadreyes.reyes.Utilidades;
//clase que representa los campos y las tablas
public class Utilidades {


    //CONSTANTES CAMPO DE TABLA Empresa
    public static final String TABLA_EMPRESA="empresa";
    public static final String CAMPOempresa_ID="idempresa";
    public static final String CAMPOempresa_NOMBRE_EMPRESA="nombreempresa";
    public static final String CAMPOempresa_DIRECCION="direccionempresa";

    public static final String CREATE_TABLE_EMPRESA ="CREATE TABLE"+ " "+
            TABLA_EMPRESA+" ("+
            CAMPOempresa_ID+" "+ "INTEGER, "+
            CAMPOempresa_NOMBRE_EMPRESA+" TEXT, "+
            CAMPOempresa_DIRECCION+" TEXT )";
    //CONSTANTE CAMPO DE LA TABLA GUARDIA

    public static final String TABLE_GUARDIA="guardia";
    public static final String CAMPOguardia_ID="idguardia";
    public static final String CAMPOguardia_NOMBRE_COMPLETO="nombreguardia";
    public static final String CAMPOguardia_CI="CIguardia";
    public static  final String CAMPOguardia_CONTRASEÑA="contraseñaguardia";

    public static final String CREATE_TABLE_GUADIA ="CREATE TABLE"+" "+
            TABLE_GUARDIA+"("+
            CAMPOguardia_ID+" "+" INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CAMPOguardia_NOMBRE_COMPLETO+"TEXT,"+
            CAMPOguardia_CI+"TEXT,"+
            CAMPOguardia_CONTRASEÑA+"TEXT)";
// CONSTANTE CAMP DE LA TABLA NOVEDAD
    public static final String TABLE_NOVEDAD="novedad";
    public static final String CAMPOnovedad_ID="idnovedad";
    public static final String CAMPOnovedad_NOMBRE="nombrenovedad";
    public static final String CAMPOnovedad_DETALLE="detallenovedad";
    public static  final String CAMPOnovedad_FECHA="fechanovedad";

    public static final String CREATE_TABLE_NOVEDAD ="CREATE TABLE"+" "+
            TABLE_NOVEDAD+"("+
            CAMPOnovedad_ID+" "+"INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CAMPOnovedad_NOMBRE+"TEXT,"+
            CAMPOnovedad_DETALLE+"TEXT,"+
            CAMPOnovedad_FECHA+"TEXT)";
    // CONSTANTE CAMP DE LA TABLA MARCAR PUNTO
    public static final String TABLE_MARCAR="marcar";
    public static final String CAMPOmarcar_ID="idmarcar";
    public static final String CAMPOmarcar_NOMBRE="nombremarcar";
    public static final String CAMPOmarcar_PUNTO="puntomarcar";
    public static  final String CAMPOmarcar_GPS="gpsmarcar";
    public static  final String CAMPOmarcar_FECHA="fechamarcar";
    public static  final String CAMPOmarcar_DETALLE="detallemarcar";

    public static final String CREATE_TABLE_MARCAR ="CREATE TABLE"+" "+
            TABLE_MARCAR+"("+
            CAMPOmarcar_ID+" "+"INTEGER PRIMARY KEY AUTOINCREMENT, "+
            CAMPOmarcar_NOMBRE+"TEXT, "+
            CAMPOmarcar_PUNTO+"TEXT, "+
            CAMPOmarcar_GPS+"TEXT, "+
            CAMPOmarcar_FECHA+"TEXT, "+
            CAMPOmarcar_DETALLE+"TEXT)";



}
