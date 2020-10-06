package com.grupodeseguridadreyes.reyes.entidades;

public class EntidadNovedades {
    private Integer idnovedad;
    private String nombrenovedad;
    private String detallenovedad;
    private String fechanovedad;
    // contructor

    public EntidadNovedades(Integer idnovedad, String nombrenovedad, String detallenovedad, String fechanovedad) {
        this.idnovedad = idnovedad;
        this.nombrenovedad = nombrenovedad;
        this.detallenovedad = detallenovedad;
        this.fechanovedad = fechanovedad;
    }


    //get y set


    public Integer getIdnovedad() {
        return idnovedad;
    }

    public void setIdnovedad(Integer idnovedad) {
        this.idnovedad = idnovedad;
    }

    public String getNombrenovedad() {
        return nombrenovedad;
    }

    public void setNombrenovedad(String nombrenovedad) {
        this.nombrenovedad = nombrenovedad;
    }

    public String getDetallenovedad() {
        return detallenovedad;
    }

    public void setDetallenovedad(String detallenovedad) {
        this.detallenovedad = detallenovedad;
    }

    public String getFechanovedad() {
        return fechanovedad;
    }

    public void setFechanovedad(String fechanovedad) {
        this.fechanovedad = fechanovedad;
    }
}
