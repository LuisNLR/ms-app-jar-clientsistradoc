/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.dto;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author USER
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TramiteQuerysDTO {
    
    // Datos Tramite
    private String codigoTramite;
    private String fechaIngreso;
    private String asunto;
    private String observacion;
    private String tipoTramite;
    private String solicitante;
    private String estadoTramite;
    // Datos Movimientos
    private String motivoEnvio;
    private String estadoMovimiento;
    private String dependenciaActual;
    private String dependenciaDestino;
    private Integer duracion;
    private Integer diasTranscurridos;
    private String flujoRealizar;
    private Integer nroFolios;
    private String tipoDocumentoTramite;
    private String fechaFin;
    
    
    public TramiteQuerysDTO() {
            super();
    }

    public TramiteQuerysDTO(String codigoTramite, String asunto, String tipoTramite, String solicitante,
                            String motivoEnvio, String dependenciaActual, String dependenciaDestino) {
            super();
            this.codigoTramite = codigoTramite;
            this.asunto = asunto;
            this.tipoTramite = tipoTramite;
            this.solicitante = solicitante;
            this.motivoEnvio = motivoEnvio;
            this.dependenciaActual = dependenciaActual;
            this.dependenciaDestino = dependenciaDestino;
    }
    
    public TramiteQuerysDTO(String codigoTramite, String asunto, String tipoTramite, String solicitante,
                            String motivoEnvio, String dependenciaActual, String dependenciaDestino, Integer duracion, Integer diasTranscurridos) {
            super();
            this.codigoTramite = codigoTramite;
            this.asunto = asunto;
            this.tipoTramite = tipoTramite;
            this.solicitante = solicitante;
            this.motivoEnvio = motivoEnvio;
            this.dependenciaActual = dependenciaActual;
            this.dependenciaDestino = dependenciaDestino;
            this.duracion = duracion;
            this.diasTranscurridos = diasTranscurridos;
    }

    public TramiteQuerysDTO(String codigoTramite, String asunto, String tipoTramite, String solicitante,
                            String estadoTramite) {
            super();
            this.codigoTramite = codigoTramite;
            this.asunto = asunto;
            this.tipoTramite = tipoTramite;
            this.solicitante = solicitante;
            this.estadoTramite = estadoTramite;
    }

    public String getCodigoTramite() {
        return codigoTramite;
    }

    public void setCodigoTramite(String codigoTramite) {
        this.codigoTramite = codigoTramite;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public String getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(String solicitante) {
        this.solicitante = solicitante;
    }

    public String getEstadoTramite() {
        return estadoTramite;
    }

    public void setEstadoTramite(String estadoTramite) {
        this.estadoTramite = estadoTramite;
    }

    public String getMotivoEnvio() {
        return motivoEnvio;
    }

    public void setMotivoEnvio(String motivoEnvio) {
        this.motivoEnvio = motivoEnvio;
    }

    public String getEstadoMovimiento() {
        return estadoMovimiento;
    }

    public void setEstadoMovimiento(String estadoMovimiento) {
        this.estadoMovimiento = estadoMovimiento;
    }

    public String getDependenciaActual() {
        return dependenciaActual;
    }

    public void setDependenciaActual(String dependenciaActual) {
        this.dependenciaActual = dependenciaActual;
    }

    public String getDependenciaDestino() {
        return dependenciaDestino;
    }

    public void setDependenciaDestino(String dependenciaDestino) {
        this.dependenciaDestino = dependenciaDestino;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getDiasTranscurridos() {
        return diasTranscurridos;
    }

    public void setDiasTranscurridos(Integer diasTranscurridos) {
        this.diasTranscurridos = diasTranscurridos;
    }

    public String getFlujoRealizar() {
        return flujoRealizar;
    }

    public void setFlujoRealizar(String flujoRealizar) {
        this.flujoRealizar = flujoRealizar;
    }

    public Integer getNroFolios() {
        return nroFolios;
    }

    public void setNroFolios(Integer nroFolios) {
        this.nroFolios = nroFolios;
    }

    public String getTipoDocumentoTramite() {
        return tipoDocumentoTramite;
    }

    public void setTipoDocumentoTramite(String tipoDocumentoTramite) {
        this.tipoDocumentoTramite = tipoDocumentoTramite;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }
    
    
}
