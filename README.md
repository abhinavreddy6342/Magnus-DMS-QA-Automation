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
- Test Scenarios
- Test Cases
- Traceability Matrix
- Test Plan / Strategy
- Defect Log
- Blocker Report
- JIRA Defect Validation Record
- QA Review Checklist
- Test Execution Summary
- Selenium Automation Framework

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

The 14 skipped tests consist of the DMS availability check and the 13 DMS functional automation tests because the required Internal Audit/Audits module is not available for the current test user.

## Blocker
BLK_DMS_001

The DMS functional flows defined in the signed-off FDD require access through:

Audits -> Area -> Audit/Sub Audit -> Documents

DMS functional workflow execution will continue after the required Internal Audit/DMS access is provided.

## Defect Status
1 evidenced blocker is documented.

The requirement asked for 5 JIRA defects. Four additional defects have not been fabricated because the DMS functional screens are inaccessible in the current environment. They require actual DMS execution and evidence before being raised.

## Test Artifacts
- Magnus_DMS_Test_Scenarios_UPDATED.xlsx
- Magnus_DMS_Test_Cases.xlsx
- DMS_Traceability_Matrix.csv
- DMS_Test_Plan_Strategy.txt
- DMS_Test_Execution_Summary.txt
- DMS_Defect_Log.csv
- DMS_JIRA_Defect_Validation_Record.txt
- DMS_QA_Review_Checklist.txt
- BLK_DMS_001.txt
- DEF_DMS_001_Blocker.txt

## Automation Status
Login automation: Working
Application launch validation: Working
DMS availability check: Blocked by environment access
DMS functional workflow automation: Implemented as access-gated tests; actual workflow execution is blocked by required application access

## Review Status
QA review checklist prepared.
Peer review confirmation is pending from a second reviewer/teammate.
