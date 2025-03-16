/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.dto;

/**
 *
 * @author USER
 */
public class DependenciaDTO {

    private Long idDependencia;
    private String nombreDependencia;
    private AreaEntidadDTO areaEntidadDto;

    public DependenciaDTO() {
    }

    public DependenciaDTO(Long idDependencia, String nombreDependencia, AreaEntidadDTO areaEntidadDto) {
        this.idDependencia = idDependencia;
        this.nombreDependencia = nombreDependencia;
        this.areaEntidadDto = areaEntidadDto;
    }

    public Long getIdDependencia() {
        return idDependencia;
    }

    public void setIdDependencia(Long idDependencia) {
        this.idDependencia = idDependencia;
    }

    public String getNombreDependencia() {
        return nombreDependencia;
    }

    public void setNombreDependencia(String nombreDependencia) {
        this.nombreDependencia = nombreDependencia;
    }

    public AreaEntidadDTO getAreaEntidadDto() {
        return areaEntidadDto;
    }

    public void setAreaEntidadDto(AreaEntidadDTO areaEntidadDto) {
        this.areaEntidadDto = areaEntidadDto;
    }

}
