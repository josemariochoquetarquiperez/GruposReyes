package com.grupodeseguridadreyes.reyes.entidades;

public class EntidadEmpresa {
    private Integer idempresa;
    private String nombreempresa;
    private String direccionempresa;
    //contructor

    public EntidadEmpresa(Integer idempresa, String nombreempresa, String direccionempresa) {
        this.idempresa = idempresa;
        this.nombreempresa = nombreempresa;
        this.direccionempresa = direccionempresa;
    }

    //get y set

    public Integer getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(Integer idempresa) {
        this.idempresa = idempresa;
    }

    public String getNombreempresa() {
        return nombreempresa;
    }

    public void setNombreempresa(String nombreempresa) {
        this.nombreempresa = nombreempresa;
    }

    public String getDireccionempresa() {
        return direccionempresa;
    }

    public void setDireccionempresa(String direccionempresa) {
        this.direccionempresa = direccionempresa;
    }
}
