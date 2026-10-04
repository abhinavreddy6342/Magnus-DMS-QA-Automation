# Magnus DMS – QA Automation & Manual Testing

> **End-to-end QA project combining manual testing, requirements traceability, defect management, and Selenium automation for a Document Management System.**

[![Java](https://img.shields.io/badge/Java-17%2B-orange)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Selenium-4.49.0-43B02A)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/TestNG-7.9.0-red)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Maven-3.9%2B-C71A36)](https://maven.apache.org/)
[![Browser](https://img.shields.io/badge/Browser-Google%20Chrome-blue)](https://www.google.com/chrome/)

---

## 📌 Project Overview

**Magnus DMS QA Automation** is a structured software quality assurance project created for testing the **Magnus Document Management System (DMS)**.

The project demonstrates the complete QA lifecycle:

**Requirements → Test Design → Traceability → Manual Testing → Defect Management → Automation → Test Execution → Reporting**

The implementation combines **manual testing artifacts** with a maintainable **Selenium WebDriver + Java + TestNG + Maven automation framework**.

The project is designed around the signed-off DMS Functional Design Document (FDD) and covers the major document-management requirements including document access, versioning, association, status management, download, check-out, deletion, and permissions.

---

## 🎯 QA Objectives

The primary objectives of this project are to:

- Convert functional requirements into structured and executable test scenarios.
- Design detailed manual test cases with clear preconditions, steps, expected results, and requirement mapping.
- Establish requirement-to-test traceability.
- Build a reusable Selenium automation framework using the **Page Object Model**.
- Validate application launch and authentication flows automatically.
- Introduce access-aware automation for the DMS functional area.
- Document environment blockers with reproducible evidence.
- Maintain professional QA documentation suitable for real-world testing workflows.
- Ensure defects are reported only when supported by actual execution evidence.

---

## 🚀 Key Highlights

### Manual QA Coverage

- **20 Test Scenarios**
- **20 Detailed Test Cases**
- **13 Functional Requirements**
- **Requirement Traceability Matrix**
- **Test Plan / Test Strategy**
- **Execution Summary**
- **Defect / Blocker Documentation**
- **JIRA Defect Validation Record**
- **QA Review Checklist**
- **Test Review Minutes**

### Automation Coverage

- Selenium WebDriver
- Java
- TestNG
- Maven
- Page Object Model
- Centralized configuration
- Environment-variable based credentials
- Reusable test-data utilities
- Login automation
- Application launch validation
- DMS availability validation
- Access-gated automation for DMS requirements

---

## 🧩 Functional Requirement Coverage

The automation and QA documentation are aligned with the following DMS functional requirements:

| ID | Requirement |
|---|---|
| FR_DMS_01 | Access Documents |
| FR_DMS_02 | Create New Document Containers |
| FR_DMS_03 | Add New Version / Check-In |
| FR_DMS_04 | Linking / Associating Documents |
| FR_DMS_05 | Trigger a Task |
| FR_DMS_06 | Manage Document Status |
| FR_DMS_07 | View Document Details |
| FR_DMS_08 | Version History |
| FR_DMS_09 | Download Document |
| FR_DMS_10 | Check Out Document |
| FR_DMS_11 | Delete Document |
| FR_DMS_12 | Remove Association |
| FR_DMS_13 | Apply Permissions |

### Required DMS Navigation

```text
Audits
   ↓
Area
   ↓
Audit / Sub Audit
   ↓
Documents
```

---

## 🏗️ Automation Framework Architecture

```text
Magnus-DMS-Automation/
│
├── pom.xml
├── testng.xml
├── README.md
├── requirements.txt
│
├── src/
│   ├── main/
│   │   └── java/com/magnus/dms/
│   │       ├── pages/
│   │       │   └── LoginPage.java
│   │       │
│   │       └── utils/
│   │           ├── ConfigReader.java
│   │           └── TestDataUtil.java
│   │
│   └── test/
│       ├── java/com/magnus/dms/
│       │   ├── base/
│       │   │   ├── BaseTest.java
│       │   │   └── LoggedInBaseTest.java
│       │   │
│       │   ├── dmstests/
│       │   │   ├── DmsAvailabilityTest.java
│       │   │   └── DmsFunctionalAutomationTest.java
│       │   │
│       │   └── tests/
│       │       ├── LoginTest.java
│       │       └── MagnusLaunchTest.java
│       │
│       └── resources/
│           ├── config.properties
│           └── testdata/
│               ├── DMS_Bulk_Document_1.txt
│               ├── DMS_Bulk_Document_2.txt
│               ├── DMS_Test_Document_V1.txt
│               └── DMS_Test_Document_V2.txt
│
└── test-artifacts/
    ├── Magnus_DMS_Test_Scenarios_UPDATED.xlsx
    ├── Magnus_DMS_Test_Cases.xlsx
    ├── DMS_Traceability_Matrix.csv
    ├── DMS_Test_Plan_Strategy.txt
    ├── DMS_Test_Execution_Summary.txt
    ├── DMS_Defect_Log.csv
    ├── BLK_DMS_001.txt
    ├── DEF_DMS_001_Blocker.txt
    ├── DMS_JIRA_Defect_Validation_Record.txt
    ├── DMS_QA_Review_Checklist.txt
    └── DMS_Test_Review_Minutes.txt
```

---

## 🧪 Testing Strategy

The project follows a structured QA approach covering:

### Requirement Analysis

Functional requirements were reviewed from the signed-off DMS FDD and converted into testable conditions.

### Test Scenario Design

High-level scenarios were created to cover positive, negative, validation, navigation, document-management, versioning, and permission-related behavior.

### Test Case Design

Detailed test cases were prepared with:

- Test Case ID
- Requirement ID
- Preconditions
- Test Steps
- Test Data
- Expected Result
- Priority
- Test Type

### Traceability

A Requirement Traceability Matrix maps:

```text
Requirement
     ↓
Test Scenario
     ↓
Test Case
     ↓
Automation Status
```

This provides visibility into requirement coverage and testing status.

### Defect Management

Defects are documented using structured information such as:

- Summary
- Severity
- Priority
- Component
- Environment
- Test Case ID
- Description
- Reproduction Steps
- Expected Result
- Actual Result

---

## 🤖 Automation Design

The automation framework follows the **Page Object Model (POM)** to separate:

```text
Test Logic
     ↓
Page Objects
     ↓
Configuration / Test Data
```

### Framework Components

**`BaseTest`**

Responsible for WebDriver initialization, browser configuration, application launch, and cleanup.

**`LoggedInBaseTest`**

Provides reusable authentication setup for tests that require a logged-in session.

**`LoginPage`**

Encapsulates login-page locators and authentication actions.

**`ConfigReader`**

Loads application configuration and retrieves credentials securely from environment variables.

**`TestDataUtil`**

Provides reusable access to test files bundled with the project.

**`DmsAvailabilityTest`**

Validates whether the required Internal Audit/DMS area is accessible before attempting DMS-specific testing.

**`DmsFunctionalAutomationTest`**

Provides access-gated test entry points aligned with the 13 DMS functional requirements.

---

## 🔐 Credential Handling

Credentials are **not hard-coded into the source code**.

Environment variables are used:

```powershell
$env:MAGNUS_USERNAME = "your-username"
$env:MAGNUS_PASSWORD = "your-password"
```

This keeps authentication data outside the repository and demonstrates basic test-automation security hygiene.

---

## ▶️ Running the Automation

### Prerequisites

- Java 17+
- Maven 3.9+
- Google Chrome
- Valid Magnus test credentials
- Internet access to the Magnus application

### Set Credentials

```powershell
$env:MAGNUS_USERNAME = "your-username"
$env:MAGNUS_PASSWORD = "your-password"
```

### Execute the Suite

```powershell
mvn test
```

### TestNG Report

After execution, the TestNG results are available at:

```text
target/surefire-reports/testng-results.xml
```

---

## 📊 Latest Execution Result

The latest verified execution produced:

| Metric | Result |
|---|---:|
| Total Tests | **16** |
| Passed | **2** |
| Failed | **0** |
| Skipped | **14** |
| Build | **SUCCESS** |

### Passed Tests

```text
LoginTest.verifyValidLogin
MagnusLaunchTest.verifyMagnusApplicationLaunches
```

These validate:

- Magnus application launch
- Valid user authentication
- Successful redirect after login
- Presence of the authenticated application state

---

## ⚠️ DMS Execution Blocker

During execution, the supplied test account successfully authenticated into Magnus, but the **Internal Audit / Audits module required for DMS access was not available**.

The required navigation:

```text
Audits → Area → Audit/Sub Audit → Documents
```

could therefore not be reached.

The project records this as:

```text
BLK_DMS_001
```

### Impact

Because the required DMS area is inaccessible:

- Actual DMS workflows cannot currently be executed.
- The 13 DMS functional automation entry points are access-gated rather than falsely reported as passed.
- Additional product defects cannot responsibly be raised without observing the actual DMS functionality.

This project intentionally follows an **evidence-based defect reporting approach**: unverified product defects are not fabricated simply to satisfy a defect-count requirement.

---

## 🐞 Defect Management Status

### Evidenced Blocker

**BLK_DMS_001**

> Internal Audit / DMS module is not available for the current test user.

The blocker is documented with its impact, evidence, environment, and required next action.

### Additional Defects

Additional JIRA defects are intentionally pending until DMS access is available and actual functional deviations can be reproduced.

This demonstrates an important QA principle:

> **A defect should be raised from observable evidence, not assumption.**

---

## 📁 QA Deliverables

The `test-artifacts` directory contains the complete documentation package:

| Artifact | Purpose |
|---|---|
| `Magnus_DMS_Test_Scenarios_UPDATED.xlsx` | 20 high-level test scenarios |
| `Magnus_DMS_Test_Cases.xlsx` | 20 detailed test cases |
| `DMS_Traceability_Matrix.csv` | Requirement-to-test coverage |
| `DMS_Test_Plan_Strategy.txt` | Test planning and strategy |
| `DMS_Test_Execution_Summary.txt` | Execution results and status |
| `DMS_Defect_Log.csv` | Defect / blocker tracking |
| `BLK_DMS_001.txt` | Detailed blocker report |
| `DEF_DMS_001_Blocker.txt` | Defect-style blocker documentation |
| `DMS_JIRA_Defect_Validation_Record.txt` | JIRA defect validation |
| `DMS_QA_Review_Checklist.txt` | QA review checklist |
| `DMS_Test_Review_Minutes.txt` | Test review documentation |

---

## 🛠️ Technology Stack

### Automation

- **Java**
- **Selenium WebDriver**
- **TestNG**
- **Maven**
- **Google Chrome**

### QA Practices

- Requirement Analysis
- Test Scenario Design
- Test Case Design
- Functional Testing
- Negative Testing
- Regression-Oriented Test Design
- Requirement Traceability
- Defect Management
- Test Execution Reporting
- Peer Review Preparation
- Risk / Blocker Management

### Development Practices

- Page Object Model
- Reusable Base Test Classes
- Centralized Configuration
- Environment-Based Credentials
- Reusable Test Data
- Maven Project Structure
- Git / GitHub Version Control

---

## 💡 What This Project Demonstrates

This project goes beyond writing Selenium scripts.

It demonstrates the ability to work across the complete QA workflow:

```text
Understand Requirements
        ↓
Design Test Scenarios
        ↓
Write Detailed Test Cases
        ↓
Build Traceability
        ↓
Develop Automation
        ↓
Execute Tests
        ↓
Analyze Results
        ↓
Document Defects / Blockers
        ↓
Prepare QA Reports
```

The project also demonstrates responsible testing practice by clearly separating:

```text
PASSED
FAILED
SKIPPED
BLOCKED
NOT EXECUTED
```

rather than treating inaccessible functionality as a successful test.

---

## 📈 Potential Extension

Once the required Internal Audit / DMS permissions and test data are available, the framework can be extended to execute the complete DMS workflows for:

- Document creation
- Document upload
- Version / check-in
- Document linking
- Task creation
- Status management
- Document details
- Version history
- Download
- Check-out
- Delete
- Remove association
- Permissions

The existing framework structure is intended to support adding these workflow actions without redesigning the entire project.

---

## 👨‍💻 Project Repository

**GitHub:**  
https://github.com/abhinavreddy6342/Magnus-DMS-QA-Automation

---

## 📦 Submission Package

A complete project archive is included:

```text
Magnus-DMS-QA-Project-Final.zip
```

The package contains the automation source, QA documentation, test data, configuration, execution artifacts, and project setup files.

---

## ✅ Project Status

```text
QA Documentation       ████████████████████ 100%
Test Scenarios         ████████████████████ 100%
Test Cases             ████████████████████ 100%
Traceability           ████████████████████ 100%
Automation Framework   ████████████████████ 100%
Launch/Login Testing   ████████████████████ 100%
DMS Functional Access  ████████░░░░░░░░░░░░ Blocked
```

**Current status: Submission-ready QA project with documented DMS access blocker.**

---

## ⭐ Recruiter Takeaway

**Magnus DMS QA Automation** demonstrates practical experience in both **manual QA and test automation**, with emphasis on requirement-driven testing, Selenium framework design, traceability, defect reporting, execution analysis, and professional QA documentation.

The project reflects a quality-engineering mindset focused not only on *automating tests*, but also on **understanding requirements, designing meaningful coverage, validating evidence, and communicating test results clearly**.
