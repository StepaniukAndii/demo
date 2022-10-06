package demo1;

import java.io.IOException;
import java.util.Properties;

public class DemoProfile {

    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        properties.load(DemoProfile.class.getResourceAsStream(System.getProperty("app", "/app.properties")));
        String env = properties.getProperty("env.url");

        System.out.println(env);
    }
}
