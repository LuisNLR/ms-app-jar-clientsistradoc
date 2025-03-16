/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.softlite.clientsistradoc.process;

import pe.com.softlite.clientsistradoc.dto.UsuarioDto;
import java.net.http.HttpResponse;

/**
 *
 * @author USER
 */
public interface AuthenticationLogin {
    
    public HttpResponse<String> login(UsuarioDto loginRequestDto);
    
}
