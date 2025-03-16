/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.dto;

/**
 *
 * @author USER
 */
public class TipoTramiteDTO {

    private Long idTipoTramite;
    private String nombreTipoTramite;
    private Double montoTipoTramite;
    private Integer numeroDias;
    private String estado;

    public TipoTramiteDTO() {
    }
    
    public TipoTramiteDTO(Long idTipoTramite, String nombreTipoTramite) {
        this.idTipoTramite = idTipoTramite;
        this.nombreTipoTramite = nombreTipoTramite;
    }

    public TipoTramiteDTO(Long idTipoTramite, String nombreTipoTramite, Double montoTipoTramite, Integer numeroDias, String estado) {
        this.idTipoTramite = idTipoTramite;
        this.nombreTipoTramite = nombreTipoTramite;
        this.montoTipoTramite = montoTipoTramite;
        this.numeroDias = numeroDias;
        this.estado = estado;
    }

    public Long getIdTipoTramite() {
        return idTipoTramite;
    }

    public void setIdTipoTramite(Long idTipoTramite) {
        this.idTipoTramite = idTipoTramite;
    }

    public String getNombreTipoTramite() {
        return nombreTipoTramite;
    }

    public void setNombreTipoTramite(String nombreTipoTramite) {
        this.nombreTipoTramite = nombreTipoTramite;
    }

    public Double getMontoTipoTramite() {
        return montoTipoTramite;
    }

    public void setMontoTipoTramite(Double montoTipoTramite) {
        this.montoTipoTramite = montoTipoTramite;
    }

    public Integer getNumeroDias() {
        return numeroDias;
    }

    public void setNumeroDias(Integer numeroDias) {
        this.numeroDias = numeroDias;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
