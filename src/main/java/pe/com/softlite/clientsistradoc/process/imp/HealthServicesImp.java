/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.process.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import pe.com.softlite.clientsistradoc.dto.Health;
import pe.com.softlite.clientsistradoc.process.HealthServices;
import pe.com.softlite.clientsistradoc.utils.ReadProperty;

/**
 *
 * @author USER
 */
public class HealthServicesImp implements HealthServices {
    
    private final String urlAuthentication = ReadProperty.getInstance().getValueProperty("url.ws.authentication");
    
    private final String urlSistradoc = ReadProperty.getInstance().getValueProperty("url.ws.sistradoc");

    @Override
    public Health getHealthAuthentication() {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        Health health = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.authentication.health");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlAuthentication + apiUri))
//			.uri(URI.create("http://localhost:8093/ms-app-ws-authentication/actuator/health"))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            health = objectMapper.readValue(httpResponse.body(), Health.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return health;
    }

    @Override
    public Health getHealthSistradoc() {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        Health health = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.health");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri))
//			.uri(URI.create("http://localhost:8093/ms-app-ws-authentication/actuator/health))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            health = objectMapper.readValue(httpResponse.body(), Health.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return health;
    }
    
}
