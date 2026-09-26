package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import utils.APIUtils;
import utils.ConfigReader;

import java.io.IOException;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginWithAPIData() throws IOException {

        setUp();

        try {
            String userId = APIUtils.createUser();
            System.out.println("Created User: " + userId);

            ConfigReader configReader = new ConfigReader();
            driver.get(configReader.getUrl());

            LoginPage loginPage = new LoginPage(driver);
            loginPage.login("standard_user", "secret_sauce");

            Assert.assertTrue(
                    loginPage.isLoginSuccessful(),
                    "Login failed: SauceDemo inventory page was not displayed."
            );
        } finally {
            tearDown();
        }
    }
}
