package mavenProject;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class GoogleTest {
	
	WebDriver driver;
	
  @Test
  public void f() {
	  
	  String Expected="Google";
	  String Actual=driver.getTitle();
	  Assert.assertEquals(Actual, Expected);
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Documents\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
	  
	  driver= new ChromeDriver();
 
  driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  
	  driver.quit();
  }

}
