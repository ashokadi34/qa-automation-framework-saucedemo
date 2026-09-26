package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import pages.LoginPage;

public class Hooks {
    private static WebDriver driver;
    private static LoginPage loginPage;

    @Before
    public void setUp() {
        driver = DriverFactory.initDriver();
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
            loginPage = null;
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static LoginPage getLoginPage() {
        return loginPage;
    }
}
