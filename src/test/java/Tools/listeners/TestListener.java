package Tools.listeners;

import Config.BaseTest;
import Tools.extentreports.ExtentManager;
import Tools.extentreports.ExtentTestManager;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


import static Tools.extentreports.ExtentTestManager.getTest;


public class TestListener implements ITestListener {


    public void onStart(ITestContext context) {
        System.out.println ( "*** Test Suite " + context.getName () + " started ***" );
    }

    public void onFinish(ITestContext context) {
        System.out.println ( ("*** Test Suite " + context.getName () + " ending ***") );
        ExtentTestManager.endTest ();
        ExtentManager.getInstance ().flush ();
    }

    public void onTestStart(ITestResult result) {
        System.out.println ( ("*** Running test method " + result.getMethod ().getMethodName () + "...") );
        ExtentTestManager.startTest ( result.getMethod ().getMethodName (), " test is starting." );
    }

    public void onTestSuccess(ITestResult result) {
        System.out.println ( "*** Executed " + result.getMethod ().getMethodName () + " test successfully..." );
        ExtentTestManager.getTest ().log ( Status.PASS, "Test passed" );

        Object testClass = result.getInstance ();
        WebDriver webDriver = ((BaseTest) testClass).getDriver ();
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) webDriver).getScreenshotAs ( OutputType.BASE64 );
        getTest ().log ( Status.PASS, "Test Passed",
                         getTest ().addScreenCaptureFromBase64String ( base64Screenshot ).getModel ().getMedia ().get ( 0 ) );
    }

    public void onTestFailure(ITestResult result) {
        System.out.println ( "*** Test execution " + result.getMethod ().getMethodName () + " failed..." );
        ExtentTestManager.getTest ().log ( Status.FAIL, "Test Failed" );

        Object testClass = result.getInstance ();
        WebDriver webDriver = ((BaseTest) testClass).getDriver ();
        String base64Screenshot = "data:image/png;base64," + ((TakesScreenshot) webDriver).getScreenshotAs ( OutputType.BASE64 );
        getTest ().log ( Status.FAIL, "Test Failed",
                         getTest ().addScreenCaptureFromBase64String ( base64Screenshot ).getModel ().getMedia ().get ( 0 ) );
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println ( "*** Test " + result.getMethod ().getMethodName () + " skipped..." );
        ExtentTestManager.getTest ().log ( Status.SKIP, "Test Skipped" );
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println ( "*** Test failed but within percentage % " + result.getMethod ().getMethodName () );
    }

}