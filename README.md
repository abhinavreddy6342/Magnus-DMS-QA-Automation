# Magnus DMS – QA Automation Project

## Project
Magnus – Document Management System (DMS)

## Technology Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- Google Chrome

## QA Deliverables
- 20 Test Scenarios
- 20 Test Cases
- Requirement Traceability Matrix
- Test Plan / Test Strategy
- Defect Log
- Blocker Report
- JIRA Defect Validation Record
- QA Review Checklist
- Test Review Minutes
- Test Execution Summary
- Selenium Automation Framework
- Requirements Reference

## Test Execution

Set the required environment variables:

$env:MAGNUS_USERNAME = "your-username"
$env:MAGNUS_PASSWORD = "your-password"

Run the complete suite:

mvn test

## Latest Execution Result

Total Tests: 16
Passed: 2
Failed: 0
Skipped: 14
Build: SUCCESS

Passed Tests:
1. LoginTest.verifyValidLogin
2. MagnusLaunchTest.verifyMagnusApplicationLaunches

Skipped Tests:
- DmsAvailabilityTest.verifyInternalAuditModuleIsAvailable
- 13 DMS functional automation tests covering FR_DMS_01 to FR_DMS_13

Skip Reason:
BLK_DMS_001 – Internal Audit/Audits module required for DMS testing is not available for the current test user.

## Functional Requirement Coverage

FR_DMS_01 – Access Documents
FR_DMS_02 – Create New Document Containers
FR_DMS_03 – Add New Version / Check-In
FR_DMS_04 – Linking / Associating Documents
FR_DMS_05 – Trigger a Task
FR_DMS_06 – Manage Document Status
FR_DMS_07 – View Document Details
FR_DMS_08 – Version History
FR_DMS_09 – Download Document
FR_DMS_10 – Check Out Document
FR_DMS_11 – Delete Document
FR_DMS_12 – Remove Association
FR_DMS_13 – Apply Permissions

## DMS Navigation Required

Audits -> Area -> Audit/Sub Audit -> Documents

## Blocker

BLK_DMS_001

The current test user can successfully log in, but the Internal Audit/Audits module required to access the DMS functionality is unavailable.

Therefore, the actual DMS functional workflows cannot currently be executed.

## Defect Status

1 evidenced blocker is documented.

The assignment requires 5 JIRA defects. Four additional defects have not been fabricated because the DMS functional screens are inaccessible in the current environment.

Additional JIRA defects must be raised only after actual DMS execution identifies deviations from the signed-off FDD.

## Automation Status

Application launch validation: Working
Login automation: Working
DMS availability validation: Working
DMS FR_DMS_01–FR_DMS_13 access-gated automation: Implemented
Actual DMS workflow execution: Blocked by application access

## Test Artifacts

- Magnus_DMS_Test_Scenarios_UPDATED.xlsx
- Magnus_DMS_Test_Cases.xlsx
- DMS_Traceability_Matrix.csv
- DMS_Test_Plan_Strategy.txt
- DMS_Test_Execution_Summary.txt
- DMS_Defect_Log.csv
- DMS_JIRA_Defect_Validation_Record.txt
- DMS_QA_Review_Checklist.txt
- DMS_Test_Review_Minutes.txt
- BLK_DMS_001.txt
- DEF_DMS_001_Blocker.txt

## Review Status

QA review checklist prepared.
Test review minutes prepared.
External peer-review confirmation is pending from a second reviewer/teammate.

## Submission Status

Documentation package: Complete
Automation framework: Complete
Application launch/login validation: Complete
DMS functional execution: Blocked by BLK_DMS_001
Evidence-based defect reporting: Complete for currently observable blocker
