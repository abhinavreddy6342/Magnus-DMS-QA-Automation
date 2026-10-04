package com.magnus.dms.base;

import com.magnus.dms.pages.LoginPage;
import com.magnus.dms.utils.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class LoggedInBaseTest extends BaseTest {

    protected WebDriverWait wait;

    @BeforeMethod
    @Override
    public void setUp() {

        super.setUp();

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(
                        Long.parseLong(ConfigReader.get("timeout"))
                )
        );

        String username = ConfigReader.get("magnus.username");
        String password = ConfigReader.get("magnus.password");

        Assert.assertNotNull(username, "Magnus username is not configured.");
        Assert.assertNotNull(password, "Magnus password is not configured.");

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);

        wait.until(
                ExpectedConditions.urlContains("/Home/Index")
        );

        Assert.assertTrue(
                driver.findElements(
                        By.xpath("//*[normalize-space()='Logout']")
                ).size() > 0,
                "Login completed but Logout was not found."
        );
    }
}
