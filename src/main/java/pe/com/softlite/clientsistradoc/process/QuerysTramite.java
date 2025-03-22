/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.softlite.clientsistradoc.process;

import pe.com.softlite.clientsistradoc.dto.TareaQuerysDTO;
import pe.com.softlite.clientsistradoc.dto.TramiteQuerysDTO;
import java.util.List;
import pe.com.softlite.clientsistradoc.dto.TramiteMovimientoQueryFlujo;

/**
 *
 * @author USER
 */
public interface QuerysTramite {
    
    public List<TramiteQuerysDTO> listTramitesToDeriverByDependency(Long idDependency);
    
    public List<TramiteQuerysDTO> listTramitesToDevolverByDependency(Long idDependency);
    
    public List<TramiteQuerysDTO> listTramitesToFinishedByDependency(Long idDependency);
    
    public List<TramiteQuerysDTO> listTramitesToAttendByDependency(Long idDependency);
    
    public List<TramiteQuerysDTO> listTramitesFindByCodigoTramite(String codigoTramite);
    
    public List<TramiteQuerysDTO> listTramitesFindBySolicitante(String tipoDocumento, String nroDocumento);
    
    public List<TramiteQuerysDTO> listTramitesFindByRangoFechas(String fechaInicio, String fechaFin);
    
    public List<TareaQuerysDTO> listTareasFindByTramite(String codigoTramite);
    
    public List<TramiteMovimientoQueryFlujo> listFlujoTramiteByCodigo(String codigoTramite);
}
