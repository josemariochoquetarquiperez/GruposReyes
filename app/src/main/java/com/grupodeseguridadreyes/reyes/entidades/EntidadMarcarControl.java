package com.grupodeseguridadreyes.reyes.entidades;

public class EntidadMarcarControl {
    private Integer idmarcar;
    private String nombremarcar;
    private String puntomarcar;
    private String gpsmarcar;
    private String fechamarcar;
    private String detallemarcar;

    //contrutor

    public EntidadMarcarControl(Integer idmarcar, String nombremarcar, String puntomarcar, String gpsmarcar, String fechamarcar, String detallemarcar) {
        this.idmarcar = idmarcar;
        this.nombremarcar = nombremarcar;
        this.puntomarcar = puntomarcar;
        this.gpsmarcar = gpsmarcar;
        this.fechamarcar = fechamarcar;
        this.detallemarcar = detallemarcar;
    }


    //get y set


    public Integer getIdmarcar() {
        return idmarcar;
    }

    public void setIdmarcar(Integer idmarcar) {
        this.idmarcar = idmarcar;
    }

    public String getNombremarcar() {
        return nombremarcar;
    }

    public void setNombremarcar(String nombremarcar) {
        this.nombremarcar = nombremarcar;
    }

    public String getPuntomarcar() {
        return puntomarcar;
    }

    public void setPuntomarcar(String puntomarcar) {
        this.puntomarcar = puntomarcar;
    }

    public String getGpsmarcar() {
        return gpsmarcar;
    }

    public void setGpsmarcar(String gpsmarcar) {
        this.gpsmarcar = gpsmarcar;
    }

    public String getFechamarcar() {
        return fechamarcar;
    }

    public void setFechamarcar(String fechamarcar) {
        this.fechamarcar = fechamarcar;
    }

    public String getDetallemarcar() {
        return detallemarcar;
    }

    public void setDetallemarcar(String detallemarcar) {
        this.detallemarcar = detallemarcar;
    }
}
