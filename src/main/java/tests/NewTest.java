package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {

	public WebDriver driver;

	@Test
	public void openMyBlog() {
		driver.get("https://www.youtube.com/watch?v=IUMYGIcNATA");
	}

	@BeforeClass
	public void beforeClass() throws MalformedURLException {

		// System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		// driver = new ChromeDriver();
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setBrowserName("chrome");
		desiredCapabilities.setPlatform(Platform.WIN10);
		URL remoteAddress = new URL("http://127.0.0.1:9515");
		driver = new RemoteWebDriver(remoteAddress, desiredCapabilities);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}