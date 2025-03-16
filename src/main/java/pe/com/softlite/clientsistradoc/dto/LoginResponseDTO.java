/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.dto;

/**
 *
 * @author USER
 */
public class LoginResponseDTO {
    
    private String usuario;
    private String nombreUsuario;
    private Long idDependencia;
    private String nombreDependencia;
    private String nombreArea;
    private String token;

    public LoginResponseDTO() {
    }

    public LoginResponseDTO(String usuario, String nombreUsuario, Long idDependencia, String nombreDependencia, String nombreArea, String token) {
        this.usuario = usuario;
        this.nombreUsuario = nombreUsuario;
        this.idDependencia = idDependencia;
        this.nombreDependencia = nombreDependencia;
        this.nombreArea = nombreArea;
        this.token = token;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
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

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
    
}
