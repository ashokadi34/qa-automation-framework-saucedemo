# 🚀 QA Automation Framework - E2E Hybrid (UI + API)

## 📌 Overview

This project is a **scalable end-to-end automation framework** designed for modern web applications.
It combines **UI automation (Selenium)** and **API testing (REST Assured)** to enable **hybrid testing**, improving reliability and reducing execution time.

The framework is built using **Java + TestNG + Cucumber (BDD)** and follows industry best practices like **Page Object Model (POM)**, **parallel execution**, and **detailed reporting**.

---

## 🛠️ Tech Stack

* **Language**: Java
* **UI Automation**: Selenium WebDriver
* **Test Framework**: TestNG
* **BDD**: Cucumber
* **API Testing**: REST Assured
* **Build Tool**: Maven
* **Reporting**: Extent Reports
* **Version Control**: Git

---

## 🧱 Framework Architecture

* **Page Object Model (POM)** for maintainability
* **Hybrid Framework** (UI + API integration)
* **Reusable utilities** for waits, screenshots, config
* **TestNG Listeners** for reporting and logging
* **Cucumber BDD layer** for readable test scenarios

---

## 📁 Project Structure

```
qa-automation-framework-e2e/
│── pom.xml
│── testng.xml
│── README.md
│
├── src/main/java
│   ├── base            # Base test setup
│   ├── factory         # WebDriver initialization
│   ├── pages           # Page Object classes
│   ├── utils           # Utilities (API, waits, screenshots, reports)
│
├── src/test/java
│   ├── tests           # TestNG test classes
│   ├── stepDefinitions # Cucumber step definitions
│   ├── runners         # Test runners
│
├── src/test/resources
│   ├── features        # Cucumber feature files
│   ├── config.properties
```

---

## 🔥 Key Features

### ✅ Hybrid Testing (UI + API)

* Create test data via API
* Validate workflows through UI

### ✅ Page Object Model (POM)

* Clean separation of test logic and page actions
* Improves maintainability and reusability

### ✅ Parallel Execution

* Faster test execution using TestNG

### ✅ Extent Reports

* Detailed HTML reports
* Step-level logging
* Screenshot attachment on failure

### ✅ Screenshot Capture

* Automatic screenshots on test failure
* Helps in debugging issues quickly

### ✅ Configurable Environment

* Easily switch environments using `config.properties`

---

## 🧪 Sample Test Flow

1. Create user via API
2. Launch application
3. Perform login via UI
4. Validate successful login

---

## ▶️ How to Run Tests

### 🔹 Run via Maven

```
mvn clean test
```

### 🔹 Run via TestNG

* Execute `testng.xml`

---

## 📊 Reports

After execution:

* **Extent Report** → `target/ExtentReport.html`
* **Screenshots** → `/screenshots/`

---

## 📸 Sample Report Features

* Pass/Fail status
* Error logs
* Stack trace
* Screenshot on failure

---

## 📈 Future Enhancements

* CI/CD integration (GitHub Actions / Jenkins)
* Docker + Selenium Grid
* Advanced logging (Log4j)
* Retry mechanism for flaky tests
* Test data management (JSON/DB integration)

---

## 👨‍💻 Author

**Ashok Kumar**

---
