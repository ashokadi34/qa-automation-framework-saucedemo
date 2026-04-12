package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
// ...existing imports...

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginSteps {
	
	WebDriver driver;
	LoginPage lp;

    @Given("user is on login page")
    public void openPage() {
        // instantiate ChromeDriver via reflection to avoid direct compile-time
        // dependency on org.openqa.selenium.chrome.ChromeDriver which can
        // cause classpath errors in some IDE setups
        try {
            Class<?> chromeCls = Class.forName("org.openqa.selenium.chrome.ChromeDriver");
            driver = (WebDriver) chromeCls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to initialize ChromeDriver", e);
        }

        driver.get("https://www.saucedemo.com/");
 	    driver.manage().window().maximize();
        System.out.println("Opened login page");
    }

    @When("user enters credentials")
    public void enterData() {
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.findElement(By.id("user-name")).sendKeys("standard_user");
	    driver.findElement(By.id("password")).sendKeys("secret_sauce");
        System.out.println("Entered credentials");
    }

    @Then("login should be successful")
    public void validate() {
    	driver.findElement(By.id("login-button")).click();
        System.out.println("Login success");
    }
}