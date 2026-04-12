package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    Properties prop;

    public ConfigReader() throws IOException {
        prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);
    }

    public String getUrl() {
        return prop.getProperty("url");
    }
}