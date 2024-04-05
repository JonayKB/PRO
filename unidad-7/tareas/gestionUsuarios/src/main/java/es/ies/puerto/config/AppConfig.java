package es.ies.puerto.config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import es.ies.puerto.exception.UsuarioException;

public class AppConfig {
    private String url;
    public AppConfig(){
        leerProperties();
    }
    
    public void leerProperties(){
        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/app.properties")) {
            properties.load(fis);
            url = properties.getProperty("url");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

}
