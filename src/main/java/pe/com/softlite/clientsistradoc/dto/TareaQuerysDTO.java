/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.dto;

/**
 *
 * @author USER
 */
public class TareaQuerysDTO {
    
    private String descripcion;
    private String tipoTarea;
    private String fecha;
    private String dependencia;

    public TareaQuerysDTO() {
    }

    public TareaQuerysDTO(String descripcion, String tipoTarea, String fecha, String dependencia) {
        this.descripcion = descripcion;
        this.tipoTarea = tipoTarea;
        this.fecha = fecha;
        this.dependencia = dependencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoTarea() {
        return tipoTarea;
    }

    public void setTipoTarea(String tipoTarea) {
        this.tipoTarea = tipoTarea;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }
    
    
    
}
