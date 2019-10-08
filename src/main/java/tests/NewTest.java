package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
	
	public WebDriver driver;
	
  @Test
  public void openMyBlog() {
	driver.get("http://thongtinnhansu.viettel.vn/");
  }
  
  
  public void beforeClass() {
	  
	  System.setProperty("webdriver.gecko.driver", "E:\\geckodriver.exe");
	  driver = new FirefoxDriver();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}