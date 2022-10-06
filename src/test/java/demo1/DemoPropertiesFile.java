package demo1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class DemoPropertiesFile {

    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("src/test/resources/config.properties");
        Properties properties = new Properties();
        properties.load(reader);
        String env = properties.getProperty("env");
        String browser = properties.getProperty("browser");
        boolean headless = Boolean.parseBoolean(properties.getProperty("headless"));
        String browserVersion = properties.getProperty("browserVersion");

        System.out.println(env);
        System.out.println(browser);
        System.out.println(headless);
        System.out.println(browserVersion);
    }
}
