/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.process.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import pe.com.softlite.clientsistradoc.dto.UsuarioDto;
import pe.com.softlite.clientsistradoc.process.AuthenticationLogin;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import pe.com.softlite.clientsistradoc.utils.ReadProperty;

/**
 *
 * @author USER
 */
public class AuthenticationLoginImp implements AuthenticationLogin{
    
    private final String urlAuthentication = ReadProperty.getInstance().getValueProperty("url.ws.authentication");

    @Override
    public HttpResponse<String> login(UsuarioDto loginRequestDto) {
        Gson gson = new Gson();
        
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.authentication.login");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlAuthentication + apiUri))
//			.uri(URI.create("http://localhost:8093/ms-app-ws-authentication/auth/login"))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(loginRequestDto)))
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

}
