package base;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class BaseUtils {
	public ChromeDriver driver;
	public String excelFileName;
	@Parameters({ "url", "username", "Password" })
	@BeforeMethod
	public void login(String url, String uname, String Password) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElementById("username").sendKeys(uname);
		driver.findElementById("password").sendKeys(Password);
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
	}

	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	@DataProvider(name = "SathyaR")
	public String[][] getdata() throws IOException{
		return ReadExcel.getExcel(excelFileName);
	}
}
