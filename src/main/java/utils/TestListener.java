package utils;

import com.aventstack.extentreports.*;
import org.testng.*;
import org.openqa.selenium.WebDriver;
import base.BaseTest;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getInstance();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        try {
            WebDriver driver = ((BaseTest) result.getInstance()).driver;

            String path = ScreenshotUtils.capture(driver, result.getMethod().getMethodName());

            test.addScreenCaptureFromPath(path);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}