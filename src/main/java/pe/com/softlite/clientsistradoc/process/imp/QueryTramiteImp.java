/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.process.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import pe.com.softlite.clientsistradoc.dto.TareaQuerysDTO;
import pe.com.softlite.clientsistradoc.dto.TramiteQuerysDTO;
import pe.com.softlite.clientsistradoc.process.QuerysTramite;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Arrays;
import java.util.List;
import pe.com.softlite.clientsistradoc.dto.TramiteMovimientoQueryFlujo;
import pe.com.softlite.clientsistradoc.utils.ReadProperty;

/**
 *
 * @author USER
 */
public class QueryTramiteImp implements QuerysTramite{
    
    private final String urlSistradoc = ReadProperty.getInstance().getValueProperty("url.ws.sistradoc");

    @Override
    public List<TramiteQuerysDTO> listTramitesToDeriverByDependency(Long idDependency) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TramiteQuerysDTO[] listTramiteQuerysDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTramiteDeriver");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + idDependency))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListTramiteToDeriverByDependency/"+ idDependency))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTramiteQuerysDTO = objectMapper.readValue(httpResponse.body(), TramiteQuerysDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTramiteQuerysDTO);
    }

    @Override
    public List<TramiteQuerysDTO> listTramitesToDevolverByDependency(Long idDependency) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TramiteQuerysDTO[] listTramiteQuerysDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTramiteDevolver");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + idDependency))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListTramiteToDevolverByDependency/"+ idDependency))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTramiteQuerysDTO = objectMapper.readValue(httpResponse.body(), TramiteQuerysDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTramiteQuerysDTO);
    }

    @Override
    public List<TramiteQuerysDTO> listTramitesToFinishedByDependency(Long idDependency) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TramiteQuerysDTO[] listTramiteQuerysDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTramiteFinished");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + idDependency))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListTramiteToFinishedByDependency/"+ idDependency))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTramiteQuerysDTO = objectMapper.readValue(httpResponse.body(), TramiteQuerysDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTramiteQuerysDTO);
    }
    
    @Override
    public List<TramiteQuerysDTO> listTramitesToAttendByDependency(Long idDependency) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TramiteQuerysDTO[] listTramiteQuerysDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTramiteToAttend");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + idDependency))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListTramiteToAttendByDependency/"+ idDependency))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTramiteQuerysDTO = objectMapper.readValue(httpResponse.body(), TramiteQuerysDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTramiteQuerysDTO);
    }

    @Override
    public List<TramiteQuerysDTO> listTramitesFindByCodigoTramite(String codigoTramite) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TramiteQuerysDTO[] listTramiteQuerysDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTramiteByCodigoTramite");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + codigoTramite))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListTramiteFindByCodigoTramite/"+ codigoTramite))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTramiteQuerysDTO = objectMapper.readValue(httpResponse.body(), TramiteQuerysDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTramiteQuerysDTO);
    }

    @Override
    public List<TramiteQuerysDTO> listTramitesFindBySolicitante(String tipoDocumento, String nroDocumento) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TramiteQuerysDTO[] listTramiteQuerysDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTramiteBySolicitante");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + tipoDocumento + "/" + nroDocumento))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListTramiteFindBySolicitante/"+ tipoDocumento + "/" + nroDocumento))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTramiteQuerysDTO = objectMapper.readValue(httpResponse.body(), TramiteQuerysDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTramiteQuerysDTO);
    }

    @Override
    public List<TramiteQuerysDTO> listTramitesFindByRangoFechas(String fechaInicio, String fechaFin) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TramiteQuerysDTO[] listTramiteQuerysDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTramiteByDateRange");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + fechaInicio + "/" + fechaFin))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListTramiteFindByDateRange/"+ fechaInicio + "/" + fechaFin))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTramiteQuerysDTO = objectMapper.readValue(httpResponse.body(), TramiteQuerysDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTramiteQuerysDTO);
    }

    @Override
    public List<TareaQuerysDTO> listTareasFindByTramite(String codigoTramite) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TareaQuerysDTO[] listTareaQuerysDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListTareasByCodigoTramite");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + codigoTramite))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListTareasByCodigoTramite/"+ codigoTramite))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listTareaQuerysDTO = objectMapper.readValue(httpResponse.body(), TareaQuerysDTO[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listTareaQuerysDTO);
    }

    @Override
    public List<TramiteMovimientoQueryFlujo> listFlujoTramiteByCodigo(String codigoTramite) {
        HttpClient httpClient = null;
        HttpRequest request = null;
        HttpResponse<String> httpResponse = null;
        TramiteMovimientoQueryFlujo[] listFlujoTramiteDTO = null;
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getListFlujoTramiteByCodigo");
        try {
            httpClient = HttpClient.newHttpClient();
            request = HttpRequest.newBuilder()
                        .uri(URI.create(urlSistradoc + apiUri + codigoTramite))
//			.uri(URI.create("http://localhost:8090/ms-app-ws-sistradoc/querys/getListFlujoTramiteByCodigo/"+ codigoTramite))
                        .header("Content-Type", "application/json")
                        .version(HttpClient.Version.HTTP_1_1)
                        .GET()
                        .build();

            httpResponse = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
            ObjectMapper objectMapper = new ObjectMapper();
            listFlujoTramiteDTO = objectMapper.readValue(httpResponse.body(), TramiteMovimientoQueryFlujo[].class);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Arrays.asList (listFlujoTramiteDTO);
    }
    
}
