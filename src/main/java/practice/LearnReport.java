package practice;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnReport {

	ExtentHtmlReporter reporter;
	ExtentReports extent;
	ExtentTest test;
	WebDriver driver;

	String testcaseName = "sat", testcaseDec = "none";

	@BeforeSuite
	public void startReport() {
		reporter = new ExtentHtmlReporter("./result.html");
		// reporter.setAppendExisting(true);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
	}

	@BeforeClass
	public void report() throws IOException {
		test = extent.createTest(testcaseName, testcaseDec);
	}

	@AfterMethod
	public void reportStep(ITestResult result) {
		if (result.getStatus() == ITestResult.SUCCESS) {
			test.pass("Pass");
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test.pass("Fail");
		}
	}

	@BeforeMethod
	public void start() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();

	}

	@Test
	public void execute() {
		driver.get("https://www.softwaretestinghelp.com/selenium-framework-design-selenium-tutorial-21/");
	}

	@AfterSuite
	public void stopReport() {
		extent.flush();
	}
}
