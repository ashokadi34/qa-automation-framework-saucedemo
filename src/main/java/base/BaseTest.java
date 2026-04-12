package base;

import org.openqa.selenium.WebDriver;
import factory.DriverFactory;

public class BaseTest {

    public WebDriver driver;

    public void setUp() {
        driver = DriverFactory.initDriver();
    }

    public void tearDown() {
        driver.quit();
    }
}