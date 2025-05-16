/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.process.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import pe.com.softlite.clientsistradoc.dto.TipoTramiteDTO;
import pe.com.softlite.clientsistradoc.dto.TramiteMovimientoDTO;
import pe.com.softlite.clientsistradoc.dto.TramiteRegisterDTO;
import pe.com.softlite.clientsistradoc.dto.TramiteTareaDTO;
import pe.com.softlite.clientsistradoc.process.ServicesTramite;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import pe.com.softlite.clientsistradoc.utils.ReadProperty;

/**
 *
 * @author USER
 */
public class ServicesTramiteImp implements ServicesTramite {
    
    private final String urlSistradoc = ReadProperty.getInstance().getValueProperty("url.ws.sistradoc");

    @Override
    public HttpResponse<String> register(TramiteRegisterDTO tramiteRegisterDto) {
        Gson gson = new Gson();
        
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.register");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/api/registerTramite"))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(tramiteRegisterDto)))
                        .build();
            
            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    @Override
    public List<TipoTramiteDTO> listTipoTramite() {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TipoTramiteDTO[] listTipoTramite = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTipoTramite");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/api/getListTipoTramite"))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTipoTramite = objectMapper.readValue(httpResponse.body(), TipoTramiteDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTipoTramite);
    }

    @Override
    public HttpResponse<String> deriver(TramiteMovimientoDTO tramiteMovimientoDto) {
        Gson gson = new Gson();
        
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.deriver");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/api/deriverTramite"))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(tramiteMovimientoDto)))
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    @Override
    public HttpResponse<String> devolver(TramiteMovimientoDTO tramiteMovimientoDto) {
        Gson gson = new Gson();
        
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.devolver");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/api/devolverTramite"))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(tramiteMovimientoDto)))
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    @Override
    public HttpResponse<String> finished(TramiteRegisterDTO tramiteRegisterDto) {
        Gson gson = new Gson();
        
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.finished");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/api/finishedTramite"))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(tramiteRegisterDto)))
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return httpResponse;
    }
    
    @Override
    public HttpResponse<String> registerActivity(TramiteTareaDTO tramiteTareaRegisterDto) {
        Gson gson = new Gson();
        
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.registerTarea");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/api/registerTareaTramite"))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .POST(HttpRequest.BodyPublishers.ofString(gson.toJson(tramiteTareaRegisterDto)))
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return httpResponse;
    }
    
}
