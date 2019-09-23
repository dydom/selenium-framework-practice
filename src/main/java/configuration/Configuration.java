package configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    private Properties appProps;

    public Configuration() throws IOException {
        appProps = new Properties();
        appProps.load(new FileInputStream("src/main/java/configuration/Configuration.properties"));
    }

    public String getLink() {
        return appProps.getProperty("applicationAddress");
    }

    public String getBrowser() {
        return appProps.getProperty("browser");
    }

}
