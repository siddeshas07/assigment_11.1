package scenarios;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest {
	@Test
	public void loginTest() {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASSiddesh\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
	    
	    // Instantiate a ChromeDriver class.     
		WebDriver driver=new FirefoxDriver();  
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
		
		WebElement logoutButton = driver.findElement(By.xpath("//input[@value='Log out']"));
		boolean displayed = logoutButton.isDisplayed();
		
		Assert.assertTrue(displayed);
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Insurance Broker System");
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://demo.guru99.com/insurance/v1/header.php");
		
		
	}

}
