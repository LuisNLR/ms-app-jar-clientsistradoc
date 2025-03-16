/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.softlite.clientsistradoc.process;

import pe.com.softlite.clientsistradoc.dto.TipoTramiteDTO;
import pe.com.softlite.clientsistradoc.dto.TramiteMovimientoDTO;
import pe.com.softlite.clientsistradoc.dto.TramiteRegisterDTO;
import pe.com.softlite.clientsistradoc.dto.TramiteTareaDTO;
import java.net.http.HttpResponse;
import java.util.List;

/**
 *
 * @author USER
 */
public interface ServicesTramite {
    
    public HttpResponse<String> register(TramiteRegisterDTO tramiteRegisterDto);
    
    public HttpResponse<String> deriver(TramiteMovimientoDTO tramiteMovimientoDto);
    
    public HttpResponse<String> devolver(TramiteMovimientoDTO tramiteMovimientoDto);
    
    public HttpResponse<String> finished(TramiteRegisterDTO tramiteRegisterDto);
    
    public HttpResponse<String> registerActivity(TramiteTareaDTO tramiteTareaRegisterDto);
    
    public List<TipoTramiteDTO> listTipoTramite();
    
}
