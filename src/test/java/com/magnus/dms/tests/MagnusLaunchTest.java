package com.magnus.dms.tests;

import com.magnus.dms.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MagnusLaunchTest extends BaseTest {

    @Test
    public void verifyMagnusApplicationLaunches() {
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(
                currentUrl.contains("magnus.jalatechnologies.com"),
                "Magnus application did not open correctly."
        );
    }
}
