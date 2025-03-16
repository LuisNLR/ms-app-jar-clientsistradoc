/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.softlite.clientsistradoc.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author USER
 */
public class ReadProperty {

    private static ReadProperty readProperty;
    private ReadProperty() {
    }
    
    public static ReadProperty getInstance() {
        if(readProperty==null){
            readProperty = new ReadProperty();
        }
        return readProperty;
    }
    
    Properties properties = new Properties();

    public String getValueProperty(String propertyName) {
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream("application.properties");
//            properties.load(new FileInputStream(new File("src/main/resources/application.properties")));
            properties.load(inputStream);

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return (String) properties.get(propertyName);
    }
    
    public static void main(String args[]) {
        new ReadProperty().getValueProperty("url.ws.sistradoc");
    }

}
