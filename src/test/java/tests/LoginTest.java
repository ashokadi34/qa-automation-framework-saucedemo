package tests;

import base.BaseTest;
import pages.LoginPage;
import utils.APIUtils;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginWithAPIData() {

        setUp();

        String userId = APIUtils.createUser();
        System.out.println("Created User: " + userId);

        driver.get("https://www.saucedemo.com/");

        LoginPage lp = new LoginPage(driver);
        lp.login("standard_user", "secret_sauce");

        tearDown();
    }
}