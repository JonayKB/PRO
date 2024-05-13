package es.ies.puerto.config;

import es.ies.puerto.exception.MarvelException;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AppConfig {
    String urlBd;
    public AppConfig() throws MarvelException {
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/app.properties")) {
            properties.load(fis);
            urlBd = properties.getProperty("urlBd");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUrlBd() {
        
        return this.urlBd;
    }
}
