package demo2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverLogLevel;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.v100.log.Log;
import org.openqa.selenium.logging.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.util.logging.Level;

public class DemoLog {

    @Test
    void checkLog() {
        WebDriverManager.chromedriver().setup();
        LoggingPreferences logPrefs = new LoggingPreferences();
        logPrefs.enable(LogType.PERFORMANCE, Level.ALL);
        ChromeOptions options = new ChromeOptions();
//        options.setLogLevel(ChromeDriverLogLevel.ALL);
        options.setCapability("goog:loggingPrefs", logPrefs);

        WebDriver driver = new ChromeDriver(options);


        driver.get("https://www.google.com");

        LogEntries log = driver.manage().logs().get(LogType.PERFORMANCE);
        for (LogEntry entry : log) {
            System.out.println(entry.getMessage());
        }

        driver.quit();
    }
}
