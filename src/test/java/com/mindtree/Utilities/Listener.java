package com.mindtree.Utilities;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener {
	public static Logger Log = LogManager.getLogger(BrowserConnection.class.getName());

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {
		TakeScreenshot.getScreenShot(result.getName());
		Log.info("Screenshot taken");
	}

	public void onTestFailure(ITestResult result) {

	}

	public void onTestSkipped(ITestResult result) {

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	public void onTestFailedWithTimeout(ITestResult result) {

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ITestContext context) {

	}

}
