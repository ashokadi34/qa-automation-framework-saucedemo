package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import hooks.Hooks;
import org.testng.Assert;
import pages.LoginPage;
import utils.ConfigReader;

import java.io.IOException;

public class LoginSteps {

    @Given("user is on login page")
    public void openPage() throws IOException {
        ConfigReader configReader = new ConfigReader();
        Hooks.getDriver().get(configReader.getUrl());
    }

    @When("user enters credentials")
    public void enterData() {
        LoginPage loginPage = Hooks.getLoginPage();
        loginPage.login("standard_user", "secret_sauce");
    }

    @Then("login should be successful")
    public void validate() {
        LoginPage loginPage = Hooks.getLoginPage();

        Assert.assertTrue(
                loginPage.isLoginSuccessful(),
                "Login failed: SauceDemo inventory page was not displayed."
        );
    }
}
