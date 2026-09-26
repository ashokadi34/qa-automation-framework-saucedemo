# QA Automation Framework - Java | Selenium | TestNG | Cucumber | REST Assured

## Overview

A Java-based UI and API automation framework demonstrating reusable test automation patterns with Selenium WebDriver, TestNG, Cucumber BDD, REST Assured, Page Object Model, Extent Reports, configuration management, and failure screenshots.

The project uses SauceDemo as the UI application under test and ReqRes as a sample API for API automation.

## Key Features

- Selenium WebDriver UI automation
- TestNG test execution
- Cucumber BDD with TestNG integration
- Page Object Model (POM)
- REST Assured API utility
- WebDriver factory
- Reusable configuration reader
- Explicit wait utility
- TestNG listener
- Extent HTML reporting
- Failure screenshot capture
- Maven-based execution

## Framework Architecture

```text
TestNG Test / Cucumber Scenario
              |
              v
       Page Object Model
              |
              v
         WebDriver
              |
              v
       SauceDemo UI

REST Assured API Utility
              |
              v
           ReqRes
```

## Project Structure

```text
qa-automation-framework-saucedemo/
|
+-- pom.xml
+-- testng.xml
+-- README.md
|
+-- src/main/java/
|   +-- base/
|   +-- factory/
|   +-- pages/
|   +-- utils/
|
+-- src/test/java/
|   +-- hooks/
|   +-- runners/
|   +-- stepDefinitions/
|   +-- tests/
|
+-- src/test/resources/
    +-- config.properties
    +-- features/
        +-- login.feature
```

## Test Flows

### TestNG UI flow

```text
LoginTest
   |
   +-- Create sample API user using REST Assured
   |
   +-- Read application URL from config.properties
   |
   +-- Open SauceDemo
   |
   +-- Login through LoginPage
```

The API call is currently a reusable API demonstration; the generated API user ID is logged and is not used as SauceDemo login data.

### Cucumber BDD flow

```text
login.feature
      |
      v
LoginSteps
      |
      v
Hooks
      |
      v
DriverFactory
      |
      v
LoginPage
      |
      v
SauceDemo
```

## Technologies

| Technology | Purpose |
|---|---|
| Java | Programming language |
| Selenium WebDriver | UI automation |
| TestNG | Test execution |
| Cucumber | BDD scenarios |
| REST Assured | API automation |
| Maven | Build and dependency management |
| Extent Reports | HTML test reporting |
| Git | Version control |

## Configuration

Configuration is stored in:

```text
src/test/resources/config.properties
```

Example:

```properties
url=https://www.saucedemo.com/
browser=chrome
```

The application URL is loaded from the classpath by `ConfigReader`.

## Running the Tests

```bash
mvn clean test
```

The `testng.xml` suite contains both the TestNG UI test and the Cucumber TestNG runner, and registers the Extent Reports listener.

## Reports

After execution:

```text
target/ExtentReport.html
target/report.html
```

Failure screenshots are stored under:

```text
screenshots/
```

## Framework Design Notes

### Page Object Model
`LoginPage` encapsulates SauceDemo login locators and actions.

### WebDriver Factory
`DriverFactory` centralizes Chrome WebDriver creation and browser initialization.

### Cucumber Hooks
Cucumber `@Before` and `@After` hooks create and close the browser for each scenario.

### TestNG Listener
`TestListener` integrates Extent Reports and captures screenshots when a TestNG test fails.

### API Utility
`APIUtils` provides a reusable REST Assured method for creating sample API data against ReqRes.

## Current Scope

This repository focuses on core SDET automation patterns. It does not currently claim parallel execution, Selenium Grid, Docker execution, CI/CD integration, or database testing.

## Future Enhancements

- CI/CD integration with GitHub Actions or Jenkins
- Browser selection through configuration
- Parallel test execution
- Retry handling for transient failures
- API response validation and reusable request specifications
- Test data management
- Database validation
- Selenium Grid or containerized execution
---
## ⭐ Repository
If you find this project useful, feel free to explore the implementation and provide feedback.
```text
https://github.com/ashokadi34/qa-automation-framework-saucedemo
```
## Author

**Ashok Kumar**

Senior Software Test Engineer | SDET | QA Automation

---

# Thank you!