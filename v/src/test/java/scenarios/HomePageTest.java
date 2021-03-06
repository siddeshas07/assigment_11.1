package scenarios;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;

public class HomePageTest {
	@Test
	public void requestQuoteTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASSiddesh\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
	    
	    // Instantiate a ChromeDriver class.     
		WebDriver driver=new FirefoxDriver();  
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login();
		
		HomePage homePage = new HomePage(driver);
		homePage.calculatePremium();
		
	}

}
