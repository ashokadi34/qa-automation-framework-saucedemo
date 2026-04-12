package factory;

import org.openqa.selenium.WebDriver;
// avoid direct reference to ChromeDriver to prevent compile-time issues when
// the concrete driver class may not be available on the build classpath

public class DriverFactory {

    public static WebDriver initDriver() {
        try {
            Class<?> chromeCls = Class.forName("org.openqa.selenium.chrome.ChromeDriver");
            WebDriver driver = (WebDriver) chromeCls.getDeclaredConstructor().newInstance();
            driver.manage().window().maximize();
            return driver;
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize ChromeDriver", e);
        }
    }
}