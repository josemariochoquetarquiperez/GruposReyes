package com.grupodeseguridadreyes.reyes.entidades;

public class EntidadGuardia {
    private Integer idguardia;
    private String nombreguardia;
    private String CIguardia;
    private String contraseñaguardia;

    //contructor

    public EntidadGuardia(Integer idguardia, String nombreguardia, String CIguardia, String contraseñaguardia) {
        this.idguardia = idguardia;
        this.nombreguardia = nombreguardia;
        this.CIguardia = CIguardia;
        this.contraseñaguardia = contraseñaguardia;
    }


    //get y set

    public Integer getIdguardia() {
        return idguardia;
    }

    public void setIdguardia(Integer idguardia) {
        this.idguardia = idguardia;
    }

    public String getNombreguardia() {
        return nombreguardia;
    }

    public void setNombreguardia(String nombreguardia) {
        this.nombreguardia = nombreguardia;
    }

    public String getCIguardia() {
        return CIguardia;
    }

    public void setCIguardia(String CIguardia) {
        this.CIguardia = CIguardia;
    }

    public String getContraseñaguardia() {
        return contraseñaguardia;
    }

    public void setContraseñaguardia(String contraseñaguardia) {
        this.contraseñaguardia = contraseñaguardia;
    }
}
