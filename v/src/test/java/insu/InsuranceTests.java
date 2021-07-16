package insurancetests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InsuranceTests {

	@Test(enabled=false)
	public void loginTest() {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASSiddesh\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
	    
	    // Instantiate a ChromeDriver class.     
		WebDriver driver=new FirefoxDriver();  
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("siddeshas1999@gmail.com");
		
		WebElement p = driver.findElement(By.id("password"));
		p.sendKeys("7975869561");
		
		WebElement l = driver.findElement(By.name("submit"));
		l.click();
		
		WebElement logoutButton = driver.findElement(By.xpath("//input[@value='Log out']"));
		boolean displayed = logoutButton.isDisplayed();
		
		Assert.assertTrue(displayed);
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Insurance Broker System");
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://demo.guru99.com/insurance/v1/header.php");
		
		
	}
	@Test(enabled = false)
	public void requestQuoteTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASSiddesh\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
	    
	    // Instantiate a ChromeDriver class.     
		WebDriver driver=new FirefoxDriver();  
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("siddeshas1999@gmail.com");
		
		WebElement p = driver.findElement(By.id("password"));
		p.sendKeys("7975869561");
		
		WebElement l = driver.findElement(By.name("submit"));
		l.click();
		
		//clicks on Request Quotation Page
		driver.findElement(By.linkText("Request Quotation")).click();
		
		
		//Selects as yes
		driver.findElement(By.id("quotation_windscreenrepair_t")).click();
		
		//Input estimated value as 1000
		driver.findElement(By.id("quotation_vehicle_attributes_value")).sendKeys("1000");
		Thread.sleep(3000);
		
		//Selects parking location as Public
		Select select = new Select(driver.findElement(By.id("quotation_vehicle_attributes_parkinglocation"))); select.selectByIndex(3);
		Thread.sleep(3000);
		
		//Clicks on Calculate Premium
		driver.findElement(By.xpath("//input[@value='Calculate Premium']")).click();
		Thread.sleep(3000);
		
		WebElement calculatedPremium = driver.findElement(By.id("calculatedpremium"));
		Assert.assertTrue(calculatedPremium.isDisplayed());
		
		//Clicks on reset form
		driver.findElement(By.xpath("//input[@id='resetquote']")).click();
	}
	
	@Test
	public void invalidLogin() {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASSiddesh\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
	    
	    // Instantiate a ChromeDriver class.     
		WebDriver driver=new FirefoxDriver();  
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();

		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("siddeshas1999@gmail.com");
		
		WebElement p = driver.findElement(By.id("password"));
		p.sendKeys("7975869561");
		
		WebElement l = driver.findElement(By.name("submit"));
		l.click();
		
		
		
		
		
	}
	
	@Test(enabled = false)
	public void loginAndlogout() {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ASSiddesh\\Downloads\\geckodriver-v0.29.1-win64\\geckodriver.exe");  
	    
	    // Instantiate a ChromeDriver class.     
		WebDriver driver=new FirefoxDriver();  
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		driver.manage().window().maximize();
		
		WebElement e = driver.findElement(By.id("email"));
		e.sendKeys("siddeshas1999@gmail.com");
		
		WebElement p = driver.findElement(By.id("password"));
		p.sendKeys("7975869561");
		
		WebElement l = driver.findElement(By.name("submit"));
		l.click();
		
		driver.findElement(By.xpath("//input[@value='Log out']")).click();
		WebElement li = driver.findElement(By.xpath("//input[@value='Log in']"));
		Assert.assertTrue(li.isDisplayed());
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Insurance Broker System - Login");
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "http://demo.guru99.com/insurance/v1/index.php");
	}
}
