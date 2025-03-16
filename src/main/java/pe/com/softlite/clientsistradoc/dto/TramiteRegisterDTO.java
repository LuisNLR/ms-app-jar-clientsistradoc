/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.dto;

/**
 *
 * @author USER
 */
public class TramiteRegisterDTO {
    
    private TramiteDTO tramiteDto;

    public TramiteRegisterDTO() {
    }

    public TramiteRegisterDTO(TramiteDTO tramiteDto) {
        this.tramiteDto = tramiteDto;
    }

    public TramiteDTO getTramiteDto() {
        return tramiteDto;
    }

    public void setTramiteDto(TramiteDTO tramiteDto) {
        this.tramiteDto = tramiteDto;
    }
    
}
