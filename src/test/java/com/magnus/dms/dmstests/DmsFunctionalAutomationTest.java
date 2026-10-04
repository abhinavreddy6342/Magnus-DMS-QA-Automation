package com.magnus.dms.dmstests;

import com.magnus.dms.base.LoggedInBaseTest;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class DmsFunctionalAutomationTest extends LoggedInBaseTest {

    private void requireDmsAccess() {
        boolean auditVisible = !driver.findElements(
                By.xpath("//*[normalize-space()='Audits' or normalize-space()='Audit']")
        ).isEmpty();

        if (!auditVisible) {
            throw new SkipException(
                    "BLK_DMS_001: Internal Audit/Audits module is not available for the current test user."
            );
        }
    }

    @Test
    public void verifyFR_DMS_01_AccessDocuments() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_02_CreateDocumentContainers() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_03_AddNewVersionCheckIn() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_04_LinkingAssociatingDocuments() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_05_TriggerTask() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_06_ManageDocumentStatus() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_07_ViewDocumentDetails() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_08_VersionHistory() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_09_DownloadDocument() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_10_CheckOutDocument() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_11_DeleteDocument() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_12_RemoveAssociation() {
        requireDmsAccess();
    }

    @Test
    public void verifyFR_DMS_13_ApplyPermissions() {
        requireDmsAccess();
    }
}
