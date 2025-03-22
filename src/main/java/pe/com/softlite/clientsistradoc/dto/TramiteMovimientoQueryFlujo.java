/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.dto;

/**
 *
 * @author USER
 */
public class TramiteMovimientoQueryFlujo {
    
    public String proceso;
    public String motivoEnvio;
    public String dependenciaAsignada;
    public String fechaAsignacion;
    public String fechaFin;
    public String tiempoTranscurrido;

    public TramiteMovimientoQueryFlujo() {
    }

    public String getProceso() {
        return proceso;
    }

    public void setProceso(String proceso) {
        this.proceso = proceso;
    }

    public String getMotivoEnvio() {
        return motivoEnvio;
    }

    public void setMotivoEnvio(String motivoEnvio) {
        this.motivoEnvio = motivoEnvio;
    }

    public String getDependenciaAsignada() {
        return dependenciaAsignada;
    }

    public void setDependenciaAsignada(String dependenciaAsignada) {
        this.dependenciaAsignada = dependenciaAsignada;
    }

    public String getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(String fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }

    public void setTiempoTranscurrido(String tiempoTranscurrido) {
        this.tiempoTranscurrido = tiempoTranscurrido;
    }
    
}
