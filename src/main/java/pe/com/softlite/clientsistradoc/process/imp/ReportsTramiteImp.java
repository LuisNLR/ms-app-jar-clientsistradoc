/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.process.imp;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import javax.swing.JOptionPane;
import pe.com.softlite.clientsistradoc.dto.TramiteQuerysDTO;
import pe.com.softlite.clientsistradoc.process.ReportsTramite;
import pe.com.softlite.clientsistradoc.utils.ReadProperty;

/**
 *
 * @author USER
 */
public class ReportsTramiteImp implements ReportsTramite {
    
    private final String urlSistradoc = ReadProperty.getInstance().getValueProperty("url.ws.sistradoc");

    @Override
    public void generateReportTramitesInProgressByDependency() {
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getReportTramitesInProgressByDependency");
        try {
            // URL del microservicio que genera el PDF
            URL url = new URL(urlSistradoc + apiUri);
//            URL url = new URL("http://localhost:8090/ms-app-ws-sistradoc/reporte/pdf");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Verifica respuesta
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Lee el PDF del response
                InputStream inputStream = con.getInputStream();
                byte[] buffer = inputStream.readAllBytes();

                // Guarda el PDF localmente
                File archivo = new File("report.pdf");
                try (FileOutputStream fos = new FileOutputStream(archivo)) {
                    fos.write(buffer);
                    fos.flush();
                }

                // Abre el PDF automáticamente (si el sistema lo permite)
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(archivo);
                } else {
                    JOptionPane.showMessageDialog(null, "PDF descargado: " + archivo.getAbsolutePath());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener el reporte: " + responseCode);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
        
    }

    @Override
    public void generateReportTramitesInProgressByTipoTramite() {
        String apiUri = ReadProperty.getInstance().getValueProperty("api.ws.sistradoc.getReportTramitesInProgressByTipoTramite");
        try {
            // URL del microservicio que genera el PDF
            URL url = new URL(urlSistradoc + apiUri);
//            URL url = new URL("http://localhost:8090/ms-app-ws-sistradoc/reporte/pdf");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");

            // Verifica respuesta
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Lee el PDF del response
                InputStream inputStream = con.getInputStream();
                byte[] buffer = inputStream.readAllBytes();

                // Guarda el PDF localmente
                File archivo = new File("report.pdf");
                try (FileOutputStream fos = new FileOutputStream(archivo)) {
                    fos.write(buffer);
                    fos.flush();
                }

                // Abre el PDF automáticamente (si el sistema lo permite)
                if (Desktop.isDesktopSupported()) {
                    Desktop.getDesktop().open(archivo);
                } else {
                    JOptionPane.showMessageDialog(null, "PDF descargado: " + archivo.getAbsolutePath());
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error al obtener el reporte: " + responseCode);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }
    
}
