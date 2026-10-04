package com.magnus.dms.tests;

import com.magnus.dms.base.BaseTest;
import com.magnus.dms.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void verifyValidLogin() {

        String username = System.getenv("MAGNUS_USERNAME");
        String password = System.getenv("MAGNUS_PASSWORD");

        Assert.assertNotNull(
                username,
                "MAGNUS_USERNAME environment variable is not set."
        );

        Assert.assertNotNull(
                password,
                "MAGNUS_PASSWORD environment variable is not set."
        );

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(username, password);

        WebDriverWait wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );

        wait.until(
                ExpectedConditions.urlContains("/Home/Index")
        );

        Assert.assertTrue(
                driver.getCurrentUrl().contains("/Home/Index"),
                "Login failed or the application did not redirect to Home."
        );

        Assert.assertTrue(
                driver.getPageSource().contains("Logout"),
                "Login succeeded but Logout option was not found."
        );
    }
}
