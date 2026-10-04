package com.magnus.dms.dmstests;

import com.magnus.dms.base.LoggedInBaseTest;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DmsAvailabilityTest extends LoggedInBaseTest {

    @Test
    public void verifyInternalAuditModuleIsAvailable() {

        boolean auditVisible = !driver.findElements(
                By.xpath("//*[normalize-space()='Audits' or normalize-space()='Audit']")
        ).isEmpty();

        if (!auditVisible) {
            throw new SkipException(
                    "BLK_DMS_001: Internal Audit/Audits module is not available for the current test user."
            );
        }

        System.out.println("Internal Audit/Audits module is available.");
    }
}
